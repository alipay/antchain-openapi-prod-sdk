// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryRealpersonFacevrfResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 实人认证结果
    // PROCESSING（初始化）
    // SUCCESS（认证通过）FAIL（认证不通过）
    @NameInMap("certify_state")
    public String certifyState;

    // 【solution_type=H5 | APP 返回】
    // 本次认证是否存在安全风险
    // true(检测到安全风险)
    // false(未检测到安全风险)
    @NameInMap("attack_flag")
    public String attackFlag;

    // 【solution_type=H5 | APP 返回】
    // base64过后的二值化图片
    @NameInMap("alive_photo")
    public String alivePhoto;

    public static QueryRealpersonFacevrfResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRealpersonFacevrfResponse self = new QueryRealpersonFacevrfResponse();
        return TeaModel.build(map, self);
    }

    public QueryRealpersonFacevrfResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRealpersonFacevrfResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRealpersonFacevrfResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRealpersonFacevrfResponse setCertifyState(String certifyState) {
        this.certifyState = certifyState;
        return this;
    }
    public String getCertifyState() {
        return this.certifyState;
    }

    public QueryRealpersonFacevrfResponse setAttackFlag(String attackFlag) {
        this.attackFlag = attackFlag;
        return this;
    }
    public String getAttackFlag() {
        return this.attackFlag;
    }

    public QueryRealpersonFacevrfResponse setAlivePhoto(String alivePhoto) {
        this.alivePhoto = alivePhoto;
        return this;
    }
    public String getAlivePhoto() {
        return this.alivePhoto;
    }

}
