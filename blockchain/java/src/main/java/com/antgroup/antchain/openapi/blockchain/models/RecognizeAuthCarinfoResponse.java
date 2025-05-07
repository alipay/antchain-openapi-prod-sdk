// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class RecognizeAuthCarinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 校验结果
    @NameInMap("check_success")
    public String checkSuccess;

    public static RecognizeAuthCarinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeAuthCarinfoResponse self = new RecognizeAuthCarinfoResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeAuthCarinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RecognizeAuthCarinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RecognizeAuthCarinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RecognizeAuthCarinfoResponse setCheckSuccess(String checkSuccess) {
        this.checkSuccess = checkSuccess;
        return this;
    }
    public String getCheckSuccess() {
        return this.checkSuccess;
    }

}
