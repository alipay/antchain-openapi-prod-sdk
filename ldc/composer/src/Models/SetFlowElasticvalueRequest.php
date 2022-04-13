<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class SetFlowElasticvalueRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 弹性值，对应zdal里的弹性位，比如52，53等
    /**
     * @var string[]
     */
    public $elasticValues;

    // 是否灰度（默认 false）
    /**
     * @var bool
     */
    public $gray;

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

    // 工作空间组
    /**
     * @var string
     */
    public $workspaceGroup;
    protected $_name = [
        'authToken'      => 'auth_token',
        'elasticValues'  => 'elastic_values',
        'gray'           => 'gray',
        'operator'       => 'operator',
        'press'          => 'press',
        'workspaceGroup' => 'workspace_group',
    ];

    public function validate()
    {
        Model::validateRequired('elasticValues', $this->elasticValues, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->elasticValues) {
            $res['elastic_values'] = $this->elasticValues;
        }
        if (null !== $this->gray) {
            $res['gray'] = $this->gray;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->press) {
            $res['press'] = $this->press;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SetFlowElasticvalueRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['elastic_values'])) {
            if (!empty($map['elastic_values'])) {
                $model->elasticValues = $map['elastic_values'];
            }
        }
        if (isset($map['gray'])) {
            $model->gray = $map['gray'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['press'])) {
            $model->press = $map['press'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }

        return $model;
    }
}
