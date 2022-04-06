<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class RemoveLoadbalanceVcomputergroupRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // computer_ids
    /**
     * @var string[]
     */
    public $computerIds;

    // 后端是否是弹性网卡
    /**
     * @var bool
     */
    public $isEip;

    // ports
    /**
     * @var int[]
     */
    public $ports;

    // weights
    /**
     * @var int[]
     */
    public $weights;

    // eips
    /**
     * @var string[]
     */
    public $eips;

    // v_computer_group_id
    /**
     * @var string
     */
    public $vComputerGroupId;

    // workspace_id
    /**
     * @var string
     */
    public $workspaceId;
    protected $_name = [
        'authToken'        => 'auth_token',
        'computerIds'      => 'computer_ids',
        'isEip'            => 'is_eip',
        'ports'            => 'ports',
        'weights'          => 'weights',
        'eips'             => 'eips',
        'vComputerGroupId' => 'v_computer_group_id',
        'workspaceId'      => 'workspace_id',
    ];

    public function validate()
    {
        Model::validateRequired('computerIds', $this->computerIds, true);
        Model::validateRequired('ports', $this->ports, true);
        Model::validateRequired('weights', $this->weights, true);
        Model::validateRequired('vComputerGroupId', $this->vComputerGroupId, true);
        Model::validateRequired('workspaceId', $this->workspaceId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->computerIds) {
            $res['computer_ids'] = $this->computerIds;
        }
        if (null !== $this->isEip) {
            $res['is_eip'] = $this->isEip;
        }
        if (null !== $this->ports) {
            $res['ports'] = $this->ports;
        }
        if (null !== $this->weights) {
            $res['weights'] = $this->weights;
        }
        if (null !== $this->eips) {
            $res['eips'] = $this->eips;
        }
        if (null !== $this->vComputerGroupId) {
            $res['v_computer_group_id'] = $this->vComputerGroupId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RemoveLoadbalanceVcomputergroupRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['computer_ids'])) {
            if (!empty($map['computer_ids'])) {
                $model->computerIds = $map['computer_ids'];
            }
        }
        if (isset($map['is_eip'])) {
            $model->isEip = $map['is_eip'];
        }
        if (isset($map['ports'])) {
            if (!empty($map['ports'])) {
                $model->ports = $map['ports'];
            }
        }
        if (isset($map['weights'])) {
            if (!empty($map['weights'])) {
                $model->weights = $map['weights'];
            }
        }
        if (isset($map['eips'])) {
            if (!empty($map['eips'])) {
                $model->eips = $map['eips'];
            }
        }
        if (isset($map['v_computer_group_id'])) {
            $model->vComputerGroupId = $map['v_computer_group_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }

        return $model;
    }
}
