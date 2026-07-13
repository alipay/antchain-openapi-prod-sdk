// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class ListCustomerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 企业列表
    @NameInMap("customers")
    @Validation(required = true)
    public java.util.List<Customer> customers;

    public static ListCustomerResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomerResponse self = new ListCustomerResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListCustomerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListCustomerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListCustomerResponse setCustomers(java.util.List<Customer> customers) {
        this.customers = customers;
        return this;
    }
    public java.util.List<Customer> getCustomers() {
        return this.customers;
    }

}
