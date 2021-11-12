<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class Container extends Model
{
    // 应用版本
    /**
     * @example 1.0.0
     *
     * @var string
     */
    public $appVersion;

    // cpu核数，单位C。
    /**
     * @example 4
     *
     * @var int
     */
    public $cpu;

    // 宿主机ip。
    /**
     * @example 11.163.29.26
     *
     * @var string
     */
    public $hostIp;

    // 宿主机名称。
    /**
     * @example 58ops2-1.et15sqa
     *
     * @var string
     */
    public $hostName;

    // 容器id。
    /**
     * @example 006ca7547c991d2a5bee2167552fc5058f92aea3fb2ce534394172e21af01055
     *
     * @var string
     */
    public $id;

    // 容器镜像。
    /**
     * @example acs-reg.alipay.com/haochen.xl/hadoop-hbase-ha:20180801-2
     *
     * @var string
     */
    public $image;

    // 容器ip。
    /**
     * @example 11.167.33.24
     *
     * @var string
     */
    public $ip;

    // 内存大小，单位M。
    /**
     * @example 8192
     *
     * @var int
     */
    public $memory;

    // 容器名称。
    /**
     * @example hbase-slave-2
     *
     * @var string
     */
    public $name;

    // 容器所在的pod。
    /**
     * @example pod1
     *
     * @var string
     */
    public $pod;

    // 资源所属的资源池的唯一标识。
    /**
     * @example c-ant58sit
     *
     * @var string
     */
    public $resourcePoolId;

    // 容器状态。
    /**
     * @example RUNNING
     *
     * @var string
     */
    public $status;

    // 应用名
    /**
     * @example yunyou
     *
     * @var string
     */
    public $appName;
    protected $_name = [
        'appVersion'     => 'app_version',
        'cpu'            => 'cpu',
        'hostIp'         => 'host_ip',
        'hostName'       => 'host_name',
        'id'             => 'id',
        'image'          => 'image',
        'ip'             => 'ip',
        'memory'         => 'memory',
        'name'           => 'name',
        'pod'            => 'pod',
        'resourcePoolId' => 'resource_pool_id',
        'status'         => 'status',
        'appName'        => 'app_name',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appVersion) {
            $res['app_version'] = $this->appVersion;
        }
        if (null !== $this->cpu) {
            $res['cpu'] = $this->cpu;
        }
        if (null !== $this->hostIp) {
            $res['host_ip'] = $this->hostIp;
        }
        if (null !== $this->hostName) {
            $res['host_name'] = $this->hostName;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->image) {
            $res['image'] = $this->image;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->memory) {
            $res['memory'] = $this->memory;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->pod) {
            $res['pod'] = $this->pod;
        }
        if (null !== $this->resourcePoolId) {
            $res['resource_pool_id'] = $this->resourcePoolId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Container
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_version'])) {
            $model->appVersion = $map['app_version'];
        }
        if (isset($map['cpu'])) {
            $model->cpu = $map['cpu'];
        }
        if (isset($map['host_ip'])) {
            $model->hostIp = $map['host_ip'];
        }
        if (isset($map['host_name'])) {
            $model->hostName = $map['host_name'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['image'])) {
            $model->image = $map['image'];
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }
        if (isset($map['memory'])) {
            $model->memory = $map['memory'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['pod'])) {
            $model->pod = $map['pod'];
        }
        if (isset($map['resource_pool_id'])) {
            $model->resourcePoolId = $map['resource_pool_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }

        return $model;
    }
}
