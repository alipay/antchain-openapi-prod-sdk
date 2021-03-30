// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryCreditConsignorRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 申请id
    @NameInMap("apply_id")
    public String applyId;

    // 货主分布式数字身份
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 集团平台方分布式数字身份
    @NameInMap("group_platform_did")
    @Validation(required = true)
    public String groupPlatformDid;

    // 产品id
    // A模式： PRODUCT_MYBANK, 
    // A+模式： PRODUCT_MYBANK_A_PLUS, 
    // B模式： PRODUCT_MYBANK_B, 
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    public static QueryCreditConsignorRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditConsignorRequest self = new QueryCreditConsignorRequest();
        return TeaModel.build(map, self);
    }

    public QueryCreditConsignorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCreditConsignorRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCreditConsignorRequest setApplyId(String applyId) {
        this.applyId = applyId;
        return this;
    }
    public String getApplyId() {
        return this.applyId;
    }

    public QueryCreditConsignorRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public QueryCreditConsignorRequest setGroupPlatformDid(String groupPlatformDid) {
        this.groupPlatformDid = groupPlatformDid;
        return this;
    }
    public String getGroupPlatformDid() {
        return this.groupPlatformDid;
    }

    public QueryCreditConsignorRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

}
