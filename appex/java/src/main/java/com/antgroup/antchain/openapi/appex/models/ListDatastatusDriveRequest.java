// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class ListDatastatusDriveRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 区块链身份
    // 
    @NameInMap("user_did")
    @Validation(required = true)
    public String userDid;

    // 联盟标识（联盟码）
    // 
    @NameInMap("union_id")
    @Validation(required = true)
    public String unionId;

    // 链上数据的身份
    // 
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    public static ListDatastatusDriveRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatastatusDriveRequest self = new ListDatastatusDriveRequest();
        return TeaModel.build(map, self);
    }

    public ListDatastatusDriveRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListDatastatusDriveRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListDatastatusDriveRequest setUserDid(String userDid) {
        this.userDid = userDid;
        return this;
    }
    public String getUserDid() {
        return this.userDid;
    }

    public ListDatastatusDriveRequest setUnionId(String unionId) {
        this.unionId = unionId;
        return this;
    }
    public String getUnionId() {
        return this.unionId;
    }

    public ListDatastatusDriveRequest setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
