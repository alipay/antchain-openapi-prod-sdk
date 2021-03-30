// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class SaveBiznewVehicleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 托运订单号
    // 
    // 
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 拖车单号
    // 
    // 
    @NameInMap("vehicle_code")
    @Validation(required = true)
    public String vehicleCode;

    // 货代did
    @NameInMap("forwarder_did")
    @Validation(required = true)
    public String forwarderDid;

    // 拖车总金额 [业务必填]
    @NameInMap("vehicle_total_amount")
    public String vehicleTotalAmount;

    // 拖车运费金额 [业务必填]
    @NameInMap("vehicle_amount")
    public String vehicleAmount;

    // 拖车杂费金额 [业务必填]
    @NameInMap("vehicle_charges")
    public String vehicleCharges;

    // 币种 [业务必填]
    @NameInMap("currency")
    public String currency;

    // 箱号箱ID
    // 
    // 
    @NameInMap("container_id_info_list")
    public java.util.List<ContainerIdInfo> containerIdInfoList;

    public static SaveBiznewVehicleRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBiznewVehicleRequest self = new SaveBiznewVehicleRequest();
        return TeaModel.build(map, self);
    }

    public SaveBiznewVehicleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveBiznewVehicleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveBiznewVehicleRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public SaveBiznewVehicleRequest setVehicleCode(String vehicleCode) {
        this.vehicleCode = vehicleCode;
        return this;
    }
    public String getVehicleCode() {
        return this.vehicleCode;
    }

    public SaveBiznewVehicleRequest setForwarderDid(String forwarderDid) {
        this.forwarderDid = forwarderDid;
        return this;
    }
    public String getForwarderDid() {
        return this.forwarderDid;
    }

    public SaveBiznewVehicleRequest setVehicleTotalAmount(String vehicleTotalAmount) {
        this.vehicleTotalAmount = vehicleTotalAmount;
        return this;
    }
    public String getVehicleTotalAmount() {
        return this.vehicleTotalAmount;
    }

    public SaveBiznewVehicleRequest setVehicleAmount(String vehicleAmount) {
        this.vehicleAmount = vehicleAmount;
        return this;
    }
    public String getVehicleAmount() {
        return this.vehicleAmount;
    }

    public SaveBiznewVehicleRequest setVehicleCharges(String vehicleCharges) {
        this.vehicleCharges = vehicleCharges;
        return this;
    }
    public String getVehicleCharges() {
        return this.vehicleCharges;
    }

    public SaveBiznewVehicleRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public SaveBiznewVehicleRequest setContainerIdInfoList(java.util.List<ContainerIdInfo> containerIdInfoList) {
        this.containerIdInfoList = containerIdInfoList;
        return this;
    }
    public java.util.List<ContainerIdInfo> getContainerIdInfoList() {
        return this.containerIdInfoList;
    }

}
