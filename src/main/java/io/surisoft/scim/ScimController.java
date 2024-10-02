package io.surisoft.scim;

import io.surisoft.scim.request.Result;
import io.surisoft.scim.resources.ControllerConfiguration;
import jakarta.servlet.http.HttpServletRequest;

public interface ScimController {
    public Result handleRequest(String accessToken, HttpServletRequest httpServletRequest);
    public String getScimImplementationName();
    public void init(ControllerConfiguration controllerConfiguration);
}