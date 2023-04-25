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

    // 租户来源-用于租户间功能和数据的隔离
    @NameInMap("source")
    @Validation(required = true)
    public String source;

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

    public QueryPbcInstitutionRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
