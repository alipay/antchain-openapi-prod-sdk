// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class AuthWitnessFlowRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 发起请求的实例应用ID
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 证书id
    @NameInMap("cert_id")
    public String certId;

    // 签署页码，单个签时必传
    @NameInMap("page")
    public String page;

    // 签署x坐标，单个签时必传
    @NameInMap("pos_x")
    public String posX;

    // 签署y坐标，单个签时必传
    @NameInMap("pos_y")
    public String posY;

    // 印章图片key
    @NameInMap("seal_file_key")
    public String sealFileKey;

    // 印章id
    @NameInMap("seal_id")
    public String sealId;

    // 印章类型，1-模板，2-手绘
    @NameInMap("seal_type")
    @Validation(required = true)
    public Long sealType;

    // 签署类型，单个签时必传
    @NameInMap("signature_type")
    public String signatureType;

    // 批量签署信息，批量签时必传
    @NameInMap("sign_datas")
    public String signDatas;

    // 待签署文档摘要值，单个签时必传
    @NameInMap("sign_hash")
    public String signHash;

    // 签署票证
    @NameInMap("sign_ticket")
    @Validation(required = true)
    public String signTicket;

    // 签署主体账号id
    @NameInMap("subject_account_id")
    public String subjectAccountId;

    // 第三方文档id，单个签时必传
    @NameInMap("third_doc_id")
    public String thirdDocId;

    // 发起请求的鉴权token
    @NameInMap("token")
    @Validation(required = true)
    public String token;

    // 见证流程id
    @NameInMap("witness_flow_id")
    @Validation(required = true)
    public String witnessFlowId;

    public static AuthWitnessFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthWitnessFlowRequest self = new AuthWitnessFlowRequest();
        return TeaModel.build(map, self);
    }

    public AuthWitnessFlowRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AuthWitnessFlowRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AuthWitnessFlowRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AuthWitnessFlowRequest setCertId(String certId) {
        this.certId = certId;
        return this;
    }
    public String getCertId() {
        return this.certId;
    }

    public AuthWitnessFlowRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public AuthWitnessFlowRequest setPosX(String posX) {
        this.posX = posX;
        return this;
    }
    public String getPosX() {
        return this.posX;
    }

    public AuthWitnessFlowRequest setPosY(String posY) {
        this.posY = posY;
        return this;
    }
    public String getPosY() {
        return this.posY;
    }

    public AuthWitnessFlowRequest setSealFileKey(String sealFileKey) {
        this.sealFileKey = sealFileKey;
        return this;
    }
    public String getSealFileKey() {
        return this.sealFileKey;
    }

    public AuthWitnessFlowRequest setSealId(String sealId) {
        this.sealId = sealId;
        return this;
    }
    public String getSealId() {
        return this.sealId;
    }

    public AuthWitnessFlowRequest setSealType(Long sealType) {
        this.sealType = sealType;
        return this;
    }
    public Long getSealType() {
        return this.sealType;
    }

    public AuthWitnessFlowRequest setSignatureType(String signatureType) {
        this.signatureType = signatureType;
        return this;
    }
    public String getSignatureType() {
        return this.signatureType;
    }

    public AuthWitnessFlowRequest setSignDatas(String signDatas) {
        this.signDatas = signDatas;
        return this;
    }
    public String getSignDatas() {
        return this.signDatas;
    }

    public AuthWitnessFlowRequest setSignHash(String signHash) {
        this.signHash = signHash;
        return this;
    }
    public String getSignHash() {
        return this.signHash;
    }

    public AuthWitnessFlowRequest setSignTicket(String signTicket) {
        this.signTicket = signTicket;
        return this;
    }
    public String getSignTicket() {
        return this.signTicket;
    }

    public AuthWitnessFlowRequest setSubjectAccountId(String subjectAccountId) {
        this.subjectAccountId = subjectAccountId;
        return this;
    }
    public String getSubjectAccountId() {
        return this.subjectAccountId;
    }

    public AuthWitnessFlowRequest setThirdDocId(String thirdDocId) {
        this.thirdDocId = thirdDocId;
        return this;
    }
    public String getThirdDocId() {
        return this.thirdDocId;
    }

    public AuthWitnessFlowRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public AuthWitnessFlowRequest setWitnessFlowId(String witnessFlowId) {
        this.witnessFlowId = witnessFlowId;
        return this;
    }
    public String getWitnessFlowId() {
        return this.witnessFlowId;
    }

}
