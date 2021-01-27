<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

use AntChain\IAM\Models\Action;

class GetRoleResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'actions' => 'actions',
        'createTime' => 'create_time',
        'description' => 'description',
        'id' => 'id',
        'name' => 'name',
        'tenant' => 'tenant',
        'type' => 'type',
        'updateTime' => 'update_time',
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
        if (null !== $this->actions) {
            $res['actions'] = [];
            if(null !== $this->actions && is_array($this->actions)){
                $n = 0;
                foreach($this->actions as $item){
                    $res['actions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetRoleResponse
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
        if(isset($map['actions'])){
            if(!empty($map['actions'])){
                $model->actions = [];
                $n = 0;
                foreach($map['actions'] as $item) {
                    $model->actions[$n++] = null !== $item ? Action::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['create_time'])){
            $model->createTime = $map['create_time'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['update_time'])){
            $model->updateTime = $map['update_time'];
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

    // 角色所包含的操作点
    /**
     * @var Action[]
     */
    public $actions;

    // 创建时间,ISO8601格式
    /**
     * @var string
     */
    public $createTime;

    // 角色描述
    /**
     * @var string
     */
    public $description;

    // 角色Id
    /**
     * @var string
     */
    public $id;

    // 角色名称
    /**
     * @var string
     */
    public $name;

    // 角色归属租户
    /**
     * @var string
     */
    public $tenant;

    // 角色类型，CUSTOM:自定义角色，COMMON:系统通用角色
    /**
     * @var string
     */
    public $type;

    // 更新时间,ISO8601格式
    /**
     * @var string
     */
    public $updateTime;

}
