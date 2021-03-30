// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryCreditDriverRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 申请id
    @NameInMap("apply_id")
    public String applyId;

    // 司机分布式数字身份
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 集团平台方分布式数字身份
    @NameInMap("group_platform_did")
    @Validation(required = true)
    public String groupPlatformDid;

    // 产品id  目前填写PRODUCT_MYBANK
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    public static QueryCreditDriverRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditDriverRequest self = new QueryCreditDriverRequest();
        return TeaModel.build(map, self);
    }

    public QueryCreditDriverRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCreditDriverRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCreditDriverRequest setApplyId(String applyId) {
        this.applyId = applyId;
        return this;
    }
    public String getApplyId() {
        return this.applyId;
    }

    public QueryCreditDriverRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public QueryCreditDriverRequest setGroupPlatformDid(String groupPlatformDid) {
        this.groupPlatformDid = groupPlatformDid;
        return this;
    }
    public String getGroupPlatformDid() {
        return this.groupPlatformDid;
    }

    public QueryCreditDriverRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

}
