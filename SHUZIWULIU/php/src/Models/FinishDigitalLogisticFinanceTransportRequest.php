<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class FinishDigitalLogisticFinanceTransportRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'allFreight' => 'all_freight',
        'backFee' => 'back_fee',
        'consignorFreightAmount' => 'consignor_freight_amount',
        'destDoorsEndTime' => 'dest_doors_end_time',
        'endTime' => 'end_time',
        'freightIncr' => 'freight_incr',
        'lossFee' => 'loss_fee',
        'platformDid' => 'platform_did',
        'taxWaybillId' => 'tax_waybill_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->allFreight) {
            $res['all_freight'] = $this->allFreight;
        }
        if (null !== $this->backFee) {
            $res['back_fee'] = $this->backFee;
        }
        if (null !== $this->consignorFreightAmount) {
            $res['consignor_freight_amount'] = $this->consignorFreightAmount;
        }
        if (null !== $this->destDoorsEndTime) {
            $res['dest_doors_end_time'] = $this->destDoorsEndTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->freightIncr) {
            $res['freight_incr'] = $this->freightIncr;
        }
        if (null !== $this->lossFee) {
            $res['loss_fee'] = $this->lossFee;
        }
        if (null !== $this->platformDid) {
            $res['platform_did'] = $this->platformDid;
        }
        if (null !== $this->taxWaybillId) {
            $res['tax_waybill_id'] = $this->taxWaybillId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return FinishDigitalLogisticFinanceTransportRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['all_freight'])){
            $model->allFreight = $map['all_freight'];
        }
        if(isset($map['back_fee'])){
            $model->backFee = $map['back_fee'];
        }
        if(isset($map['consignor_freight_amount'])){
            $model->consignorFreightAmount = $map['consignor_freight_amount'];
        }
        if(isset($map['dest_doors_end_time'])){
            $model->destDoorsEndTime = $map['dest_doors_end_time'];
        }
        if(isset($map['end_time'])){
            $model->endTime = $map['end_time'];
        }
        if(isset($map['freight_incr'])){
            $model->freightIncr = $map['freight_incr'];
        }
        if(isset($map['loss_fee'])){
            $model->lossFee = $map['loss_fee'];
        }
        if(isset($map['platform_did'])){
            $model->platformDid = $map['platform_did'];
        }
        if(isset($map['tax_waybill_id'])){
            $model->taxWaybillId = $map['tax_waybill_id'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 运费
    /**
     * @var string
     */
    public $allFreight;

    // 回单押金
    /**
     * @var string
     */
    public $backFee;

    // 货主支付运费金额
    /**
     * @var string
     */
    public $consignorFreightAmount;

    // 到达门点时间
    /**
     * @var int
     */
    public $destDoorsEndTime;

    // 终结时间
    /**
     * @var int
     */
    public $endTime;

    // 运费增项
    /**
     * @var string
     */
    public $freightIncr;

    // 运费扣减
    /**
     * @var string
     */
    public $lossFee;

    // 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
    /**
     * @var string
     */
    public $platformDid;

    // 运单id
    /**
     * @var string
     */
    public $taxWaybillId;

}
