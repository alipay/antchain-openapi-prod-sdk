// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class ImportXsiteConfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    //  
    @NameInMap("workspace_name")
    public String workspaceName;

    //  
    @NameInMap("data")
    @Validation(required = true)
    public XSiteExportData data;

    // 替换前的字符串
    @NameInMap("origin")
    public String origin;

    // 替换后的字符串
    @NameInMap("replaced")
    public String replaced;

    public static ImportXsiteConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportXsiteConfigRequest self = new ImportXsiteConfigRequest();
        return TeaModel.build(map, self);
    }

    public ImportXsiteConfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportXsiteConfigRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public ImportXsiteConfigRequest setData(XSiteExportData data) {
        this.data = data;
        return this;
    }
    public XSiteExportData getData() {
        return this.data;
    }

    public ImportXsiteConfigRequest setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public ImportXsiteConfigRequest setReplaced(String replaced) {
        this.replaced = replaced;
        return this;
    }
    public String getReplaced() {
        return this.replaced;
    }

}
