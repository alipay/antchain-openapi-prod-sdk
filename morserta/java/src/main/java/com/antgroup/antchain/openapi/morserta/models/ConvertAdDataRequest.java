// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.morserta.models;

import com.aliyun.tea.*;

public class ConvertAdDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 广告主id
    @NameInMap("account_id")
    @Validation(required = true)
    public Long accountId;

    // ios/android
    @NameInMap("device_os_type")
    @Validation(required = true)
    public String deviceOsType;

    // 设备ID（imei或idfa的加密值）
    @NameInMap("muid")
    @Validation(required = true)
    public String muid;

    // 点击ID
    @NameInMap("click_id")
    @Validation(required = true)
    public String clickId;

    // 点击时间
    @NameInMap("click_time")
    @Validation(required = true)
    public Long clickTime;

    // 曝光时间
    @NameInMap("impression_time")
    @Validation(required = true)
    public String impressionTime;

    // 手机号MD5
    @NameInMap("mobile_md5")
    @Validation(required = true)
    public String mobileMd5;

    // 区分投放渠道来源weixin\youlianghui\chuanshanjia\douyin
    @NameInMap("platform")
    public Long platform;

    // 事件类型，枚举值如下：
    // submit-提交表单
    // pay-付费
    // renewal-续费
    // m2_renewal-m2续期
    // surrender-退保
    @NameInMap("event_code")
    @Validation(required = true)
    public String eventCode;

    // 转化事件时间
    @NameInMap("event_time")
    @Validation(required = true)
    public Long eventTime;

    // 设备oaid
    @NameInMap("oaid")
    public String oaid;

    // oaid_md5
    @NameInMap("oaid_md5")
    public String oaidMd5;

    // caid
    @NameInMap("caid")
    public String caid;

    // caid_md5
    @NameInMap("caid_md5")
    public String caidMd5;

    // android_id
    @NameInMap("android_id")
    public String androidId;

    // imei
    @NameInMap("imei")
    public String imei;

    // imei_md5
    @NameInMap("imei_md5")
    public String imeiMd5;

    // idfa
    @NameInMap("idfa")
    public String idfa;

    // idfa_md5
    @NameInMap("idfa_md5")
    public String idfaMd5;

    public static ConvertAdDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ConvertAdDataRequest self = new ConvertAdDataRequest();
        return TeaModel.build(map, self);
    }

    public ConvertAdDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConvertAdDataRequest setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }
    public Long getAccountId() {
        return this.accountId;
    }

    public ConvertAdDataRequest setDeviceOsType(String deviceOsType) {
        this.deviceOsType = deviceOsType;
        return this;
    }
    public String getDeviceOsType() {
        return this.deviceOsType;
    }

    public ConvertAdDataRequest setMuid(String muid) {
        this.muid = muid;
        return this;
    }
    public String getMuid() {
        return this.muid;
    }

    public ConvertAdDataRequest setClickId(String clickId) {
        this.clickId = clickId;
        return this;
    }
    public String getClickId() {
        return this.clickId;
    }

    public ConvertAdDataRequest setClickTime(Long clickTime) {
        this.clickTime = clickTime;
        return this;
    }
    public Long getClickTime() {
        return this.clickTime;
    }

    public ConvertAdDataRequest setImpressionTime(String impressionTime) {
        this.impressionTime = impressionTime;
        return this;
    }
    public String getImpressionTime() {
        return this.impressionTime;
    }

    public ConvertAdDataRequest setMobileMd5(String mobileMd5) {
        this.mobileMd5 = mobileMd5;
        return this;
    }
    public String getMobileMd5() {
        return this.mobileMd5;
    }

    public ConvertAdDataRequest setPlatform(Long platform) {
        this.platform = platform;
        return this;
    }
    public Long getPlatform() {
        return this.platform;
    }

    public ConvertAdDataRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public ConvertAdDataRequest setEventTime(Long eventTime) {
        this.eventTime = eventTime;
        return this;
    }
    public Long getEventTime() {
        return this.eventTime;
    }

    public ConvertAdDataRequest setOaid(String oaid) {
        this.oaid = oaid;
        return this;
    }
    public String getOaid() {
        return this.oaid;
    }

    public ConvertAdDataRequest setOaidMd5(String oaidMd5) {
        this.oaidMd5 = oaidMd5;
        return this;
    }
    public String getOaidMd5() {
        return this.oaidMd5;
    }

    public ConvertAdDataRequest setCaid(String caid) {
        this.caid = caid;
        return this;
    }
    public String getCaid() {
        return this.caid;
    }

    public ConvertAdDataRequest setCaidMd5(String caidMd5) {
        this.caidMd5 = caidMd5;
        return this;
    }
    public String getCaidMd5() {
        return this.caidMd5;
    }

    public ConvertAdDataRequest setAndroidId(String androidId) {
        this.androidId = androidId;
        return this;
    }
    public String getAndroidId() {
        return this.androidId;
    }

    public ConvertAdDataRequest setImei(String imei) {
        this.imei = imei;
        return this;
    }
    public String getImei() {
        return this.imei;
    }

    public ConvertAdDataRequest setImeiMd5(String imeiMd5) {
        this.imeiMd5 = imeiMd5;
        return this;
    }
    public String getImeiMd5() {
        return this.imeiMd5;
    }

    public ConvertAdDataRequest setIdfa(String idfa) {
        this.idfa = idfa;
        return this;
    }
    public String getIdfa() {
        return this.idfa;
    }

    public ConvertAdDataRequest setIdfaMd5(String idfaMd5) {
        this.idfaMd5 = idfaMd5;
        return this;
    }
    public String getIdfaMd5() {
        return this.idfaMd5;
    }

}
