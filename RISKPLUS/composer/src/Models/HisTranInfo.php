<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class HisTranInfo extends Model {
    protected $_name = [
        'repairNo' => 'repair_no',
        'buyDate' => 'buy_date',
        'commType' => 'comm_type',
        'commAmount' => 'comm_amount',
        'repairTime' => 'repair_time',
        'isJoint' => 'is_joint',
        'totalCost' => 'total_cost',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->repairNo) {
            $res['repair_no'] = $this->repairNo;
        }
        if (null !== $this->buyDate) {
            $res['buy_date'] = $this->buyDate;
        }
        if (null !== $this->commType) {
            $res['comm_type'] = $this->commType;
        }
        if (null !== $this->commAmount) {
            $res['comm_amount'] = $this->commAmount;
        }
        if (null !== $this->repairTime) {
            $res['repair_time'] = $this->repairTime;
        }
        if (null !== $this->isJoint) {
            $res['is_joint'] = $this->isJoint;
        }
        if (null !== $this->totalCost) {
            $res['total_cost'] = $this->totalCost;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return HisTranInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['repair_no'])){
            $model->repairNo = $map['repair_no'];
        }
        if(isset($map['buy_date'])){
            $model->buyDate = $map['buy_date'];
        }
        if(isset($map['comm_type'])){
            $model->commType = $map['comm_type'];
        }
        if(isset($map['comm_amount'])){
            $model->commAmount = $map['comm_amount'];
        }
        if(isset($map['repair_time'])){
            $model->repairTime = $map['repair_time'];
        }
        if(isset($map['is_joint'])){
            $model->isJoint = $map['is_joint'];
        }
        if(isset($map['total_cost'])){
            $model->totalCost = $map['total_cost'];
        }
        return $model;
    }
    // 维修单号
    /**
     * @example 
     * @var string
     */
    public $repairNo;

    // 购买日期
    /**
     * @example 
     * @var string
     */
    public $buyDate;

    // 商品型号
    /**
     * @example 
     * @var string
     */
    public $commType;

    // 商品金额
    /**
     * @example 
     * @var string
     */
    public $commAmount;

    // 维修时间
    /**
     * @example 
     * @var string
     */
    public $repairTime;

    // 是否联保
    /**
     * @example 
     * @var string
     */
    public $isJoint;

    // 合计费用(每笔历史交易的合计费用)
    /**
     * @example 
     * @var string
     */
    public $totalCost;

}
