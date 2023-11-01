// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class StopIotplantformProductResponse extends TeaModel {
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
    // 
    @NameInMap("meter_data_id")
    public Long meterDataId;

    // 商品实例是否处于可用状态，1可用，0不可用
    @NameInMap("status")
    public Long status;

    public static StopIotplantformProductResponse build(java.util.Map<String, ?> map) throws Exception {
        StopIotplantformProductResponse self = new StopIotplantformProductResponse();
        return TeaModel.build(map, self);
    }

    public StopIotplantformProductResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StopIotplantformProductResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StopIotplantformProductResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StopIotplantformProductResponse setMeterDataId(Long meterDataId) {
        this.meterDataId = meterDataId;
        return this;
    }
    public Long getMeterDataId() {
        return this.meterDataId;
    }

    public StopIotplantformProductResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
