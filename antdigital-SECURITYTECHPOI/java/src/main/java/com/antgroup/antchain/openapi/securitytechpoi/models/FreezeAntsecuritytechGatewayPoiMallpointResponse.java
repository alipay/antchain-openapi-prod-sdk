// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytechpoi.models;

import com.aliyun.tea.*;

public class FreezeAntsecuritytechGatewayPoiMallpointResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 冻结结果详情
    @NameInMap("freeze_result")
    public PoiMallPointFreezeResult freezeResult;

    public static FreezeAntsecuritytechGatewayPoiMallpointResponse build(java.util.Map<String, ?> map) throws Exception {
        FreezeAntsecuritytechGatewayPoiMallpointResponse self = new FreezeAntsecuritytechGatewayPoiMallpointResponse();
        return TeaModel.build(map, self);
    }

    public FreezeAntsecuritytechGatewayPoiMallpointResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public FreezeAntsecuritytechGatewayPoiMallpointResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public FreezeAntsecuritytechGatewayPoiMallpointResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public FreezeAntsecuritytechGatewayPoiMallpointResponse setFreezeResult(PoiMallPointFreezeResult freezeResult) {
        this.freezeResult = freezeResult;
        return this;
    }
    public PoiMallPointFreezeResult getFreezeResult() {
        return this.freezeResult;
    }

}
