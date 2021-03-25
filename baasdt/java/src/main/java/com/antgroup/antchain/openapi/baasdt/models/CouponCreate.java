// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CouponCreate extends TeaModel {
    // 电子券批次ID
    @NameInMap("collection_id")
    @Validation(required = true)
    public String collectionId;

    // 电子券价值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    // 电子券名称
    @NameInMap("coupon_name")
    @Validation(required = true)
    public String couponName;

    // 用户脱敏ID
    @NameInMap("desensitized_uid")
    public String desensitizedUid;

    // 扩展信息
    @NameInMap("ext_info")
    @Validation(required = true)
    public String extInfo;

    // 持有者ID
    @NameInMap("holder_user_account")
    public String holderUserAccount;

    // 电子券公钥
    @NameInMap("public_key")
    @Validation(required = true)
    public String publicKey;

    // 时区（暂时固定为GMT+8）
    @NameInMap("time_zone")
    @Validation(required = true)
    public String timeZone;

    // 用户公钥
    @NameInMap("uid_public_key")
    public String uidPublicKey;

    // 有效开始时间
    @NameInMap("valid_after")
    @Validation(required = true)
    public Long validAfter;

    // 有效结束时间
    @NameInMap("valid_before")
    @Validation(required = true)
    public Long validBefore;

    public static CouponCreate build(java.util.Map<String, ?> map) throws Exception {
        CouponCreate self = new CouponCreate();
        return TeaModel.build(map, self);
    }

    public CouponCreate setCollectionId(String collectionId) {
        this.collectionId = collectionId;
        return this;
    }
    public String getCollectionId() {
        return this.collectionId;
    }

    public CouponCreate setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public CouponCreate setCouponName(String couponName) {
        this.couponName = couponName;
        return this;
    }
    public String getCouponName() {
        return this.couponName;
    }

    public CouponCreate setDesensitizedUid(String desensitizedUid) {
        this.desensitizedUid = desensitizedUid;
        return this;
    }
    public String getDesensitizedUid() {
        return this.desensitizedUid;
    }

    public CouponCreate setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public CouponCreate setHolderUserAccount(String holderUserAccount) {
        this.holderUserAccount = holderUserAccount;
        return this;
    }
    public String getHolderUserAccount() {
        return this.holderUserAccount;
    }

    public CouponCreate setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public CouponCreate setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public CouponCreate setUidPublicKey(String uidPublicKey) {
        this.uidPublicKey = uidPublicKey;
        return this;
    }
    public String getUidPublicKey() {
        return this.uidPublicKey;
    }

    public CouponCreate setValidAfter(Long validAfter) {
        this.validAfter = validAfter;
        return this;
    }
    public Long getValidAfter() {
        return this.validAfter;
    }

    public CouponCreate setValidBefore(Long validBefore) {
        this.validBefore = validBefore;
        return this;
    }
    public Long getValidBefore() {
        return this.validBefore;
    }

}
