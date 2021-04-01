// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDidVcrepositoryReadwithdefineidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 自定义的业务id，通常此字段不是"vc:mychain:"前缀开头，会使用如下规则生成最终verifiable_claim_id： verifiable_claim_id = "vc:mychain:" + SHA256(Joiner.on(":").join(issuer_did, subject_did, define_id)); 此表达式参与SHA256的 define_id 为用户指定的当前参数。
    @NameInMap("define_id")
    @Validation(required = true)
    public String defineId;

    // 请求读取数据的did。
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 目标证书VC的颁发者did。
    @NameInMap("issuer_did")
    @Validation(required = true)
    public String issuerDid;

    // 保留字段，请求读的did身份对应公钥对所有数据参数的签名（目前托管模式可缺省此字段，未来非托管时需请求端签名，需填此字段）
    @NameInMap("signature")
    public String signature;

    // 目标证书VC的颁发目标did。
    @NameInMap("subject_did")
    @Validation(required = true)
    public String subjectDid;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static StartDidVcrepositoryReadwithdefineidRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDidVcrepositoryReadwithdefineidRequest self = new StartDidVcrepositoryReadwithdefineidRequest();
        return TeaModel.build(map, self);
    }

    public StartDidVcrepositoryReadwithdefineidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDidVcrepositoryReadwithdefineidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDidVcrepositoryReadwithdefineidRequest setDefineId(String defineId) {
        this.defineId = defineId;
        return this;
    }
    public String getDefineId() {
        return this.defineId;
    }

    public StartDidVcrepositoryReadwithdefineidRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartDidVcrepositoryReadwithdefineidRequest setIssuerDid(String issuerDid) {
        this.issuerDid = issuerDid;
        return this;
    }
    public String getIssuerDid() {
        return this.issuerDid;
    }

    public StartDidVcrepositoryReadwithdefineidRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public StartDidVcrepositoryReadwithdefineidRequest setSubjectDid(String subjectDid) {
        this.subjectDid = subjectDid;
        return this;
    }
    public String getSubjectDid() {
        return this.subjectDid;
    }

    public StartDidVcrepositoryReadwithdefineidRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
