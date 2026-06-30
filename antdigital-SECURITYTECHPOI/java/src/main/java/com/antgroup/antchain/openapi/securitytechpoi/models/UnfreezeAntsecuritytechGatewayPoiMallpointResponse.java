// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytechpoi.models;

import com.aliyun.tea.*;

public class UnfreezeAntsecuritytechGatewayPoiMallpointResponse extends TeaModel {
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

    public static UnfreezeAntsecuritytechGatewayPoiMallpointResponse build(java.util.Map<String, ?> map) throws Exception {
        UnfreezeAntsecuritytechGatewayPoiMallpointResponse self = new UnfreezeAntsecuritytechGatewayPoiMallpointResponse();
        return TeaModel.build(map, self);
    }

    public UnfreezeAntsecuritytechGatewayPoiMallpointResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UnfreezeAntsecuritytechGatewayPoiMallpointResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UnfreezeAntsecuritytechGatewayPoiMallpointResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UnfreezeAntsecuritytechGatewayPoiMallpointResponse setUnfreezeResult(PoiMallPointUnfreezeResult unfreezeResult) {
        this.unfreezeResult = unfreezeResult;
        return this;
    }
    public PoiMallPointUnfreezeResult getUnfreezeResult() {
        return this.unfreezeResult;
    }

}
