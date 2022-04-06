<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class UpdateLoadbalanceVcomputergroupRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // v_computergroup_id
    /**
     * @var string
     */
    public $vComputergroupId;

    // is_eip
    /**
     * @var bool
     */
    public $isEip;

    // eips
    /**
     * @var string[]
     */
    public $eips;

    // computer_ids
    /**
     * @var string[]
     */
    public $computerIds;

    // weights
    /**
     * @var int[]
     */
    public $weights;

    // ports
    /**
     * @var int[]
     */
    public $ports;

    // 是否只是调整权重，不增删后端服务器
    /**
     * @var bool
     */
    public $updateWeightOnly;
    protected $_name = [
        'authToken'        => 'auth_token',
        'vComputergroupId' => 'v_computergroup_id',
        'isEip'            => 'is_eip',
        'eips'             => 'eips',
        'computerIds'      => 'computer_ids',
        'weights'          => 'weights',
        'ports'            => 'ports',
        'updateWeightOnly' => 'update_weight_only',
    ];

    public function validate()
    {
        Model::validateRequired('vComputergroupId', $this->vComputergroupId, true);
        Model::validateRequired('eips', $this->eips, true);
        Model::validateRequired('weights', $this->weights, true);
        Model::validateRequired('ports', $this->ports, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->vComputergroupId) {
            $res['v_computergroup_id'] = $this->vComputergroupId;
        }
        if (null !== $this->isEip) {
            $res['is_eip'] = $this->isEip;
        }
        if (null !== $this->eips) {
            $res['eips'] = $this->eips;
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
        if (null !== $this->updateWeightOnly) {
            $res['update_weight_only'] = $this->updateWeightOnly;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateLoadbalanceVcomputergroupRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['v_computergroup_id'])) {
            $model->vComputergroupId = $map['v_computergroup_id'];
        }
        if (isset($map['is_eip'])) {
            $model->isEip = $map['is_eip'];
        }
        if (isset($map['eips'])) {
            if (!empty($map['eips'])) {
                $model->eips = $map['eips'];
            }
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
        if (isset($map['update_weight_only'])) {
            $model->updateWeightOnly = $map['update_weight_only'];
        }

        return $model;
    }
}
