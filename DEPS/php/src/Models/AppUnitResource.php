<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class AppUnitResource extends Model {
    protected $_name = [
        'appId' => 'app_id',
        'unitId' => 'unit_id',
        'machineCount' => 'machine_count',
        'mountedMachineCount' => 'mounted_machine_count',
        'slbCount' => 'slb_count',
        'slbWeight' => 'slb_weight',
    ];
    public function validate() {
        Model::validateRequired('appId', $this->appId, true);
        Model::validateRequired('unitId', $this->unitId, true);
        Model::validateRequired('machineCount', $this->machineCount, true);
        Model::validateRequired('mountedMachineCount', $this->mountedMachineCount, true);
        Model::validateRequired('slbCount', $this->slbCount, true);
        Model::validateRequired('slbWeight', $this->slbWeight, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->unitId) {
            $res['unit_id'] = $this->unitId;
        }
        if (null !== $this->machineCount) {
            $res['machine_count'] = $this->machineCount;
        }
        if (null !== $this->mountedMachineCount) {
            $res['mounted_machine_count'] = $this->mountedMachineCount;
        }
        if (null !== $this->slbCount) {
            $res['slb_count'] = $this->slbCount;
        }
        if (null !== $this->slbWeight) {
            $res['slb_weight'] = $this->slbWeight;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AppUnitResource
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['app_id'])){
            $model->appId = $map['app_id'];
        }
        if(isset($map['unit_id'])){
            $model->unitId = $map['unit_id'];
        }
        if(isset($map['machine_count'])){
            $model->machineCount = $map['machine_count'];
        }
        if(isset($map['mounted_machine_count'])){
            $model->mountedMachineCount = $map['mounted_machine_count'];
        }
        if(isset($map['slb_count'])){
            $model->slbCount = $map['slb_count'];
        }
        if(isset($map['slb_weight'])){
            $model->slbWeight = $map['slb_weight'];
        }
        return $model;
    }
    // 应用 ID
    /**
     * @example 123
     * @var string
     */
    public $appId;

    // 单元id
    /**
     * @example 123
     * @var string
     */
    public $unitId;

    // 机器数
    /**
     * @example 
     * @var int
     */
    public $machineCount;

    // 已挂载机器数
    /**
     * @example 
     * @var int
     */
    public $mountedMachineCount;

    // 负载均衡数
    /**
     * @example 123
     * @var int
     */
    public $slbCount;

    // 负载均衡权重
    /**
     * @example 
     * @var int
     */
    public $slbWeight;

}
