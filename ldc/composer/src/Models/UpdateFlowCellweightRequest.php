<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UpdateFlowCellweightRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 部署单元组
    /**
     * @var string
     */
    public $cellGroup;

    // 操作人
    /**
     * @var string
     */
    public $operator;

    // 是否压测流量，默认 false
    /**
     * @var bool
     */
    public $press;

    // 部署单元权重信息
    /**
     * @var CellWeightInfoList
     */
    public $weightInfoList;

    // 工作空间组
    /**
     * @var string
     */
    public $workspaceGroup;
    protected $_name = [
        'authToken'      => 'auth_token',
        'cellGroup'      => 'cell_group',
        'operator'       => 'operator',
        'press'          => 'press',
        'weightInfoList' => 'weight_info_list',
        'workspaceGroup' => 'workspace_group',
    ];

    public function validate()
    {
        Model::validateRequired('cellGroup', $this->cellGroup, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('weightInfoList', $this->weightInfoList, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->cellGroup) {
            $res['cell_group'] = $this->cellGroup;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->press) {
            $res['press'] = $this->press;
        }
        if (null !== $this->weightInfoList) {
            $res['weight_info_list'] = null !== $this->weightInfoList ? $this->weightInfoList->toMap() : null;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateFlowCellweightRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['cell_group'])) {
            $model->cellGroup = $map['cell_group'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['press'])) {
            $model->press = $map['press'];
        }
        if (isset($map['weight_info_list'])) {
            $model->weightInfoList = CellWeightInfoList::fromMap($map['weight_info_list']);
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }

        return $model;
    }
}
