<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class DeploymentUnitInstance extends Model
{
    // 环境id
    /**
     * @example 7304000001
     *
     * @var string
     */
    public $envId;

    // 产品码
    /**
     * @example YUNYOUDEV
     *
     * @var string
     */
    public $prodCode;

    // 产品版本
    /**
     * @example 1.11.1
     *
     * @var string
     */
    public $prodVersion;

    // 部署单元实例id
    /**
     * @example default
     *
     * @var string
     */
    public $identity;

    // 部署单元标识id
    /**
     * @example default
     *
     * @var string
     */
    public $deploymentUnitIdentity;

    // 部署单元实例状态：ACTIVE、FAILED、UPGRADING
    /**
     * @example ACTIVE
     *
     * @var string
     */
    public $status;

    // 部署拓扑标识
    /**
     * @example xx
     *
     * @var string
     */
    public $deployTopologyIdentity;

    // 部署规格标识id
    /**
     * @example xxx
     *
     * @var string
     */
    public $deploySpecIdentity;

    // 部署单元部署在哪个zone
    /**
     * @example RANDOM
     *
     * @var string
     */
    public $zone;

    // 逻辑部署单元实例id
    /**
     * @example default
     *
     * @var string
     */
    public $logicalInstanceId;
    protected $_name = [
        'envId'                  => 'env_id',
        'prodCode'               => 'prod_code',
        'prodVersion'            => 'prod_version',
        'identity'               => 'identity',
        'deploymentUnitIdentity' => 'deployment_unit_identity',
        'status'                 => 'status',
        'deployTopologyIdentity' => 'deploy_topology_identity',
        'deploySpecIdentity'     => 'deploy_spec_identity',
        'zone'                   => 'zone',
        'logicalInstanceId'      => 'logical_instance_id',
    ];

    public function validate()
    {
        Model::validateRequired('envId', $this->envId, true);
        Model::validateRequired('prodCode', $this->prodCode, true);
        Model::validateRequired('prodVersion', $this->prodVersion, true);
        Model::validateRequired('identity', $this->identity, true);
        Model::validateRequired('deploymentUnitIdentity', $this->deploymentUnitIdentity, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('deployTopologyIdentity', $this->deployTopologyIdentity, true);
        Model::validateRequired('deploySpecIdentity', $this->deploySpecIdentity, true);
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
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        if (null !== $this->deploymentUnitIdentity) {
            $res['deployment_unit_identity'] = $this->deploymentUnitIdentity;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->deployTopologyIdentity) {
            $res['deploy_topology_identity'] = $this->deployTopologyIdentity;
        }
        if (null !== $this->deploySpecIdentity) {
            $res['deploy_spec_identity'] = $this->deploySpecIdentity;
        }
        if (null !== $this->zone) {
            $res['zone'] = $this->zone;
        }
        if (null !== $this->logicalInstanceId) {
            $res['logical_instance_id'] = $this->logicalInstanceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeploymentUnitInstance
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
        if (isset($map['identity'])) {
            $model->identity = $map['identity'];
        }
        if (isset($map['deployment_unit_identity'])) {
            $model->deploymentUnitIdentity = $map['deployment_unit_identity'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['deploy_topology_identity'])) {
            $model->deployTopologyIdentity = $map['deploy_topology_identity'];
        }
        if (isset($map['deploy_spec_identity'])) {
            $model->deploySpecIdentity = $map['deploy_spec_identity'];
        }
        if (isset($map['zone'])) {
            $model->zone = $map['zone'];
        }
        if (isset($map['logical_instance_id'])) {
            $model->logicalInstanceId = $map['logical_instance_id'];
        }

        return $model;
    }
}
