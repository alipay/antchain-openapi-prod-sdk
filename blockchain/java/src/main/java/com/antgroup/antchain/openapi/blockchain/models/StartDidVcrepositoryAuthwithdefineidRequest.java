// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDidVcrepositoryAuthwithdefineidRequest extends TeaModel {
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

    // 自定义的业务id，通常此字段不是"vc:mychain:"前缀开头，会使用如下规则生成最终verifiable_claim_id： verifiable_claim_id = "vc:mychain:" + SHA256(Joiner.on(":").join(issuer_did, subject_did, define_id)); 此表达式参与SHA256的 define_id 为用户指定的当前参数。
    @NameInMap("define_id")
    @Validation(required = true)
    public String defineId;

    // 请求操作的did，也是目标VC的owner，也就是VC内容中的subject did身份。
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 目标证书的颁发者did。
    @NameInMap("issuer_did")
    @Validation(required = true)
    public String issuerDid;

    // 保留字段，请求增加授权的调用方did身份对应公钥对所有数据参数的签名（目前托管模式可缺省此字段，未来非托管时需请求端签名，需填此字段）
    @NameInMap("signature")
    public String signature;

    // 目标证书VC的颁发目标did。
    @NameInMap("subject_did")
    @Validation(required = true)
    public String subjectDid;

    public static StartDidVcrepositoryAuthwithdefineidRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDidVcrepositoryAuthwithdefineidRequest self = new StartDidVcrepositoryAuthwithdefineidRequest();
        return TeaModel.build(map, self);
    }

    public StartDidVcrepositoryAuthwithdefineidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDidVcrepositoryAuthwithdefineidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDidVcrepositoryAuthwithdefineidRequest setAuthDidList(String authDidList) {
        this.authDidList = authDidList;
        return this;
    }
    public String getAuthDidList() {
        return this.authDidList;
    }

    public StartDidVcrepositoryAuthwithdefineidRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public StartDidVcrepositoryAuthwithdefineidRequest setDefineId(String defineId) {
        this.defineId = defineId;
        return this;
    }
    public String getDefineId() {
        return this.defineId;
    }

    public StartDidVcrepositoryAuthwithdefineidRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartDidVcrepositoryAuthwithdefineidRequest setIssuerDid(String issuerDid) {
        this.issuerDid = issuerDid;
        return this;
    }
    public String getIssuerDid() {
        return this.issuerDid;
    }

    public StartDidVcrepositoryAuthwithdefineidRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public StartDidVcrepositoryAuthwithdefineidRequest setSubjectDid(String subjectDid) {
        this.subjectDid = subjectDid;
        return this;
    }
    public String getSubjectDid() {
        return this.subjectDid;
    }

}
