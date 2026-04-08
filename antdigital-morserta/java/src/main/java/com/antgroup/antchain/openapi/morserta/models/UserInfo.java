// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.morserta.models;

import com.aliyun.tea.*;

public class UserInfo extends TeaModel {
    // Android 设备填写，imei原值
    /**
     * <strong>example:</strong>
     * <p>Android 设备填写，imei原值</p>
     */
    @NameInMap("original_imei")
    public String originalImei;

    // Android 设备填写，imei md5值
    /**
     * <strong>example:</strong>
     * <p>Android 设备填写，imei md5值</p>
     */
    @NameInMap("md5_imei")
    public String md5Imei;

    // Android 设备填写,android_id原值 
    /**
     * <strong>example:</strong>
     * <p>Android 设备填写,android_id原值 </p>
     */
    @NameInMap("original_android_id")
    public String originalAndroidId;

    // Android 设备填写, md5 后的 android_id 设备号
    /**
     * <strong>example:</strong>
     * <p>Android 设备填写, md5 后的 android_id 设备号</p>
     */
    @NameInMap("md5_android_id")
    public String md5AndroidId;

    // Android 设备填写，oaid原值
    /**
     * <strong>example:</strong>
     * <p>Android 设备填写，oaid原值</p>
     */
    @NameInMap("original_oaid")
    public String originalOaid;

    // Android 设备填写，oaid MD5值
    /**
     * <strong>example:</strong>
     * <p>Android 设备填写，oaid MD5值</p>
     */
    @NameInMap("md5_oaid")
    public String md5Oaid;

    // iOS 设备填写, idfa原值
    /**
     * <strong>example:</strong>
     * <p>iOS 设备填写, idfa原值</p>
     */
    @NameInMap("original_idfa")
    public String originalIdfa;

    // iOS 设备填写, idfa md5值
    /**
     * <strong>example:</strong>
     * <p>iOS 设备填写, idfa md5值</p>
     */
    @NameInMap("md5_idfa")
    public String md5Idfa;

    // 客户电话原值
    /**
     * <strong>example:</strong>
     * <p>客户电话原值</p>
     */
    @NameInMap("original_phone")
    public String originalPhone;

    // md5后的电话号码
    /**
     * <strong>example:</strong>
     * <p>md5后的电话号码</p>
     */
    @NameInMap("md5_phone")
    public String md5Phone;

    // 客户联系方式的sha256
    /**
     * <strong>example:</strong>
     * <p>客户联系方式的sha256</p>
     */
    @NameInMap("sha256_phone")
    public String sha256Phone;

    // iOS 设备填写,中国广告协会互联网广告标
    /**
     * <strong>example:</strong>
     * <p>iOS 设备填写,中国广告协会互联网广告标</p>
     */
    @NameInMap("caid")
    public String caid;

    // IOS设备填写，caid版本
    /**
     * <strong>example:</strong>
     * <p>IOS设备填写，caid版本</p>
     */
    @NameInMap("caid_version")
    public String caidVersion;

    // 仅腾讯渠道下，WECHAT, WECHAT_MINI_PROGRAM, WECHAT_MINI_GAME投放时传递，微信 openid 保持原值
    /**
     * <strong>example:</strong>
     * <p>仅腾讯渠道下，WECHAT, WECHAT_MINI_PROGRAM, WECHAT_MINI_GAME投放时传递，微信 openid 保持原值</p>
     */
    @NameInMap("wechat_openid")
    public String wechatOpenid;

    // 仅腾讯渠道下，WECHAT, WECHAT_MINI_PROGRAM, WECHAT_MINI_GAME投放时传递，微信 unionid 保持原值
    /**
     * <strong>example:</strong>
     * <p>仅腾讯渠道下，WECHAT, WECHAT_MINI_PROGRAM, WECHAT_MINI_GAME投放时传递，微信 unionid 保持原值</p>
     */
    @NameInMap("wechat_unionid")
    public String wechatUnionid;

    // 仅腾讯渠道下，WECHAT, WECHAT_MINI_PROGRAM, WECHAT_MINI_GAME投放时传递，微信分配的 APPID
    /**
     * <strong>example:</strong>
     * <p>仅腾讯渠道下，WECHAT, WECHAT_MINI_PROGRAM, WECHAT_MINI_GAME投放时传递，微信分配的 APPID</p>
     */
    @NameInMap("wechat_app_id")
    public String wechatAppId;

    public static UserInfo build(java.util.Map<String, ?> map) throws Exception {
        UserInfo self = new UserInfo();
        return TeaModel.build(map, self);
    }

    public UserInfo setOriginalImei(String originalImei) {
        this.originalImei = originalImei;
        return this;
    }
    public String getOriginalImei() {
        return this.originalImei;
    }

    public UserInfo setMd5Imei(String md5Imei) {
        this.md5Imei = md5Imei;
        return this;
    }
    public String getMd5Imei() {
        return this.md5Imei;
    }

    public UserInfo setOriginalAndroidId(String originalAndroidId) {
        this.originalAndroidId = originalAndroidId;
        return this;
    }
    public String getOriginalAndroidId() {
        return this.originalAndroidId;
    }

    public UserInfo setMd5AndroidId(String md5AndroidId) {
        this.md5AndroidId = md5AndroidId;
        return this;
    }
    public String getMd5AndroidId() {
        return this.md5AndroidId;
    }

    public UserInfo setOriginalOaid(String originalOaid) {
        this.originalOaid = originalOaid;
        return this;
    }
    public String getOriginalOaid() {
        return this.originalOaid;
    }

    public UserInfo setMd5Oaid(String md5Oaid) {
        this.md5Oaid = md5Oaid;
        return this;
    }
    public String getMd5Oaid() {
        return this.md5Oaid;
    }

    public UserInfo setOriginalIdfa(String originalIdfa) {
        this.originalIdfa = originalIdfa;
        return this;
    }
    public String getOriginalIdfa() {
        return this.originalIdfa;
    }

    public UserInfo setMd5Idfa(String md5Idfa) {
        this.md5Idfa = md5Idfa;
        return this;
    }
    public String getMd5Idfa() {
        return this.md5Idfa;
    }

    public UserInfo setOriginalPhone(String originalPhone) {
        this.originalPhone = originalPhone;
        return this;
    }
    public String getOriginalPhone() {
        return this.originalPhone;
    }

    public UserInfo setMd5Phone(String md5Phone) {
        this.md5Phone = md5Phone;
        return this;
    }
    public String getMd5Phone() {
        return this.md5Phone;
    }

    public UserInfo setSha256Phone(String sha256Phone) {
        this.sha256Phone = sha256Phone;
        return this;
    }
    public String getSha256Phone() {
        return this.sha256Phone;
    }

    public UserInfo setCaid(String caid) {
        this.caid = caid;
        return this;
    }
    public String getCaid() {
        return this.caid;
    }

    public UserInfo setCaidVersion(String caidVersion) {
        this.caidVersion = caidVersion;
        return this;
    }
    public String getCaidVersion() {
        return this.caidVersion;
    }

    public UserInfo setWechatOpenid(String wechatOpenid) {
        this.wechatOpenid = wechatOpenid;
        return this;
    }
    public String getWechatOpenid() {
        return this.wechatOpenid;
    }

    public UserInfo setWechatUnionid(String wechatUnionid) {
        this.wechatUnionid = wechatUnionid;
        return this;
    }
    public String getWechatUnionid() {
        return this.wechatUnionid;
    }

    public UserInfo setWechatAppId(String wechatAppId) {
        this.wechatAppId = wechatAppId;
        return this;
    }
    public String getWechatAppId() {
        return this.wechatAppId;
    }

}
