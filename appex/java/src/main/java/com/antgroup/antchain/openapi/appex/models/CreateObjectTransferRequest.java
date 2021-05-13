// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class CreateObjectTransferRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

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

    // 链上物体的身份，即物体（物权）上链接口返回的交易哈希
    @NameInMap("object_hash")
    @Validation(required = true)
    public String objectHash;

    // 流转备注信息
    @NameInMap("form_body")
    public String formBody;

    // 数据归属权流转到的Did
    @NameInMap("to_did")
    @Validation(required = true)
    public String toDid;

    public static CreateObjectTransferRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateObjectTransferRequest self = new CreateObjectTransferRequest();
        return TeaModel.build(map, self);
    }

    public CreateObjectTransferRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateObjectTransferRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateObjectTransferRequest setUserDid(String userDid) {
        this.userDid = userDid;
        return this;
    }
    public String getUserDid() {
        return this.userDid;
    }

    public CreateObjectTransferRequest setUnionId(String unionId) {
        this.unionId = unionId;
        return this;
    }
    public String getUnionId() {
        return this.unionId;
    }

    public CreateObjectTransferRequest setObjectHash(String objectHash) {
        this.objectHash = objectHash;
        return this;
    }
    public String getObjectHash() {
        return this.objectHash;
    }

    public CreateObjectTransferRequest setFormBody(String formBody) {
        this.formBody = formBody;
        return this;
    }
    public String getFormBody() {
        return this.formBody;
    }

    public CreateObjectTransferRequest setToDid(String toDid) {
        this.toDid = toDid;
        return this;
    }
    public String getToDid() {
        return this.toDid;
    }

}
