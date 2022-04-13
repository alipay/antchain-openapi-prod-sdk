// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ImportUnireleaseSolutionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // Line迭代发布Json String
    @NameInMap("solution")
    @Validation(required = true)
    public String solution;

    // 机构列表信息；如果不填默认是所有机构统一发布
    @NameInMap("tenants")
    public java.util.List<String> tenants;

    public static ImportUnireleaseSolutionRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportUnireleaseSolutionRequest self = new ImportUnireleaseSolutionRequest();
        return TeaModel.build(map, self);
    }

    public ImportUnireleaseSolutionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportUnireleaseSolutionRequest setSolution(String solution) {
        this.solution = solution;
        return this;
    }
    public String getSolution() {
        return this.solution;
    }

    public ImportUnireleaseSolutionRequest setTenants(java.util.List<String> tenants) {
        this.tenants = tenants;
        return this;
    }
    public java.util.List<String> getTenants() {
        return this.tenants;
    }

}
