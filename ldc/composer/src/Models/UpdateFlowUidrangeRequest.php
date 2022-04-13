<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UpdateFlowUidrangeRequest extends Model
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

    // 是否灰度流量（默认false）
    /**
     * @var bool
     */
    public $gray;

    // 操作人
    /**
     * @var string
     */
    public $operator;

    // 是否压测流量（默认 false）
    /**
     * @var bool
     */
    public $press;

    // uid 范围
    /**
     * @var UidShardList
     */
    public $uidRanges;

    // 工作空间组
    /**
     * @var string
     */
    public $workspaceGroup;
    protected $_name = [
        'authToken'      => 'auth_token',
        'cellGroup'      => 'cell_group',
        'gray'           => 'gray',
        'operator'       => 'operator',
        'press'          => 'press',
        'uidRanges'      => 'uid_ranges',
        'workspaceGroup' => 'workspace_group',
    ];

    public function validate()
    {
        Model::validateRequired('cellGroup', $this->cellGroup, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('uidRanges', $this->uidRanges, true);
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
        if (null !== $this->gray) {
            $res['gray'] = $this->gray;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->press) {
            $res['press'] = $this->press;
        }
        if (null !== $this->uidRanges) {
            $res['uid_ranges'] = null !== $this->uidRanges ? $this->uidRanges->toMap() : null;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateFlowUidrangeRequest
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
        if (isset($map['gray'])) {
            $model->gray = $map['gray'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['press'])) {
            $model->press = $map['press'];
        }
        if (isset($map['uid_ranges'])) {
            $model->uidRanges = UidShardList::fromMap($map['uid_ranges']);
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }

        return $model;
    }
}
