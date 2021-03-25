<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class EquityExtInfo extends Model
{
    // 指定兑换日限制已使用
    /**
     * @example 10
     *
     * @var int
     */
    public $limitPerDayUsed;

    // 指定兑换月限制已使用
    /**
     * @example 100
     *
     * @var int
     */
    public $limitPerMonthUsed;

    // 权益开放的租户ID
    /**
     * @example ID
     *
     * @var string
     */
    public $openToTenantId;

    // 指定日期
    /**
     * @example 12121212
     *
     * @var string
     */
    public $targetDate;

    // 权益对租户价格
    /**
     * @example 10.0000
     *
     * @var string
     */
    public $tenantPrice;

    // 授权给租户用户的价格
    /**
     * @example 10.00
     *
     * @var UserPrice
     */
    public $tenantUserPrice;

    // 租户价格包括费率
    /**
     * @example 10.001
     *
     * @var string
     */
    public $tenantPriceWithCommission;

    // 费率
    /**
     * @example 0.001
     *
     * @var string
     */
    public $commission;
    protected $_name = [
        'limitPerDayUsed'           => 'limit_per_day_used',
        'limitPerMonthUsed'         => 'limit_per_month_used',
        'openToTenantId'            => 'open_to_tenant_id',
        'targetDate'                => 'target_date',
        'tenantPrice'               => 'tenant_price',
        'tenantUserPrice'           => 'tenant_user_price',
        'tenantPriceWithCommission' => 'tenant_price_with_commission',
        'commission'                => 'commission',
    ];

    public function validate()
    {
        Model::validateRequired('limitPerDayUsed', $this->limitPerDayUsed, true);
        Model::validateRequired('limitPerMonthUsed', $this->limitPerMonthUsed, true);
        Model::validateRequired('openToTenantId', $this->openToTenantId, true);
        Model::validateRequired('targetDate', $this->targetDate, true);
        Model::validateRequired('tenantPrice', $this->tenantPrice, true);
        Model::validateRequired('tenantUserPrice', $this->tenantUserPrice, true);
        Model::validateRequired('tenantPriceWithCommission', $this->tenantPriceWithCommission, true);
        Model::validateRequired('commission', $this->commission, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->limitPerDayUsed) {
            $res['limit_per_day_used'] = $this->limitPerDayUsed;
        }
        if (null !== $this->limitPerMonthUsed) {
            $res['limit_per_month_used'] = $this->limitPerMonthUsed;
        }
        if (null !== $this->openToTenantId) {
            $res['open_to_tenant_id'] = $this->openToTenantId;
        }
        if (null !== $this->targetDate) {
            $res['target_date'] = $this->targetDate;
        }
        if (null !== $this->tenantPrice) {
            $res['tenant_price'] = $this->tenantPrice;
        }
        if (null !== $this->tenantUserPrice) {
            $res['tenant_user_price'] = null !== $this->tenantUserPrice ? $this->tenantUserPrice->toMap() : null;
        }
        if (null !== $this->tenantPriceWithCommission) {
            $res['tenant_price_with_commission'] = $this->tenantPriceWithCommission;
        }
        if (null !== $this->commission) {
            $res['commission'] = $this->commission;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EquityExtInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['limit_per_day_used'])) {
            $model->limitPerDayUsed = $map['limit_per_day_used'];
        }
        if (isset($map['limit_per_month_used'])) {
            $model->limitPerMonthUsed = $map['limit_per_month_used'];
        }
        if (isset($map['open_to_tenant_id'])) {
            $model->openToTenantId = $map['open_to_tenant_id'];
        }
        if (isset($map['target_date'])) {
            $model->targetDate = $map['target_date'];
        }
        if (isset($map['tenant_price'])) {
            $model->tenantPrice = $map['tenant_price'];
        }
        if (isset($map['tenant_user_price'])) {
            $model->tenantUserPrice = UserPrice::fromMap($map['tenant_user_price']);
        }
        if (isset($map['tenant_price_with_commission'])) {
            $model->tenantPriceWithCommission = $map['tenant_price_with_commission'];
        }
        if (isset($map['commission'])) {
            $model->commission = $map['commission'];
        }

        return $model;
    }
}
