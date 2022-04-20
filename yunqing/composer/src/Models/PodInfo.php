<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class PodInfo extends Model
{
    // podname
    /**
     * @example yanfa
     *
     * @var string
     */
    public $podName;

    // 容器name
    /**
     * @example xxx_name
     *
     * @var string
     */
    public $containerName;

    // ip
    /**
     * @example ip
     *
     * @var string
     */
    public $ip;

    // host ip
    /**
     * @example xxx_name
     *
     * @var string
     */
    public $hostIp;

    // hostname
    /**
     * @example hostname
     *
     * @var string
     */
    public $hostName;

    // cpu
    /**
     * @example 100m
     *
     * @var string
     */
    public $cpu;

    // 内存
    /**
     * @example 10
     *
     * @var string
     */
    public $memory;

    // status
    /**
     * @example online
     *
     * @var string
     */
    public $status;

    // 产品码--应用名
    /**
     * @example IAM--aciamcore
     *
     * @var string
     */
    public $productApp;

    // 租户信息
    //
    /**
     * @example 123abc
     *
     * @var string
     */
    public $tenantId;

    // 环境信息
    //
    /**
     * @example 123abc
     *
     * @var string
     */
    public $envId;
    protected $_name = [
        'podName'       => 'pod_name',
        'containerName' => 'container_name',
        'ip'            => 'ip',
        'hostIp'        => 'host_ip',
        'hostName'      => 'host_name',
        'cpu'           => 'cpu',
        'memory'        => 'memory',
        'status'        => 'status',
        'productApp'    => 'product_app',
        'tenantId'      => 'tenant_id',
        'envId'         => 'env_id',
    ];

    public function validate()
    {
        Model::validateRequired('podName', $this->podName, true);
        Model::validateRequired('containerName', $this->containerName, true);
        Model::validateRequired('ip', $this->ip, true);
        Model::validateRequired('hostIp', $this->hostIp, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->podName) {
            $res['pod_name'] = $this->podName;
        }
        if (null !== $this->containerName) {
            $res['container_name'] = $this->containerName;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->hostIp) {
            $res['host_ip'] = $this->hostIp;
        }
        if (null !== $this->hostName) {
            $res['host_name'] = $this->hostName;
        }
        if (null !== $this->cpu) {
            $res['cpu'] = $this->cpu;
        }
        if (null !== $this->memory) {
            $res['memory'] = $this->memory;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->productApp) {
            $res['product_app'] = $this->productApp;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->envId) {
            $res['env_id'] = $this->envId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PodInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['pod_name'])) {
            $model->podName = $map['pod_name'];
        }
        if (isset($map['container_name'])) {
            $model->containerName = $map['container_name'];
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }
        if (isset($map['host_ip'])) {
            $model->hostIp = $map['host_ip'];
        }
        if (isset($map['host_name'])) {
            $model->hostName = $map['host_name'];
        }
        if (isset($map['cpu'])) {
            $model->cpu = $map['cpu'];
        }
        if (isset($map['memory'])) {
            $model->memory = $map['memory'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['product_app'])) {
            $model->productApp = $map['product_app'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['env_id'])) {
            $model->envId = $map['env_id'];
        }

        return $model;
    }
}
