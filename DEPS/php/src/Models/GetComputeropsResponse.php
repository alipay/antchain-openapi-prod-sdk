<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\OpsGroup;

class GetComputeropsResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'executor' => 'executor',
        'groups' => 'groups',
        'status' => 'status',
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
        if (null !== $this->executor) {
            $res['executor'] = $this->executor;
        }
        if (null !== $this->groups) {
            $res['groups'] = [];
            if(null !== $this->groups && is_array($this->groups)){
                $n = 0;
                foreach($this->groups as $item){
                    $res['groups'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetComputeropsResponse
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
        if(isset($map['executor'])){
            $model->executor = $map['executor'];
        }
        if(isset($map['groups'])){
            if(!empty($map['groups'])){
                $model->groups = [];
                $n = 0;
                foreach($map['groups'] as $item) {
                    $model->groups[$n++] = null !== $item ? OpsGroup::fromMap($item) : $item;
                }
            }
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

    // 运维操作执行者
    /**
     * @var string
     */
    public $executor;

    // 改运维单下所有计算容器分组运维状态详情
    /**
     * @var OpsGroup[]
     */
    public $groups;

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
