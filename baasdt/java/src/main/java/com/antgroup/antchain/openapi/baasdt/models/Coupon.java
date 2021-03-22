// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class Coupon extends TeaModel {
    // 绑定时间戳（毫秒）
    @NameInMap("bind_time")
    @Validation(required = true)
    public Long bindTime;

    // 绑定电子券的哈希
    @NameInMap("bind_tx_hash")
    @Validation(required = true)
    public String bindTxHash;

    // 电子券理论上应处于的状态（比如电子券已过期）
    @NameInMap("cal_status")
    @Validation(required = true)
    public Long calStatus;

    // 激活时间戳（毫秒）
    @NameInMap("charge_time")
    @Validation(required = true)
    public Long chargeTime;

    // 激活码
    @NameInMap("coupon_code")
    @Validation(required = true)
    public String couponCode;

    // 激活码附加信息
    @NameInMap("coupon_ext_code")
    @Validation(required = true)
    public String couponExtCode;

    // 电子券ID
    @NameInMap("coupon_id")
    @Validation(required = true)
    public String couponId;

    // 电子券名称
    @NameInMap("coupon_name")
    @Validation(required = true)
    public String couponName;

    // 创建时间戳（毫秒）
    @NameInMap("create_time")
    @Validation(required = true)
    public Long createTime;

    // 创建电子券的哈希
    @NameInMap("create_tx_hash")
    @Validation(required = true)
    public String createTxHash;

    // 脱敏用户ID
    @NameInMap("desensitized_uid")
    @Validation(required = true)
    public String desensitizedUid;

    // 扩展信息
    @NameInMap("ext_info")
    @Validation(required = true)
    public String extInfo;

    // 最后一次操作时间戳（毫秒）
    @NameInMap("last_time")
    @Validation(required = true)
    public Long lastTime;

    // 最后一次操作的交易哈希
    @NameInMap("last_tx_hash")
    @Validation(required = true)
    public String lastTxHash;

    // 电子券公钥。椭圆曲线密码学 Secp256k1曲线的公钥，长度64字节，十六进制128位。
    @NameInMap("public_key")
    @Validation(required = true)
    public String publicKey;

    // 调子券信息查询次数
    @NameInMap("query_count")
    @Validation(required = true)
    public Long queryCount;

    // 最后一次查询时间戳（毫秒）
    @NameInMap("query_time")
    @Validation(required = true)
    public Long queryTime;

    // 最近一次查询的交易哈希
    @NameInMap("query_tx_hash")
    @Validation(required = true)
    public String queryTxHash;

    // 风控状态：0 启用，1 禁用
    @NameInMap("risk_status")
    @Validation(required = true)
    public Long riskStatus;

    // 电子券状态：
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 用户公钥
    @NameInMap("uid_public_key")
    @Validation(required = true)
    public String uidPublicKey;

    // 有效开始时间（毫秒时间戳）
    @NameInMap("valid_after")
    @Validation(required = true)
    public Long validAfter;

    // 有效结束时间（毫秒时间戳）
    @NameInMap("valid_before")
    @Validation(required = true)
    public Long validBefore;

    // 价值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    // 电子券版本
    @NameInMap("version")
    @Validation(required = true)
    public Long version;

    // 电子券激活交易哈希
    @NameInMap("charge_tx_hash")
    @Validation(required = true)
    public String chargeTxHash;

    // 记名电子券持有者账户
    @NameInMap("holder_user_account")
    @Validation(required = true)
    public String holderUserAccount;

    public static Coupon build(java.util.Map<String, ?> map) throws Exception {
        Coupon self = new Coupon();
        return TeaModel.build(map, self);
    }

    public Coupon setBindTime(Long bindTime) {
        this.bindTime = bindTime;
        return this;
    }
    public Long getBindTime() {
        return this.bindTime;
    }

    public Coupon setBindTxHash(String bindTxHash) {
        this.bindTxHash = bindTxHash;
        return this;
    }
    public String getBindTxHash() {
        return this.bindTxHash;
    }

    public Coupon setCalStatus(Long calStatus) {
        this.calStatus = calStatus;
        return this;
    }
    public Long getCalStatus() {
        return this.calStatus;
    }

    public Coupon setChargeTime(Long chargeTime) {
        this.chargeTime = chargeTime;
        return this;
    }
    public Long getChargeTime() {
        return this.chargeTime;
    }

    public Coupon setCouponCode(String couponCode) {
        this.couponCode = couponCode;
        return this;
    }
    public String getCouponCode() {
        return this.couponCode;
    }

    public Coupon setCouponExtCode(String couponExtCode) {
        this.couponExtCode = couponExtCode;
        return this;
    }
    public String getCouponExtCode() {
        return this.couponExtCode;
    }

    public Coupon setCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }
    public String getCouponId() {
        return this.couponId;
    }

    public Coupon setCouponName(String couponName) {
        this.couponName = couponName;
        return this;
    }
    public String getCouponName() {
        return this.couponName;
    }

    public Coupon setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public Coupon setCreateTxHash(String createTxHash) {
        this.createTxHash = createTxHash;
        return this;
    }
    public String getCreateTxHash() {
        return this.createTxHash;
    }

    public Coupon setDesensitizedUid(String desensitizedUid) {
        this.desensitizedUid = desensitizedUid;
        return this;
    }
    public String getDesensitizedUid() {
        return this.desensitizedUid;
    }

    public Coupon setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public Coupon setLastTime(Long lastTime) {
        this.lastTime = lastTime;
        return this;
    }
    public Long getLastTime() {
        return this.lastTime;
    }

    public Coupon setLastTxHash(String lastTxHash) {
        this.lastTxHash = lastTxHash;
        return this;
    }
    public String getLastTxHash() {
        return this.lastTxHash;
    }

    public Coupon setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public Coupon setQueryCount(Long queryCount) {
        this.queryCount = queryCount;
        return this;
    }
    public Long getQueryCount() {
        return this.queryCount;
    }

    public Coupon setQueryTime(Long queryTime) {
        this.queryTime = queryTime;
        return this;
    }
    public Long getQueryTime() {
        return this.queryTime;
    }

    public Coupon setQueryTxHash(String queryTxHash) {
        this.queryTxHash = queryTxHash;
        return this;
    }
    public String getQueryTxHash() {
        return this.queryTxHash;
    }

    public Coupon setRiskStatus(Long riskStatus) {
        this.riskStatus = riskStatus;
        return this;
    }
    public Long getRiskStatus() {
        return this.riskStatus;
    }

    public Coupon setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public Coupon setUidPublicKey(String uidPublicKey) {
        this.uidPublicKey = uidPublicKey;
        return this;
    }
    public String getUidPublicKey() {
        return this.uidPublicKey;
    }

    public Coupon setValidAfter(Long validAfter) {
        this.validAfter = validAfter;
        return this;
    }
    public Long getValidAfter() {
        return this.validAfter;
    }

    public Coupon setValidBefore(Long validBefore) {
        this.validBefore = validBefore;
        return this;
    }
    public Long getValidBefore() {
        return this.validBefore;
    }

    public Coupon setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public Coupon setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

    public Coupon setChargeTxHash(String chargeTxHash) {
        this.chargeTxHash = chargeTxHash;
        return this;
    }
    public String getChargeTxHash() {
        return this.chargeTxHash;
    }

    public Coupon setHolderUserAccount(String holderUserAccount) {
        this.holderUserAccount = holderUserAccount;
        return this;
    }
    public String getHolderUserAccount() {
        return this.holderUserAccount;
    }

}
