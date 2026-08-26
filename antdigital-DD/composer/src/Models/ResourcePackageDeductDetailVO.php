<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class ResourcePackageDeductDetailVO extends Model {
    protected $_name = [
        'resourcePackageLogId' => 'resource_package_log_id',
        'deductedAmount' => 'deducted_amount',
        'resourcePackageId' => 'resource_package_id',
        'resourcePackageInstanceId' => 'resource_package_instance_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->resourcePackageLogId) {
            $res['resource_package_log_id'] = $this->resourcePackageLogId;
        }
        if (null !== $this->deductedAmount) {
            $res['deducted_amount'] = $this->deductedAmount;
        }
        if (null !== $this->resourcePackageId) {
            $res['resource_package_id'] = $this->resourcePackageId;
        }
        if (null !== $this->resourcePackageInstanceId) {
            $res['resource_package_instance_id'] = $this->resourcePackageInstanceId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ResourcePackageDeductDetailVO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['resource_package_log_id'])){
            $model->resourcePackageLogId = $map['resource_package_log_id'];
        }
        if(isset($map['deducted_amount'])){
            $model->deductedAmount = $map['deducted_amount'];
        }
        if(isset($map['resource_package_id'])){
            $model->resourcePackageId = $map['resource_package_id'];
        }
        if(isset($map['resource_package_instance_id'])){
            $model->resourcePackageInstanceId = $map['resource_package_instance_id'];
        }
        return $model;
    }
    // 资源包抵扣日志id
    /**
     * @example 11
     * @var string
     */
    public $resourcePackageLogId;

    // 资源包抵扣量
    /**
     * @example 1
     * @var string
     */
    public $deductedAmount;

    // 资源包id
    /**
     * @example aaa
     * @var string
     */
    public $resourcePackageId;

    // 资源包实例id
    /**
     * @example aaa
     * @var string
     */
    public $resourcePackageInstanceId;

}
