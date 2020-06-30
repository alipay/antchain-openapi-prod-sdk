<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryMypointsMerchantbalanceResponse extends Model {
    protected $_name = [
        'budgetAvailableBalance' => 'budget_available_balance',
        'budgetBalance' => 'budget_balance',
        'budgetCode' => 'budget_code',
        'pid' => 'pid',
        'pointLibBalance' => 'point_lib_balance',
        'pointLibCode' => 'point_lib_code',
        'tenantId' => 'tenant_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->budgetAvailableBalance) {
            $res['budget_available_balance'] = $this->budgetAvailableBalance;
        }
        if (null !== $this->budgetBalance) {
            $res['budget_balance'] = $this->budgetBalance;
        }
        if (null !== $this->budgetCode) {
            $res['budget_code'] = $this->budgetCode;
        }
        if (null !== $this->pid) {
            $res['pid'] = $this->pid;
        }
        if (null !== $this->pointLibBalance) {
            $res['point_lib_balance'] = $this->pointLibBalance;
        }
        if (null !== $this->pointLibCode) {
            $res['point_lib_code'] = $this->pointLibCode;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryMypointsMerchantbalanceResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['budget_available_balance'])){
            $model->budgetAvailableBalance = $map['budget_available_balance'];
        }
        if(isset($map['budget_balance'])){
            $model->budgetBalance = $map['budget_balance'];
        }
        if(isset($map['budget_code'])){
            $model->budgetCode = $map['budget_code'];
        }
        if(isset($map['pid'])){
            $model->pid = $map['pid'];
        }
        if(isset($map['point_lib_balance'])){
            $model->pointLibBalance = $map['point_lib_balance'];
        }
        if(isset($map['point_lib_code'])){
            $model->pointLibCode = $map['point_lib_code'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        return $model;
    }
    /**
     * @description 积分库可用余额
     * @example 1000
     * @var integer
     */
    public $budgetAvailableBalance;

    /**
     * @description 预算库余额
     * @example 1000000
     * @var integer
     */
    public $budgetBalance;

    /**
     * @description 预算库代码
     * @example budget_code
     * @var string
     */
    public $budgetCode;

    /**
     * @description 商户的支付宝商家ID
     * @example 537645238548
     * @var string
     */
    public $pid;

    /**
     * @description 积分库余额
     * @example 100000
     * @var integer
     */
    public $pointLibBalance;

    /**
     * @description 积分库代码
     * @example point_lib_code
     * @var string
     */
    public $pointLibCode;

    /**
     * @description 商户的金融云租户ID
     * @example GHUYTRFD
     * @var string
     */
    public $tenantId;

}
