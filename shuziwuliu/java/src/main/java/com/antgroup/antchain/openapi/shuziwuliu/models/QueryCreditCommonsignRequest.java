// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryCreditCommonsignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 产品id
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    // 集团平台did
    @NameInMap("group_platform_did")
    @Validation(required = true)
    public String groupPlatformDid;

    // 签约方did
    @NameInMap("sign_did")
    @Validation(required = true)
    public String signDid;

    // 申请id，不填则查询当前签约状态，填写则查询apply_id对应的签约申请结果
    @NameInMap("apply_id")
    public String applyId;

    public static QueryCreditCommonsignRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditCommonsignRequest self = new QueryCreditCommonsignRequest();
        return TeaModel.build(map, self);
    }

    public QueryCreditCommonsignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCreditCommonsignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCreditCommonsignRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public QueryCreditCommonsignRequest setGroupPlatformDid(String groupPlatformDid) {
        this.groupPlatformDid = groupPlatformDid;
        return this;
    }
    public String getGroupPlatformDid() {
        return this.groupPlatformDid;
    }

    public QueryCreditCommonsignRequest setSignDid(String signDid) {
        this.signDid = signDid;
        return this;
    }
    public String getSignDid() {
        return this.signDid;
    }

    public QueryCreditCommonsignRequest setApplyId(String applyId) {
        this.applyId = applyId;
        return this;
    }
    public String getApplyId() {
        return this.applyId;
    }

}
