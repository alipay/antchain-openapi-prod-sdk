<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class QuerySofamqConsumptionRequest extends Model
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

    // 租户实例ID
    //
    /**
     * @var string
     */
    public $instanceId;

    // ldc模式下的cell
    //
    /**
     * @var string
     */
    public $cell;

    // 消费者groupID
    /**
     * @var string
     */
    public $groupId;

    // 订阅的topic
    //
    /**
     * @var string
     */
    public $topic;

    // 是否带上客户端信息
    //
    /**
     * @var bool
     */
    public $needClientDetail;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'instanceId'        => 'instance_id',
        'cell'              => 'cell',
        'groupId'           => 'group_id',
        'topic'             => 'topic',
        'needClientDetail'  => 'need_client_detail',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('cell', $this->cell, true);
        Model::validateRequired('groupId', $this->groupId, true);
        Model::validateRequired('topic', $this->topic, true);
        Model::validateRequired('needClientDetail', $this->needClientDetail, true);
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
        if (null !== $this->cell) {
            $res['cell'] = $this->cell;
        }
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }
        if (null !== $this->needClientDetail) {
            $res['need_client_detail'] = $this->needClientDetail;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySofamqConsumptionRequest
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
        if (isset($map['cell'])) {
            $model->cell = $map['cell'];
        }
        if (isset($map['group_id'])) {
            $model->groupId = $map['group_id'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }
        if (isset($map['need_client_detail'])) {
            $model->needClientDetail = $map['need_client_detail'];
        }

        return $model;
    }
}
