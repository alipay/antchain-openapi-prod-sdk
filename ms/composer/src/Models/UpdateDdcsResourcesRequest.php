<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class UpdateDdcsResourcesRequest extends Model
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

    // 应用名
    /**
     * @var string
     */
    public $appName;

    // 资源的属性信息，以 JSON 字符串格式传入
    /**
     * @var string
     */
    public $attributes;

    // 资源描述信息
    /**
     * @var string
     */
    public $desc;

    // 更新的资源自增长 ID
    /**
     * @var int
     */
    public $id;

    // 系统字段：环境实例 ID
    /**
     * @var string
     */
    public $instanceId;

    // 资源搜索的域
    /**
     * @var string
     */
    public $region;

    // 资源唯一标识
    /**
     * @var string
     */
    public $resourceId;

    // 是否全量更新属性，默认为 false
    /**
     * @var bool
     */
    public $updateAttribute;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appName'           => 'app_name',
        'attributes'        => 'attributes',
        'desc'              => 'desc',
        'id'                => 'id',
        'instanceId'        => 'instance_id',
        'region'            => 'region',
        'resourceId'        => 'resource_id',
        'updateAttribute'   => 'update_attribute',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('desc', $this->desc, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('region', $this->region, true);
        Model::validateRequired('resourceId', $this->resourceId, true);
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
        if (null !== $this->attributes) {
            $res['attributes'] = $this->attributes;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->resourceId) {
            $res['resource_id'] = $this->resourceId;
        }
        if (null !== $this->updateAttribute) {
            $res['update_attribute'] = $this->updateAttribute;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateDdcsResourcesRequest
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
        if (isset($map['attributes'])) {
            $model->attributes = $map['attributes'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['region'])) {
            $model->region = $map['region'];
        }
        if (isset($map['resource_id'])) {
            $model->resourceId = $map['resource_id'];
        }
        if (isset($map['update_attribute'])) {
            $model->updateAttribute = $map['update_attribute'];
        }

        return $model;
    }
}
