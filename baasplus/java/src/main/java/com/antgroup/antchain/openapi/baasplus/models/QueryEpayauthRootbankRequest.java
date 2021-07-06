// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryEpayauthRootbankRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 支持全称，或部分名称 如果不传名称，系统默认将返回热门银行，如果用户期望的银行不是热门银行，可以建议用户输入银行名称进行查询。
    @NameInMap("bank_name")
    @Validation(required = true)
    public String bankName;

    public static QueryEpayauthRootbankRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEpayauthRootbankRequest self = new QueryEpayauthRootbankRequest();
        return TeaModel.build(map, self);
    }

    public QueryEpayauthRootbankRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEpayauthRootbankRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEpayauthRootbankRequest setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    public String getBankName() {
        return this.bankName;
    }

}
