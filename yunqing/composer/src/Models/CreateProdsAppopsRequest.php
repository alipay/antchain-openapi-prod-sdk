<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class CreateProdsAppopsRequest extends Model
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

    // 应用名称
    /**
     * @var string
     */
    public $appName;

    // 部署单元标识id
    /**
     * @var string
     */
    public $deploymentUnitIdentity;

    // 部署单元实例id
    /**
     * @var string
     */
    public $deploymentUnitInstanceIdentity;

    // 应用运维的操作类型，取值列表：ONLINE：上线，OFFLINE：下线，RESTART:重启
    //
    /**
     * @var string
     */
    public $opsAction;

    // 容器名称列表
    //
    /**
     * @var string[]
     */
    public $containerNames;

    // 应用容器分组策略，默认取SYSTEM_RECOMMENDATION
    /**
     * @var string
     */
    public $groupStrategy;
    protected $_name = [
        'authToken'                      => 'auth_token',
        'productInstanceId'              => 'product_instance_id',
        'envId'                          => 'env_id',
        'prodCode'                       => 'prod_code',
        'appName'                        => 'app_name',
        'deploymentUnitIdentity'         => 'deployment_unit_identity',
        'deploymentUnitInstanceIdentity' => 'deployment_unit_instance_identity',
        'opsAction'                      => 'ops_action',
        'containerNames'                 => 'container_names',
        'groupStrategy'                  => 'group_strategy',
    ];

    public function validate()
    {
        Model::validateRequired('envId', $this->envId, true);
        Model::validateRequired('prodCode', $this->prodCode, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('deploymentUnitIdentity', $this->deploymentUnitIdentity, true);
        Model::validateRequired('deploymentUnitInstanceIdentity', $this->deploymentUnitInstanceIdentity, true);
        Model::validateRequired('opsAction', $this->opsAction, true);
        Model::validateRequired('containerNames', $this->containerNames, true);
        Model::validateRequired('groupStrategy', $this->groupStrategy, true);
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
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->deploymentUnitIdentity) {
            $res['deployment_unit_identity'] = $this->deploymentUnitIdentity;
        }
        if (null !== $this->deploymentUnitInstanceIdentity) {
            $res['deployment_unit_instance_identity'] = $this->deploymentUnitInstanceIdentity;
        }
        if (null !== $this->opsAction) {
            $res['ops_action'] = $this->opsAction;
        }
        if (null !== $this->containerNames) {
            $res['container_names'] = $this->containerNames;
        }
        if (null !== $this->groupStrategy) {
            $res['group_strategy'] = $this->groupStrategy;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateProdsAppopsRequest
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
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['deployment_unit_identity'])) {
            $model->deploymentUnitIdentity = $map['deployment_unit_identity'];
        }
        if (isset($map['deployment_unit_instance_identity'])) {
            $model->deploymentUnitInstanceIdentity = $map['deployment_unit_instance_identity'];
        }
        if (isset($map['ops_action'])) {
            $model->opsAction = $map['ops_action'];
        }
        if (isset($map['container_names'])) {
            if (!empty($map['container_names'])) {
                $model->containerNames = $map['container_names'];
            }
        }
        if (isset($map['group_strategy'])) {
            $model->groupStrategy = $map['group_strategy'];
        }

        return $model;
    }
}
