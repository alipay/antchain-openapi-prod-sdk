<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class DrmResource extends Model
{
    // appName
    /**
     * @example dsr
     *
     * @var string
     */
    public $appName;

    // 资源属性列表
    /**
     * @example [{DrmAttribute}]
     *
     * @var DrmAttribute[]
     */
    public $attributes;

    // drm资源id
    /**
     * @example 213
     *
     * @var int
     */
    public $id;

    // 实例id
    /**
     * @example 00000001
     *
     * @var string
     */
    public $instanceId;

    // 描述字段
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // 资源域
    /**
     * @example Alipay
     *
     * @var string
     */
    public $region;

    // 资源域和应用名
    /**
     * @example Alipay.dsrconsole
     *
     * @var string
     */
    public $resourceDomain;

    // 资源类路径
    /**
     * @example com.alipay.antcloud.dsrconsole.core.service.drm.config
     *
     * @var string
     */
    public $resourceId;

    // 资源版本
    /**
     * @example 3.0
     *
     * @var string
     */
    public $resourceVersion;

    // type
    /**
     * @example normal
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'appName'         => 'app_name',
        'attributes'      => 'attributes',
        'id'              => 'id',
        'instanceId'      => 'instance_id',
        'name'            => 'name',
        'region'          => 'region',
        'resourceDomain'  => 'resource_domain',
        'resourceId'      => 'resource_id',
        'resourceVersion' => 'resource_version',
        'type'            => 'type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->attributes) {
            $res['attributes'] = [];
            if (null !== $this->attributes && \is_array($this->attributes)) {
                $n = 0;
                foreach ($this->attributes as $item) {
                    $res['attributes'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
     * @return DrmResource
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['attributes'])) {
            if (!empty($map['attributes'])) {
                $model->attributes = [];
                $n                 = 0;
                foreach ($map['attributes'] as $item) {
                    $model->attributes[$n++] = null !== $item ? DrmAttribute::fromMap($item) : $item;
                }
            }
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
