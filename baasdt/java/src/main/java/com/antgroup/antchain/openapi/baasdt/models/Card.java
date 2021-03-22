// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class Card extends TeaModel {
    // 计算理论上应该变为的状态
    @NameInMap("cal_status")
    @Validation(required = true)
    public Long calStatus;

    // 卡密ID
    @NameInMap("card_id")
    @Validation(required = true)
    public String cardId;

    // 充值时间
    @NameInMap("charge_time")
    @Validation(required = true)
    public Long chargeTime;

    // 数量
    @NameInMap("count_of_min_unit")
    @Validation(required = true)
    public Long countOfMinUnit;

    // 卡密创建时间
    @NameInMap("create_time")
    @Validation(required = true)
    public Long createTime;

    // 创建卡密时的交易hash
    @NameInMap("create_tx_hash")
    @Validation(required = true)
    public String createTxHash;

    // 脱敏手机信息
    @NameInMap("desensitized_uid")
    @Validation(required = true)
    public String desensitizedUid;

    // 附加信息
    @NameInMap("ext_info")
    @Validation(required = true)
    public String extInfo;

    // 最小单位数量
    @NameInMap("min_unit")
    @Validation(required = true)
    public Long minUnit;

    // 公钥
    @NameInMap("public_key")
    @Validation(required = true)
    public String publicKey;

    // 状态
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 公钥信息
    @NameInMap("uid_public_key")
    @Validation(required = true)
    public String uidPublicKey;

    // 卡密在该时间后有效
    @NameInMap("valid_after")
    @Validation(required = true)
    public Long validAfter;

    // 卡密在该时间前有效
    @NameInMap("valid_before")
    @Validation(required = true)
    public Long validBefore;

    // 有效天数
    @NameInMap("valid_days")
    @Validation(required = true)
    public Long validDays;

    // 价值
    @NameInMap("value")
    @Validation(required = true)
    public Long value;

    // 卡密版本
    @NameInMap("version")
    @Validation(required = true)
    public Long version;

    public static Card build(java.util.Map<String, ?> map) throws Exception {
        Card self = new Card();
        return TeaModel.build(map, self);
    }

    public Card setCalStatus(Long calStatus) {
        this.calStatus = calStatus;
        return this;
    }
    public Long getCalStatus() {
        return this.calStatus;
    }

    public Card setCardId(String cardId) {
        this.cardId = cardId;
        return this;
    }
    public String getCardId() {
        return this.cardId;
    }

    public Card setChargeTime(Long chargeTime) {
        this.chargeTime = chargeTime;
        return this;
    }
    public Long getChargeTime() {
        return this.chargeTime;
    }

    public Card setCountOfMinUnit(Long countOfMinUnit) {
        this.countOfMinUnit = countOfMinUnit;
        return this;
    }
    public Long getCountOfMinUnit() {
        return this.countOfMinUnit;
    }

    public Card setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public Card setCreateTxHash(String createTxHash) {
        this.createTxHash = createTxHash;
        return this;
    }
    public String getCreateTxHash() {
        return this.createTxHash;
    }

    public Card setDesensitizedUid(String desensitizedUid) {
        this.desensitizedUid = desensitizedUid;
        return this;
    }
    public String getDesensitizedUid() {
        return this.desensitizedUid;
    }

    public Card setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public Card setMinUnit(Long minUnit) {
        this.minUnit = minUnit;
        return this;
    }
    public Long getMinUnit() {
        return this.minUnit;
    }

    public Card setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public Card setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public Card setUidPublicKey(String uidPublicKey) {
        this.uidPublicKey = uidPublicKey;
        return this;
    }
    public String getUidPublicKey() {
        return this.uidPublicKey;
    }

    public Card setValidAfter(Long validAfter) {
        this.validAfter = validAfter;
        return this;
    }
    public Long getValidAfter() {
        return this.validAfter;
    }

    public Card setValidBefore(Long validBefore) {
        this.validBefore = validBefore;
        return this;
    }
    public Long getValidBefore() {
        return this.validBefore;
    }

    public Card setValidDays(Long validDays) {
        this.validDays = validDays;
        return this;
    }
    public Long getValidDays() {
        return this.validDays;
    }

    public Card setValue(Long value) {
        this.value = value;
        return this;
    }
    public Long getValue() {
        return this.value;
    }

    public Card setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

}
