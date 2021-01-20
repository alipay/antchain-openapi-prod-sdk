<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class SingleExecResult extends Model {
    protected $_name = [
        'executeDetails' => 'execute_details',
        'finishTime' => 'finish_time',
        'startTime' => 'start_time',
        'status' => 'status',
        'target' => 'target',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->executeDetails) {
            $res['execute_details'] = $this->executeDetails;
        }
        if (null !== $this->finishTime) {
            $res['finish_time'] = $this->finishTime;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->target) {
            $res['target'] = $this->target;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SingleExecResult
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['execute_details'])){
            $model->executeDetails = $map['execute_details'];
        }
        if(isset($map['finish_time'])){
            $model->finishTime = $map['finish_time'];
        }
        if(isset($map['start_time'])){
            $model->startTime = $map['start_time'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['target'])){
            $model->target = $map['target'];
        }
        return $model;
    }
    // 执行结果详情。如果成功，为执行日志；如果失败，为错误信息
    /**
     * @example 
     * @var string
     */
    public $executeDetails;

    // 执行结束时间
    /**
     * @example 
     * @var int
     */
    public $finishTime;

    // 执行开始时间
    /**
     * @example 
     * @var int
     */
    public $startTime;

    // 执行结果状态。取值列表：
    // EXECUTING：执行中；
    // SUCCESS：执行成功；
    // FAILED：执行失败；
    // IGNORED：已忽略；
    // TIME_OUT：已超时
    // 
    /**
     * @example 
     * @var string
     */
    public $status;

    // 执行对象。比如一台机器的ip
    /**
     * @example 
     * @var string
     */
    public $target;

}
