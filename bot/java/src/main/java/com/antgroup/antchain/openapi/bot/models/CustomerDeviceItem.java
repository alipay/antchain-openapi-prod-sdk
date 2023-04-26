// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CustomerDeviceItem extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 账号id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    //  设备品类-型号-规格  
    @NameInMap("device_type")
    @Validation(required = true)
    public String deviceType;

    // 设备sn
    @NameInMap("device_sn")
    @Validation(required = true)
    public String deviceSn;

    // 设备did
    @NameInMap("device_did")
    @Validation(required = true)
    public String deviceDid;

    // 服务有效期
    @NameInMap("valide_time")
    @Validation(required = true)
    public String valideTime;

    // 设备状态
    @NameInMap("device_status")
    @Validation(required = true)
    public String deviceStatus;

    // 服务状态
    @NameInMap("service_status")
    @Validation(required = true)
    public String serviceStatus;

    // 屏幕状态 开屏、锁屏
    @NameInMap("screen_status")
    public String screenStatus;

    public static CustomerDeviceItem build(java.util.Map<String, ?> map) throws Exception {
        CustomerDeviceItem self = new CustomerDeviceItem();
        return TeaModel.build(map, self);
    }

    public CustomerDeviceItem setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CustomerDeviceItem setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CustomerDeviceItem setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CustomerDeviceItem setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public CustomerDeviceItem setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public CustomerDeviceItem setDeviceDid(String deviceDid) {
        this.deviceDid = deviceDid;
        return this;
    }
    public String getDeviceDid() {
        return this.deviceDid;
    }

    public CustomerDeviceItem setValideTime(String valideTime) {
        this.valideTime = valideTime;
        return this;
    }
    public String getValideTime() {
        return this.valideTime;
    }

    public CustomerDeviceItem setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
        return this;
    }
    public String getDeviceStatus() {
        return this.deviceStatus;
    }

    public CustomerDeviceItem setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }
    public String getServiceStatus() {
        return this.serviceStatus;
    }

    public CustomerDeviceItem setScreenStatus(String screenStatus) {
        this.screenStatus = screenStatus;
        return this;
    }
    public String getScreenStatus() {
        return this.screenStatus;
    }

}
