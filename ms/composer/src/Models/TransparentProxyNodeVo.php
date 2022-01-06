<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class TransparentProxyNodeVo extends Model
{
    // 应用名
    /**
     * @example app1
     *
     * @var string
     */
    public $appName;

    // 节点 ID
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 应用实例 ID
    /**
     * @example 999999
     *
     * @var string
     */
    public $instanceId;

    // IP 地址
    /**
     * @example 127.0.0.1
     *
     * @var string
     */
    public $ip;

    // mosn 版本
    /**
     * @example Mosn v.1.10.1
     *
     * @var string
     */
    public $mosnVersion;

    // 节点状态
    /**
     * @example 运行中
     *
     * @var string
     */
    public $nodeStatus;

    // 节点集群类型
    /**
     * @example container
     *
     * @var string
     */
    public $nodeType;

    // 节点是否在运行透明劫持
    /**
     * @example 1
     *
     * @var string
     */
    public $realRun;

    // Sidecar 状态
    /**
     * @example 运行中
     *
     * @var string
     */
    public $sidecarStatus;

    // 透明劫持开关
    /**
     * @example 1
     *
     * @var int
     */
    public $transparentProxySwitch;
    protected $_name = [
        'appName'                => 'app_name',
        'id'                     => 'id',
        'instanceId'             => 'instance_id',
        'ip'                     => 'ip',
        'mosnVersion'            => 'mosn_version',
        'nodeStatus'             => 'node_status',
        'nodeType'               => 'node_type',
        'realRun'                => 'real_run',
        'sidecarStatus'          => 'sidecar_status',
        'transparentProxySwitch' => 'transparent_proxy_switch',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('ip', $this->ip, true);
        Model::validateRequired('mosnVersion', $this->mosnVersion, true);
        Model::validateRequired('nodeStatus', $this->nodeStatus, true);
        Model::validateRequired('nodeType', $this->nodeType, true);
        Model::validateRequired('realRun', $this->realRun, true);
        Model::validateRequired('sidecarStatus', $this->sidecarStatus, true);
        Model::validateRequired('transparentProxySwitch', $this->transparentProxySwitch, true);
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
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->mosnVersion) {
            $res['mosn_version'] = $this->mosnVersion;
        }
        if (null !== $this->nodeStatus) {
            $res['node_status'] = $this->nodeStatus;
        }
        if (null !== $this->nodeType) {
            $res['node_type'] = $this->nodeType;
        }
        if (null !== $this->realRun) {
            $res['real_run'] = $this->realRun;
        }
        if (null !== $this->sidecarStatus) {
            $res['sidecar_status'] = $this->sidecarStatus;
        }
        if (null !== $this->transparentProxySwitch) {
            $res['transparent_proxy_switch'] = $this->transparentProxySwitch;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TransparentProxyNodeVo
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
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }
        if (isset($map['mosn_version'])) {
            $model->mosnVersion = $map['mosn_version'];
        }
        if (isset($map['node_status'])) {
            $model->nodeStatus = $map['node_status'];
        }
        if (isset($map['node_type'])) {
            $model->nodeType = $map['node_type'];
        }
        if (isset($map['real_run'])) {
            $model->realRun = $map['real_run'];
        }
        if (isset($map['sidecar_status'])) {
            $model->sidecarStatus = $map['sidecar_status'];
        }
        if (isset($map['transparent_proxy_switch'])) {
            $model->transparentProxySwitch = $map['transparent_proxy_switch'];
        }

        return $model;
    }
}
