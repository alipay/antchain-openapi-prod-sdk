<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class CouponCollection extends Model
{
    // 批次ID
    /**
     * @example COLLECTIONDID
     *
     * @var string
     */
    public $collectionId;

    // 电子券批次名称
    /**
     * @example 电子券批次名称
     *
     * @var string
     */
    public $name;

    // 批次发行方
    /**
     * @example 批次发行方
     *
     * @var string
     */
    public $issuer;

    // 批次前缀
    /**
     * @example CARD
     *
     * @var string
     */
    public $couponNumberPrefix;

    // 批次管理员链上ID
    /**
     * @example f76ce9b19b4cf733e127e40061155d6356bc5cc05db591a1e6c7d4ee4366eb99
     *
     * @var string
     */
    public $couponAdminAccount;

    // 批次管理员租户ID
    /**
     * @example OKIJUHYG
     *
     * @var string
     */
    public $couponAdminTenantId;

    // 批次过期观察员链上ID
    /**
     * @example f76ce9b19b4cf733e127e40061155d6356bc5cc05db591a1e6c7d4ee4366eb98
     *
     * @var string
     */
    public $expireMonitorAccount;

    // 批次过期观察员租户ID
    /**
     * @example RDTFGUHK
     *
     * @var string
     */
    public $expireMonitorTenantId;

    // 是否记名
    /**
     * @example true, false
     *
     * @var bool
     */
    public $needRegistered;

    // 是否创建时记名
    /**
     * @example true, false
     *
     * @var bool
     */
    public $needPreRegistered;
    protected $_name = [
        'collectionId'          => 'collection_id',
        'name'                  => 'name',
        'issuer'                => 'issuer',
        'couponNumberPrefix'    => 'coupon_number_prefix',
        'couponAdminAccount'    => 'coupon_admin_account',
        'couponAdminTenantId'   => 'coupon_admin_tenant_id',
        'expireMonitorAccount'  => 'expire_monitor_account',
        'expireMonitorTenantId' => 'expire_monitor_tenant_id',
        'needRegistered'        => 'need_registered',
        'needPreRegistered'     => 'need_pre_registered',
    ];

    public function validate()
    {
        Model::validateRequired('collectionId', $this->collectionId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('issuer', $this->issuer, true);
        Model::validateRequired('couponNumberPrefix', $this->couponNumberPrefix, true);
        Model::validateRequired('couponAdminAccount', $this->couponAdminAccount, true);
        Model::validateRequired('couponAdminTenantId', $this->couponAdminTenantId, true);
        Model::validateRequired('expireMonitorAccount', $this->expireMonitorAccount, true);
        Model::validateRequired('expireMonitorTenantId', $this->expireMonitorTenantId, true);
        Model::validateRequired('needRegistered', $this->needRegistered, true);
        Model::validateRequired('needPreRegistered', $this->needPreRegistered, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->collectionId) {
            $res['collection_id'] = $this->collectionId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->issuer) {
            $res['issuer'] = $this->issuer;
        }
        if (null !== $this->couponNumberPrefix) {
            $res['coupon_number_prefix'] = $this->couponNumberPrefix;
        }
        if (null !== $this->couponAdminAccount) {
            $res['coupon_admin_account'] = $this->couponAdminAccount;
        }
        if (null !== $this->couponAdminTenantId) {
            $res['coupon_admin_tenant_id'] = $this->couponAdminTenantId;
        }
        if (null !== $this->expireMonitorAccount) {
            $res['expire_monitor_account'] = $this->expireMonitorAccount;
        }
        if (null !== $this->expireMonitorTenantId) {
            $res['expire_monitor_tenant_id'] = $this->expireMonitorTenantId;
        }
        if (null !== $this->needRegistered) {
            $res['need_registered'] = $this->needRegistered;
        }
        if (null !== $this->needPreRegistered) {
            $res['need_pre_registered'] = $this->needPreRegistered;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CouponCollection
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['collection_id'])) {
            $model->collectionId = $map['collection_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['issuer'])) {
            $model->issuer = $map['issuer'];
        }
        if (isset($map['coupon_number_prefix'])) {
            $model->couponNumberPrefix = $map['coupon_number_prefix'];
        }
        if (isset($map['coupon_admin_account'])) {
            $model->couponAdminAccount = $map['coupon_admin_account'];
        }
        if (isset($map['coupon_admin_tenant_id'])) {
            $model->couponAdminTenantId = $map['coupon_admin_tenant_id'];
        }
        if (isset($map['expire_monitor_account'])) {
            $model->expireMonitorAccount = $map['expire_monitor_account'];
        }
        if (isset($map['expire_monitor_tenant_id'])) {
            $model->expireMonitorTenantId = $map['expire_monitor_tenant_id'];
        }
        if (isset($map['need_registered'])) {
            $model->needRegistered = $map['need_registered'];
        }
        if (isset($map['need_pre_registered'])) {
            $model->needPreRegistered = $map['need_pre_registered'];
        }

        return $model;
    }
}
