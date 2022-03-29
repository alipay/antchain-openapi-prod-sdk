<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class GetSofamqConsumerstatusRequest extends Model
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

    // 需要查询的单元
    /**
     * @var string
     */
    public $cell;

    // 是否查询详细信息。取值说明如下：true：要查询详细信息；false：不查询详细信息。
    /**
     * @var bool
     */
    public $detail;

    // 需要查询的消费端 Group ID
    /**
     * @var string
     */
    public $groupId;

    // 需查询的 Group ID 所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
    /**
     * @var string
     */
    public $instanceId;

    // 是否打印 Jstack 信息
    /**
     * @var bool
     */
    public $needJstack;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'cell'              => 'cell',
        'detail'            => 'detail',
        'groupId'           => 'group_id',
        'instanceId'        => 'instance_id',
        'needJstack'        => 'need_jstack',
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
        if (null !== $this->cell) {
            $res['cell'] = $this->cell;
        }
        if (null !== $this->detail) {
            $res['detail'] = $this->detail;
        }
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->needJstack) {
            $res['need_jstack'] = $this->needJstack;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetSofamqConsumerstatusRequest
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
        if (isset($map['cell'])) {
            $model->cell = $map['cell'];
        }
        if (isset($map['detail'])) {
            $model->detail = $map['detail'];
        }
        if (isset($map['group_id'])) {
            $model->groupId = $map['group_id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['need_jstack'])) {
            $model->needJstack = $map['need_jstack'];
        }

        return $model;
    }
}
