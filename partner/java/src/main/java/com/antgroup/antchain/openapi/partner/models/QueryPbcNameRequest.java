// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class QueryPbcNameRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 省份名称
    @NameInMap("province")
    @Validation(required = true)
    public String province;

    // 城市名称
    @NameInMap("city")
    @Validation(required = true)
    public String city;

    // 银行机构id
    @NameInMap("inst_id")
    @Validation(required = true)
    public String instId;

    // 支行名称关键字
    @NameInMap("branch_name")
    @Validation(required = true)
    public String branchName;

    public static QueryPbcNameRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPbcNameRequest self = new QueryPbcNameRequest();
        return TeaModel.build(map, self);
    }

    public QueryPbcNameRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPbcNameRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public QueryPbcNameRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public QueryPbcNameRequest setInstId(String instId) {
        this.instId = instId;
        return this;
    }
    public String getInstId() {
        return this.instId;
    }

    public QueryPbcNameRequest setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
    public String getBranchName() {
        return this.branchName;
    }

}
