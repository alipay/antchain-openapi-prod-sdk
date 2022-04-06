<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AddLoadbalanceVcomputergroupRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // workspace_id
    /**
     * @var string
     */
    public $workspaceId;

    // v_computer_group_id
    /**
     * @var string
     */
    public $vComputerGroupId;

    // is_eip
    /**
     * @var bool
     */
    public $isEip;

    // computer 的id数组
    /**
     * @var string[]
     */
    public $computerIds;

    // 权重
    /**
     * @var int[]
     */
    public $weights;

    // ports
    /**
     * @var string[]
     */
    public $ports;

    // 当is_eip时必填
    /**
     * @var string[]
     */
    public $eips;
    protected $_name = [
        'authToken'        => 'auth_token',
        'workspaceId'      => 'workspace_id',
        'vComputerGroupId' => 'v_computer_group_id',
        'isEip'            => 'is_eip',
        'computerIds'      => 'computer_ids',
        'weights'          => 'weights',
        'ports'            => 'ports',
        'eips'             => 'eips',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('vComputerGroupId', $this->vComputerGroupId, true);
        Model::validateRequired('weights', $this->weights, true);
        Model::validateRequired('ports', $this->ports, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->vComputerGroupId) {
            $res['v_computer_group_id'] = $this->vComputerGroupId;
        }
        if (null !== $this->isEip) {
            $res['is_eip'] = $this->isEip;
        }
        if (null !== $this->computerIds) {
            $res['computer_ids'] = $this->computerIds;
        }
        if (null !== $this->weights) {
            $res['weights'] = $this->weights;
        }
        if (null !== $this->ports) {
            $res['ports'] = $this->ports;
        }
        if (null !== $this->eips) {
            $res['eips'] = $this->eips;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddLoadbalanceVcomputergroupRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['v_computer_group_id'])) {
            $model->vComputerGroupId = $map['v_computer_group_id'];
        }
        if (isset($map['is_eip'])) {
            $model->isEip = $map['is_eip'];
        }
        if (isset($map['computer_ids'])) {
            if (!empty($map['computer_ids'])) {
                $model->computerIds = $map['computer_ids'];
            }
        }
        if (isset($map['weights'])) {
            if (!empty($map['weights'])) {
                $model->weights = $map['weights'];
            }
        }
        if (isset($map['ports'])) {
            if (!empty($map['ports'])) {
                $model->ports = $map['ports'];
            }
        }
        if (isset($map['eips'])) {
            if (!empty($map['eips'])) {
                $model->eips = $map['eips'];
            }
        }

        return $model;
    }
}
