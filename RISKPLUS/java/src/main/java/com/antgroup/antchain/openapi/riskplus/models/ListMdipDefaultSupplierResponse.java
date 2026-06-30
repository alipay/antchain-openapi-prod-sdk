// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ListMdipDefaultSupplierResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 供应商列表
    @NameInMap("supplier_list")
    public java.util.List<Supplier> supplierList;

    public static ListMdipDefaultSupplierResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMdipDefaultSupplierResponse self = new ListMdipDefaultSupplierResponse();
        return TeaModel.build(map, self);
    }

    public ListMdipDefaultSupplierResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListMdipDefaultSupplierResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMdipDefaultSupplierResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListMdipDefaultSupplierResponse setSupplierList(java.util.List<Supplier> supplierList) {
        this.supplierList = supplierList;
        return this;
    }
    public java.util.List<Supplier> getSupplierList() {
        return this.supplierList;
    }

}
