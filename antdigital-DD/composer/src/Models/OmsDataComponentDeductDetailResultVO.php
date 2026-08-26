<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class OmsDataComponentDeductDetailResultVO extends Model {
    protected $_name = [
        'resourcePackageLogId' => 'resource_package_log_id',
        'deductAmount' => 'deduct_amount',
        'deductedFund' => 'deducted_fund',
        'deductedTime' => 'deducted_time',
        'resourcePackageId' => 'resource_package_id',
        'resourcePackageInstanceId' => 'resource_package_instance_id',
        'deductAmountStr' => 'deduct_amount_str',
    ];
    public function validate() {
        Model::validateRequired('resourcePackageLogId', $this->resourcePackageLogId, true);
        Model::validateRequired('deductedFund', $this->deductedFund, true);
        Model::validateRequired('deductedTime', $this->deductedTime, true);
        Model::validateRequired('resourcePackageId', $this->resourcePackageId, true);
        Model::validateRequired('resourcePackageInstanceId', $this->resourcePackageInstanceId, true);
        Model::validatePattern('deductedTime', $this->deductedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->resourcePackageLogId) {
            $res['resource_package_log_id'] = $this->resourcePackageLogId;
        }
        if (null !== $this->deductAmount) {
            $res['deduct_amount'] = $this->deductAmount;
        }
        if (null !== $this->deductedFund) {
            $res['deducted_fund'] = $this->deductedFund;
        }
        if (null !== $this->deductedTime) {
            $res['deducted_time'] = $this->deductedTime;
        }
        if (null !== $this->resourcePackageId) {
            $res['resource_package_id'] = $this->resourcePackageId;
        }
        if (null !== $this->resourcePackageInstanceId) {
            $res['resource_package_instance_id'] = $this->resourcePackageInstanceId;
        }
        if (null !== $this->deductAmountStr) {
            $res['deduct_amount_str'] = $this->deductAmountStr;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OmsDataComponentDeductDetailResultVO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['resource_package_log_id'])){
            $model->resourcePackageLogId = $map['resource_package_log_id'];
        }
        if(isset($map['deduct_amount'])){
            $model->deductAmount = $map['deduct_amount'];
        }
        if(isset($map['deducted_fund'])){
            $model->deductedFund = $map['deducted_fund'];
        }
        if(isset($map['deducted_time'])){
            $model->deductedTime = $map['deducted_time'];
        }
        if(isset($map['resource_package_id'])){
            $model->resourcePackageId = $map['resource_package_id'];
        }
        if(isset($map['resource_package_instance_id'])){
            $model->resourcePackageInstanceId = $map['resource_package_instance_id'];
        }
        if(isset($map['deduct_amount_str'])){
            $model->deductAmountStr = $map['deduct_amount_str'];
        }
        return $model;
    }
    // 资源包抵扣日志id
    /**
     * @example 1233
     * @var string
     */
    public $resourcePackageLogId;

    // 资源包抵扣量
    /**
     * @example 123
     * @var int
     */
    public $deductAmount;

    // 资源包抵扣价值
    /**
     * @example 123
     * @var string
     */
    public $deductedFund;

    // 资源包抵扣时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $deductedTime;

    // 资源包id
    /**
     * @example A0SQBRFM01222133ORGJC1CN1ZXEMO6K8TL
     * @var string
     */
    public $resourcePackageId;

    // 资源包实例id
    /**
     * @example 资源包实例id
     * @var string
     */
    public $resourcePackageInstanceId;

    // 高精度抵扣量
    /**
     * @example 0.09
     * @var string
     */
    public $deductAmountStr;

}
