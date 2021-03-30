// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class SaveBizVehicleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
    @NameInMap("action")
    public String action;

    // 箱子信息 业务必填
    @NameInMap("container_params")
    public java.util.List<VehicleContainerParam> containerParams;

    // 货代did
    @NameInMap("forwarder_did")
    @Validation(required = true)
    public String forwarderDid;

    // 订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 拖车单号
    @NameInMap("vehicle_code")
    @Validation(required = true)
    public String vehicleCode;

    // 车牌号 
    @NameInMap("vehicle_no")
    public String vehicleNo;

    public static SaveBizVehicleRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBizVehicleRequest self = new SaveBizVehicleRequest();
        return TeaModel.build(map, self);
    }

    public SaveBizVehicleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveBizVehicleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveBizVehicleRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public SaveBizVehicleRequest setContainerParams(java.util.List<VehicleContainerParam> containerParams) {
        this.containerParams = containerParams;
        return this;
    }
    public java.util.List<VehicleContainerParam> getContainerParams() {
        return this.containerParams;
    }

    public SaveBizVehicleRequest setForwarderDid(String forwarderDid) {
        this.forwarderDid = forwarderDid;
        return this;
    }
    public String getForwarderDid() {
        return this.forwarderDid;
    }

    public SaveBizVehicleRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public SaveBizVehicleRequest setVehicleCode(String vehicleCode) {
        this.vehicleCode = vehicleCode;
        return this;
    }
    public String getVehicleCode() {
        return this.vehicleCode;
    }

    public SaveBizVehicleRequest setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
        return this;
    }
    public String getVehicleNo() {
        return this.vehicleNo;
    }

}
