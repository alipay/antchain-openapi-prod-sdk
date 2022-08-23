<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class ContainerInstance extends Model
{
    // 资源id
    /**
     * @example zz-xxx
     *
     * @var string
     */
    public $resourceId;

    // 容器名称
    /**
     * @example zz-xxx-xx-0
     *
     * @var string
     */
    public $name;

    // 容器挂载的阿里云anytunnel的资源id
    /**
     * @example xx
     *
     * @var string
     */
    public $anytunnelResourceId;

    // 容器对应的index
    /**
     * @example 0
     *
     * @var string
     */
    public $index;

    // 容器ip
    /**
     * @example 192.168.0.1
     *
     * @var string
     */
    public $ip;

    // 集群节点ip
    /**
     * @example 127.0.0.1
     *
     * @var string
     */
    public $hostIp;

    // 产品码
    /**
     * @example YUNYOUDEV
     *
     * @var string
     */
    public $prodCode;

    // 应用名称
    /**
     * @example yunyoudev
     *
     * @var string
     */
    public $appName;

    // 应用镜像名
    /**
     * @example acs.xxxx.com/xxx
     *
     * @var string
     */
    public $image;

    // cpu
    /**
     * @example 2
     *
     * @var string
     */
    public $cpu;

    // 内存大小
    /**
     * @example 1024
     *
     * @var string
     */
    public $memory;

    // 容器挂载的阿里云anytunnelIp
    /**
     * @example 12.12.12.12
     *
     * @var string
     */
    public $anytunnelServiceIp;

    // 部署单元实例id
    /**
     * @example default
     *
     * @var string
     */
    public $deploymentUnitInstanceIdentity;

    // 部署单元标识id
    /**
     * @example default
     *
     * @var string
     */
    public $deploymentUnitIdentity;
    protected $_name = [
        'resourceId'                     => 'resource_id',
        'name'                           => 'name',
        'anytunnelResourceId'            => 'anytunnel_resource_id',
        'index'                          => 'index',
        'ip'                             => 'ip',
        'hostIp'                         => 'host_ip',
        'prodCode'                       => 'prod_code',
        'appName'                        => 'app_name',
        'image'                          => 'image',
        'cpu'                            => 'cpu',
        'memory'                         => 'memory',
        'anytunnelServiceIp'             => 'anytunnel_service_ip',
        'deploymentUnitInstanceIdentity' => 'deployment_unit_instance_identity',
        'deploymentUnitIdentity'         => 'deployment_unit_identity',
    ];

    public function validate()
    {
        Model::validateRequired('resourceId', $this->resourceId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('index', $this->index, true);
        Model::validateRequired('prodCode', $this->prodCode, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('image', $this->image, true);
        Model::validateRequired('cpu', $this->cpu, true);
        Model::validateRequired('memory', $this->memory, true);
        Model::validateRequired('deploymentUnitInstanceIdentity', $this->deploymentUnitInstanceIdentity, true);
        Model::validateRequired('deploymentUnitIdentity', $this->deploymentUnitIdentity, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->resourceId) {
            $res['resource_id'] = $this->resourceId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->anytunnelResourceId) {
            $res['anytunnel_resource_id'] = $this->anytunnelResourceId;
        }
        if (null !== $this->index) {
            $res['index'] = $this->index;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->hostIp) {
            $res['host_ip'] = $this->hostIp;
        }
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->image) {
            $res['image'] = $this->image;
        }
        if (null !== $this->cpu) {
            $res['cpu'] = $this->cpu;
        }
        if (null !== $this->memory) {
            $res['memory'] = $this->memory;
        }
        if (null !== $this->anytunnelServiceIp) {
            $res['anytunnel_service_ip'] = $this->anytunnelServiceIp;
        }
        if (null !== $this->deploymentUnitInstanceIdentity) {
            $res['deployment_unit_instance_identity'] = $this->deploymentUnitInstanceIdentity;
        }
        if (null !== $this->deploymentUnitIdentity) {
            $res['deployment_unit_identity'] = $this->deploymentUnitIdentity;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContainerInstance
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['resource_id'])) {
            $model->resourceId = $map['resource_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['anytunnel_resource_id'])) {
            $model->anytunnelResourceId = $map['anytunnel_resource_id'];
        }
        if (isset($map['index'])) {
            $model->index = $map['index'];
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }
        if (isset($map['host_ip'])) {
            $model->hostIp = $map['host_ip'];
        }
        if (isset($map['prod_code'])) {
            $model->prodCode = $map['prod_code'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['image'])) {
            $model->image = $map['image'];
        }
        if (isset($map['cpu'])) {
            $model->cpu = $map['cpu'];
        }
        if (isset($map['memory'])) {
            $model->memory = $map['memory'];
        }
        if (isset($map['anytunnel_service_ip'])) {
            $model->anytunnelServiceIp = $map['anytunnel_service_ip'];
        }
        if (isset($map['deployment_unit_instance_identity'])) {
            $model->deploymentUnitInstanceIdentity = $map['deployment_unit_instance_identity'];
        }
        if (isset($map['deployment_unit_identity'])) {
            $model->deploymentUnitIdentity = $map['deployment_unit_identity'];
        }

        return $model;
    }
}
