<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class SideCarDetailModel extends Model
{
    // 应用服务名
    /**
     * @example cloudmeshtestjavaclient
     *
     * @var string
     */
    public $appServiceName;

    // 集群名
    /**
     * @example default
     *
     * @var string
     */
    public $clustername;

    // pod创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $createdTime;

    // 命名空间
    /**
     * @example default
     *
     * @var string
     */
    public $namespace;

    // pod ip
    /**
     * @example 192.168.1.100
     *
     * @var string
     */
    public $podIp;

    // pod实例名
    /**
     * @example cloudmeshtestjavaclient-m5t2w-nxg88
     *
     * @var string
     */
    public $podName;

    // pod状态
    /**
     * @example Running
     *
     * @var string
     */
    public $podStatus;

    // sidecar状态
    /**
     * @example running
     *
     * @var string
     */
    public $sidecarStatus;

    // sidecar类型(mosn/odp/mist)
    /**
     * @example mosn
     *
     * @var string
     */
    public $sidecarType;

    // sidecar版本
    /**
     * @example 1.8.9-78564185
     *
     * @var string
     */
    public $sidecarVersion;
    protected $_name = [
        'appServiceName' => 'app_service_name',
        'clustername'    => 'clustername',
        'createdTime'    => 'created_time',
        'namespace'      => 'namespace',
        'podIp'          => 'pod_ip',
        'podName'        => 'pod_name',
        'podStatus'      => 'pod_status',
        'sidecarStatus'  => 'sidecar_status',
        'sidecarType'    => 'sidecar_type',
        'sidecarVersion' => 'sidecar_version',
    ];

    public function validate()
    {
        Model::validateRequired('appServiceName', $this->appServiceName, true);
        Model::validateRequired('clustername', $this->clustername, true);
        Model::validateRequired('createdTime', $this->createdTime, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('podIp', $this->podIp, true);
        Model::validateRequired('podName', $this->podName, true);
        Model::validateRequired('podStatus', $this->podStatus, true);
        Model::validateRequired('sidecarStatus', $this->sidecarStatus, true);
        Model::validateRequired('sidecarType', $this->sidecarType, true);
        Model::validateRequired('sidecarVersion', $this->sidecarVersion, true);
        Model::validatePattern('createdTime', $this->createdTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appServiceName) {
            $res['app_service_name'] = $this->appServiceName;
        }
        if (null !== $this->clustername) {
            $res['clustername'] = $this->clustername;
        }
        if (null !== $this->createdTime) {
            $res['created_time'] = $this->createdTime;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->podIp) {
            $res['pod_ip'] = $this->podIp;
        }
        if (null !== $this->podName) {
            $res['pod_name'] = $this->podName;
        }
        if (null !== $this->podStatus) {
            $res['pod_status'] = $this->podStatus;
        }
        if (null !== $this->sidecarStatus) {
            $res['sidecar_status'] = $this->sidecarStatus;
        }
        if (null !== $this->sidecarType) {
            $res['sidecar_type'] = $this->sidecarType;
        }
        if (null !== $this->sidecarVersion) {
            $res['sidecar_version'] = $this->sidecarVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SideCarDetailModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_service_name'])) {
            $model->appServiceName = $map['app_service_name'];
        }
        if (isset($map['clustername'])) {
            $model->clustername = $map['clustername'];
        }
        if (isset($map['created_time'])) {
            $model->createdTime = $map['created_time'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['pod_ip'])) {
            $model->podIp = $map['pod_ip'];
        }
        if (isset($map['pod_name'])) {
            $model->podName = $map['pod_name'];
        }
        if (isset($map['pod_status'])) {
            $model->podStatus = $map['pod_status'];
        }
        if (isset($map['sidecar_status'])) {
            $model->sidecarStatus = $map['sidecar_status'];
        }
        if (isset($map['sidecar_type'])) {
            $model->sidecarType = $map['sidecar_type'];
        }
        if (isset($map['sidecar_version'])) {
            $model->sidecarVersion = $map['sidecar_version'];
        }

        return $model;
    }
}
