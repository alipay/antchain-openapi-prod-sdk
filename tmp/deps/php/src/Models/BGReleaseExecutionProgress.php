<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\SlbExecutionProgress;
use AntChain\Deps\Models\TaskExecutionProgress;
use AntChain\Deps\Models\ResourceGroupExecutionProgress;

class BGReleaseExecutionProgress extends Model {
    protected $_name = [
        'unitId' => 'unit_id',
        'unitType' => 'unit_type',
        'resourceType' => 'resource_type',
        'trafficExecutionProgressOfService' => 'traffic_execution_progress_of_service',
        'serviceExecutionProgressGroup' => 'service_execution_progress_group',
        'rollbackServiceExecutionProgressGroup' => 'rollback_service_execution_progress_group',
        'baseProgress' => 'base_progress',
    ];
    public function validate() {
        Model::validateRequired('unitId', $this->unitId, true);
        Model::validateRequired('unitType', $this->unitType, true);
        Model::validateRequired('resourceType', $this->resourceType, true);
        Model::validateRequired('trafficExecutionProgressOfService', $this->trafficExecutionProgressOfService, true);
        Model::validateRequired('serviceExecutionProgressGroup', $this->serviceExecutionProgressGroup, true);
        Model::validateRequired('rollbackServiceExecutionProgressGroup', $this->rollbackServiceExecutionProgressGroup, true);
        Model::validateRequired('baseProgress', $this->baseProgress, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->unitId) {
            $res['unit_id'] = $this->unitId;
        }
        if (null !== $this->unitType) {
            $res['unit_type'] = $this->unitType;
        }
        if (null !== $this->resourceType) {
            $res['resource_type'] = $this->resourceType;
        }
        if (null !== $this->trafficExecutionProgressOfService) {
            $res['traffic_execution_progress_of_service'] = [];
            if(null !== $this->trafficExecutionProgressOfService && is_array($this->trafficExecutionProgressOfService)){
                $n = 0;
                foreach($this->trafficExecutionProgressOfService as $item){
                    $res['traffic_execution_progress_of_service'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->serviceExecutionProgressGroup) {
            $res['service_execution_progress_group'] = [];
            if(null !== $this->serviceExecutionProgressGroup && is_array($this->serviceExecutionProgressGroup)){
                $n = 0;
                foreach($this->serviceExecutionProgressGroup as $item){
                    $res['service_execution_progress_group'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->rollbackServiceExecutionProgressGroup) {
            $res['rollback_service_execution_progress_group'] = [];
            if(null !== $this->rollbackServiceExecutionProgressGroup && is_array($this->rollbackServiceExecutionProgressGroup)){
                $n = 0;
                foreach($this->rollbackServiceExecutionProgressGroup as $item){
                    $res['rollback_service_execution_progress_group'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->baseProgress) {
            $res['base_progress'] = null !== $this->baseProgress ? $this->baseProgress->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return BGReleaseExecutionProgress
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['unit_id'])){
            $model->unitId = $map['unit_id'];
        }
        if(isset($map['unit_type'])){
            $model->unitType = $map['unit_type'];
        }
        if(isset($map['resource_type'])){
            $model->resourceType = $map['resource_type'];
        }
        if(isset($map['traffic_execution_progress_of_service'])){
            if(!empty($map['traffic_execution_progress_of_service'])){
                $model->trafficExecutionProgressOfService = [];
                $n = 0;
                foreach($map['traffic_execution_progress_of_service'] as $item) {
                    $model->trafficExecutionProgressOfService[$n++] = null !== $item ? SlbExecutionProgress::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['service_execution_progress_group'])){
            if(!empty($map['service_execution_progress_group'])){
                $model->serviceExecutionProgressGroup = [];
                $n = 0;
                foreach($map['service_execution_progress_group'] as $item) {
                    $model->serviceExecutionProgressGroup[$n++] = null !== $item ? TaskExecutionProgress::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['rollback_service_execution_progress_group'])){
            if(!empty($map['rollback_service_execution_progress_group'])){
                $model->rollbackServiceExecutionProgressGroup = [];
                $n = 0;
                foreach($map['rollback_service_execution_progress_group'] as $item) {
                    $model->rollbackServiceExecutionProgressGroup[$n++] = null !== $item ? TaskExecutionProgress::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['base_progress'])){
            $model->baseProgress = ResourceGroupExecutionProgress::fromMap($map['base_progress']);
        }
        return $model;
    }
    // unit_id
    /**
     * @example unit_id
     * @var string
     */
    public $unitId;

    // unit_type
    /**
     * @example unit_type
     * @var string
     */
    public $unitType;

    // resource_type
    /**
     * @example resource_type
     * @var string
     */
    public $resourceType;

    // traffic_execution_progress_of_service
    /**
     * @example 
     * @var SlbExecutionProgress[]
     */
    public $trafficExecutionProgressOfService;

    // service_execution_progress_group
    /**
     * @example 
     * @var TaskExecutionProgress[]
     */
    public $serviceExecutionProgressGroup;

    // rollback_service_execution_progress_group
    /**
     * @example 
     * @var TaskExecutionProgress[]
     */
    public $rollbackServiceExecutionProgressGroup;

    // base_progress
    /**
     * @example 
     * @var ResourceGroupExecutionProgress
     */
    public $baseProgress;

}
