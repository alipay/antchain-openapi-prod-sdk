<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class QuerySofamqLabelsRequest extends Model
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

    // 实例 ID（命名空间）
    /**
     * @var string
     */
    public $instanceId;

    // 资源类型：TOPIC、GROUP
    /**
     * @var string
     */
    public $resourceType;

    // 资源名，like _resource_name_ 匹配
    /**
     * @var string
     */
    public $resourceName;

    // 标签 KEY
    /**
     * @var string
     */
    public $labelKey;

    // 标签值，like _label_value_ 匹配
    /**
     * @var string
     */
    public $labelValue;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'instanceId'        => 'instance_id',
        'resourceType'      => 'resource_type',
        'resourceName'      => 'resource_name',
        'labelKey'          => 'label_key',
        'labelValue'        => 'label_value',
    ];

    public function validate()
    {
        Model::validateRequired('labelValue', $this->labelValue, true);
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
        if (null !== $this->resourceType) {
            $res['resource_type'] = $this->resourceType;
        }
        if (null !== $this->resourceName) {
            $res['resource_name'] = $this->resourceName;
        }
        if (null !== $this->labelKey) {
            $res['label_key'] = $this->labelKey;
        }
        if (null !== $this->labelValue) {
            $res['label_value'] = $this->labelValue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySofamqLabelsRequest
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
        if (isset($map['resource_type'])) {
            $model->resourceType = $map['resource_type'];
        }
        if (isset($map['resource_name'])) {
            $model->resourceName = $map['resource_name'];
        }
        if (isset($map['label_key'])) {
            $model->labelKey = $map['label_key'];
        }
        if (isset($map['label_value'])) {
            $model->labelValue = $map['label_value'];
        }

        return $model;
    }
}
