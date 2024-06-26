// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateDistributedeviceBydeviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备Id
    // 
    @NameInMap("device_id")
    @Validation(required = true)
    public String deviceId;

    // 设备数据模型Id
    // 
    // 
    @NameInMap("data_model_id")
    public String dataModelId;

    // 场景码 
    // 
    // 
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 设备注册信息
    // 
    // 
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 签名
    // 
    // 
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    // sdk版本号
    // 
    // 
    @NameInMap("sdk_id")
    @Validation(required = true)
    public String sdkId;

    // 设备类型编码，必填，对应资管平台中的设备类型 
    // 
    // 枚举值：
    // 
    // 车辆 1000 
    // 车辆 四轮车 1001 
    // 车辆 四轮车 纯电四轮车 1002 
    // 车辆 四轮车 混动四轮车 1003 
    // 车辆 四轮车 燃油四轮车 1004 
    // 车辆 两轮车 1011 
    // 车辆 两轮车 两轮单车 1012 
    // 车辆 两轮车 两轮助力车 1013 
    // 
    // 换电柜 2000 
    // 换电柜 二轮车换电柜 2001 
    // 
    // 电池 3000 
    // 电池 磷酸铁电池 3001 
    // 电池 三元锂电池 3002 
    // 
    // 回收设备 4000 
    // 
    // 垃圾分类回收 4001 
    // 
    // 洗车机 5000
    // 
    // 通用计算设备	                6000
    // 	移动设备		        6001
    // 		智能手机	        6002
    // 		工业掌机	        6003
    // 		平板电脑	        6004
    // 	云设备		        6011
    // 		云计算服务器	6012
    @NameInMap("device_type_code")
    public Long deviceTypeCode;

    // 设备单价 单位：分
    @NameInMap("initial_price")
    public Long initialPrice;

    // 出厂时间
    @NameInMap("factory_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String factoryTime;

    // 投放时间
    @NameInMap("release_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String releaseTime;

    // 设备型号
    @NameInMap("device_name")
    public String deviceName;

    // 资产所有人标识（统一社会信用代码）
    @NameInMap("owner")
    public String owner;

    // 资产所有人名称
    @NameInMap("owner_name")
    public String ownerName;

    // 额外信息
    @NameInMap("extra_info")
    public String extraInfo;

    // 设备IMEI
    @NameInMap("device_imei")
    public String deviceImei;

    public static CreateDistributedeviceBydeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDistributedeviceBydeviceRequest self = new CreateDistributedeviceBydeviceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDistributedeviceBydeviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDistributedeviceBydeviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDistributedeviceBydeviceRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public CreateDistributedeviceBydeviceRequest setDataModelId(String dataModelId) {
        this.dataModelId = dataModelId;
        return this;
    }
    public String getDataModelId() {
        return this.dataModelId;
    }

    public CreateDistributedeviceBydeviceRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public CreateDistributedeviceBydeviceRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateDistributedeviceBydeviceRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public CreateDistributedeviceBydeviceRequest setSdkId(String sdkId) {
        this.sdkId = sdkId;
        return this;
    }
    public String getSdkId() {
        return this.sdkId;
    }

    public CreateDistributedeviceBydeviceRequest setDeviceTypeCode(Long deviceTypeCode) {
        this.deviceTypeCode = deviceTypeCode;
        return this;
    }
    public Long getDeviceTypeCode() {
        return this.deviceTypeCode;
    }

    public CreateDistributedeviceBydeviceRequest setInitialPrice(Long initialPrice) {
        this.initialPrice = initialPrice;
        return this;
    }
    public Long getInitialPrice() {
        return this.initialPrice;
    }

    public CreateDistributedeviceBydeviceRequest setFactoryTime(String factoryTime) {
        this.factoryTime = factoryTime;
        return this;
    }
    public String getFactoryTime() {
        return this.factoryTime;
    }

    public CreateDistributedeviceBydeviceRequest setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
        return this;
    }
    public String getReleaseTime() {
        return this.releaseTime;
    }

    public CreateDistributedeviceBydeviceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public CreateDistributedeviceBydeviceRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public CreateDistributedeviceBydeviceRequest setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public CreateDistributedeviceBydeviceRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public CreateDistributedeviceBydeviceRequest setDeviceImei(String deviceImei) {
        this.deviceImei = deviceImei;
        return this;
    }
    public String getDeviceImei() {
        return this.deviceImei;
    }

}
