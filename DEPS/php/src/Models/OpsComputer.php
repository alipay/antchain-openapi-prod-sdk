<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\OpsComputerTask;

class OpsComputer extends Model {
    protected $_name = [
        'id' => 'id',
        'innerIp' => 'inner_ip',
        'name' => 'name',
        'status' => 'status',
        'tasks' => 'tasks',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->innerIp) {
            $res['inner_ip'] = $this->innerIp;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->tasks) {
            $res['tasks'] = [];
            if(null !== $this->tasks && is_array($this->tasks)){
                $n = 0;
                foreach($this->tasks as $item){
                    $res['tasks'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OpsComputer
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['inner_ip'])){
            $model->innerIp = $map['inner_ip'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['tasks'])){
            if(!empty($map['tasks'])){
                $model->tasks = [];
                $n = 0;
                foreach($map['tasks'] as $item) {
                    $model->tasks[$n++] = null !== $item ? OpsComputerTask::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 计算容器id
    /**
     * @example 
     * @var string
     */
    public $id;

    // 计算容器内网ip
    /**
     * @example 
     * @var string
     */
    public $innerIp;

    // 计算容器名称
    /**
     * @example 
     * @var string
     */
    public $name;

    // 计算容器当前运维状态。取值列表：
    // INITED：初始化完成；
    // EXECUTING：执行中；
    // SUCCESS：执行成功；
    // FAILED：执行失败；
    // CANCELED：已取消；
    // IGNORED：已忽略
    // 
    /**
     * @example 
     * @var string
     */
    public $status;

    // 计算容器上执行的任务信息。任务信息列表中包含正在执行和执行完成的任务。
    /**
     * @example 
     * @var OpsComputerTask[]
     */
    public $tasks;

}
