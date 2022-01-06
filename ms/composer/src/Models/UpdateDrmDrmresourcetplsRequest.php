<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class UpdateDrmDrmresourcetplsRequest extends Model
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

    // 资源属性列表
    /**
     * @var string
     */
    public $attributes;

    // 描述
    /**
     * @var string
     */
    public $desc;

    // 所有单元中是否存在有特殊推送过值的单元
    /**
     * @var bool
     */
    public $hasInstance;

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

    // 资源域
    /**
     * @var string
     */
    public $region;

    // 资源类路径
    /**
     * @var string
     */
    public $resourceId;

    // tpl_id
    /**
     * @var int
     */
    public $tplId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appName'           => 'app_name',
        'attributes'        => 'attributes',
        'desc'              => 'desc',
        'hasInstance'       => 'has_instance',
        'id'                => 'id',
        'instanceId'        => 'instance_id',
        'region'            => 'region',
        'resourceId'        => 'resource_id',
        'tplId'             => 'tpl_id',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
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
        if (null !== $this->hasInstance) {
            $res['has_instance'] = $this->hasInstance;
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
        if (null !== $this->tplId) {
            $res['tpl_id'] = $this->tplId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateDrmDrmresourcetplsRequest
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
        if (isset($map['has_instance'])) {
            $model->hasInstance = $map['has_instance'];
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
        if (isset($map['tpl_id'])) {
            $model->tplId = $map['tpl_id'];
        }

        return $model;
    }
}
