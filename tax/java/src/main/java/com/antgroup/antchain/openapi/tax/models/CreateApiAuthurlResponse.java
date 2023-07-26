// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class CreateApiAuthurlResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 订单号
    @NameInMap("order_no")
    public String orderNo;

    // 短链接地址
    @NameInMap("login_url")
    public String loginUrl;

    // 授权原始链接
    @NameInMap("origin_login_url")
    public String originLoginUrl;

    public static CreateApiAuthurlResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApiAuthurlResponse self = new CreateApiAuthurlResponse();
        return TeaModel.build(map, self);
    }

    public CreateApiAuthurlResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateApiAuthurlResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateApiAuthurlResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateApiAuthurlResponse setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public CreateApiAuthurlResponse setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
        return this;
    }
    public String getLoginUrl() {
        return this.loginUrl;
    }

    public CreateApiAuthurlResponse setOriginLoginUrl(String originLoginUrl) {
        this.originLoginUrl = originLoginUrl;
        return this;
    }
    public String getOriginLoginUrl() {
        return this.originLoginUrl;
    }

}
