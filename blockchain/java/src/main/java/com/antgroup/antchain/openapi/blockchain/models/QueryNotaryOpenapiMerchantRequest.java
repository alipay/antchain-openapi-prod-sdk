// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryNotaryOpenapiMerchantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询唯一ID，初始化获取认证地址时生成
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    public static QueryNotaryOpenapiMerchantRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryNotaryOpenapiMerchantRequest self = new QueryNotaryOpenapiMerchantRequest();
        return TeaModel.build(map, self);
    }

    public QueryNotaryOpenapiMerchantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryNotaryOpenapiMerchantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryNotaryOpenapiMerchantRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

}
