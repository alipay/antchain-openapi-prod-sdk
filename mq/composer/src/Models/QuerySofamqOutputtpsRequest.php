<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class QuerySofamqOutputtpsRequest extends Model
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

    // 查询区间起始毫秒时间戳
    /**
     * @var string
     */
    public $beginTime;

    // 需要查询的Cell名
    /**
     * @var string
     */
    public $cell;

    // 查询区间终止毫秒时间戳
    /**
     * @var string
     */
    public $endTime;

    // 需要查询的 Group ID
    /**
     * @var string
     */
    public $groupId;

    // 需统计数据的 Group ID 所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
    /**
     * @var string
     */
    public $instanceId;

    // 采样周期，单位分钟，取值可为 1、5、10
    /**
     * @var int
     */
    public $period;

    // 需要查询的 Topic 名称
    /**
     * @var string
     */
    public $topic;

    // 查询的类型。取值说明如下：
    //
    // 0：查询消费消息总量的统计曲线
    // 1：查询消费消息 TPS 的统计曲线
    /**
     * @var int
     */
    public $type;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'beginTime'         => 'begin_time',
        'cell'              => 'cell',
        'endTime'           => 'end_time',
        'groupId'           => 'group_id',
        'instanceId'        => 'instance_id',
        'period'            => 'period',
        'topic'             => 'topic',
        'type'              => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('beginTime', $this->beginTime, true);
        Model::validateRequired('endTime', $this->endTime, true);
        Model::validateRequired('groupId', $this->groupId, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('topic', $this->topic, true);
        Model::validateRequired('type', $this->type, true);
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
        if (null !== $this->beginTime) {
            $res['begin_time'] = $this->beginTime;
        }
        if (null !== $this->cell) {
            $res['cell'] = $this->cell;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->period) {
            $res['period'] = $this->period;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySofamqOutputtpsRequest
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
        if (isset($map['begin_time'])) {
            $model->beginTime = $map['begin_time'];
        }
        if (isset($map['cell'])) {
            $model->cell = $map['cell'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['group_id'])) {
            $model->groupId = $map['group_id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['period'])) {
            $model->period = $map['period'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
