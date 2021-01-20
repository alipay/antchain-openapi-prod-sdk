<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\Pair;

class ResourceGroupExecutionProgress extends Model {
    protected $_name = [
        'finishedTime' => 'finished_time',
        'id' => 'id',
        'paasId' => 'paas_id',
        'resourceCount' => 'resource_count',
        'resourceStates' => 'resource_states',
        'standaloneExecutable' => 'standalone_executable',
        'startedTime' => 'started_time',
        'state' => 'state',
        'referKey' => 'refer_key',
    ];
    public function validate() {
        Model::validatePattern('startedTime', $this->startedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->finishedTime) {
            $res['finished_time'] = $this->finishedTime;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->paasId) {
            $res['paas_id'] = $this->paasId;
        }
        if (null !== $this->resourceCount) {
            $res['resource_count'] = $this->resourceCount;
        }
        if (null !== $this->resourceStates) {
            $res['resource_states'] = [];
            if(null !== $this->resourceStates && is_array($this->resourceStates)){
                $n = 0;
                foreach($this->resourceStates as $item){
                    $res['resource_states'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->standaloneExecutable) {
            $res['standalone_executable'] = $this->standaloneExecutable;
        }
        if (null !== $this->startedTime) {
            $res['started_time'] = $this->startedTime;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->referKey) {
            $res['refer_key'] = $this->referKey;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ResourceGroupExecutionProgress
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['finished_time'])){
            $model->finishedTime = $map['finished_time'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['paas_id'])){
            $model->paasId = $map['paas_id'];
        }
        if(isset($map['resource_count'])){
            $model->resourceCount = $map['resource_count'];
        }
        if(isset($map['resource_states'])){
            if(!empty($map['resource_states'])){
                $model->resourceStates = [];
                $n = 0;
                foreach($map['resource_states'] as $item) {
                    $model->resourceStates[$n++] = null !== $item ? Pair::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['standalone_executable'])){
            $model->standaloneExecutable = $map['standalone_executable'];
        }
        if(isset($map['started_time'])){
            $model->startedTime = $map['started_time'];
        }
        if(isset($map['state'])){
            $model->state = $map['state'];
        }
        if(isset($map['refer_key'])){
            $model->referKey = $map['refer_key'];
        }
        return $model;
    }
    // finished_time
    /**
     * @example true, false
     * @var bool
     */
    public $finishedTime;

    // id
    /**
     * @example id
     * @var string
     */
    public $id;

    // paas_id
    /**
     * @example paas_id
     * @var string
     */
    public $paasId;

    // resource_count
    /**
     * @example 
     * @var int
     */
    public $resourceCount;

    // resource_states
    /**
     * @example 
     * @var Pair[]
     */
    public $resourceStates;

    // standalone_executable
    /**
     * @example true, false
     * @var bool
     */
    public $standaloneExecutable;

    // started_time
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $startedTime;

    // state
    /**
     * @example state
     * @var string
     */
    public $state;

    // refer_key
    /**
     * @example refer_key
     * @var string
     */
    public $referKey;

}
