<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class QuerySofamqTopicstatusRequest extends Model
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

    // 需查询的 Topic 所在的 Cell
    /**
     * @var string
     */
    public $cell;

    // 需查询的 Topic 所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
    /**
     * @var string
     */
    public $instanceId;

    // 需查询的 Topic 名称
    /**
     * @var string
     */
    public $topic;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'cell'              => 'cell',
        'instanceId'        => 'instance_id',
        'topic'             => 'topic',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('topic', $this->topic, true);
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
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySofamqTopicstatusRequest
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
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }

        return $model;
    }
}
