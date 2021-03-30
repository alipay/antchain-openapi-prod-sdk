// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryCreditIssuescpticketresultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 申请唯一流水号
    @NameInMap("apply_id")
    @Validation(required = true)
    public String applyId;

    // 集团平台方分布式数字身份
    @NameInMap("group_platform_did")
    @Validation(required = true)
    public String groupPlatformDid;

    // 业务发起方分布式数字身
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 产品id
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    public static QueryCreditIssuescpticketresultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditIssuescpticketresultRequest self = new QueryCreditIssuescpticketresultRequest();
        return TeaModel.build(map, self);
    }

    public QueryCreditIssuescpticketresultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCreditIssuescpticketresultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCreditIssuescpticketresultRequest setApplyId(String applyId) {
        this.applyId = applyId;
        return this;
    }
    public String getApplyId() {
        return this.applyId;
    }

    public QueryCreditIssuescpticketresultRequest setGroupPlatformDid(String groupPlatformDid) {
        this.groupPlatformDid = groupPlatformDid;
        return this;
    }
    public String getGroupPlatformDid() {
        return this.groupPlatformDid;
    }

    public QueryCreditIssuescpticketresultRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public QueryCreditIssuescpticketresultRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

}
