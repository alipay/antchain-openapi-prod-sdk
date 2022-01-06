<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class AddDdcsGraydataRequest extends Model
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

    // 属性自增长 ID，可以通过查询属性接口获取 ID
    /**
     * @var int
     */
    public $attributeId;

    // 属性推送值
    /**
     * @var string
     */
    public $data;

    // 灰度推送的机器列表，多个 IP 之间英文逗号隔开
    /**
     * @var string
     */
    public $hosts;

    // 系统字段：环境实例 ID
    /**
     * @var string
     */
    public $instanceId;

    // 操作人
    /**
     * @var string
     */
    public $operator;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'attributeId'       => 'attribute_id',
        'data'              => 'data',
        'hosts'             => 'hosts',
        'instanceId'        => 'instance_id',
        'operator'          => 'operator',
    ];

    public function validate()
    {
        Model::validateRequired('attributeId', $this->attributeId, true);
        Model::validateRequired('hosts', $this->hosts, true);
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
        if (null !== $this->attributeId) {
            $res['attribute_id'] = $this->attributeId;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->hosts) {
            $res['hosts'] = $this->hosts;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddDdcsGraydataRequest
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
        if (isset($map['attribute_id'])) {
            $model->attributeId = $map['attribute_id'];
        }
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }
        if (isset($map['hosts'])) {
            $model->hosts = $map['hosts'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }

        return $model;
    }
}
