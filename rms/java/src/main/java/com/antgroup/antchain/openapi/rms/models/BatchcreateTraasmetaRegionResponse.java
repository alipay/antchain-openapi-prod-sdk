// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class BatchcreateTraasmetaRegionResponse extends TeaModel {
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

    public static BatchcreateTraasmetaRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateTraasmetaRegionResponse self = new BatchcreateTraasmetaRegionResponse();
        return TeaModel.build(map, self);
    }

    public BatchcreateTraasmetaRegionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchcreateTraasmetaRegionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchcreateTraasmetaRegionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchcreateTraasmetaRegionResponse setRegions(java.util.List<TraasRegionDto> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<TraasRegionDto> getRegions() {
        return this.regions;
    }

}
