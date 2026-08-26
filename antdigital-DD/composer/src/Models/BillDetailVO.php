<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\MultiCurrencyMoney;
use AntChain\DD\Models\ResourcePackageDeductDetailVO;
use AntChain\DD\Models\ChargeItemVO;

class BillDetailVO extends Model {
    protected $_name = [
        'id' => 'id',
        'chargeBillId' => 'charge_bill_id',
        'arNo' => 'ar_no',
        'prodCode' => 'prod_code',
        'prodEventCode' => 'prod_event_code',
        'instanceId' => 'instance_id',
        'amount' => 'amount',
        'highPrecisionAmount' => 'high_precision_amount',
        'discountFee' => 'discount_fee',
        'highPrecisionDiscountFee' => 'high_precision_discount_fee',
        'flowPackDeducted' => 'flow_pack_deducted',
        'flowPackDeductDetail' => 'flow_pack_deduct_detail',
        'gmtFeeStartTime' => 'gmt_fee_start_time',
        'gmtFeeEndTime' => 'gmt_fee_end_time',
        'feeItems' => 'fee_items',
        'constraintItems' => 'constraint_items',
        'extendInfo' => 'extend_info',
    ];
    public function validate() {
        Model::validateRequired('id', $this->id, true);
        Model::validatePattern('gmtFeeStartTime', $this->gmtFeeStartTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtFeeEndTime', $this->gmtFeeEndTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->chargeBillId) {
            $res['charge_bill_id'] = $this->chargeBillId;
        }
        if (null !== $this->arNo) {
            $res['ar_no'] = $this->arNo;
        }
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }
        if (null !== $this->prodEventCode) {
            $res['prod_event_code'] = $this->prodEventCode;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->amount) {
            $res['amount'] = null !== $this->amount ? $this->amount->toMap() : null;
        }
        if (null !== $this->highPrecisionAmount) {
            $res['high_precision_amount'] = $this->highPrecisionAmount;
        }
        if (null !== $this->discountFee) {
            $res['discount_fee'] = null !== $this->discountFee ? $this->discountFee->toMap() : null;
        }
        if (null !== $this->highPrecisionDiscountFee) {
            $res['high_precision_discount_fee'] = $this->highPrecisionDiscountFee;
        }
        if (null !== $this->flowPackDeducted) {
            $res['flow_pack_deducted'] = $this->flowPackDeducted;
        }
        if (null !== $this->flowPackDeductDetail) {
            $res['flow_pack_deduct_detail'] = [];
            if(null !== $this->flowPackDeductDetail && is_array($this->flowPackDeductDetail)){
                $n = 0;
                foreach($this->flowPackDeductDetail as $item){
                    $res['flow_pack_deduct_detail'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->gmtFeeStartTime) {
            $res['gmt_fee_start_time'] = $this->gmtFeeStartTime;
        }
        if (null !== $this->gmtFeeEndTime) {
            $res['gmt_fee_end_time'] = $this->gmtFeeEndTime;
        }
        if (null !== $this->feeItems) {
            $res['fee_items'] = [];
            if(null !== $this->feeItems && is_array($this->feeItems)){
                $n = 0;
                foreach($this->feeItems as $item){
                    $res['fee_items'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->constraintItems) {
            $res['constraint_items'] = [];
            if(null !== $this->constraintItems && is_array($this->constraintItems)){
                $n = 0;
                foreach($this->constraintItems as $item){
                    $res['constraint_items'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->extendInfo) {
            $res['extend_info'] = $this->extendInfo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return BillDetailVO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['charge_bill_id'])){
            $model->chargeBillId = $map['charge_bill_id'];
        }
        if(isset($map['ar_no'])){
            $model->arNo = $map['ar_no'];
        }
        if(isset($map['prod_code'])){
            $model->prodCode = $map['prod_code'];
        }
        if(isset($map['prod_event_code'])){
            $model->prodEventCode = $map['prod_event_code'];
        }
        if(isset($map['instance_id'])){
            $model->instanceId = $map['instance_id'];
        }
        if(isset($map['amount'])){
            $model->amount = MultiCurrencyMoney::fromMap($map['amount']);
        }
        if(isset($map['high_precision_amount'])){
            $model->highPrecisionAmount = $map['high_precision_amount'];
        }
        if(isset($map['discount_fee'])){
            $model->discountFee = MultiCurrencyMoney::fromMap($map['discount_fee']);
        }
        if(isset($map['high_precision_discount_fee'])){
            $model->highPrecisionDiscountFee = $map['high_precision_discount_fee'];
        }
        if(isset($map['flow_pack_deducted'])){
            $model->flowPackDeducted = $map['flow_pack_deducted'];
        }
        if(isset($map['flow_pack_deduct_detail'])){
            if(!empty($map['flow_pack_deduct_detail'])){
                $model->flowPackDeductDetail = [];
                $n = 0;
                foreach($map['flow_pack_deduct_detail'] as $item) {
                    $model->flowPackDeductDetail[$n++] = null !== $item ? ResourcePackageDeductDetailVO::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['gmt_fee_start_time'])){
            $model->gmtFeeStartTime = $map['gmt_fee_start_time'];
        }
        if(isset($map['gmt_fee_end_time'])){
            $model->gmtFeeEndTime = $map['gmt_fee_end_time'];
        }
        if(isset($map['fee_items'])){
            if(!empty($map['fee_items'])){
                $model->feeItems = [];
                $n = 0;
                foreach($map['fee_items'] as $item) {
                    $model->feeItems[$n++] = null !== $item ? ChargeItemVO::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['constraint_items'])){
            if(!empty($map['constraint_items'])){
                $model->constraintItems = [];
                $n = 0;
                foreach($map['constraint_items'] as $item) {
                    $model->constraintItems[$n++] = null !== $item ? ChargeItemVO::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['extend_info'])){
            $model->extendInfo = $map['extend_info'];
        }
        return $model;
    }
    // 主键Id
    /**
     * @example 1
     * @var string
     */
    public $id;

    // 账单Id
    /**
     * @example aa
     * @var string
     */
    public $chargeBillId;

    // 合约号
    /**
     * @example aa
     * @var string
     */
    public $arNo;

    // 资源名称@ResourceNameEnum
    /**
     * @example 名称
     * @var string
     */
    public $prodCode;

    // 云产品收费事件码
    /**
     * @example aa
     * @var string
     */
    public $prodEventCode;

    // 实例id
    /**
     * @example aa
     * @var string
     */
    public $instanceId;

    // 账单金额
    /**
     * @example 1
     * @var MultiCurrencyMoney
     */
    public $amount;

    // 高精度金额
    /**
     * @example 1
     * @var string
     */
    public $highPrecisionAmount;

    // 优惠金额
    /**
     * @example 1
     * @var MultiCurrencyMoney
     */
    public $discountFee;

    // 高精度优惠金额
    /**
     * @example 1
     * @var string
     */
    public $highPrecisionDiscountFee;

    // 流量包抵扣量
    /**
     * @example 
     * @var int
     */
    public $flowPackDeducted;

    // 流量包抵扣详情
    /**
     * @example 
     * @var ResourcePackageDeductDetailVO[]
     */
    public $flowPackDeductDetail;

    // 账单对应的使用时间区间的开始时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $gmtFeeStartTime;

    // 账单对应的使用时间区间的结束时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $gmtFeeEndTime;

    // 计费项
    /**
     * @example 
     * @var ChargeItemVO[]
     */
    public $feeItems;

    // 约束项
    /**
     * @example 
     * @var ChargeItemVO[]
     */
    public $constraintItems;

    // This property corresponds to db column <tt>extend_info</tt>.
    /**
     * @example JSON
     * @var string
     */
    public $extendInfo;

}
