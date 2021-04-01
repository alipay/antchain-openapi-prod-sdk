// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDidVcrepositoryAuthwithvcidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 配置此did列表，为这些did分配读取目标VC的权限，如果目标VC存储时是明文存储，则操作失败（无需做此权限管控）。
    @NameInMap("auth_did_list")
    @Validation(required = true)
    public String authDidList;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    // 目标VC的owner，也就是VC内容中的subject did身份。
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 保留字段，请求增加授权的调用方did身份对应公钥对所有数据参数的签名（目前托管模式可缺省此字段，未来非托管时需请求端签名，需填此字段）
    @NameInMap("signature")
    public String signature;

    // 通过指定目标证书VC的唯一verifiable_claim_id来找到目标证书VC并新增授权。
    @NameInMap("verifiable_claim_id")
    @Validation(required = true)
    public String verifiableClaimId;

    public static StartDidVcrepositoryAuthwithvcidRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDidVcrepositoryAuthwithvcidRequest self = new StartDidVcrepositoryAuthwithvcidRequest();
        return TeaModel.build(map, self);
    }

    public StartDidVcrepositoryAuthwithvcidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDidVcrepositoryAuthwithvcidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDidVcrepositoryAuthwithvcidRequest setAuthDidList(String authDidList) {
        this.authDidList = authDidList;
        return this;
    }
    public String getAuthDidList() {
        return this.authDidList;
    }

    public StartDidVcrepositoryAuthwithvcidRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public StartDidVcrepositoryAuthwithvcidRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartDidVcrepositoryAuthwithvcidRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public StartDidVcrepositoryAuthwithvcidRequest setVerifiableClaimId(String verifiableClaimId) {
        this.verifiableClaimId = verifiableClaimId;
        return this;
    }
    public String getVerifiableClaimId() {
        return this.verifiableClaimId;
    }

}
