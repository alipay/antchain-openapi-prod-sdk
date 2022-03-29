// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class ExportXsiteConfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    //  
    @NameInMap("workspace_name")
    public String workspaceName;

    //  
    @NameInMap("data")
    @Validation(required = true)
    public XSiteExport data;

    public static ExportXsiteConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportXsiteConfigRequest self = new ExportXsiteConfigRequest();
        return TeaModel.build(map, self);
    }

    public ExportXsiteConfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExportXsiteConfigRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public ExportXsiteConfigRequest setData(XSiteExport data) {
        this.data = data;
        return this;
    }
    public XSiteExport getData() {
        return this.data;
    }

}
