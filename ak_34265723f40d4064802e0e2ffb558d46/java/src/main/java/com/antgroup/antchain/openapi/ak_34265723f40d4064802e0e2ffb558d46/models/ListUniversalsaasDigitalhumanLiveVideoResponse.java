// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_34265723f40d4064802e0e2ffb558d46.models;

import com.aliyun.tea.*;

public class ListUniversalsaasDigitalhumanLiveVideoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 结果状态
    @NameInMap("success")
    public Boolean success;

    // 直播视频列表
    @NameInMap("data")
    public java.util.List<LiveVideos> data;

    public static ListUniversalsaasDigitalhumanLiveVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUniversalsaasDigitalhumanLiveVideoResponse self = new ListUniversalsaasDigitalhumanLiveVideoResponse();
        return TeaModel.build(map, self);
    }

    public ListUniversalsaasDigitalhumanLiveVideoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListUniversalsaasDigitalhumanLiveVideoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListUniversalsaasDigitalhumanLiveVideoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListUniversalsaasDigitalhumanLiveVideoResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListUniversalsaasDigitalhumanLiveVideoResponse setData(java.util.List<LiveVideos> data) {
        this.data = data;
        return this;
    }
    public java.util.List<LiveVideos> getData() {
        return this.data;
    }

}
