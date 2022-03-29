<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class CreateSofamqGroupRequest extends Model
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

    // 创建的消息端 Group ID
    /**
     * @var string
     */
    public $groupId;

    // 需创建的 Group ID 所对应的实例 ID
    /**
     * @var string
     */
    public $instanceId;

    // Group ID 描述信息
    /**
     * @var string
     */
    public $remark;

    // 指定创建的 Group ID 适用的协议。TCP 协议和 HTTP 协议的 Group ID 不可以共用，需要分别创建。取值说明如下：
    //
    // tcp：默认值，表示创建的 Group ID 仅适用于 TCP 协议的消息收发。
    // http：表示创建的 Group ID 仅适用于 HTTP 协议的消息收发。
    /**
     * @var string
     */
    public $groupType;

    // Group 所属的应用名称，要求 app name 在 zappinfo 上可查
    /**
     * @var string
     */
    public $owner;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'groupId'           => 'group_id',
        'instanceId'        => 'instance_id',
        'remark'            => 'remark',
        'groupType'         => 'group_type',
        'owner'             => 'owner',
    ];

    public function validate()
    {
        Model::validateRequired('groupId', $this->groupId, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
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
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->groupType) {
            $res['group_type'] = $this->groupType;
        }
        if (null !== $this->owner) {
            $res['owner'] = $this->owner;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateSofamqGroupRequest
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
        if (isset($map['group_id'])) {
            $model->groupId = $map['group_id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }
        if (isset($map['group_type'])) {
            $model->groupType = $map['group_type'];
        }
        if (isset($map['owner'])) {
            $model->owner = $map['owner'];
        }

        return $model;
    }
}
