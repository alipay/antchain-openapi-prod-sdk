// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dubhe.models;

import com.aliyun.tea.*;

public class PushRiskplusDubbridgeInstallmentSupplementRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号：request请求单号，每次请求唯一，如uuid
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 资产方用户唯一标识
    @NameInMap("open_id")
    @Validation(required = true)
    public String openId;

    // 资产方购物订单号，如二轮车/摩托车订单号
    @NameInMap("biz_order_no")
    @Validation(required = true)
    public String bizOrderNo;

    // 业务类型：1-现金贷；2-分期付
    // 
    @NameInMap("prod_type")
    public String prodType;

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

    // 渠道号
    @NameInMap("channel_code")
    public String channelCode;

    // 导流平台
    @NameInMap("traffic_platform")
    public String trafficPlatform;

    public static PushRiskplusDubbridgeInstallmentSupplementRequest build(java.util.Map<String, ?> map) throws Exception {
        PushRiskplusDubbridgeInstallmentSupplementRequest self = new PushRiskplusDubbridgeInstallmentSupplementRequest();
        return TeaModel.build(map, self);
    }

    public PushRiskplusDubbridgeInstallmentSupplementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushRiskplusDubbridgeInstallmentSupplementRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushRiskplusDubbridgeInstallmentSupplementRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public PushRiskplusDubbridgeInstallmentSupplementRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public PushRiskplusDubbridgeInstallmentSupplementRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public PushRiskplusDubbridgeInstallmentSupplementRequest setProdType(String prodType) {
        this.prodType = prodType;
        return this;
    }
    public String getProdType() {
        return this.prodType;
    }

    public PushRiskplusDubbridgeInstallmentSupplementRequest setFileScene(String fileScene) {
        this.fileScene = fileScene;
        return this;
    }
    public String getFileScene() {
        return this.fileScene;
    }

    public PushRiskplusDubbridgeInstallmentSupplementRequest setFileList(java.util.List<SupplementFile> fileList) {
        this.fileList = fileList;
        return this;
    }
    public java.util.List<SupplementFile> getFileList() {
        return this.fileList;
    }

    public PushRiskplusDubbridgeInstallmentSupplementRequest setStoreInfo(StoreInfo storeInfo) {
        this.storeInfo = storeInfo;
        return this;
    }
    public StoreInfo getStoreInfo() {
        return this.storeInfo;
    }

    public PushRiskplusDubbridgeInstallmentSupplementRequest setVehicleInfo(VehicleInfo vehicleInfo) {
        this.vehicleInfo = vehicleInfo;
        return this;
    }
    public VehicleInfo getVehicleInfo() {
        return this.vehicleInfo;
    }

    public PushRiskplusDubbridgeInstallmentSupplementRequest setAdditional(Additional additional) {
        this.additional = additional;
        return this;
    }
    public Additional getAdditional() {
        return this.additional;
    }

    public PushRiskplusDubbridgeInstallmentSupplementRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public PushRiskplusDubbridgeInstallmentSupplementRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

}
