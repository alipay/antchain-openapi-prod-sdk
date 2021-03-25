<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class TaskResult extends Model {
    protected $_name = [
        'result' => 'result',
        'targetId' => 'target_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }
        if (null !== $this->targetId) {
            $res['target_id'] = $this->targetId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return TaskResult
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['result'])){
            $model->result = $map['result'];
        }
        if(isset($map['target_id'])){
            $model->targetId = $map['target_id'];
        }
        return $model;
    }
    // 任务执行结果。取值：
    // SUCCESSFUL：任务执行成功；
    // FAILED：任务执行失败
    // 
    /**
     * @example 
     * @var string
     */
    public $result;

    // 任务目标id，如：一个Computer的id
    /**
     * @example 
     * @var string
     */
    public $targetId;

}
