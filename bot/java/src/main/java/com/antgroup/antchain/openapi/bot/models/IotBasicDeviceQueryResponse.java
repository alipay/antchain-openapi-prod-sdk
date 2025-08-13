// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class IotBasicDeviceQueryResponse extends TeaModel {
    // 设备名称	
    // 
    /**
     * <strong>example:</strong>
     * <p>智能防疫一体机</p>
     */
    @NameInMap("device_name")
    @Validation(required = true)
    public String deviceName;

    // 设备序列号
    /**
     * <strong>example:</strong>
     * <p>CN12300x</p>
     */
    @NameInMap("device_sn")
    @Validation(required = true)
    public String deviceSn;

    // 设备品类名称	
    /**
     * <strong>example:</strong>
     * <p>智能防疫机</p>
     */
    @NameInMap("device_category_name")
    @Validation(required = true)
    public String deviceCategoryName;

    // 设备型号
    /**
     * <strong>example:</strong>
     * <p>PL10</p>
     */
    @NameInMap("device_model")
    @Validation(required = true)
    public String deviceModel;

    // 设备状态
    /**
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("device_status")
    public String deviceStatus;

    // 设备安装位置
    /**
     * <strong>example:</strong>
     * <p>浙江省杭州市西湖区 </p>
     */
    @NameInMap("location")
    public String location;

    // 设备注册时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("register_time")
    @Validation(required = true)
    public String registerTime;

    // 设备厂商
    /**
     * <strong>example:</strong>
     * <p>蚂蚁数科</p>
     */
    @NameInMap("corp_name")
    @Validation(required = true)
    public String corpName;

    // 租户ID
    /**
     * <strong>example:</strong>
     * <p>2088xx</p>
     */
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 客户名称
    /**
     * <strong>example:</strong>
     * <p>测试客户xx </p>
     */
    @NameInMap("customer_name")
    @Validation(required = true)
    public String customerName;

    // 异常错误码
    /**
     * <strong>example:</strong>
     * <p>SMILE_INIT_ERROR</p>
     */
    @NameInMap("abnormal_code")
    public String abnormalCode;

    // 设备唯一身份id
    /**
     * <strong>example:</strong>
     * <p>did:private:12dsadadadf </p>
     */
    @NameInMap("device_did")
    public String deviceDid;

    // 账号ID
    /**
     * <strong>example:</strong>
     * <p>12321321</p>
     */
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 账户名称
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("account_name")
    @Validation(required = true)
    public String accountName;

    // 设备服务状态
    /**
     * <strong>example:</strong>
     * <p>INIT</p>
     */
    @NameInMap("service_status")
    @Validation(required = true)
    public String serviceStatus;

    // 应用版本号
    /**
     * <strong>example:</strong>
     * <p>1.1.13</p>
     */
    @NameInMap("app_version")
    @Validation(required = true)
    public String appVersion;

    // 服务有效期
    /**
     * <strong>example:</strong>
     * <p>2024-4-01</p>
     */
    @NameInMap("validity_time")
    public String validityTime;

    public static IotBasicDeviceQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        IotBasicDeviceQueryResponse self = new IotBasicDeviceQueryResponse();
        return TeaModel.build(map, self);
    }

    public IotBasicDeviceQueryResponse setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public IotBasicDeviceQueryResponse setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public IotBasicDeviceQueryResponse setDeviceCategoryName(String deviceCategoryName) {
        this.deviceCategoryName = deviceCategoryName;
        return this;
    }
    public String getDeviceCategoryName() {
        return this.deviceCategoryName;
    }

    public IotBasicDeviceQueryResponse setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

    public IotBasicDeviceQueryResponse setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
        return this;
    }
    public String getDeviceStatus() {
        return this.deviceStatus;
    }

    public IotBasicDeviceQueryResponse setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public IotBasicDeviceQueryResponse setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
        return this;
    }
    public String getRegisterTime() {
        return this.registerTime;
    }

    public IotBasicDeviceQueryResponse setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public IotBasicDeviceQueryResponse setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public IotBasicDeviceQueryResponse setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public IotBasicDeviceQueryResponse setAbnormalCode(String abnormalCode) {
        this.abnormalCode = abnormalCode;
        return this;
    }
    public String getAbnormalCode() {
        return this.abnormalCode;
    }

    public IotBasicDeviceQueryResponse setDeviceDid(String deviceDid) {
        this.deviceDid = deviceDid;
        return this;
    }
    public String getDeviceDid() {
        return this.deviceDid;
    }

    public IotBasicDeviceQueryResponse setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public IotBasicDeviceQueryResponse setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public IotBasicDeviceQueryResponse setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }
    public String getServiceStatus() {
        return this.serviceStatus;
    }

    public IotBasicDeviceQueryResponse setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public IotBasicDeviceQueryResponse setValidityTime(String validityTime) {
        this.validityTime = validityTime;
        return this;
    }
    public String getValidityTime() {
        return this.validityTime;
    }

}
