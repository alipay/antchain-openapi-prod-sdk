<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class UpdateCmdtemplateRequest extends Model
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

    // 模板内容
    /**
     * @var CmdTemplate
     */
    public $template;

    // 可见范围：TENANT/WORKSPACE
    /**
     * @var string
     */
    public $scope;

    // 可见范围id列表
    /**
     * @var string[]
     */
    public $scopeIds;

    // 工作空间
    /**
     * @var string
     */
    public $workspace;
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant'    => 'tenant',
        'template'  => 'template',
        'scope'     => 'scope',
        'scopeIds'  => 'scope_ids',
        'workspace' => 'workspace',
    ];

    public function validate()
    {
        Model::validateRequired('template', $this->template, true);
        Model::validateRequired('scope', $this->scope, true);
        Model::validateRequired('workspace', $this->workspace, true);
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
        if (null !== $this->template) {
            $res['template'] = null !== $this->template ? $this->template->toMap() : null;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->scopeIds) {
            $res['scope_ids'] = $this->scopeIds;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateCmdtemplateRequest
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
        if (isset($map['template'])) {
            $model->template = CmdTemplate::fromMap($map['template']);
        }
        if (isset($map['scope'])) {
            $model->scope = $map['scope'];
        }
        if (isset($map['scope_ids'])) {
            if (!empty($map['scope_ids'])) {
                $model->scopeIds = $map['scope_ids'];
            }
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }

        return $model;
    }
}
