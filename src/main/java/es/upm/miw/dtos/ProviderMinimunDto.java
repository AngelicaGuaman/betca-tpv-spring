package es.upm.miw.dtos;

import javax.validation.constraints.NotNull;

public class ProviderMinimunDto {

    @NotNull
    private String id;

    @NotNull
    private String company;

    @NotNull
    private String nif;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "ProviderMinimunDto[" +
                "id='" + id + '\'' +
                ", company='" + company + '\'' +
                ", nif='" + nif + '\'' +
                ']';
    }
}