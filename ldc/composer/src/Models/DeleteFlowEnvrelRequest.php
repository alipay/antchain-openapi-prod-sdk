<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class DeleteFlowEnvrelRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 目标环境
    /**
     * @var string
     */
    public $dest;

    // 源环境
    /**
     * @var string
     */
    public $src;

    // 关联类型（PROD，GRAY）
    /**
     * @var string
     */
    public $type;

    // 环境
    /**
     * @var string
     */
    public $workspaceGroup;

    // 操作人
    /**
     * @var string
     */
    public $operator;
    protected $_name = [
        'authToken'      => 'auth_token',
        'dest'           => 'dest',
        'src'            => 'src',
        'type'           => 'type',
        'workspaceGroup' => 'workspace_group',
        'operator'       => 'operator',
    ];

    public function validate()
    {
        Model::validateRequired('dest', $this->dest, true);
        Model::validateRequired('src', $this->src, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
        Model::validateRequired('operator', $this->operator, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->dest) {
            $res['dest'] = $this->dest;
        }
        if (null !== $this->src) {
            $res['src'] = $this->src;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteFlowEnvrelRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['dest'])) {
            $model->dest = $map['dest'];
        }
        if (isset($map['src'])) {
            $model->src = $map['src'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }

        return $model;
    }
}
