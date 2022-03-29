// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetTraasmetaRegionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // traasregiondto
    @NameInMap("region")
    public TraasRegionDto region;

    public static GetTraasmetaRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTraasmetaRegionResponse self = new GetTraasmetaRegionResponse();
        return TeaModel.build(map, self);
    }

    public GetTraasmetaRegionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetTraasmetaRegionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetTraasmetaRegionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetTraasmetaRegionResponse setRegion(TraasRegionDto region) {
        this.region = region;
        return this;
    }
    public TraasRegionDto getRegion() {
        return this.region;
    }

}
