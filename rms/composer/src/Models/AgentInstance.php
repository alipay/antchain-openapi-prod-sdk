<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class AgentInstance extends Model
{
    // agent版本
    /**
     * @example v1.0
     *
     * @var string
     */
    public $version;

    // agent 采集对象的唯一标识符
    /**
     * @example 127.0.0.1@test
     *
     * @var string
     */
    public $collectId;

    // app 名称
    /**
     * @example metaservice
     *
     * @var string
     */
    public $appName;

    // IP 地址
    /**
     * @example 127.0.0.1
     *
     * @var string
     */
    public $ip;

    // hostname 名称
    /**
     * @example localhost
     *
     * @var string
     */
    public $hostname;

    // 租户 ID
    /**
     * @example 1
     *
     * @var int
     */
    public $tenantId;

    // 工作空间 ID
    /**
     * @example 3
     *
     * @var int
     */
    public $workspaceId;

    // agent 状态
    /**
     * @example 1
     *
     * @var int
     */
    public $status;

    // 容器/ECS
    /**
     * @example MACHINE
     *
     * @var string
     */
    public $deployType;

    // agent 附加信息
    /**
     * @example {"clockOffset: 2"}
     *
     * @var string
     */
    public $extraInfo;

    // 更新时间
    /**
     * @example 123456
     *
     * @var int
     */
    public $gmtModified;

    // 是否开启告警标志
    /**
     * @example 0，1
     *
     * @var int
     */
    public $label;
    protected $_name = [
        'version'     => 'version',
        'collectId'   => 'collect_id',
        'appName'     => 'app_name',
        'ip'          => 'ip',
        'hostname'    => 'hostname',
        'tenantId'    => 'tenant_id',
        'workspaceId' => 'workspace_id',
        'status'      => 'status',
        'deployType'  => 'deploy_type',
        'extraInfo'   => 'extra_info',
        'gmtModified' => 'gmt_modified',
        'label'       => 'label',
    ];

    public function validate()
    {
        Model::validateRequired('version', $this->version, true);
        Model::validateRequired('collectId', $this->collectId, true);
        Model::validateRequired('ip', $this->ip, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('deployType', $this->deployType, true);
        Model::validateRequired('label', $this->label, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->collectId) {
            $res['collect_id'] = $this->collectId;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->hostname) {
            $res['hostname'] = $this->hostname;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->deployType) {
            $res['deploy_type'] = $this->deployType;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->label) {
            $res['label'] = $this->label;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AgentInstance
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['collect_id'])) {
            $model->collectId = $map['collect_id'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }
        if (isset($map['hostname'])) {
            $model->hostname = $map['hostname'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['deploy_type'])) {
            $model->deployType = $map['deploy_type'];
        }
        if (isset($map['extra_info'])) {
            $model->extraInfo = $map['extra_info'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['label'])) {
            $model->label = $map['label'];
        }

        return $model;
    }
}
