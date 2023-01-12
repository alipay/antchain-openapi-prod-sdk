<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class BindCmdtemplateRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $tenant;

    // 模板id
    /**
     * @var string
     */
    public $templateId;

    // 工作空间
    /**
     * @var string
     */
    public $workspace;

    // 角色列表
    /**
     * @var OpsAllowedRolesRequest[]
     */
    public $rolesRequest;
    protected $_name = [
        'authToken'    => 'auth_token',
        'tenant'       => 'tenant',
        'templateId'   => 'template_id',
        'workspace'    => 'workspace',
        'rolesRequest' => 'roles_request',
    ];

    public function validate()
    {
        Model::validateRequired('templateId', $this->templateId, true);
        Model::validateRequired('workspace', $this->workspace, true);
        Model::validateRequired('rolesRequest', $this->rolesRequest, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        if (null !== $this->rolesRequest) {
            $res['roles_request'] = [];
            if (null !== $this->rolesRequest && \is_array($this->rolesRequest)) {
                $n = 0;
                foreach ($this->rolesRequest as $item) {
                    $res['roles_request'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BindCmdtemplateRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }
        if (isset($map['template_id'])) {
            $model->templateId = $map['template_id'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }
        if (isset($map['roles_request'])) {
            if (!empty($map['roles_request'])) {
                $model->rolesRequest = [];
                $n                   = 0;
                foreach ($map['roles_request'] as $item) {
                    $model->rolesRequest[$n++] = null !== $item ? OpsAllowedRolesRequest::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
