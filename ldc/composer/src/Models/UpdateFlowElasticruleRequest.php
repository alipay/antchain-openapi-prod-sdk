<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UpdateFlowElasticruleRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 弹性规则 ID
    /**
     * @var int
     */
    public $id;

    // 操作人
    /**
     * @var string
     */
    public $operator;

    // 弹性规则服务名称。
    // RPC：对应接口名，例如：com.alipay.cif.facade.AckCodeService:1.0:cif。
    // APP：对应应用名，例如：cif。
    // MSG或ANTQ：对应消息groupId，例如：S-UNIQUERY-SYNC。
    /**
     * @var string
     */
    public $serviceName;

    // 弹性规则状态，可选值 VALID("线上生效")，PRESS("仅压测生效")，INVALID("无效状态");
    /**
     * @var string
     */
    public $status;

    // 工作空间组
    /**
     * @var string
     */
    public $workspaceGroup;
    protected $_name = [
        'authToken'      => 'auth_token',
        'id'             => 'id',
        'operator'       => 'operator',
        'serviceName'    => 'service_name',
        'status'         => 'status',
        'workspaceGroup' => 'workspace_group',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('serviceName', $this->serviceName, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->serviceName) {
            $res['service_name'] = $this->serviceName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateFlowElasticruleRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['service_name'])) {
            $model->serviceName = $map['service_name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }

        return $model;
    }
}
