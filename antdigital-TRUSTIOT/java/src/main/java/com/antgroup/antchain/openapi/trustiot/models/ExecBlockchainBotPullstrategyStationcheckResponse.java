// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trustiot.models;

import com.aliyun.tea.*;

public class ExecBlockchainBotPullstrategyStationcheckResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回参数密文
    @NameInMap("data")
    public String data;

    // 返回消息
    @NameInMap("msg")
    public String msg;

    // 返回值
    @NameInMap("ret")
    public Long ret;

    // 签名，原文为ret+msg+data密文
    @NameInMap("sig")
    public String sig;

    public static ExecBlockchainBotPullstrategyStationcheckResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecBlockchainBotPullstrategyStationcheckResponse self = new ExecBlockchainBotPullstrategyStationcheckResponse();
        return TeaModel.build(map, self);
    }

    public ExecBlockchainBotPullstrategyStationcheckResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecBlockchainBotPullstrategyStationcheckResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecBlockchainBotPullstrategyStationcheckResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecBlockchainBotPullstrategyStationcheckResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ExecBlockchainBotPullstrategyStationcheckResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ExecBlockchainBotPullstrategyStationcheckResponse setRet(Long ret) {
        this.ret = ret;
        return this;
    }
    public Long getRet() {
        return this.ret;
    }

    public ExecBlockchainBotPullstrategyStationcheckResponse setSig(String sig) {
        this.sig = sig;
        return this;
    }
    public String getSig() {
        return this.sig;
    }

}
