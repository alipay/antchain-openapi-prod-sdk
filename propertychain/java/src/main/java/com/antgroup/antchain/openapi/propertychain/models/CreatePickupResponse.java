// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class CreatePickupResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 提取码
    @NameInMap("pickup_id")
    public String pickupId;

    // 区块链信息
    @NameInMap("info")
    public BlockchainInfo info;

    // 请求标识
    @NameInMap("request_id")
    public String requestId;

    // 时间
    @NameInMap("date")
    public Long date;

    public static CreatePickupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePickupResponse self = new CreatePickupResponse();
        return TeaModel.build(map, self);
    }

    public CreatePickupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreatePickupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreatePickupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreatePickupResponse setPickupId(String pickupId) {
        this.pickupId = pickupId;
        return this;
    }
    public String getPickupId() {
        return this.pickupId;
    }

    public CreatePickupResponse setInfo(BlockchainInfo info) {
        this.info = info;
        return this;
    }
    public BlockchainInfo getInfo() {
        return this.info;
    }

    public CreatePickupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePickupResponse setDate(Long date) {
        this.date = date;
        return this;
    }
    public Long getDate() {
        return this.date;
    }

}
