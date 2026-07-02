// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class LoadTsmCertificatetsmResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    //  LoadCertificateTSMCmdResponse implements Serializable
    @NameInMap("cmd_list")
    public java.util.List<TsmCommonCmd> cmdList;

    public static LoadTsmCertificatetsmResponse build(java.util.Map<String, ?> map) throws Exception {
        LoadTsmCertificatetsmResponse self = new LoadTsmCertificatetsmResponse();
        return TeaModel.build(map, self);
    }

    public LoadTsmCertificatetsmResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public LoadTsmCertificatetsmResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public LoadTsmCertificatetsmResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public LoadTsmCertificatetsmResponse setCmdList(java.util.List<TsmCommonCmd> cmdList) {
        this.cmdList = cmdList;
        return this;
    }
    public java.util.List<TsmCommonCmd> getCmdList() {
        return this.cmdList;
    }

}
