<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryAasAntdaoMypointsMerchantbalanceResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
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
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
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
     * @return QueryAasAntdaoMypointsMerchantbalanceResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
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
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 积分库可用余额
    /**
     * @var integer
     */
    public $budgetAvailableBalance;

    // 预算库余额
    /**
     * @var integer
     */
    public $budgetBalance;

    // 预算库代码
    /**
     * @var string
     */
    public $budgetCode;

    // 商户的支付宝商家ID
    /**
     * @var string
     */
    public $pid;

    // 积分库余额
    /**
     * @var integer
     */
    public $pointLibBalance;

    // 积分库代码
    /**
     * @var string
     */
    public $pointLibCode;

    // 商户的金融云租户ID
    /**
     * @var string
     */
    public $tenantId;

}
