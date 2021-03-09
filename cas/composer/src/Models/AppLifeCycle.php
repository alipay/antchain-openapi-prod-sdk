<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AppLifeCycle extends Model
{
    // ID
    /**
     * @example 123
     *
     * @var string
     */
    public $id;

    // 应用ID
    /**
     * @example 123
     *
     * @var string
     */
    public $appId;

    // 工作空间ID
    /**
     * @example 123
     *
     * @var string
     */
    public $workspaceId;

    // 应用状态
    /**
     * @example DEV | ONLINE | OFFLINE
     *
     * @var string
     */
    public $state;

    // 最近运维单号
    /**
     * @example 123
     *
     * @var string
     */
    public $lastOpsorderId;

    // 上次发布版本
    /**
     * @example 123
     *
     * @var string
     */
    public $lastDeployVersion;

    // 上次发布时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $lastDeployTime;

    // 上线时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $onlineTime;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // 最近修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;
    protected $_name = [
        'id'                => 'id',
        'appId'             => 'app_id',
        'workspaceId'       => 'workspace_id',
        'state'             => 'state',
        'lastOpsorderId'    => 'last_opsorder_id',
        'lastDeployVersion' => 'last_deploy_version',
        'lastDeployTime'    => 'last_deploy_time',
        'onlineTime'        => 'online_time',
        'gmtCreate'         => 'gmt_create',
        'gmtModified'       => 'gmt_modified',
    ];

    public function validate()
    {
        Model::validateRequired('lastDeployVersion', $this->lastDeployVersion, true);
        Model::validateRequired('lastDeployTime', $this->lastDeployTime, true);
        Model::validatePattern('lastDeployTime', $this->lastDeployTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('onlineTime', $this->onlineTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->lastOpsorderId) {
            $res['last_opsorder_id'] = $this->lastOpsorderId;
        }
        if (null !== $this->lastDeployVersion) {
            $res['last_deploy_version'] = $this->lastDeployVersion;
        }
        if (null !== $this->lastDeployTime) {
            $res['last_deploy_time'] = $this->lastDeployTime;
        }
        if (null !== $this->onlineTime) {
            $res['online_time'] = $this->onlineTime;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppLifeCycle
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['last_opsorder_id'])) {
            $model->lastOpsorderId = $map['last_opsorder_id'];
        }
        if (isset($map['last_deploy_version'])) {
            $model->lastDeployVersion = $map['last_deploy_version'];
        }
        if (isset($map['last_deploy_time'])) {
            $model->lastDeployTime = $map['last_deploy_time'];
        }
        if (isset($map['online_time'])) {
            $model->onlineTime = $map['online_time'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }

        return $model;
    }
}
