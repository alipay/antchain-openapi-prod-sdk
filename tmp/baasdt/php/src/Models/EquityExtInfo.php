<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class EquityExtInfo extends Model {
    protected $_name = [
        'commission' => 'commission',
        'limitPerDayUsed' => 'limit_per_day_used',
        'limitPerMonthUsed' => 'limit_per_month_used',
        'openToTenantId' => 'open_to_tenant_id',
        'targetDate' => 'target_date',
        'tenantPrice' => 'tenant_price',
        'tenantPriceWithCommission' => 'tenant_price_with_commission',
        'tenantUserPrice' => 'tenant_user_price',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->commission) {
            $res['commission'] = $this->commission;
        }
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
        if (null !== $this->tenantPriceWithCommission) {
            $res['tenant_price_with_commission'] = $this->tenantPriceWithCommission;
        }
        if (null !== $this->tenantUserPrice) {
            $res['tenant_user_price'] = null !== $this->tenantUserPrice ? $this->tenantUserPrice->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return EquityExtInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['commission'])){
            $model->commission = $map['commission'];
        }
        if(isset($map['limit_per_day_used'])){
            $model->limitPerDayUsed = $map['limit_per_day_used'];
        }
        if(isset($map['limit_per_month_used'])){
            $model->limitPerMonthUsed = $map['limit_per_month_used'];
        }
        if(isset($map['open_to_tenant_id'])){
            $model->openToTenantId = $map['open_to_tenant_id'];
        }
        if(isset($map['target_date'])){
            $model->targetDate = $map['target_date'];
        }
        if(isset($map['tenant_price'])){
            $model->tenantPrice = $map['tenant_price'];
        }
        if(isset($map['tenant_price_with_commission'])){
            $model->tenantPriceWithCommission = $map['tenant_price_with_commission'];
        }
        if(isset($map['tenant_user_price'])){
            $model->tenantUserPrice = UserPrice::fromMap($map['tenant_user_price']);
        }
        return $model;
    }
    // 费率
    /**
     * @example 0.001
     * @var string
     */
    public $commission;

    // 指定兑换日限制已使用
    /**
     * @example 10
     * @var integer
     */
    public $limitPerDayUsed;

    // 指定兑换月限制已使用
    /**
     * @example 100
     * @var integer
     */
    public $limitPerMonthUsed;

    // 权益开放的租户ID
    /**
     * @example ID
     * @var string
     */
    public $openToTenantId;

    // 指定日期
    /**
     * @example 12121212
     * @var string
     */
    public $targetDate;

    // 权益对租户价格
    /**
     * @example 10.0000
     * @var string
     */
    public $tenantPrice;

    // 租户价格包括费率
    /**
     * @example 10.001
     * @var string
     */
    public $tenantPriceWithCommission;

    // 授权给租户用户的价格
    /**
     * @example 10.00
     * @var UserPrice
     */
    public $tenantUserPrice;

}
