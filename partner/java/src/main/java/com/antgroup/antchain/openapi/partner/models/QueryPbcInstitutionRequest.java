// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class QueryPbcInstitutionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 机构名称关键字
    @NameInMap("inst_name")
    @Validation(required = true)
    public String instName;

    public static QueryPbcInstitutionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPbcInstitutionRequest self = new QueryPbcInstitutionRequest();
        return TeaModel.build(map, self);
    }

    public QueryPbcInstitutionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPbcInstitutionRequest setInstName(String instName) {
        this.instName = instName;
        return this;
    }
    public String getInstName() {
        return this.instName;
    }

}
