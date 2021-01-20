<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class GetWorkspacegroupResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'id' => 'id',
        'name' => 'name',
        'status' => 'status',
        'tenant' => 'tenant',
        'workspaces' => 'workspaces',
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->workspaces) {
            $res['workspaces'] = $this->workspaces;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetWorkspacegroupResponse
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
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['workspaces'])){
            if(!empty($map['workspaces'])){
                $model->workspaces = $map['workspaces'];
            }
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

    // 环境名称
    /**
     * @var string
     */
    public $id;

    // 环境显示名称
    /**
     * @var string
     */
    public $name;

    // 环境状态
    /**
     * @var string
     */
    public $status;

    // 租户名称
    /**
     * @var string
     */
    public $tenant;

    // 工作空间名称列表
    /**
     * @var string[]
     */
    public $workspaces;

}
