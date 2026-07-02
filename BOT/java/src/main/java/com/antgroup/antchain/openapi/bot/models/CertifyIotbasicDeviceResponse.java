// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CertifyIotbasicDeviceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 设备名称
    @NameInMap("device_name")
    public String deviceName;

    // 设备型号
    @NameInMap("device_model")
    public String deviceModel;

    // 设备状态
    @NameInMap("device_status")
    public String deviceStatus;

    // 注册时间
    @NameInMap("register_time")
    public String registerTime;

    // 客户名称
    @NameInMap("customer_name")
    public String customerName;

    // 客户对应租户ID
    @NameInMap("tenant_id")
    public String tenantId;

    // 客户端版本
    @NameInMap("app_version")
    public String appVersion;

    // 服务状态
    @NameInMap("service_status")
    public String serviceStatus;

    // 子账号ID
    @NameInMap("account_id")
    public String accountId;

    // 所属账号名称
    @NameInMap("account_name")
    public String accountName;

    // 子账号角色
    @NameInMap("user_role")
    public String userRole;

    public static CertifyIotbasicDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        CertifyIotbasicDeviceResponse self = new CertifyIotbasicDeviceResponse();
        return TeaModel.build(map, self);
    }

    public CertifyIotbasicDeviceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CertifyIotbasicDeviceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CertifyIotbasicDeviceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CertifyIotbasicDeviceResponse setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public CertifyIotbasicDeviceResponse setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

    public CertifyIotbasicDeviceResponse setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
        return this;
    }
    public String getDeviceStatus() {
        return this.deviceStatus;
    }

    public CertifyIotbasicDeviceResponse setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
        return this;
    }
    public String getRegisterTime() {
        return this.registerTime;
    }

    public CertifyIotbasicDeviceResponse setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public CertifyIotbasicDeviceResponse setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CertifyIotbasicDeviceResponse setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public CertifyIotbasicDeviceResponse setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }
    public String getServiceStatus() {
        return this.serviceStatus;
    }

    public CertifyIotbasicDeviceResponse setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CertifyIotbasicDeviceResponse setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CertifyIotbasicDeviceResponse setUserRole(String userRole) {
        this.userRole = userRole;
        return this;
    }
    public String getUserRole() {
        return this.userRole;
    }

}
