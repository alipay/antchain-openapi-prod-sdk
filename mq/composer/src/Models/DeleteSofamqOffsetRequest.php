<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class DeleteSofamqOffsetRequest extends Model
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

    // 需清除消费进度的 Group ID 所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
    /**
     * @var string
     */
    public $instanceId;

    // 需清除消费进度的消费端 Group ID
    /**
     * @var string
     */
    public $groupId;

    // 需清除消费进度的 Topic 名称
    /**
     * @var string
     */
    public $topic;

    // 需要清除消费进度的单元
    /**
     * @var string
     */
    public $cells;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'instanceId'        => 'instance_id',
        'groupId'           => 'group_id',
        'topic'             => 'topic',
        'cells'             => 'cells',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('groupId', $this->groupId, true);
        Model::validateRequired('topic', $this->topic, true);
        Model::validateRequired('cells', $this->cells, true);
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
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }
        if (null !== $this->cells) {
            $res['cells'] = $this->cells;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteSofamqOffsetRequest
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
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['group_id'])) {
            $model->groupId = $map['group_id'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }
        if (isset($map['cells'])) {
            $model->cells = $map['cells'];
        }

        return $model;
    }
}
