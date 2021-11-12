<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class CreateAppopsRequest extends Model
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

    // 执行运维操作的目标应用列表。
    /**
     * @var string[]
     */
    public $appServiceIds;

    // 执行运维操作的目标容器列表。当ops_dimension为CONTAINER时，该参数必填。
    /**
     * @var string[]
     */
    public $containerIds;

    // 目标环境唯一标识。
    /**
     * @var string
     */
    public $envId;

    // 应用运维的操作类型，取值列表：ONLINE：上线，OFFLINE：下线，RESTART:重启，RECOVERY_RESTART：容灾重启，DISABLE_SLB_TRAFFIC:应用摘流，ENABLE_SLB_TRAFFIC:应用挂流。
    /**
     * @var string
     */
    public $opsAction;

    // 应用运维维度。两种取值：APP_SERVICE、CONTAINER。
    /**
     * @var string
     */
    public $opsDimension;

    // 要执行运维操作的应用服务实例所在的单元。
    /**
     * @var string
     */
    public $cellId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appServiceIds'     => 'app_service_ids',
        'containerIds'      => 'container_ids',
        'envId'             => 'env_id',
        'opsAction'         => 'ops_action',
        'opsDimension'      => 'ops_dimension',
        'cellId'            => 'cell_id',
    ];

    public function validate()
    {
        Model::validateRequired('envId', $this->envId, true);
        Model::validateRequired('opsAction', $this->opsAction, true);
        Model::validateRequired('opsDimension', $this->opsDimension, true);
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
        if (null !== $this->appServiceIds) {
            $res['app_service_ids'] = $this->appServiceIds;
        }
        if (null !== $this->containerIds) {
            $res['container_ids'] = $this->containerIds;
        }
        if (null !== $this->envId) {
            $res['env_id'] = $this->envId;
        }
        if (null !== $this->opsAction) {
            $res['ops_action'] = $this->opsAction;
        }
        if (null !== $this->opsDimension) {
            $res['ops_dimension'] = $this->opsDimension;
        }
        if (null !== $this->cellId) {
            $res['cell_id'] = $this->cellId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAppopsRequest
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
        if (isset($map['app_service_ids'])) {
            if (!empty($map['app_service_ids'])) {
                $model->appServiceIds = $map['app_service_ids'];
            }
        }
        if (isset($map['container_ids'])) {
            if (!empty($map['container_ids'])) {
                $model->containerIds = $map['container_ids'];
            }
        }
        if (isset($map['env_id'])) {
            $model->envId = $map['env_id'];
        }
        if (isset($map['ops_action'])) {
            $model->opsAction = $map['ops_action'];
        }
        if (isset($map['ops_dimension'])) {
            $model->opsDimension = $map['ops_dimension'];
        }
        if (isset($map['cell_id'])) {
            $model->cellId = $map['cell_id'];
        }

        return $model;
    }
}
