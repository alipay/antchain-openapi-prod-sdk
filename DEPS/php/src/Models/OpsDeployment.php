<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\OpsApplicationChain;

class OpsDeployment extends Model {
    protected $_name = [
        'applicationChains' => 'application_chains',
        'executor' => 'executor',
        'operationId' => 'operation_id',
        'status' => 'status',
        'title' => 'title',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->applicationChains) {
            $res['application_chains'] = [];
            if(null !== $this->applicationChains && is_array($this->applicationChains)){
                $n = 0;
                foreach($this->applicationChains as $item){
                    $res['application_chains'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->executor) {
            $res['executor'] = $this->executor;
        }
        if (null !== $this->operationId) {
            $res['operation_id'] = $this->operationId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OpsDeployment
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['application_chains'])){
            if(!empty($map['application_chains'])){
                $model->applicationChains = [];
                $n = 0;
                foreach($map['application_chains'] as $item) {
                    $model->applicationChains[$n++] = null !== $item ? OpsApplicationChain::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['executor'])){
            $model->executor = $map['executor'];
        }
        if(isset($map['operation_id'])){
            $model->operationId = $map['operation_id'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['title'])){
            $model->title = $map['title'];
        }
        return $model;
    }
    // 此部署操作中所有被操作的应用（服务）详情，以操作链的形式体现
    /**
     * @example 
     * @var OpsApplicationChain[]
     */
    public $applicationChains;

    // 部署操作执行者
    /**
     * @example 
     * @var string
     */
    public $executor;

    // 部署单id
    /**
     * @example 0000000098
     * @var string
     */
    public $operationId;

    // 
    // 
    // 部署单状态。取值列表：
    // INITING：初始化中；
    // INIT_FAILED：初始化失败；
    // INITED：初始化完成；
    // EXECUTING：执行中；
    // SUCCESS：执行成功；
    // FAILED：执行失败；
    // CANCELING：取消中；
    // CANCELED：已取消
    // 
    // 
    /**
     * @example 
     * @var string
     */
    public $status;

    // 部署单标题。长度不超过50个UTF-8字符
    /**
     * @example 日常应用运维20150720-v1.0.4
     * @var string
     */
    public $title;

}
