// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAuthVcTransactionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询目标可验证声明的ID
    @NameInMap("vc_id")
    @Validation(required = true)
    public String vcId;

    // 业务类型，通常需要与授权宝服务沟通确定，业务类型可能影响此接口内部实现逻辑，长度不超过32字符。
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 如果此字段为空，则默认使用当前请求租户在授权宝配置的did来进行查询(此did需授权有权限)，此外情况都需要指定目标vc_id的owner_did
    // 
    @NameInMap("owner_did")
    public String ownerDid;

    public static QueryAuthVcTransactionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthVcTransactionRequest self = new QueryAuthVcTransactionRequest();
        return TeaModel.build(map, self);
    }

    public QueryAuthVcTransactionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAuthVcTransactionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAuthVcTransactionRequest setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

    public QueryAuthVcTransactionRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QueryAuthVcTransactionRequest setOwnerDid(String ownerDid) {
        this.ownerDid = ownerDid;
        return this;
    }
    public String getOwnerDid() {
        return this.ownerDid;
    }

}
