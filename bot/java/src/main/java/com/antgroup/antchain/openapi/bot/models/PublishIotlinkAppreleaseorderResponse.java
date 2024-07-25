// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PublishIotlinkAppreleaseorderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 接口调用结果
    @NameInMap("success")
    public Boolean success;

    // 未完成的设备升级列表
    @NameInMap("unfinished_list")
    public java.util.List<IotbasicReleaseDeviceInfo> unfinishedList;

    public static PublishIotlinkAppreleaseorderResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishIotlinkAppreleaseorderResponse self = new PublishIotlinkAppreleaseorderResponse();
        return TeaModel.build(map, self);
    }

    public PublishIotlinkAppreleaseorderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PublishIotlinkAppreleaseorderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PublishIotlinkAppreleaseorderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PublishIotlinkAppreleaseorderResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PublishIotlinkAppreleaseorderResponse setUnfinishedList(java.util.List<IotbasicReleaseDeviceInfo> unfinishedList) {
        this.unfinishedList = unfinishedList;
        return this;
    }
    public java.util.List<IotbasicReleaseDeviceInfo> getUnfinishedList() {
        return this.unfinishedList;
    }

}
