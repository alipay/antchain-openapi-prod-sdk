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

    // 银数AC工单ID
    @NameInMap("ac_id")
    public String acId;

    // 环境信息
    @NameInMap("env")
    public String env;

    // 是否是紧急发布场景
    @NameInMap("emergent")
    public Boolean emergent;

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

    public ImportUnireleaseSolutionRequest setAcId(String acId) {
        this.acId = acId;
        return this;
    }
    public String getAcId() {
        return this.acId;
    }

    public ImportUnireleaseSolutionRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public ImportUnireleaseSolutionRequest setEmergent(Boolean emergent) {
        this.emergent = emergent;
        return this;
    }
    public Boolean getEmergent() {
        return this.emergent;
    }

}
