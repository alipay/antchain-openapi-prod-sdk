<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class DeleteDrmDrmresourcesRequest extends Model
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

    // app name
    /**
     * @var string
     */
    public $appName;

    // drm资源id
    /**
     * @var int
     */
    public $id;

    // 实例id
    /**
     * @var string
     */
    public $instanceId;

    // 描述字段
    /**
     * @var string
     */
    public $name;

    // 资源域
    /**
     * @var string
     */
    public $region;

    // 资源域和应用名
    /**
     * @var string
     */
    public $resourceDomain;

    // 资源类路径
    /**
     * @var string
     */
    public $resourceId;

    // 资源版本
    /**
     * @var string
     */
    public $resourceVersion;

    // type
    /**
     * @var string
     */
    public $type;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appName'           => 'app_name',
        'id'                => 'id',
        'instanceId'        => 'instance_id',
        'name'              => 'name',
        'region'            => 'region',
        'resourceDomain'    => 'resource_domain',
        'resourceId'        => 'resource_id',
        'resourceVersion'   => 'resource_version',
        'type'              => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
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
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->resourceDomain) {
            $res['resource_domain'] = $this->resourceDomain;
        }
        if (null !== $this->resourceId) {
            $res['resource_id'] = $this->resourceId;
        }
        if (null !== $this->resourceVersion) {
            $res['resource_version'] = $this->resourceVersion;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteDrmDrmresourcesRequest
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
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['region'])) {
            $model->region = $map['region'];
        }
        if (isset($map['resource_domain'])) {
            $model->resourceDomain = $map['resource_domain'];
        }
        if (isset($map['resource_id'])) {
            $model->resourceId = $map['resource_id'];
        }
        if (isset($map['resource_version'])) {
            $model->resourceVersion = $map['resource_version'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
