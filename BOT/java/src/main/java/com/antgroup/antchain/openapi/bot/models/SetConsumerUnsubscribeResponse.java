// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SetConsumerUnsubscribeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 发行设备列表
    @NameInMap("distribute_device_list")
    public java.util.List<String> distributeDeviceList;

    public static SetConsumerUnsubscribeResponse build(java.util.Map<String, ?> map) throws Exception {
        SetConsumerUnsubscribeResponse self = new SetConsumerUnsubscribeResponse();
        return TeaModel.build(map, self);
    }

    public SetConsumerUnsubscribeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SetConsumerUnsubscribeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SetConsumerUnsubscribeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SetConsumerUnsubscribeResponse setDistributeDeviceList(java.util.List<String> distributeDeviceList) {
        this.distributeDeviceList = distributeDeviceList;
        return this;
    }
    public java.util.List<String> getDistributeDeviceList() {
        return this.distributeDeviceList;
    }

}
