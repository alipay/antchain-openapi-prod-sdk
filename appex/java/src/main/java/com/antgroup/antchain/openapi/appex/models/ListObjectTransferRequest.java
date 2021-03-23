// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class ListObjectTransferRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 区块链身份
    @NameInMap("user_did")
    @Validation(required = true)
    public String userDid;

    // 联盟标识（联盟码）
    @NameInMap("union_id")
    @Validation(required = true)
    public String unionId;

    // 链上物体的身份
    @NameInMap("object_hash")
    @Validation(required = true)
    public String objectHash;

    public static ListObjectTransferRequest build(java.util.Map<String, ?> map) throws Exception {
        ListObjectTransferRequest self = new ListObjectTransferRequest();
        return TeaModel.build(map, self);
    }

    public ListObjectTransferRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListObjectTransferRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListObjectTransferRequest setUserDid(String userDid) {
        this.userDid = userDid;
        return this;
    }
    public String getUserDid() {
        return this.userDid;
    }

    public ListObjectTransferRequest setUnionId(String unionId) {
        this.unionId = unionId;
        return this;
    }
    public String getUnionId() {
        return this.unionId;
    }

    public ListObjectTransferRequest setObjectHash(String objectHash) {
        this.objectHash = objectHash;
        return this;
    }
    public String getObjectHash() {
        return this.objectHash;
    }

}
