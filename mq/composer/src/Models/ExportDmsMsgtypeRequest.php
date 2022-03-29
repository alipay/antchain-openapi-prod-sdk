<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ExportDmsMsgtypeRequest extends Model
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

    // instance_id
    /**
     * @var string
     */
    public $instanceId;

    // id列表，为空则表示导出当前instance_id全部数据
    /**
     * @var string
     */
    public $ids;

    // field
    /**
     * @var string
     */
    public $field;

    // order
    /**
     * @var string
     */
    public $order;

    // topic
    /**
     * @var string
     */
    public $topic;

    // eventcode
    /**
     * @var string
     */
    public $eventcode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'instanceId'        => 'instance_id',
        'ids'               => 'ids',
        'field'             => 'field',
        'order'             => 'order',
        'topic'             => 'topic',
        'eventcode'         => 'eventcode',
    ];

    public function validate()
    {
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
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->ids) {
            $res['ids'] = $this->ids;
        }
        if (null !== $this->field) {
            $res['field'] = $this->field;
        }
        if (null !== $this->order) {
            $res['order'] = $this->order;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }
        if (null !== $this->eventcode) {
            $res['eventcode'] = $this->eventcode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExportDmsMsgtypeRequest
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
        if (isset($map['ids'])) {
            $model->ids = $map['ids'];
        }
        if (isset($map['field'])) {
            $model->field = $map['field'];
        }
        if (isset($map['order'])) {
            $model->order = $map['order'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }
        if (isset($map['eventcode'])) {
            $model->eventcode = $map['eventcode'];
        }

        return $model;
    }
}
