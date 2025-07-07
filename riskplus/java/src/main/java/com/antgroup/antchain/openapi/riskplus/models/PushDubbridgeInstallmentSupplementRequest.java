// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class PushDubbridgeInstallmentSupplementRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号：request请求单号，每次请求唯一，如uuid
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 业务类型：1-现金贷；2-分期付
    // 
    @NameInMap("prod_type")
    @Validation(required = true)
    public String prodType;

    // 资产方用户唯一标识
    @NameInMap("open_id")
    @Validation(required = true)
    public String openId;

    // 资产方购物订单号，如二轮车/摩托车订单号
    @NameInMap("biz_order_no")
    @Validation(required = true)
    public String bizOrderNo;

    // 材料场景：2-支用前、3-支用后
    @NameInMap("file_scene")
    public String fileScene;

    // 材料列表
    @NameInMap("file_list")
    public java.util.List<SupplementFile> fileList;

    // 门店信息
    @NameInMap("store_info")
    public StoreInfo storeInfo;

    // 订单车辆信息
    @NameInMap("vehicle_info")
    public VehicleInfo vehicleInfo;

    // 补充信息
    @NameInMap("additional")
    public Additional additional;

    public static PushDubbridgeInstallmentSupplementRequest build(java.util.Map<String, ?> map) throws Exception {
        PushDubbridgeInstallmentSupplementRequest self = new PushDubbridgeInstallmentSupplementRequest();
        return TeaModel.build(map, self);
    }

    public PushDubbridgeInstallmentSupplementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushDubbridgeInstallmentSupplementRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushDubbridgeInstallmentSupplementRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public PushDubbridgeInstallmentSupplementRequest setProdType(String prodType) {
        this.prodType = prodType;
        return this;
    }
    public String getProdType() {
        return this.prodType;
    }

    public PushDubbridgeInstallmentSupplementRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public PushDubbridgeInstallmentSupplementRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public PushDubbridgeInstallmentSupplementRequest setFileScene(String fileScene) {
        this.fileScene = fileScene;
        return this;
    }
    public String getFileScene() {
        return this.fileScene;
    }

    public PushDubbridgeInstallmentSupplementRequest setFileList(java.util.List<SupplementFile> fileList) {
        this.fileList = fileList;
        return this;
    }
    public java.util.List<SupplementFile> getFileList() {
        return this.fileList;
    }

    public PushDubbridgeInstallmentSupplementRequest setStoreInfo(StoreInfo storeInfo) {
        this.storeInfo = storeInfo;
        return this;
    }
    public StoreInfo getStoreInfo() {
        return this.storeInfo;
    }

    public PushDubbridgeInstallmentSupplementRequest setVehicleInfo(VehicleInfo vehicleInfo) {
        this.vehicleInfo = vehicleInfo;
        return this;
    }
    public VehicleInfo getVehicleInfo() {
        return this.vehicleInfo;
    }

    public PushDubbridgeInstallmentSupplementRequest setAdditional(Additional additional) {
        this.additional = additional;
        return this;
    }
    public Additional getAdditional() {
        return this.additional;
    }

}
