<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class DeploymentUnitSnapshotOP extends Model
{
    // 环境ID
    /**
     * @example 730420210726104445272690000
     *
     * @var string
     */
    public $envId;

    // 产品码
    /**
     * @example YANFA
     *
     * @var string
     */
    public $prodCode;

    // 产品版本
    /**
     * @example 1.12
     *
     * @var string
     */
    public $prodVersion;

    // 关联的解决方案id
    /**
     * @example 730420210726104445272690000
     *
     * @var string
     */
    public $solutionId;

    // 快照关联的发布单id
    /**
     * @example 730420210726104445272690000
     *
     * @var string
     */
    public $opsPlanId;

    // 快照版本, 根据日期生成
    /**
     * @example 730420210726104
     *
     * @var string
     */
    public $snapshotVersion;

    // 快照创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $snapshotTime;

    // 部署单元实例唯一标识
    /**
     * @example default
     *
     * @var string
     */
    public $deploymentUnitInstanceIdentity;

    // 部署单元唯一标识
    /**
     * @example default
     *
     * @var string
     */
    public $deploymentUnitIdentity;

    // 部署拓扑
    /**
     * @example DEPLOY_TOPO_202104291716090523
     *
     * @var string
     */
    public $deployTopologyIdentity;

    // 应用回滚快照
    /**
     * @example
     *
     * @var string[]
     */
    public $appSnapshot;
    protected $_name = [
        'envId'                          => 'env_id',
        'prodCode'                       => 'prod_code',
        'prodVersion'                    => 'prod_version',
        'solutionId'                     => 'solution_id',
        'opsPlanId'                      => 'ops_plan_id',
        'snapshotVersion'                => 'snapshot_version',
        'snapshotTime'                   => 'snapshot_time',
        'deploymentUnitInstanceIdentity' => 'deployment_unit_instance_identity',
        'deploymentUnitIdentity'         => 'deployment_unit_identity',
        'deployTopologyIdentity'         => 'deploy_topology_identity',
        'appSnapshot'                    => 'app_snapshot',
    ];

    public function validate()
    {
        Model::validatePattern('snapshotTime', $this->snapshotTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->envId) {
            $res['env_id'] = $this->envId;
        }
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }
        if (null !== $this->prodVersion) {
            $res['prod_version'] = $this->prodVersion;
        }
        if (null !== $this->solutionId) {
            $res['solution_id'] = $this->solutionId;
        }
        if (null !== $this->opsPlanId) {
            $res['ops_plan_id'] = $this->opsPlanId;
        }
        if (null !== $this->snapshotVersion) {
            $res['snapshot_version'] = $this->snapshotVersion;
        }
        if (null !== $this->snapshotTime) {
            $res['snapshot_time'] = $this->snapshotTime;
        }
        if (null !== $this->deploymentUnitInstanceIdentity) {
            $res['deployment_unit_instance_identity'] = $this->deploymentUnitInstanceIdentity;
        }
        if (null !== $this->deploymentUnitIdentity) {
            $res['deployment_unit_identity'] = $this->deploymentUnitIdentity;
        }
        if (null !== $this->deployTopologyIdentity) {
            $res['deploy_topology_identity'] = $this->deployTopologyIdentity;
        }
        if (null !== $this->appSnapshot) {
            $res['app_snapshot'] = $this->appSnapshot;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeploymentUnitSnapshotOP
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['env_id'])) {
            $model->envId = $map['env_id'];
        }
        if (isset($map['prod_code'])) {
            $model->prodCode = $map['prod_code'];
        }
        if (isset($map['prod_version'])) {
            $model->prodVersion = $map['prod_version'];
        }
        if (isset($map['solution_id'])) {
            $model->solutionId = $map['solution_id'];
        }
        if (isset($map['ops_plan_id'])) {
            $model->opsPlanId = $map['ops_plan_id'];
        }
        if (isset($map['snapshot_version'])) {
            $model->snapshotVersion = $map['snapshot_version'];
        }
        if (isset($map['snapshot_time'])) {
            $model->snapshotTime = $map['snapshot_time'];
        }
        if (isset($map['deployment_unit_instance_identity'])) {
            $model->deploymentUnitInstanceIdentity = $map['deployment_unit_instance_identity'];
        }
        if (isset($map['deployment_unit_identity'])) {
            $model->deploymentUnitIdentity = $map['deployment_unit_identity'];
        }
        if (isset($map['deploy_topology_identity'])) {
            $model->deployTopologyIdentity = $map['deploy_topology_identity'];
        }
        if (isset($map['app_snapshot'])) {
            if (!empty($map['app_snapshot'])) {
                $model->appSnapshot = $map['app_snapshot'];
            }
        }

        return $model;
    }
}
