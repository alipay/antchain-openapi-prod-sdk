<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class DeleteAntvipDomainRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间组名称
    /**
     * @var string
     */
    public $workspaceGroup;

    // 应用名称
    /**
     * @var string
     */
    public $application;

    // 部署单元cell名称
    /**
     * @var string
     */
    public $cell;
    protected $_name = [
        'authToken'      => 'auth_token',
        'workspaceGroup' => 'workspace_group',
        'application'    => 'application',
        'cell'           => 'cell',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
        Model::validateRequired('application', $this->application, true);
        Model::validateRequired('cell', $this->cell, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->application) {
            $res['application'] = $this->application;
        }
        if (null !== $this->cell) {
            $res['cell'] = $this->cell;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteAntvipDomainRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['application'])) {
            $model->application = $map['application'];
        }
        if (isset($map['cell'])) {
            $model->cell = $map['cell'];
        }

        return $model;
    }
}
