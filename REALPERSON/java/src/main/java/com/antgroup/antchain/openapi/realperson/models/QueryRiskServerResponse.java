// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryRiskServerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 攻击结论
    @NameInMap("face_attack")
    public String faceAttack;

    // 综合风险检测结果
    @NameInMap("risk_result")
    public RiskResult riskResult;

    // Aigc风险检测结论
    @NameInMap("aigc_risk_result")
    public AigcRiskResult aigcRiskResult;

    // 是否面部遮挡
    @NameInMap("face_occlusion")
    public Boolean faceOcclusion;

    // 人脸性别年龄预估
    @NameInMap("attributes")
    public String attributes;

    // 人脸质量分和小分
    @NameInMap("quality_result")
    public String qualityResult;

    // 风险咨询唯一标识
    @NameInMap("certify_id")
    public String certifyId;

    public static QueryRiskServerResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskServerResponse self = new QueryRiskServerResponse();
        return TeaModel.build(map, self);
    }

    public QueryRiskServerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRiskServerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRiskServerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRiskServerResponse setFaceAttack(String faceAttack) {
        this.faceAttack = faceAttack;
        return this;
    }
    public String getFaceAttack() {
        return this.faceAttack;
    }

    public QueryRiskServerResponse setRiskResult(RiskResult riskResult) {
        this.riskResult = riskResult;
        return this;
    }
    public RiskResult getRiskResult() {
        return this.riskResult;
    }

    public QueryRiskServerResponse setAigcRiskResult(AigcRiskResult aigcRiskResult) {
        this.aigcRiskResult = aigcRiskResult;
        return this;
    }
    public AigcRiskResult getAigcRiskResult() {
        return this.aigcRiskResult;
    }

    public QueryRiskServerResponse setFaceOcclusion(Boolean faceOcclusion) {
        this.faceOcclusion = faceOcclusion;
        return this;
    }
    public Boolean getFaceOcclusion() {
        return this.faceOcclusion;
    }

    public QueryRiskServerResponse setAttributes(String attributes) {
        this.attributes = attributes;
        return this;
    }
    public String getAttributes() {
        return this.attributes;
    }

    public QueryRiskServerResponse setQualityResult(String qualityResult) {
        this.qualityResult = qualityResult;
        return this;
    }
    public String getQualityResult() {
        return this.qualityResult;
    }

    public QueryRiskServerResponse setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

}
