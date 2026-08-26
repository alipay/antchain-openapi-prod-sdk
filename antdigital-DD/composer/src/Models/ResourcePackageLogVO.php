<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class ResourcePackageLogVO extends Model {
    protected $_name = [
        'id' => 'id',
        'resourcePackageInstanceId' => 'resource_package_instance_id',
        'resourcePackageDisplayName' => 'resource_package_display_name',
        'capacityBeforeDeduct' => 'capacity_before_deduct',
        'capacityBeforeDeductUnit' => 'capacity_before_deduct_unit',
        'capacityAfterDeduct' => 'capacity_after_deduct',
        'capacityAfterDeductUnit' => 'capacity_after_deduct_unit',
        'deductedAmount' => 'deducted_amount',
        'deductedAmountUnit' => 'deducted_amount_unit',
        'chargeBillId' => 'charge_bill_id',
        'billDetailId' => 'bill_detail_id',
        'deductedProductName' => 'deducted_product_name',
        'deductedInstanceId' => 'deducted_instance_id',
        'omsField' => 'oms_field',
        'deductTime' => 'deduct_time',
        'type' => 'type',
        'deductedFund' => 'deducted_fund',
        'remainFund' => 'remain_fund',
        'omsStartTime' => 'oms_start_time',
        'omsEndTime' => 'oms_end_time',
        'extendInfo' => 'extend_info',
    ];
    public function validate() {
        Model::validatePattern('deductTime', $this->deductTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('omsStartTime', $this->omsStartTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('omsEndTime', $this->omsEndTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->resourcePackageInstanceId) {
            $res['resource_package_instance_id'] = $this->resourcePackageInstanceId;
        }
        if (null !== $this->resourcePackageDisplayName) {
            $res['resource_package_display_name'] = $this->resourcePackageDisplayName;
        }
        if (null !== $this->capacityBeforeDeduct) {
            $res['capacity_before_deduct'] = $this->capacityBeforeDeduct;
        }
        if (null !== $this->capacityBeforeDeductUnit) {
            $res['capacity_before_deduct_unit'] = $this->capacityBeforeDeductUnit;
        }
        if (null !== $this->capacityAfterDeduct) {
            $res['capacity_after_deduct'] = $this->capacityAfterDeduct;
        }
        if (null !== $this->capacityAfterDeductUnit) {
            $res['capacity_after_deduct_unit'] = $this->capacityAfterDeductUnit;
        }
        if (null !== $this->deductedAmount) {
            $res['deducted_amount'] = $this->deductedAmount;
        }
        if (null !== $this->deductedAmountUnit) {
            $res['deducted_amount_unit'] = $this->deductedAmountUnit;
        }
        if (null !== $this->chargeBillId) {
            $res['charge_bill_id'] = $this->chargeBillId;
        }
        if (null !== $this->billDetailId) {
            $res['bill_detail_id'] = $this->billDetailId;
        }
        if (null !== $this->deductedProductName) {
            $res['deducted_product_name'] = $this->deductedProductName;
        }
        if (null !== $this->deductedInstanceId) {
            $res['deducted_instance_id'] = $this->deductedInstanceId;
        }
        if (null !== $this->omsField) {
            $res['oms_field'] = $this->omsField;
        }
        if (null !== $this->deductTime) {
            $res['deduct_time'] = $this->deductTime;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->deductedFund) {
            $res['deducted_fund'] = $this->deductedFund;
        }
        if (null !== $this->remainFund) {
            $res['remain_fund'] = $this->remainFund;
        }
        if (null !== $this->omsStartTime) {
            $res['oms_start_time'] = $this->omsStartTime;
        }
        if (null !== $this->omsEndTime) {
            $res['oms_end_time'] = $this->omsEndTime;
        }
        if (null !== $this->extendInfo) {
            $res['extend_info'] = $this->extendInfo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ResourcePackageLogVO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['resource_package_instance_id'])){
            $model->resourcePackageInstanceId = $map['resource_package_instance_id'];
        }
        if(isset($map['resource_package_display_name'])){
            $model->resourcePackageDisplayName = $map['resource_package_display_name'];
        }
        if(isset($map['capacity_before_deduct'])){
            $model->capacityBeforeDeduct = $map['capacity_before_deduct'];
        }
        if(isset($map['capacity_before_deduct_unit'])){
            $model->capacityBeforeDeductUnit = $map['capacity_before_deduct_unit'];
        }
        if(isset($map['capacity_after_deduct'])){
            $model->capacityAfterDeduct = $map['capacity_after_deduct'];
        }
        if(isset($map['capacity_after_deduct_unit'])){
            $model->capacityAfterDeductUnit = $map['capacity_after_deduct_unit'];
        }
        if(isset($map['deducted_amount'])){
            $model->deductedAmount = $map['deducted_amount'];
        }
        if(isset($map['deducted_amount_unit'])){
            $model->deductedAmountUnit = $map['deducted_amount_unit'];
        }
        if(isset($map['charge_bill_id'])){
            $model->chargeBillId = $map['charge_bill_id'];
        }
        if(isset($map['bill_detail_id'])){
            $model->billDetailId = $map['bill_detail_id'];
        }
        if(isset($map['deducted_product_name'])){
            $model->deductedProductName = $map['deducted_product_name'];
        }
        if(isset($map['deducted_instance_id'])){
            $model->deductedInstanceId = $map['deducted_instance_id'];
        }
        if(isset($map['oms_field'])){
            $model->omsField = $map['oms_field'];
        }
        if(isset($map['deduct_time'])){
            $model->deductTime = $map['deduct_time'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['deducted_fund'])){
            $model->deductedFund = $map['deducted_fund'];
        }
        if(isset($map['remain_fund'])){
            $model->remainFund = $map['remain_fund'];
        }
        if(isset($map['oms_start_time'])){
            $model->omsStartTime = $map['oms_start_time'];
        }
        if(isset($map['oms_end_time'])){
            $model->omsEndTime = $map['oms_end_time'];
        }
        if(isset($map['extend_info'])){
            $model->extendInfo = $map['extend_info'];
        }
        return $model;
    }
    // 流水号
    /**
     * @example 1
     * @var string
     */
    public $id;

    // 资源包实例
    /**
     * @example 1
     * @var string
     */
    public $resourcePackageInstanceId;

    // 资源包展示名称
    /**
     * @example 1
     * @var string
     */
    public $resourcePackageDisplayName;

    // 抵扣前容量
    /**
     * @example 1
     * @var string
     */
    public $capacityBeforeDeduct;

    // 抵扣前容量单位
    /**
     * @example 1
     * @var string
     */
    public $capacityBeforeDeductUnit;

    // 抵扣后容量
    /**
     * @example 1
     * @var string
     */
    public $capacityAfterDeduct;

    // 抵扣后容量单位
    /**
     * @example 1
     * @var string
     */
    public $capacityAfterDeductUnit;

    // 本次抵扣量
    /**
     * @example 1
     * @var string
     */
    public $deductedAmount;

    // 本次抵扣量单位
    /**
     * @example 1
     * @var string
     */
    public $deductedAmountUnit;

    // 账单id
    /**
     * @example 1
     * @var string
     */
    public $chargeBillId;

    // 详单id
    /**
     * @example 1
     * @var string
     */
    public $billDetailId;

    // 被抵扣的产品名
    /**
     * @example 1
     * @var string
     */
    public $deductedProductName;

    // 被抵扣实例id
    /**
     * @example 1
     * @var string
     */
    public $deductedInstanceId;

    // 抵扣的字段
    /**
     * @example 1
     * @var string
     */
    public $omsField;

    // 抵扣发生时间
    /**
     * @example 
     * @var string
     */
    public $deductTime;

    // 类型
    /**
     * @example 1
     * @var string
     */
    public $type;

    // 抵扣资金
    /**
     * @example 1
     * @var string
     */
    public $deductedFund;

    // 剩余资金
    /**
     * @example 1
     * @var string
     */
    public $remainFund;

    // 抵扣发生时间
    /**
     * @example 
     * @var string
     */
    public $omsStartTime;

    // 抵扣发生时间
    /**
     * @example 
     * @var string
     */
    public $omsEndTime;

    // extendInfo
    /**
     * @example JSON
     * @var string
     */
    public $extendInfo;

}
