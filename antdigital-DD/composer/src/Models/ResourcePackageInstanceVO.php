<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\ResourcePackageLogVO;

class ResourcePackageInstanceVO extends Model {
    protected $_name = [
        'id' => 'id',
        'tenantId' => 'tenant_id',
        'instanceName' => 'instance_name',
        'resourcePackageDisplayName' => 'resource_package_display_name',
        'resourcePackageProductName' => 'resource_package_product_name',
        'applicableProductName' => 'applicable_product_name',
        'status' => 'status',
        'renewable' => 'renewable',
        'upgradable' => 'upgradable',
        'initialCapacity' => 'initial_capacity',
        'currentCapacity' => 'current_capacity',
        'initCapacityViewUnit' => 'init_capacity_view_unit',
        'currentCapacityViewUnit' => 'current_capacity_view_unit',
        'startTime' => 'start_time',
        'endTime' => 'end_time',
        'totalFund' => 'total_fund',
        'remainFund' => 'remain_fund',
        'subResourcePackageVos' => 'sub_resource_package_vos',
    ];
    public function validate() {
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('endTime', $this->endTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->instanceName) {
            $res['instance_name'] = $this->instanceName;
        }
        if (null !== $this->resourcePackageDisplayName) {
            $res['resource_package_display_name'] = $this->resourcePackageDisplayName;
        }
        if (null !== $this->resourcePackageProductName) {
            $res['resource_package_product_name'] = $this->resourcePackageProductName;
        }
        if (null !== $this->applicableProductName) {
            $res['applicable_product_name'] = $this->applicableProductName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->renewable) {
            $res['renewable'] = $this->renewable;
        }
        if (null !== $this->upgradable) {
            $res['upgradable'] = $this->upgradable;
        }
        if (null !== $this->initialCapacity) {
            $res['initial_capacity'] = $this->initialCapacity;
        }
        if (null !== $this->currentCapacity) {
            $res['current_capacity'] = $this->currentCapacity;
        }
        if (null !== $this->initCapacityViewUnit) {
            $res['init_capacity_view_unit'] = $this->initCapacityViewUnit;
        }
        if (null !== $this->currentCapacityViewUnit) {
            $res['current_capacity_view_unit'] = $this->currentCapacityViewUnit;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->totalFund) {
            $res['total_fund'] = $this->totalFund;
        }
        if (null !== $this->remainFund) {
            $res['remain_fund'] = $this->remainFund;
        }
        if (null !== $this->subResourcePackageVos) {
            $res['sub_resource_package_vos'] = [];
            if(null !== $this->subResourcePackageVos && is_array($this->subResourcePackageVos)){
                $n = 0;
                foreach($this->subResourcePackageVos as $item){
                    $res['sub_resource_package_vos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ResourcePackageInstanceVO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['instance_name'])){
            $model->instanceName = $map['instance_name'];
        }
        if(isset($map['resource_package_display_name'])){
            $model->resourcePackageDisplayName = $map['resource_package_display_name'];
        }
        if(isset($map['resource_package_product_name'])){
            $model->resourcePackageProductName = $map['resource_package_product_name'];
        }
        if(isset($map['applicable_product_name'])){
            $model->applicableProductName = $map['applicable_product_name'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['renewable'])){
            $model->renewable = $map['renewable'];
        }
        if(isset($map['upgradable'])){
            $model->upgradable = $map['upgradable'];
        }
        if(isset($map['initial_capacity'])){
            $model->initialCapacity = $map['initial_capacity'];
        }
        if(isset($map['current_capacity'])){
            $model->currentCapacity = $map['current_capacity'];
        }
        if(isset($map['init_capacity_view_unit'])){
            $model->initCapacityViewUnit = $map['init_capacity_view_unit'];
        }
        if(isset($map['current_capacity_view_unit'])){
            $model->currentCapacityViewUnit = $map['current_capacity_view_unit'];
        }
        if(isset($map['start_time'])){
            $model->startTime = $map['start_time'];
        }
        if(isset($map['end_time'])){
            $model->endTime = $map['end_time'];
        }
        if(isset($map['total_fund'])){
            $model->totalFund = $map['total_fund'];
        }
        if(isset($map['remain_fund'])){
            $model->remainFund = $map['remain_fund'];
        }
        if(isset($map['sub_resource_package_vos'])){
            if(!empty($map['sub_resource_package_vos'])){
                $model->subResourcePackageVos = [];
                $n = 0;
                foreach($map['sub_resource_package_vos'] as $item) {
                    $model->subResourcePackageVos[$n++] = null !== $item ? ResourcePackageLogVO::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 流水号
    /**
     * @example 1
     * @var string
     */
    public $id;

    // 租户id
    /**
     * @example 2088101118131245
     * @var string
     */
    public $tenantId;

    // 实例名称
    /**
     * @example 实例
     * @var string
     */
    public $instanceName;

    // 资源包前端展现名称
    /**
     * @example 名称
     * @var string
     */
    public $resourcePackageDisplayName;

    // 资源包商品名
    /**
     * @example 资源包商品名
     * @var string
     */
    public $resourcePackageProductName;

    // 资源包可抵扣资源名称
    /**
     * @example 资源包可抵扣资源名称
     * @var string
     */
    public $applicableProductName;

    // 当前状态-VALID、CLOSED、INVALID
    /**
     * @example INVALID
     * @var string
     */
    public $status;

    // 是否可续费
    /**
     * @example true, false
     * @var bool
     */
    public $renewable;

    // 是否可升级
    /**
     * @example true, false
     * @var bool
     */
    public $upgradable;

    // 初始容量
    /**
     * @example 1
     * @var string
     */
    public $initialCapacity;

    // 当前容量
    /**
     * @example 1
     * @var string
     */
    public $currentCapacity;

    // 初始容量单位
    /**
     * @example 1
     * @var string
     */
    public $initCapacityViewUnit;

    // 当前容量单位
    /**
     * @example 1
     * @var string
     */
    public $currentCapacityViewUnit;

    // 有效期开始时间
    /**
     * @example 
     * @var string
     */
    public $startTime;

    // 有效期结束时间
    /**
     * @example 
     * @var string
     */
    public $endTime;

    // 总资金
    /**
     * @example 1
     * @var string
     */
    public $totalFund;

    // 剩余资金
    /**
     * @example 1
     * @var string
     */
    public $remainFund;

    // 子包信息
    /**
     * @example 
     * @var ResourcePackageLogVO[]
     */
    public $subResourcePackageVos;

}
