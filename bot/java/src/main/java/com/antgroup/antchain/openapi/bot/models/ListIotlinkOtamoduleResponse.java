// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ListIotlinkOtamoduleResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 操作结果
    @NameInMap("success")
    public Boolean success;

    // 应用模块列表
    @NameInMap("data")
    public java.util.List<IotbasicOtaModuleInfo> data;

    public static ListIotlinkOtamoduleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIotlinkOtamoduleResponse self = new ListIotlinkOtamoduleResponse();
        return TeaModel.build(map, self);
    }

    public ListIotlinkOtamoduleResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListIotlinkOtamoduleResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListIotlinkOtamoduleResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListIotlinkOtamoduleResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListIotlinkOtamoduleResponse setData(java.util.List<IotbasicOtaModuleInfo> data) {
        this.data = data;
        return this;
    }
    public java.util.List<IotbasicOtaModuleInfo> getData() {
        return this.data;
    }

}
