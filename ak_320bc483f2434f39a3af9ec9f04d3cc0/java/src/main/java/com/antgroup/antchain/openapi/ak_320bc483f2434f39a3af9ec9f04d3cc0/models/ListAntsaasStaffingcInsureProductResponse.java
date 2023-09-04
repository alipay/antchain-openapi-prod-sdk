// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class ListAntsaasStaffingcInsureProductResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 保险产品列表
    @NameInMap("product_list")
    public java.util.List<InsureProductInfo> productList;

    public static ListAntsaasStaffingcInsureProductResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAntsaasStaffingcInsureProductResponse self = new ListAntsaasStaffingcInsureProductResponse();
        return TeaModel.build(map, self);
    }

    public ListAntsaasStaffingcInsureProductResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListAntsaasStaffingcInsureProductResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAntsaasStaffingcInsureProductResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListAntsaasStaffingcInsureProductResponse setProductList(java.util.List<InsureProductInfo> productList) {
        this.productList = productList;
        return this;
    }
    public java.util.List<InsureProductInfo> getProductList() {
        return this.productList;
    }

}
