// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.zolozfaceverify.models;

import com.aliyun.tea.*;

public class ExecFaceauthAlgorithmResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 算法结果，json格式
    @NameInMap("algo_result")
    public String algoResult;

    public static ExecFaceauthAlgorithmResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecFaceauthAlgorithmResponse self = new ExecFaceauthAlgorithmResponse();
        return TeaModel.build(map, self);
    }

    public ExecFaceauthAlgorithmResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecFaceauthAlgorithmResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecFaceauthAlgorithmResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecFaceauthAlgorithmResponse setAlgoResult(String algoResult) {
        this.algoResult = algoResult;
        return this;
    }
    public String getAlgoResult() {
        return this.algoResult;
    }

}
