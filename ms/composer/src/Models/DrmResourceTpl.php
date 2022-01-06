<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class DrmResourceTpl extends Model
{
    // app name
    /**
     * @example appName
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

    // 描述
    /**
     * @example desc
     *
     * @var string
     */
    public $desc;

    // 所有单元中是否存在有特殊推送过值的单元
    /**
     * @example true, false
     *
     * @var bool
     */
    public $hasInstance;

    // drm资源id
    /**
     * @example 1234
     *
     * @var int
     */
    public $id;

    // 实例id
    /**
     * @example 00111
     *
     * @var string
     */
    public $instanceId;

    // 资源域
    /**
     * @example Alipay
     *
     * @var string
     */
    public $region;

    // 资源类路径
    /**
     * @example com.alipay.antcloud.dsrconsole.core.service.drm.config
     *
     * @var string
     */
    public $resourceId;
    protected $_name = [
        'appName'     => 'app_name',
        'attributes'  => 'attributes',
        'desc'        => 'desc',
        'hasInstance' => 'has_instance',
        'id'          => 'id',
        'instanceId'  => 'instance_id',
        'region'      => 'region',
        'resourceId'  => 'resource_id',
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DrmResourceTpl
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

        return $model;
    }
}
