package es.upm.miw.dtos;

import es.upm.miw.documents.Role;
import es.upm.miw.documents.User;

import java.util.Arrays;

public class UserRolesDto {

    private String id;
    private String mobile;
    private Role[] roles;

    public UserRolesDto(User user) {
        this.id = user.getId();
        this.mobile = user.getMobile();
        this.roles = user.getRoles();

    }

    public UserRolesDto() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Role[] getRoles() {
        return roles;
    }

    public void setRoles(Role[] roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "UserRolesDto{" +
                "id='" + id + '\'' +
                ", mobile='" + mobile + '\'' +
                ", roles=" + Arrays.toString(roles) +
                '}';
    }

}