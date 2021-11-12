<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class UserAuth extends Model
{
    // 授权条件,  Local的授权条件使用正则规则, 其中 # 为特殊分隔符, 在权限比较时需要移除该符号
    /**
     * @example 0000#.*
     *
     * @var string
     */
    public $condition;

    // YUNYOU_LOCAL_AUTH_KEY
    /**
     * @example YUNYOU_LOCAL_AUTH_KEY
     *
     * @var string
     */
    public $conditionKey;

    // 用户昵称, 如果是域内, 就是花名
    /**
     * @example 夏雩
     *
     * @var string
     */
    public $nickName;

    // 是否为负责人
    /**
     * @example true, false
     *
     * @var bool
     */
    public $primary;

    // 用户姓名
    /**
     * @example 刘涛
     *
     * @var string
     */
    public $realName;

    // PROCESS_ENGINEER: 全局运维工程师
    // PROD_PROCESS_ENGINEER: 产品运维工程师
    // DELIVERY_ENGINEER: 交付工程师
    // ENV_MANAGER: 环境管理员
    // LOCAL_OBSERVER: 观察者
    // AKE_PROCESS_ENGINEER: AKE运维工程师
    /**
     * @example AKE_PROCESS_ENGINEER
     *
     * @var string
     */
    public $role;

    // ID来源, 该ID用于Global和Local进行信息同步使用, 因此该值就是域账号
    /**
     * @example liutao.lt
     *
     * @var string
     */
    public $sourceId;

    // 授权状态,
    // WAIT_REGIST: 等待用户注册
    // ACTIVE: 授权已经生效
    // DELETED: 授权已经删除
    /**
     * @example ACTIVE
     *
     * @var string
     */
    public $status;

    // 用户ID, 该值为IAM上的User.ID属性
    /**
     * @example 000202
     *
     * @var string
     */
    public $userId;
    protected $_name = [
        'condition'    => 'condition',
        'conditionKey' => 'condition_key',
        'nickName'     => 'nick_name',
        'primary'      => 'primary',
        'realName'     => 'real_name',
        'role'         => 'role',
        'sourceId'     => 'source_id',
        'status'       => 'status',
        'userId'       => 'user_id',
    ];

    public function validate()
    {
        Model::validateRequired('condition', $this->condition, true);
        Model::validateRequired('conditionKey', $this->conditionKey, true);
        Model::validateRequired('primary', $this->primary, true);
        Model::validateRequired('realName', $this->realName, true);
        Model::validateRequired('role', $this->role, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('userId', $this->userId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->condition) {
            $res['condition'] = $this->condition;
        }
        if (null !== $this->conditionKey) {
            $res['condition_key'] = $this->conditionKey;
        }
        if (null !== $this->nickName) {
            $res['nick_name'] = $this->nickName;
        }
        if (null !== $this->primary) {
            $res['primary'] = $this->primary;
        }
        if (null !== $this->realName) {
            $res['real_name'] = $this->realName;
        }
        if (null !== $this->role) {
            $res['role'] = $this->role;
        }
        if (null !== $this->sourceId) {
            $res['source_id'] = $this->sourceId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UserAuth
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['condition'])) {
            $model->condition = $map['condition'];
        }
        if (isset($map['condition_key'])) {
            $model->conditionKey = $map['condition_key'];
        }
        if (isset($map['nick_name'])) {
            $model->nickName = $map['nick_name'];
        }
        if (isset($map['primary'])) {
            $model->primary = $map['primary'];
        }
        if (isset($map['real_name'])) {
            $model->realName = $map['real_name'];
        }
        if (isset($map['role'])) {
            $model->role = $map['role'];
        }
        if (isset($map['source_id'])) {
            $model->sourceId = $map['source_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }

        return $model;
    }
}
