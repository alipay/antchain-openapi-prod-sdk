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

    // 转化时间
    @NameInMap("conv_time")
    @Validation(required = true)
    public Long convTime;

    // 点击时间
    @NameInMap("click_time")
    @Validation(required = true)
    public Long clickTime;

    // 曝光时间
    @NameInMap("impression_time")
    @Validation(required = true)
    public String impressionTime;

    // 投放日期年月日时分秒（准确到秒），格式为 yyyyMMddhhmmss
    @NameInMap("dt")
    @Validation(required = true)
    public String dt;

    // 手机号MD5
    @NameInMap("mobile_md5")
    @Validation(required = true)
    public String mobileMd5;

    // 是否提单标签0,1
    @NameInMap("label_submit")
    @Validation(required = true)
    public Long labelSubmit;

    // 是否支付标签0,1
    @NameInMap("label_pay")
    @Validation(required = true)
    public Long labelPay;

    // 是否升级标签0,1
    @NameInMap("label_up")
    public Long labelUp;

    // m2是否续期
    @NameInMap("label_m2_renewal")
    @Validation(required = true)
    public Long labelM2Renewal;

    // 是否退保
    @NameInMap("label_surrender")
    public Long labelSurrender;

    // 区分投放渠道来源weixin\youlianghui\chuanshanjia\douyin
    @NameInMap("platform")
    public Long platform;

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

    public ConvertAdDataRequest setConvTime(Long convTime) {
        this.convTime = convTime;
        return this;
    }
    public Long getConvTime() {
        return this.convTime;
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

    public ConvertAdDataRequest setDt(String dt) {
        this.dt = dt;
        return this;
    }
    public String getDt() {
        return this.dt;
    }

    public ConvertAdDataRequest setMobileMd5(String mobileMd5) {
        this.mobileMd5 = mobileMd5;
        return this;
    }
    public String getMobileMd5() {
        return this.mobileMd5;
    }

    public ConvertAdDataRequest setLabelSubmit(Long labelSubmit) {
        this.labelSubmit = labelSubmit;
        return this;
    }
    public Long getLabelSubmit() {
        return this.labelSubmit;
    }

    public ConvertAdDataRequest setLabelPay(Long labelPay) {
        this.labelPay = labelPay;
        return this;
    }
    public Long getLabelPay() {
        return this.labelPay;
    }

    public ConvertAdDataRequest setLabelUp(Long labelUp) {
        this.labelUp = labelUp;
        return this;
    }
    public Long getLabelUp() {
        return this.labelUp;
    }

    public ConvertAdDataRequest setLabelM2Renewal(Long labelM2Renewal) {
        this.labelM2Renewal = labelM2Renewal;
        return this;
    }
    public Long getLabelM2Renewal() {
        return this.labelM2Renewal;
    }

    public ConvertAdDataRequest setLabelSurrender(Long labelSurrender) {
        this.labelSurrender = labelSurrender;
        return this;
    }
    public Long getLabelSurrender() {
        return this.labelSurrender;
    }

    public ConvertAdDataRequest setPlatform(Long platform) {
        this.platform = platform;
        return this;
    }
    public Long getPlatform() {
        return this.platform;
    }

}
