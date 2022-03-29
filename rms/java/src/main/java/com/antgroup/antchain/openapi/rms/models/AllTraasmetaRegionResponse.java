// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AllTraasmetaRegionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // regions
    @NameInMap("regions")
    public java.util.List<TraasRegionDto> regions;

    public static AllTraasmetaRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        AllTraasmetaRegionResponse self = new AllTraasmetaRegionResponse();
        return TeaModel.build(map, self);
    }

    public AllTraasmetaRegionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AllTraasmetaRegionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AllTraasmetaRegionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AllTraasmetaRegionResponse setRegions(java.util.List<TraasRegionDto> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<TraasRegionDto> getRegions() {
        return this.regions;
    }

}
