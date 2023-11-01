// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class OpenIotplantformProductResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商品计量表主键ID
    @NameInMap("meter_data_id")
    public Long meterDataId;

    // 商品实例是否处于可用状态
    @NameInMap("status")
    public Long status;

    public static OpenIotplantformProductResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenIotplantformProductResponse self = new OpenIotplantformProductResponse();
        return TeaModel.build(map, self);
    }

    public OpenIotplantformProductResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public OpenIotplantformProductResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public OpenIotplantformProductResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public OpenIotplantformProductResponse setMeterDataId(Long meterDataId) {
        this.meterDataId = meterDataId;
        return this;
    }
    public Long getMeterDataId() {
        return this.meterDataId;
    }

    public OpenIotplantformProductResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
