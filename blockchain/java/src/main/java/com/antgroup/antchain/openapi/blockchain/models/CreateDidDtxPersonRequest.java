// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateDidDtxPersonRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 唯一号，比如可以是hash(证件类型+企业营业执照号) 计算出来的唯一值等
    @NameInMap("owner_uid")
    @Validation(required = true)
    public String ownerUid;

    // 场景码，找dis工作人员进行分配
    // 
    @NameInMap("biz_code")
    public String bizCode;

    public static CreateDidDtxPersonRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDidDtxPersonRequest self = new CreateDidDtxPersonRequest();
        return TeaModel.build(map, self);
    }

    public CreateDidDtxPersonRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDidDtxPersonRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDidDtxPersonRequest setOwnerUid(String ownerUid) {
        this.ownerUid = ownerUid;
        return this;
    }
    public String getOwnerUid() {
        return this.ownerUid;
    }

    public CreateDidDtxPersonRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
