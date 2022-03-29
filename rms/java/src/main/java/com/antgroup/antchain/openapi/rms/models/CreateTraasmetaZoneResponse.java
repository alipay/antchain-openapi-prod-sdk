// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class CreateTraasmetaZoneResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // zone
    @NameInMap("zone")
    public TraasZoneDto zone;

    public static CreateTraasmetaZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTraasmetaZoneResponse self = new CreateTraasmetaZoneResponse();
        return TeaModel.build(map, self);
    }

    public CreateTraasmetaZoneResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateTraasmetaZoneResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateTraasmetaZoneResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateTraasmetaZoneResponse setZone(TraasZoneDto zone) {
        this.zone = zone;
        return this;
    }
    public TraasZoneDto getZone() {
        return this.zone;
    }

}
