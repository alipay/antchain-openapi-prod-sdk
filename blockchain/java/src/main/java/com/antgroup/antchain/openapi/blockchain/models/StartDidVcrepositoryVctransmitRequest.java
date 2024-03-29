// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDidVcrepositoryVctransmitRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户did标示
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 实际参数
    @NameInMap("payload")
    @Validation(required = true)
    public VcTransmitPayload payload;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    // transmit在底层vc仓库使用时候是否需要使用did密钥进行信封封装加密，如果设定true则不需要底层信封加密，需要调用方执行vcContent的加密保护。
    @NameInMap("not_encrypt")
    public Boolean notEncrypt;

    public static StartDidVcrepositoryVctransmitRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDidVcrepositoryVctransmitRequest self = new StartDidVcrepositoryVctransmitRequest();
        return TeaModel.build(map, self);
    }

    public StartDidVcrepositoryVctransmitRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDidVcrepositoryVctransmitRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDidVcrepositoryVctransmitRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartDidVcrepositoryVctransmitRequest setPayload(VcTransmitPayload payload) {
        this.payload = payload;
        return this;
    }
    public VcTransmitPayload getPayload() {
        return this.payload;
    }

    public StartDidVcrepositoryVctransmitRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public StartDidVcrepositoryVctransmitRequest setNotEncrypt(Boolean notEncrypt) {
        this.notEncrypt = notEncrypt;
        return this;
    }
    public Boolean getNotEncrypt() {
        return this.notEncrypt;
    }

}
