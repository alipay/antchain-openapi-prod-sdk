<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class UpdateDdcsResourceRequest extends Model
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

    /**
     * @var string
     */
    public $instanceId;

    // 应用名称，长度50以内
    /**
     * @var string
     */
    public $newAppName;

    // 资源描述，长度150以内
    /**
     * @var string
     */
    public $newName;

    // 机构名称，长度20以内
    /**
     * @var string
     */
    public $newRegion;

    // 配置类名称，长度150以内
    /**
     * @var string
     */
    public $newResourceId;

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
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appName'           => 'app_name',
        'instanceId'        => 'instance_id',
        'newAppName'        => 'new_app_name',
        'newName'           => 'new_name',
        'newRegion'         => 'new_region',
        'newResourceId'     => 'new_resource_id',
        'region'            => 'region',
        'resourceId'        => 'resource_id',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
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
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->newAppName) {
            $res['new_app_name'] = $this->newAppName;
        }
        if (null !== $this->newName) {
            $res['new_name'] = $this->newName;
        }
        if (null !== $this->newRegion) {
            $res['new_region'] = $this->newRegion;
        }
        if (null !== $this->newResourceId) {
            $res['new_resource_id'] = $this->newResourceId;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->resourceId) {
            $res['resource_id'] = $this->resourceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateDdcsResourceRequest
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
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['new_app_name'])) {
            $model->newAppName = $map['new_app_name'];
        }
        if (isset($map['new_name'])) {
            $model->newName = $map['new_name'];
        }
        if (isset($map['new_region'])) {
            $model->newRegion = $map['new_region'];
        }
        if (isset($map['new_resource_id'])) {
            $model->newResourceId = $map['new_resource_id'];
        }
        if (isset($map['region'])) {
            $model->region = $map['region'];
        }
        if (isset($map['resource_id'])) {
            $model->resourceId = $map['resource_id'];
        }

        return $model;
    }
}
