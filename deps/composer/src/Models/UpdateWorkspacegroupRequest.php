<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class UpdateWorkspacegroupRequest extends Model
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

    // 域名后缀。
    /**
     * @var string
     */
    public $domainSuffix;

    // workspacegroup名称，唯一标识一个环境。
    /**
     * @var string
     */
    public $name;

    // workspacegroup显示名称。
    /**
     * @var string
     */
    public $displayName;

    // 包含工作空间名称。
    /**
     * @var string[]
     */
    public $workspaces;

    // env_type
    /**
     * @var string
     */
    public $envType;
    protected $_name = [
        'authToken'    => 'auth_token',
        'tenant'       => 'tenant',
        'domainSuffix' => 'domain_suffix',
        'name'         => 'name',
        'displayName'  => 'display_name',
        'workspaces'   => 'workspaces',
        'envType'      => 'env_type',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
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
        if (null !== $this->domainSuffix) {
            $res['domain_suffix'] = $this->domainSuffix;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->workspaces) {
            $res['workspaces'] = $this->workspaces;
        }
        if (null !== $this->envType) {
            $res['env_type'] = $this->envType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateWorkspacegroupRequest
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
        if (isset($map['domain_suffix'])) {
            $model->domainSuffix = $map['domain_suffix'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['workspaces'])) {
            if (!empty($map['workspaces'])) {
                $model->workspaces = $map['workspaces'];
            }
        }
        if (isset($map['env_type'])) {
            $model->envType = $map['env_type'];
        }

        return $model;
    }
}
