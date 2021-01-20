<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\ResourceGroupExecutionProgress;
use AntChain\Deps\Models\TaskExecutionProgress;

class AppServiceExecutionProgress extends Model {
    protected $_name = [
        'baseProgress' => 'base_progress',
        'groupCount' => 'group_count',
        'preDeploymentExecutionProgresses' => 'pre_deployment_execution_progresses',
        'postDeploymentExecutionProgresses' => 'post_deployment_execution_progresses',
        'groupExecutionProgresses' => 'group_execution_progresses',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->baseProgress) {
            $res['base_progress'] = null !== $this->baseProgress ? $this->baseProgress->toMap() : null;
        }
        if (null !== $this->groupCount) {
            $res['group_count'] = $this->groupCount;
        }
        if (null !== $this->preDeploymentExecutionProgresses) {
            $res['pre_deployment_execution_progresses'] = [];
            if(null !== $this->preDeploymentExecutionProgresses && is_array($this->preDeploymentExecutionProgresses)){
                $n = 0;
                foreach($this->preDeploymentExecutionProgresses as $item){
                    $res['pre_deployment_execution_progresses'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->postDeploymentExecutionProgresses) {
            $res['post_deployment_execution_progresses'] = [];
            if(null !== $this->postDeploymentExecutionProgresses && is_array($this->postDeploymentExecutionProgresses)){
                $n = 0;
                foreach($this->postDeploymentExecutionProgresses as $item){
                    $res['post_deployment_execution_progresses'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->groupExecutionProgresses) {
            $res['group_execution_progresses'] = [];
            if(null !== $this->groupExecutionProgresses && is_array($this->groupExecutionProgresses)){
                $n = 0;
                foreach($this->groupExecutionProgresses as $item){
                    $res['group_execution_progresses'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AppServiceExecutionProgress
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['base_progress'])){
            $model->baseProgress = ResourceGroupExecutionProgress::fromMap($map['base_progress']);
        }
        if(isset($map['group_count'])){
            $model->groupCount = $map['group_count'];
        }
        if(isset($map['pre_deployment_execution_progresses'])){
            if(!empty($map['pre_deployment_execution_progresses'])){
                $model->preDeploymentExecutionProgresses = [];
                $n = 0;
                foreach($map['pre_deployment_execution_progresses'] as $item) {
                    $model->preDeploymentExecutionProgresses[$n++] = null !== $item ? TaskExecutionProgress::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['post_deployment_execution_progresses'])){
            if(!empty($map['post_deployment_execution_progresses'])){
                $model->postDeploymentExecutionProgresses = [];
                $n = 0;
                foreach($map['post_deployment_execution_progresses'] as $item) {
                    $model->postDeploymentExecutionProgresses[$n++] = null !== $item ? TaskExecutionProgress::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['group_execution_progresses'])){
            if(!empty($map['group_execution_progresses'])){
                $model->groupExecutionProgresses = [];
                $n = 0;
                foreach($map['group_execution_progresses'] as $item) {
                    $model->groupExecutionProgresses[$n++] = null !== $item ? ResourceGroupExecutionProgress::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // base_progress
    /**
     * @example 
     * @var ResourceGroupExecutionProgress
     */
    public $baseProgress;

    // group_count
    /**
     * @example 
     * @var int
     */
    public $groupCount;

    // pre_deployment_execution_progresses
    /**
     * @example 
     * @var TaskExecutionProgress[]
     */
    public $preDeploymentExecutionProgresses;

    // post_deployment_execution_progresses
    /**
     * @example 
     * @var TaskExecutionProgress[]
     */
    public $postDeploymentExecutionProgresses;

    // group_execution_progresses
    /**
     * @example 
     * @var ResourceGroupExecutionProgress[]
     */
    public $groupExecutionProgresses;

}
