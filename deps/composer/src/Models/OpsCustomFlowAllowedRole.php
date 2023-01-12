<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class OpsCustomFlowAllowedRole extends Model
{
    // id
    /**
     * @example 00001
     *
     * @var string
     */
    public $id;

    // 租户id
    /**
     * @example 0000001
     *
     * @var string
     */
    public $tenantId;

    // 工作空间id
    /**
     * @example 0000001
     *
     * @var string
     */
    public $workspaceId;

    // 模板id
    /**
     * @example 202208251515248909
     *
     * @var string
     */
    public $templateId;

    // 授权用户
    /**
     * @example 0000000002
     *
     * @var string
     */
    public $allowedExecutor;

    // 授权角色
    /**
     * @example R0000011230
     *
     * @var string
     */
    public $allowedRole;
    protected $_name = [
        'id'              => 'id',
        'tenantId'        => 'tenant_id',
        'workspaceId'     => 'workspace_id',
        'templateId'      => 'template_id',
        'allowedExecutor' => 'allowed_executor',
        'allowedRole'     => 'allowed_role',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('templateId', $this->templateId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->allowedExecutor) {
            $res['allowed_executor'] = $this->allowedExecutor;
        }
        if (null !== $this->allowedRole) {
            $res['allowed_role'] = $this->allowedRole;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OpsCustomFlowAllowedRole
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['template_id'])) {
            $model->templateId = $map['template_id'];
        }
        if (isset($map['allowed_executor'])) {
            $model->allowedExecutor = $map['allowed_executor'];
        }
        if (isset($map['allowed_role'])) {
            $model->allowedRole = $map['allowed_role'];
        }

        return $model;
    }
}
