<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class InstanceDTO extends Model
{
    // 集群名
    /**
     * @example SINGLE
     *
     * @var string
     */
    public $cluster;

    // 创建时间
    /**
     * @example
     *
     * @var int
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example
     *
     * @var int
     */
    public $gmtModified;

    // 实例ID
    /**
     * @example 000001
     *
     * @var string
     */
    public $instanceId;

    // 实例状态。取值说明如下： 0、部署中 1、已欠费
    /**
     * @example 0
     *
     * @var int
     */
    public $instanceStatus;

    // 租户id
    /**
     * @example 3123123
     *
     * @var string
     */
    public $tenantId;

    // 用户id
    /**
     * @example 32132132
     *
     * @var string
     */
    public $userId;

    // workspace名
    /**
     * @example test
     *
     * @var string
     */
    public $workspaceName;

    // 数据库id
    /**
     * @example 1
     *
     * @var int
     */
    public $id;
    protected $_name = [
        'cluster'        => 'cluster',
        'gmtCreate'      => 'gmt_create',
        'gmtModified'    => 'gmt_modified',
        'instanceId'     => 'instance_id',
        'instanceStatus' => 'instance_status',
        'tenantId'       => 'tenant_id',
        'userId'         => 'user_id',
        'workspaceName'  => 'workspace_name',
        'id'             => 'id',
    ];

    public function validate()
    {
        Model::validateRequired('cluster', $this->cluster, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('instanceStatus', $this->instanceStatus, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('id', $this->id, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cluster) {
            $res['cluster'] = $this->cluster;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->instanceStatus) {
            $res['instance_status'] = $this->instanceStatus;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InstanceDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cluster'])) {
            $model->cluster = $map['cluster'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['instance_status'])) {
            $model->instanceStatus = $map['instance_status'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }

        return $model;
    }
}
