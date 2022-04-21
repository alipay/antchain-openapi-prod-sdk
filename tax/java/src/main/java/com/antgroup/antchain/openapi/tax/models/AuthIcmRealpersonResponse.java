// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class AuthIcmRealpersonResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否授权成功true是，false否
    @NameInMap("auth_success")
    public Boolean authSuccess;

    // 订单号
    @NameInMap("order_no")
    public String orderNo;

    // 过期时间
    @NameInMap("expire_time")
    public String expireTime;

    // 授权时间 unix时间戳
    @NameInMap("auth_time")
    public String authTime;

    public static AuthIcmRealpersonResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthIcmRealpersonResponse self = new AuthIcmRealpersonResponse();
        return TeaModel.build(map, self);
    }

    public AuthIcmRealpersonResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AuthIcmRealpersonResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AuthIcmRealpersonResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AuthIcmRealpersonResponse setAuthSuccess(Boolean authSuccess) {
        this.authSuccess = authSuccess;
        return this;
    }
    public Boolean getAuthSuccess() {
        return this.authSuccess;
    }

    public AuthIcmRealpersonResponse setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public AuthIcmRealpersonResponse setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public AuthIcmRealpersonResponse setAuthTime(String authTime) {
        this.authTime = authTime;
        return this;
    }
    public String getAuthTime() {
        return this.authTime;
    }

}
