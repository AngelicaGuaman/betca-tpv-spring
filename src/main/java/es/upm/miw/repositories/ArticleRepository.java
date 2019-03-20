package es.upm.miw.repositories;

import es.upm.miw.documents.Article;
import es.upm.miw.dtos.ArticleSearchDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.math.BigDecimal;
import java.util.List;

public interface ArticleRepository extends MongoRepository<Article, String> {

    @Query("{$and:["
            + "?#{ [0] == null ? { $where : 'true'} : { description : {$regex :[0], $options : 'i'} } },"
            + "?#{ [1] == null ? { $where : 'true'} : { stock : {$gte :[1]} } }"
            + "] }" )
    List<ArticleSearchDto> findByDescriptionLikeAndStockGreaterThanEqualNullSafe
            (String description, Integer stock);

    @Query("{$and:["
            + "?#{ [0] == null ? { $where : 'true'} : { retailPrice : {$gte :[0]} } },"
            + "?#{ [1] == null ? { $where : 'true'} : { retailPrice : {$lte :[1]} } }"
            + "] }" )
    List<ArticleSearchDto> findByRetailPriceGreaterThanEqualAndRetailPriceLessThanEqualNullSafe
            (BigDecimal minPrice, BigDecimal maxPrice);

    List<ArticleSearchDto> findByReferenceNullAndProviderNull();

}
