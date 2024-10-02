package io.surisoft.scim.request;

import java.util.ArrayList;
import java.util.List;

public class Roles {
    private List<String> roles = new ArrayList<>();

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
