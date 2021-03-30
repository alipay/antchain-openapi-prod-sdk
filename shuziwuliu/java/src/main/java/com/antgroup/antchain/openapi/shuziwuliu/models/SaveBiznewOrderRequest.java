// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class SaveBiznewOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 托运订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 托运人did [业务必填]
    @NameInMap("consignor_did")
    public String consignorDid;

    // 承运人did [业务必填]
    @NameInMap("carrier_did")
    public String carrierDid;

    // 订舱单号列表
    @NameInMap("booking_info_list")
    public java.util.List<BookingNoInfo> bookingInfoList;

    // 拖车单号
    @NameInMap("vehicle_code_list")
    public java.util.List<String> vehicleCodeList;

    // 报关单号
    @NameInMap("customs_code_list")
    public java.util.List<String> customsCodeList;

    // 订单确认 CREATE/FINISH (创建/确认)  [业务必填]
    @NameInMap("status")
    public String status;

    public static SaveBiznewOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBiznewOrderRequest self = new SaveBiznewOrderRequest();
        return TeaModel.build(map, self);
    }

    public SaveBiznewOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveBiznewOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveBiznewOrderRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public SaveBiznewOrderRequest setConsignorDid(String consignorDid) {
        this.consignorDid = consignorDid;
        return this;
    }
    public String getConsignorDid() {
        return this.consignorDid;
    }

    public SaveBiznewOrderRequest setCarrierDid(String carrierDid) {
        this.carrierDid = carrierDid;
        return this;
    }
    public String getCarrierDid() {
        return this.carrierDid;
    }

    public SaveBiznewOrderRequest setBookingInfoList(java.util.List<BookingNoInfo> bookingInfoList) {
        this.bookingInfoList = bookingInfoList;
        return this;
    }
    public java.util.List<BookingNoInfo> getBookingInfoList() {
        return this.bookingInfoList;
    }

    public SaveBiznewOrderRequest setVehicleCodeList(java.util.List<String> vehicleCodeList) {
        this.vehicleCodeList = vehicleCodeList;
        return this;
    }
    public java.util.List<String> getVehicleCodeList() {
        return this.vehicleCodeList;
    }

    public SaveBiznewOrderRequest setCustomsCodeList(java.util.List<String> customsCodeList) {
        this.customsCodeList = customsCodeList;
        return this;
    }
    public java.util.List<String> getCustomsCodeList() {
        return this.customsCodeList;
    }

    public SaveBiznewOrderRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
