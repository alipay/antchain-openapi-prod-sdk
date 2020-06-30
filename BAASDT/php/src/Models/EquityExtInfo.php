<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class EquityExtInfo extends Model {
    protected $_name = [
        'limitPerDayUsed' => 'limit_per_day_used',
        'limitPerMonthUsed' => 'limit_per_month_used',
        'openToTenantId' => 'open_to_tenant_id',
        'targetDate' => 'target_date',
        'tenantPrice' => 'tenant_price',
        'tenantUserPrice' => 'tenant_user_price',
    ];
    public function validate() {}
    public function toMap() {
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
        return $res;
    }
    /**
     * @param array $map
     * @return EquityExtInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
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
        if(isset($map['tenant_user_price'])){
            $model->tenantUserPrice = UserPrice::fromMap($map['tenant_user_price']);
        }
        return $model;
    }
    /**
     * @example 10
     * @description 指定兑换日限制已使用
     * @var integer
     */
    public $limitPerDayUsed;

    /**
     * @example 100
     * @description 指定兑换月限制已使用
     * @var integer
     */
    public $limitPerMonthUsed;

    /**
     * @example ID
     * @description 权益开放的租户ID
     * @var string
     */
    public $openToTenantId;

    /**
     * @example 12121212
     * @description 指定日期
     * @var string
     */
    public $targetDate;

    /**
     * @example 10.0000
     * @description 权益对租户价格
     * @var string
     */
    public $tenantPrice;

    /**
     * @example 10.00
     * @description 授权给租户用户的价格
     * @var UserPrice
     */
    public $tenantUserPrice;

}
