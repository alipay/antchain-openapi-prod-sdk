// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ImportPurchaseorderThirdpartyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 采购平台-采购详情id
    @NameInMap("purchase_order_id")
    public String purchaseOrderId;

    // 当前状态
    // READY_DELIVER(0, "待发货"),
    // DELIVERED(1, "已发货"),
    // REFUSED(2, "已拒发"),
    // CANCELED(4, "已取消"),
    // REFUNDED(5, "已退货");
    // 
    @NameInMap("status")
    public String status;

    // InsertPurchaseOrderFailInfo
    @NameInMap("fail_map")
    public InsertPurchaseOrderFailInfo failMap;

    // 真实订单信息，成功不返回
    // 
    @NameInMap("purchase_order_info_detail")
    public PurchaseOrderInfoDetail purchaseOrderInfoDetail;

    // 幂等号
    @NameInMap("idempot_id")
    public String idempotId;

    public static ImportPurchaseorderThirdpartyResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportPurchaseorderThirdpartyResponse self = new ImportPurchaseorderThirdpartyResponse();
        return TeaModel.build(map, self);
    }

    public ImportPurchaseorderThirdpartyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ImportPurchaseorderThirdpartyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportPurchaseorderThirdpartyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ImportPurchaseorderThirdpartyResponse setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
        return this;
    }
    public String getPurchaseOrderId() {
        return this.purchaseOrderId;
    }

    public ImportPurchaseorderThirdpartyResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ImportPurchaseorderThirdpartyResponse setFailMap(InsertPurchaseOrderFailInfo failMap) {
        this.failMap = failMap;
        return this;
    }
    public InsertPurchaseOrderFailInfo getFailMap() {
        return this.failMap;
    }

    public ImportPurchaseorderThirdpartyResponse setPurchaseOrderInfoDetail(PurchaseOrderInfoDetail purchaseOrderInfoDetail) {
        this.purchaseOrderInfoDetail = purchaseOrderInfoDetail;
        return this;
    }
    public PurchaseOrderInfoDetail getPurchaseOrderInfoDetail() {
        return this.purchaseOrderInfoDetail;
    }

    public ImportPurchaseorderThirdpartyResponse setIdempotId(String idempotId) {
        this.idempotId = idempotId;
        return this;
    }
    public String getIdempotId() {
        return this.idempotId;
    }

}
