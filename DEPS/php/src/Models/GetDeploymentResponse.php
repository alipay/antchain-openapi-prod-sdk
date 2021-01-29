<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\OpsApplicationChain;

class GetDeploymentResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'applicationChains' => 'application_chains',
        'executor' => 'executor',
        'status' => 'status',
    ];
    public function validate() {
        Model::validateRequired('applicationChains', $this->applicationChains, true);
        Model::validateRequired('executor', $this->executor, true);
        Model::validateRequired('status', $this->status, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetDeploymentResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
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
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 此部署操作中所有被操作的应用详情，以操作链的形式体现
    /**
     * @var OpsApplicationChain[]
     */
    public $applicationChains;

    // 部署操作执行者
    /**
     * @var string
     */
    public $executor;

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
     * @var string
     */
    public $status;

}
