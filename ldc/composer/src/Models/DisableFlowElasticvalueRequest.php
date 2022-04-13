<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class DisableFlowElasticvalueRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间组
    /**
     * @var string
     */
    public $workspaceGroup;

    // 操作人
    /**
     * @var string
     */
    public $operator;

    // 是否弹性（默认 false）
    /**
     * @var bool
     */
    public $press;

    // 是否灰度（默认 false）
    /**
     * @var bool
     */
    public $gray;
    protected $_name = [
        'authToken'      => 'auth_token',
        'workspaceGroup' => 'workspace_group',
        'operator'       => 'operator',
        'press'          => 'press',
        'gray'           => 'gray',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
        Model::validateRequired('operator', $this->operator, true);
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
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->press) {
            $res['press'] = $this->press;
        }
        if (null !== $this->gray) {
            $res['gray'] = $this->gray;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DisableFlowElasticvalueRequest
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
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['press'])) {
            $model->press = $map['press'];
        }
        if (isset($map['gray'])) {
            $model->gray = $map['gray'];
        }

        return $model;
    }
}
