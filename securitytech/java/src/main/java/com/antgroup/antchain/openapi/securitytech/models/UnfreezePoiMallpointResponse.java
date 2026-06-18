// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class UnfreezePoiMallpointResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 解冻结果详情
    @NameInMap("unfreeze_result")
    public PoiMallPointUnfreezeResult unfreezeResult;

    public static UnfreezePoiMallpointResponse build(java.util.Map<String, ?> map) throws Exception {
        UnfreezePoiMallpointResponse self = new UnfreezePoiMallpointResponse();
        return TeaModel.build(map, self);
    }

    public UnfreezePoiMallpointResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UnfreezePoiMallpointResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UnfreezePoiMallpointResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UnfreezePoiMallpointResponse setUnfreezeResult(PoiMallPointUnfreezeResult unfreezeResult) {
        this.unfreezeResult = unfreezeResult;
        return this;
    }
    public PoiMallPointUnfreezeResult getUnfreezeResult() {
        return this.unfreezeResult;
    }

}
