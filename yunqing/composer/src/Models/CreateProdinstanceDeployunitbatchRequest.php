<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class CreateProdinstanceDeployunitbatchRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 环境id
    /**
     * @var string
     */
    public $envId;

    // 产品码
    /**
     * @var string
     */
    public $prodCode;

    // 部署单元名称
    /**
     * @var string
     */
    public $deploymentUnitName;

    // 部署单元实例id列表
    /**
     * @var string[]
     */
    public $unitInstanceIds;

    // 逻辑部署单元实例id
    /**
     * @var string
     */
    public $logicalInstanceId;

    // 集群中哪个zone，公有云场景使用，专有云不需要部署
    /**
     * @var string
     */
    public $cellId;

    // 操作人id
    /**
     * @var string
     */
    public $submitterId;

    //
    // 操作人名称（花名或者真名）
    /**
     * @var string
     */
    public $submitterName;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'envId'              => 'env_id',
        'prodCode'           => 'prod_code',
        'deploymentUnitName' => 'deployment_unit_name',
        'unitInstanceIds'    => 'unit_instance_ids',
        'logicalInstanceId'  => 'logical_instance_id',
        'cellId'             => 'cell_id',
        'submitterId'        => 'submitter_id',
        'submitterName'      => 'submitter_name',
    ];

    public function validate()
    {
        Model::validateRequired('envId', $this->envId, true);
        Model::validateRequired('prodCode', $this->prodCode, true);
        Model::validateRequired('deploymentUnitName', $this->deploymentUnitName, true);
        Model::validateRequired('unitInstanceIds', $this->unitInstanceIds, true);
        Model::validateRequired('logicalInstanceId', $this->logicalInstanceId, true);
        Model::validateRequired('cellId', $this->cellId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->envId) {
            $res['env_id'] = $this->envId;
        }
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }
        if (null !== $this->deploymentUnitName) {
            $res['deployment_unit_name'] = $this->deploymentUnitName;
        }
        if (null !== $this->unitInstanceIds) {
            $res['unit_instance_ids'] = $this->unitInstanceIds;
        }
        if (null !== $this->logicalInstanceId) {
            $res['logical_instance_id'] = $this->logicalInstanceId;
        }
        if (null !== $this->cellId) {
            $res['cell_id'] = $this->cellId;
        }
        if (null !== $this->submitterId) {
            $res['submitter_id'] = $this->submitterId;
        }
        if (null !== $this->submitterName) {
            $res['submitter_name'] = $this->submitterName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateProdinstanceDeployunitbatchRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['env_id'])) {
            $model->envId = $map['env_id'];
        }
        if (isset($map['prod_code'])) {
            $model->prodCode = $map['prod_code'];
        }
        if (isset($map['deployment_unit_name'])) {
            $model->deploymentUnitName = $map['deployment_unit_name'];
        }
        if (isset($map['unit_instance_ids'])) {
            if (!empty($map['unit_instance_ids'])) {
                $model->unitInstanceIds = $map['unit_instance_ids'];
            }
        }
        if (isset($map['logical_instance_id'])) {
            $model->logicalInstanceId = $map['logical_instance_id'];
        }
        if (isset($map['cell_id'])) {
            $model->cellId = $map['cell_id'];
        }
        if (isset($map['submitter_id'])) {
            $model->submitterId = $map['submitter_id'];
        }
        if (isset($map['submitter_name'])) {
            $model->submitterName = $map['submitter_name'];
        }

        return $model;
    }
}
