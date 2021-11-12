<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class ImportAuthRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 授权的条件
    /**
     * @var string
     */
    public $condition;

    // 授权的KEY, 目前Local只有YUNYOU_LOCAL_AUTH_KEY
    /**
     * @var string
     */
    public $conditionKey;

    // 是否被删除授权
    /**
     * @var bool
     */
    public $deleted;

    // 授权的MD5
    /**
     * @var string
     */
    public $md5;

    // 昵称
    /**
     * @var string
     */
    public $nickName;

    // 是否为负责人
    /**
     * @var bool
     */
    public $primary;

    // 用户真名
    /**
     * @var string
     */
    public $realName;

    // 角色
    /**
     * @var string
     */
    public $role;

    // 用户的域账号
    /**
     * @var string
     */
    public $sourceId;

    // 工号
    /**
     * @var string
     */
    public $workNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'condition'         => 'condition',
        'conditionKey'      => 'condition_key',
        'deleted'           => 'deleted',
        'md5'               => 'md5',
        'nickName'          => 'nick_name',
        'primary'           => 'primary',
        'realName'          => 'real_name',
        'role'              => 'role',
        'sourceId'          => 'source_id',
        'workNo'            => 'work_no',
    ];

    public function validate()
    {
        Model::validateRequired('condition', $this->condition, true);
        Model::validateRequired('conditionKey', $this->conditionKey, true);
        Model::validateRequired('deleted', $this->deleted, true);
        Model::validateRequired('md5', $this->md5, true);
        Model::validateRequired('primary', $this->primary, true);
        Model::validateRequired('realName', $this->realName, true);
        Model::validateRequired('role', $this->role, true);
        Model::validateRequired('sourceId', $this->sourceId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->condition) {
            $res['condition'] = $this->condition;
        }
        if (null !== $this->conditionKey) {
            $res['condition_key'] = $this->conditionKey;
        }
        if (null !== $this->deleted) {
            $res['deleted'] = $this->deleted;
        }
        if (null !== $this->md5) {
            $res['md5'] = $this->md5;
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
        if (null !== $this->workNo) {
            $res['work_no'] = $this->workNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportAuthRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['condition'])) {
            $model->condition = $map['condition'];
        }
        if (isset($map['condition_key'])) {
            $model->conditionKey = $map['condition_key'];
        }
        if (isset($map['deleted'])) {
            $model->deleted = $map['deleted'];
        }
        if (isset($map['md5'])) {
            $model->md5 = $map['md5'];
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
        if (isset($map['work_no'])) {
            $model->workNo = $map['work_no'];
        }

        return $model;
    }
}
