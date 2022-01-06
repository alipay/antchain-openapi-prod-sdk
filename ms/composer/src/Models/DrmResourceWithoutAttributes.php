<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class DrmResourceWithoutAttributes extends Model
{
    // 应用名
    /**
     * @example dsrconsole
     *
     * @var string
     */
    public $appName;

    // id
    /**
     * @example 10000
     *
     * @var int
     */
    public $id;

    // 租户实例id
    /**
     * @example 00001
     *
     * @var string
     */
    public $instanceId;

    // 资源类描述
    /**
     * @example 我是一个资源类描述
     *
     * @var string
     */
    public $name;

    // 资源类所属的域
    /**
     * @example Alipay
     *
     * @var string
     */
    public $region;

    // Region.appName
    /**
     * @example Alipay.demo
     *
     * @var string
     */
    public $resourceDomain;

    // 资源id
    /**
     * @example com.alipay.antcloud.dsrconsole.core.service.drm.config
     *
     * @var string
     */
    public $resourceId;

    // 资源版本号固定 3.0
    /**
     * @example 3.0
     *
     * @var string
     */
    public $resourceVersion;

    // 资源类型，tpl 表示模板类型，normal 表示普通资源
    /**
     * @example normal
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'appName'         => 'app_name',
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
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('region', $this->region, true);
        Model::validateRequired('resourceDomain', $this->resourceDomain, true);
        Model::validateRequired('resourceId', $this->resourceId, true);
        Model::validateRequired('resourceVersion', $this->resourceVersion, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
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
     * @return DrmResourceWithoutAttributes
     */
    public static function fromMap($map = [])
    {
        $model = new self();
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
