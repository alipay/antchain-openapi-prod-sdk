// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class LoadTsmResourcefileResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // appId
    @NameInMap("app_id")
    public String appId;

    // cmd_list
    @NameInMap("cmd_list")
    public java.util.List<TsmCommonCmd> cmdList;

    public static LoadTsmResourcefileResponse build(java.util.Map<String, ?> map) throws Exception {
        LoadTsmResourcefileResponse self = new LoadTsmResourcefileResponse();
        return TeaModel.build(map, self);
    }

    public LoadTsmResourcefileResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public LoadTsmResourcefileResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public LoadTsmResourcefileResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public LoadTsmResourcefileResponse setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public LoadTsmResourcefileResponse setCmdList(java.util.List<TsmCommonCmd> cmdList) {
        this.cmdList = cmdList;
        return this;
    }
    public java.util.List<TsmCommonCmd> getCmdList() {
        return this.cmdList;
    }

}
