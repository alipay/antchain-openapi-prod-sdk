// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class BatchqueryTraasmetaZoneResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // zones
    @NameInMap("zones")
    public java.util.List<TraasZoneDto> zones;

    public static BatchqueryTraasmetaZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryTraasmetaZoneResponse self = new BatchqueryTraasmetaZoneResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryTraasmetaZoneResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryTraasmetaZoneResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryTraasmetaZoneResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryTraasmetaZoneResponse setZones(java.util.List<TraasZoneDto> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<TraasZoneDto> getZones() {
        return this.zones;
    }

}
