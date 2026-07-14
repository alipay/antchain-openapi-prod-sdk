// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class IotxDeviceResponse extends TeaModel {
    // 主键id
    /**
     * <strong>example:</strong>
     * <p>656431049086242816</p>
     */
    @NameInMap("id")
    public String id;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>2026-07-14 15:54:45</p>
     */
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 更新时间
    /**
     * <strong>example:</strong>
     * <p>2026-07-14 15:54:45</p>
     */
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 租户id
    /**
     * <strong>example:</strong>
     * <p>XQBKTRQV</p>
     */
    @NameInMap("tenant_id")
    public String tenantId;

    // 使用租户id
    /**
     * <strong>example:</strong>
     * <p>XQBKTRQV</p>
     */
    @NameInMap("usage_tenant_id")
    public String usageTenantId;

    // 设备名称
    /**
     * <strong>example:</strong>
     * <p>FF9999995FF1020260409B6305762869</p>
     */
    @NameInMap("device_name")
    public String deviceName;

    // 产品key
    /**
     * <strong>example:</strong>
     * <p>iiH0DAhcM46xR1Bm</p>
     */
    @NameInMap("product_key")
    public String productKey;

    // 产品名称
    /**
     * <strong>example:</strong>
     * <p>产品名称</p>
     */
    @NameInMap("product_name")
    public String productName;

    // 设备昵称
    /**
     * <strong>example:</strong>
     * <p>604C6472CDA911149D5F88D869452848</p>
     */
    @NameInMap("nick_name")
    public String nickName;

    // 设备秘钥
    /**
     * <strong>example:</strong>
     * <p>7f0f205e13d2a3fbe6e2117dc0771745</p>
     */
    @NameInMap("device_secret")
    public String deviceSecret;

    // 设备状态
    /**
     * <strong>example:</strong>
     * <p>ONLINE</p>
     */
    @NameInMap("device_status")
    public String deviceStatus;

    // 禁用状态：0-未禁用；1-已禁用
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("disable_status")
    public String disableStatus;

    // ekyt设备唯一标识
    /**
     * <strong>example:</strong>
     * <p>FF9999995FF1020260409A0C53CC331F</p>
     */
    @NameInMap("tuid")
    public String tuid;

    // 可信产品唯一标识
    /**
     * <strong>example:</strong>
     * <p>rSJhq6L0DcALjUlEW0</p>
     */
    @NameInMap("trust_product_key")
    public String trustProductKey;

    // 可信物联唯一设备标识
    /**
     * <strong>example:</strong>
     * <p>device_7447891005096624128</p>
     */
    @NameInMap("trust_device_id")
    public String trustDeviceId;

    // ota固件版本号
    /**
     * <strong>example:</strong>
     * <p>{&quot;CAT1_OTA&quot;:&quot;1.0.4&quot;,&quot;BLE&quot;:&quot;1.0.2&quot;}</p>
     */
    @NameInMap("ota_version")
    public String otaVersion;

    // 设备注册时间
    /**
     * <strong>example:</strong>
     * <p>2026-04-09 14:21:14</p>
     */
    @NameInMap("regist_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String registTime;

    // 设备激活时间
    /**
     * <strong>example:</strong>
     * <p>2026-04-14 12:40:24</p>
     */
    @NameInMap("active_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String activeTime;

    // 最近在线时间
    /**
     * <strong>example:</strong>
     * <p>2026-04-15 09:51:48</p>
     */
    @NameInMap("last_online_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String lastOnlineTime;

    // 最近离线时间
    /**
     * <strong>example:</strong>
     * <p>2026-04-15 09:51:49</p>
     */
    @NameInMap("last_offline_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String lastOfflineTime;

    // 最近通讯时间
    /**
     * <strong>example:</strong>
     * <p>2026-04-15 09:51:47</p>
     */
    @NameInMap("last_communication_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String lastCommunicationTime;

    public static IotxDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        IotxDeviceResponse self = new IotxDeviceResponse();
        return TeaModel.build(map, self);
    }

    public IotxDeviceResponse setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public IotxDeviceResponse setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public IotxDeviceResponse setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public IotxDeviceResponse setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public IotxDeviceResponse setUsageTenantId(String usageTenantId) {
        this.usageTenantId = usageTenantId;
        return this;
    }
    public String getUsageTenantId() {
        return this.usageTenantId;
    }

    public IotxDeviceResponse setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public IotxDeviceResponse setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public IotxDeviceResponse setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public IotxDeviceResponse setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public IotxDeviceResponse setDeviceSecret(String deviceSecret) {
        this.deviceSecret = deviceSecret;
        return this;
    }
    public String getDeviceSecret() {
        return this.deviceSecret;
    }

    public IotxDeviceResponse setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
        return this;
    }
    public String getDeviceStatus() {
        return this.deviceStatus;
    }

    public IotxDeviceResponse setDisableStatus(String disableStatus) {
        this.disableStatus = disableStatus;
        return this;
    }
    public String getDisableStatus() {
        return this.disableStatus;
    }

    public IotxDeviceResponse setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public IotxDeviceResponse setTrustProductKey(String trustProductKey) {
        this.trustProductKey = trustProductKey;
        return this;
    }
    public String getTrustProductKey() {
        return this.trustProductKey;
    }

    public IotxDeviceResponse setTrustDeviceId(String trustDeviceId) {
        this.trustDeviceId = trustDeviceId;
        return this;
    }
    public String getTrustDeviceId() {
        return this.trustDeviceId;
    }

    public IotxDeviceResponse setOtaVersion(String otaVersion) {
        this.otaVersion = otaVersion;
        return this;
    }
    public String getOtaVersion() {
        return this.otaVersion;
    }

    public IotxDeviceResponse setRegistTime(String registTime) {
        this.registTime = registTime;
        return this;
    }
    public String getRegistTime() {
        return this.registTime;
    }

    public IotxDeviceResponse setActiveTime(String activeTime) {
        this.activeTime = activeTime;
        return this;
    }
    public String getActiveTime() {
        return this.activeTime;
    }

    public IotxDeviceResponse setLastOnlineTime(String lastOnlineTime) {
        this.lastOnlineTime = lastOnlineTime;
        return this;
    }
    public String getLastOnlineTime() {
        return this.lastOnlineTime;
    }

    public IotxDeviceResponse setLastOfflineTime(String lastOfflineTime) {
        this.lastOfflineTime = lastOfflineTime;
        return this;
    }
    public String getLastOfflineTime() {
        return this.lastOfflineTime;
    }

    public IotxDeviceResponse setLastCommunicationTime(String lastCommunicationTime) {
        this.lastCommunicationTime = lastCommunicationTime;
        return this;
    }
    public String getLastCommunicationTime() {
        return this.lastCommunicationTime;
    }

}
