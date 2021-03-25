// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CouponCollection extends TeaModel {
    // 批次ID
    @NameInMap("collection_id")
    @Validation(required = true)
    public String collectionId;

    // 电子券批次名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 批次发行方
    @NameInMap("issuer")
    @Validation(required = true)
    public String issuer;

    // 批次前缀
    @NameInMap("coupon_number_prefix")
    @Validation(required = true)
    public String couponNumberPrefix;

    // 批次管理员链上ID
    @NameInMap("coupon_admin_account")
    @Validation(required = true)
    public String couponAdminAccount;

    // 批次管理员租户ID
    @NameInMap("coupon_admin_tenant_id")
    @Validation(required = true)
    public String couponAdminTenantId;

    // 批次过期观察员链上ID
    @NameInMap("expire_monitor_account")
    @Validation(required = true)
    public String expireMonitorAccount;

    // 批次过期观察员租户ID
    @NameInMap("expire_monitor_tenant_id")
    @Validation(required = true)
    public String expireMonitorTenantId;

    // 是否记名
    @NameInMap("need_registered")
    @Validation(required = true)
    public Boolean needRegistered;

    // 是否创建时记名
    @NameInMap("need_pre_registered")
    @Validation(required = true)
    public Boolean needPreRegistered;

    public static CouponCollection build(java.util.Map<String, ?> map) throws Exception {
        CouponCollection self = new CouponCollection();
        return TeaModel.build(map, self);
    }

    public CouponCollection setCollectionId(String collectionId) {
        this.collectionId = collectionId;
        return this;
    }
    public String getCollectionId() {
        return this.collectionId;
    }

    public CouponCollection setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CouponCollection setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
    public String getIssuer() {
        return this.issuer;
    }

    public CouponCollection setCouponNumberPrefix(String couponNumberPrefix) {
        this.couponNumberPrefix = couponNumberPrefix;
        return this;
    }
    public String getCouponNumberPrefix() {
        return this.couponNumberPrefix;
    }

    public CouponCollection setCouponAdminAccount(String couponAdminAccount) {
        this.couponAdminAccount = couponAdminAccount;
        return this;
    }
    public String getCouponAdminAccount() {
        return this.couponAdminAccount;
    }

    public CouponCollection setCouponAdminTenantId(String couponAdminTenantId) {
        this.couponAdminTenantId = couponAdminTenantId;
        return this;
    }
    public String getCouponAdminTenantId() {
        return this.couponAdminTenantId;
    }

    public CouponCollection setExpireMonitorAccount(String expireMonitorAccount) {
        this.expireMonitorAccount = expireMonitorAccount;
        return this;
    }
    public String getExpireMonitorAccount() {
        return this.expireMonitorAccount;
    }

    public CouponCollection setExpireMonitorTenantId(String expireMonitorTenantId) {
        this.expireMonitorTenantId = expireMonitorTenantId;
        return this;
    }
    public String getExpireMonitorTenantId() {
        return this.expireMonitorTenantId;
    }

    public CouponCollection setNeedRegistered(Boolean needRegistered) {
        this.needRegistered = needRegistered;
        return this;
    }
    public Boolean getNeedRegistered() {
        return this.needRegistered;
    }

    public CouponCollection setNeedPreRegistered(Boolean needPreRegistered) {
        this.needPreRegistered = needPreRegistered;
        return this;
    }
    public Boolean getNeedPreRegistered() {
        return this.needPreRegistered;
    }

}
