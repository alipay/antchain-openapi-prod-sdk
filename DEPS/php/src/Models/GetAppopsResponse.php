<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\OpsApplicationChain;

class GetAppopsResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'applicationChains' => 'application_chains',
        'executor' => 'executor',
        'opsAction' => 'ops_action',
        'opsDimension' => 'ops_dimension',
        'status' => 'status',
        'title' => 'title',
    ];
    public function validate() {}
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
        if (null !== $this->opsAction) {
            $res['ops_action'] = $this->opsAction;
        }
        if (null !== $this->opsDimension) {
            $res['ops_dimension'] = $this->opsDimension;
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
     * @return GetAppopsResponse
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
        if(isset($map['ops_action'])){
            $model->opsAction = $map['ops_action'];
        }
        if(isset($map['ops_dimension'])){
            $model->opsDimension = $map['ops_dimension'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['title'])){
            $model->title = $map['title'];
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

    // 此运维操作中所有被操作的应用详情，以操作链的形式体现
    /**
     * @var OpsApplicationChain[]
     */
    public $applicationChains;

    // 运维操作执行者
    /**
     * @var string
     */
    public $executor;

    // 应用运维的操作类型，取值列表：ONLINE：上线应用，OFFLINE：下线应用，RESTART:重启应用，DEPLOY_STATIC_RESOURCE：部署静态资源
    /**
     * @var string
     */
    public $opsAction;

    // 应用运维的维度，有三种取值：APPLICATION、APP_SERVICE和MACHINE。设置为APPLICATION，表示在非应用服务环境下整个应用都执行该应用运维操作；设置为APP_SERVICE，表示在应用服务环境下对应用服务执行运维操作;设置为MACHINE，表示应用下的一台或多台机器执行改应用运维操作。
    /**
     * @var string
     */
    public $opsDimension;

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

    // 应用运维单标题
    /**
     * @var string
     */
    public $title;

}
