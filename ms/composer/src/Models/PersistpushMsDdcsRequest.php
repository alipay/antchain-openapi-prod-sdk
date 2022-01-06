<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class PersistpushMsDdcsRequest extends Model
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

    // 应用名称，长度50以内
    /**
     * @var string
     */
    public $appName;

    // 属性名称，长度50以内
    /**
     * @var string
     */
    public $attributeName;

    // 实例标识，通常在中间件门户首页获取，长度50以内
    /**
     * @var string
     */
    public $instanceId;

    // 操作人，可以定义为系统或者实际操作人，用于推送源追溯，长度50以内
    /**
     * @var string
     */
    public $operator;

    // 机构名称，长度20以内
    /**
     * @var string
     */
    public $region;

    // 配置类名称，长度150以内
    /**
     * @var string
     */
    public $resourceId;

    // 推送值，长度10240以内
    /**
     * @var string
     */
    public $value;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appName'           => 'app_name',
        'attributeName'     => 'attribute_name',
        'instanceId'        => 'instance_id',
        'operator'          => 'operator',
        'region'            => 'region',
        'resourceId'        => 'resource_id',
        'value'             => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('attributeName', $this->attributeName, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('region', $this->region, true);
        Model::validateRequired('resourceId', $this->resourceId, true);
        Model::validateRequired('value', $this->value, true);
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
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->attributeName) {
            $res['attribute_name'] = $this->attributeName;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->resourceId) {
            $res['resource_id'] = $this->resourceId;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PersistpushMsDdcsRequest
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
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['attribute_name'])) {
            $model->attributeName = $map['attribute_name'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['region'])) {
            $model->region = $map['region'];
        }
        if (isset($map['resource_id'])) {
            $model->resourceId = $map['resource_id'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
