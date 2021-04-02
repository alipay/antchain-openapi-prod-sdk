// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class UpdateDeviceInfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链上设备Id
    @NameInMap("chain_device_id")
    @Validation(required = true)
    public String chainDeviceId;

    // 设备imei号
    @NameInMap("device_imei")
    public String deviceImei;

    // 设备数据模型Id
    // 
    // 
    @NameInMap("data_model_id")
    public String dataModelId;

    // 设备ICCID
    // 
    // 
    @NameInMap("device_iccid")
    public String deviceIccid;

    // deviceTypeCode 枚举 
    // 
    // 车辆: 1000
    // 四轮车: 1001
    // 纯电四轮车:1002
    // 混动四轮车 1003
    // 燃油四轮车 : 1004
    // 
    // 两轮车:1011
    // 两轮单车:1012
    // 两轮助力车:1013
    // 
    // 换电柜 :2000
    // 二轮车换电柜:2001
    // 
    // 电池 :3000
    // 磷酸铁电池:3001
    // 三元锂电池:3002
    // 
    // 回收设备:4000
    // 垃圾分类回收:4001
    // 
    // 洗车机 :5000
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

    public static UpdateDeviceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceInfoRequest self = new UpdateDeviceInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceInfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDeviceInfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDeviceInfoRequest setChainDeviceId(String chainDeviceId) {
        this.chainDeviceId = chainDeviceId;
        return this;
    }
    public String getChainDeviceId() {
        return this.chainDeviceId;
    }

    public UpdateDeviceInfoRequest setDeviceImei(String deviceImei) {
        this.deviceImei = deviceImei;
        return this;
    }
    public String getDeviceImei() {
        return this.deviceImei;
    }

    public UpdateDeviceInfoRequest setDataModelId(String dataModelId) {
        this.dataModelId = dataModelId;
        return this;
    }
    public String getDataModelId() {
        return this.dataModelId;
    }

    public UpdateDeviceInfoRequest setDeviceIccid(String deviceIccid) {
        this.deviceIccid = deviceIccid;
        return this;
    }
    public String getDeviceIccid() {
        return this.deviceIccid;
    }

    public UpdateDeviceInfoRequest setDeviceTypeCode(Long deviceTypeCode) {
        this.deviceTypeCode = deviceTypeCode;
        return this;
    }
    public Long getDeviceTypeCode() {
        return this.deviceTypeCode;
    }

    public UpdateDeviceInfoRequest setInitialPrice(Long initialPrice) {
        this.initialPrice = initialPrice;
        return this;
    }
    public Long getInitialPrice() {
        return this.initialPrice;
    }

    public UpdateDeviceInfoRequest setFactoryTime(String factoryTime) {
        this.factoryTime = factoryTime;
        return this;
    }
    public String getFactoryTime() {
        return this.factoryTime;
    }

    public UpdateDeviceInfoRequest setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
        return this;
    }
    public String getReleaseTime() {
        return this.releaseTime;
    }

}
