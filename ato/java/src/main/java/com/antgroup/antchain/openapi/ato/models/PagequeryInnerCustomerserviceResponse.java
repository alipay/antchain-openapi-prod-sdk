// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerCustomerserviceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总数
    @NameInMap("total")
    public Long total;

    // 客服信息
    @NameInMap("customer_service_info_list")
    public java.util.List<CustomerServiceInfo> customerServiceInfoList;

    public static PagequeryInnerCustomerserviceResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerCustomerserviceResponse self = new PagequeryInnerCustomerserviceResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerCustomerserviceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryInnerCustomerserviceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryInnerCustomerserviceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryInnerCustomerserviceResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public PagequeryInnerCustomerserviceResponse setCustomerServiceInfoList(java.util.List<CustomerServiceInfo> customerServiceInfoList) {
        this.customerServiceInfoList = customerServiceInfoList;
        return this;
    }
    public java.util.List<CustomerServiceInfo> getCustomerServiceInfoList() {
        return this.customerServiceInfoList;
    }

}
