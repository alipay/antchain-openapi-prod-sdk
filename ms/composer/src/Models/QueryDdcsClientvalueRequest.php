<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class QueryDdcsClientvalueRequest extends Model
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

    // 系统字段：环境实例 ID
    /**
     * @var string
     */
    public $instanceId;

    // 查询的 IP 列表，英文逗号隔开
    /**
     * @var string
     */
    public $ips;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'attributeId'       => 'attribute_id',
        'instanceId'        => 'instance_id',
        'ips'               => 'ips',
    ];

    public function validate()
    {
        Model::validateRequired('attributeId', $this->attributeId, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('ips', $this->ips, true);
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
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->ips) {
            $res['ips'] = $this->ips;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDdcsClientvalueRequest
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
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['ips'])) {
            $model->ips = $map['ips'];
        }

        return $model;
    }
}
