<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\ErrorTaskExecutionNode;
use AntChain\Deps\Models\TaskExecutionProgress;

class AggregatedTaskExecutionProgress extends Model {
    protected $_name = [
        'errorTaskExecutionNodes' => 'error_task_execution_nodes',
        'taskExecutionProgress' => 'task_execution_progress',
    ];
    public function validate() {
        Model::validateRequired('errorTaskExecutionNodes', $this->errorTaskExecutionNodes, true);
        Model::validateRequired('taskExecutionProgress', $this->taskExecutionProgress, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->errorTaskExecutionNodes) {
            $res['error_task_execution_nodes'] = [];
            if(null !== $this->errorTaskExecutionNodes && is_array($this->errorTaskExecutionNodes)){
                $n = 0;
                foreach($this->errorTaskExecutionNodes as $item){
                    $res['error_task_execution_nodes'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->taskExecutionProgress) {
            $res['task_execution_progress'] = null !== $this->taskExecutionProgress ? $this->taskExecutionProgress->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AggregatedTaskExecutionProgress
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['error_task_execution_nodes'])){
            if(!empty($map['error_task_execution_nodes'])){
                $model->errorTaskExecutionNodes = [];
                $n = 0;
                foreach($map['error_task_execution_nodes'] as $item) {
                    $model->errorTaskExecutionNodes[$n++] = null !== $item ? ErrorTaskExecutionNode::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['task_execution_progress'])){
            $model->taskExecutionProgress = TaskExecutionProgress::fromMap($map['task_execution_progress']);
        }
        return $model;
    }
    // 错误节点信息
    /**
     * @example 
     * @var ErrorTaskExecutionNode[]
     */
    public $errorTaskExecutionNodes;

    // 任务执行进度
    /**
     * @example 
     * @var TaskExecutionProgress
     */
    public $taskExecutionProgress;

}
