<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class PodDetailInfo extends Model
{
    // 集群名称
    //
    /**
     * @example prod
     *
     * @var string
     */
    public $cluster;

    // pod created time
    /**
     * @example 2019/10/26 01:35:47
     *
     * @var string
     */
    public $createdTime;

    // 已经具备的finalizers
    /**
     * @example pod.beta1.sigma.ali/cni-allocated
     *
     * @var string[]
     */
    public $finalizers;

    // pod的生命周期当前阶段
    /**
     * @example ServiceAvailable, UpgradePrepared, Upgrading, UpgradeFinished
     *
     * @var string
     */
    public $lifecycleStage;

    // pod name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // pod namespace
    /**
     * @example default
     *
     * @var string
     */
    public $namespace;

    // pod ip
    /**
     * @example 11.121.11.12
     *
     * @var string
     */
    public $podIp;

    // pod的版本
    /**
     * @example 20191125163053504.j58d67yt
     *
     * @var string
     */
    public $revision;

    // pod status
    /**
     * @example Running
     *
     * @var string
     */
    public $status;

    // pod uid
    /**
     * @example 02b6addf-0f5e-11ea-a5a3-02420ba6ade1
     *
     * @var string
     */
    public $uid;

    // 描述Pod当前状态的信息
    /**
     * @example pod message
     *
     * @var string
     */
    public $message;
    protected $_name = [
        'cluster'        => 'cluster',
        'createdTime'    => 'created_time',
        'finalizers'     => 'finalizers',
        'lifecycleStage' => 'lifecycle_stage',
        'name'           => 'name',
        'namespace'      => 'namespace',
        'podIp'          => 'pod_ip',
        'revision'       => 'revision',
        'status'         => 'status',
        'uid'            => 'uid',
        'message'        => 'message',
    ];

    public function validate()
    {
        Model::validateRequired('cluster', $this->cluster, true);
        Model::validateRequired('createdTime', $this->createdTime, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('podIp', $this->podIp, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('message', $this->message, true);
        Model::validatePattern('createdTime', $this->createdTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cluster) {
            $res['cluster'] = $this->cluster;
        }
        if (null !== $this->createdTime) {
            $res['created_time'] = $this->createdTime;
        }
        if (null !== $this->finalizers) {
            $res['finalizers'] = $this->finalizers;
        }
        if (null !== $this->lifecycleStage) {
            $res['lifecycle_stage'] = $this->lifecycleStage;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->podIp) {
            $res['pod_ip'] = $this->podIp;
        }
        if (null !== $this->revision) {
            $res['revision'] = $this->revision;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->uid) {
            $res['uid'] = $this->uid;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PodDetailInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cluster'])) {
            $model->cluster = $map['cluster'];
        }
        if (isset($map['created_time'])) {
            $model->createdTime = $map['created_time'];
        }
        if (isset($map['finalizers'])) {
            if (!empty($map['finalizers'])) {
                $model->finalizers = $map['finalizers'];
            }
        }
        if (isset($map['lifecycle_stage'])) {
            $model->lifecycleStage = $map['lifecycle_stage'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['pod_ip'])) {
            $model->podIp = $map['pod_ip'];
        }
        if (isset($map['revision'])) {
            $model->revision = $map['revision'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['uid'])) {
            $model->uid = $map['uid'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }

        return $model;
    }
}
