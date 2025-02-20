// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class OperateLeasePetcomparepetsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用于追踪业务调用流程
    @NameInMap("trace_id")
    public String traceId;

    // 取值范围0~1，值越大代表本次校验结果越可信
    @NameInMap("confidence")
    public String confidence;

    // 比对结果：1通过，0不通过
    @NameInMap("is_same_pet")
    public String isSamePet;

    // 鼻纹相似度
    @NameInMap("nose_similarity")
    public String noseSimilarity;

    // 正脸相似度
    @NameInMap("face_similarity")
    public String faceSimilarity;

    public static OperateLeasePetcomparepetsResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateLeasePetcomparepetsResponse self = new OperateLeasePetcomparepetsResponse();
        return TeaModel.build(map, self);
    }

    public OperateLeasePetcomparepetsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public OperateLeasePetcomparepetsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public OperateLeasePetcomparepetsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public OperateLeasePetcomparepetsResponse setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public OperateLeasePetcomparepetsResponse setConfidence(String confidence) {
        this.confidence = confidence;
        return this;
    }
    public String getConfidence() {
        return this.confidence;
    }

    public OperateLeasePetcomparepetsResponse setIsSamePet(String isSamePet) {
        this.isSamePet = isSamePet;
        return this;
    }
    public String getIsSamePet() {
        return this.isSamePet;
    }

    public OperateLeasePetcomparepetsResponse setNoseSimilarity(String noseSimilarity) {
        this.noseSimilarity = noseSimilarity;
        return this;
    }
    public String getNoseSimilarity() {
        return this.noseSimilarity;
    }

    public OperateLeasePetcomparepetsResponse setFaceSimilarity(String faceSimilarity) {
        this.faceSimilarity = faceSimilarity;
        return this;
    }
    public String getFaceSimilarity() {
        return this.faceSimilarity;
    }

}
