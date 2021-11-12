<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class ResourcePool extends Model
{
    // 资源池名称, Local站点下唯一
    /**
     * @example lb_pool
     *
     * @var string
     */
    public $name;

    // 资源的提供者, ALB,SLB,ALISQL,RDS,OCEANBASE,AFS,OSS,ECS,ALIYUNECS
    /**
     * @example ALB
     *
     * @var string
     */
    public $provider;

    // 支持的资源类型
    /**
     * @example RDB
     *
     * @var string
     */
    public $resourceType;

    // 资源池访问信息
    /**
     * @example {"endpoint": "127.0.0.1"}
     *
     * @var string
     */
    public $accessInfo;

    // 所属cloud的id
    /**
     * @example 0000000000000001
     *
     * @var string
     */
    public $cloudId;
    protected $_name = [
        'name'         => 'name',
        'provider'     => 'provider',
        'resourceType' => 'resource_type',
        'accessInfo'   => 'access_info',
        'cloudId'      => 'cloud_id',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('provider', $this->provider, true);
        Model::validateRequired('resourceType', $this->resourceType, true);
        Model::validateRequired('accessInfo', $this->accessInfo, true);
        Model::validateRequired('cloudId', $this->cloudId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->provider) {
            $res['provider'] = $this->provider;
        }
        if (null !== $this->resourceType) {
            $res['resource_type'] = $this->resourceType;
        }
        if (null !== $this->accessInfo) {
            $res['access_info'] = $this->accessInfo;
        }
        if (null !== $this->cloudId) {
            $res['cloud_id'] = $this->cloudId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ResourcePool
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['provider'])) {
            $model->provider = $map['provider'];
        }
        if (isset($map['resource_type'])) {
            $model->resourceType = $map['resource_type'];
        }
        if (isset($map['access_info'])) {
            $model->accessInfo = $map['access_info'];
        }
        if (isset($map['cloud_id'])) {
            $model->cloudId = $map['cloud_id'];
        }

        return $model;
    }
}
