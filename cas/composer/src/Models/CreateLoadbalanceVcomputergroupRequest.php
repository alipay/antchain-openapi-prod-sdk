<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CreateLoadbalanceVcomputergroupRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // load_balancer_id
    /**
     * @var string
     */
    public $loadBalancerId;

    // name
    /**
     * @var string
     */
    public $name;

    // computer_ids
    /**
     * @var string[]
     */
    public $computerIds;

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
    protected $_name = [
        'authToken'      => 'auth_token',
        'loadBalancerId' => 'load_balancer_id',
        'name'           => 'name',
        'computerIds'    => 'computer_ids',
        'ports'          => 'ports',
        'weights'        => 'weights',
        'isEip'          => 'is_eip',
        'eips'           => 'eips',
    ];

    public function validate()
    {
        Model::validateRequired('loadBalancerId', $this->loadBalancerId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('computerIds', $this->computerIds, true);
        Model::validateRequired('ports', $this->ports, true);
        Model::validateRequired('weights', $this->weights, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->loadBalancerId) {
            $res['load_balancer_id'] = $this->loadBalancerId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->computerIds) {
            $res['computer_ids'] = $this->computerIds;
        }
        if (null !== $this->ports) {
            $res['ports'] = $this->ports;
        }
        if (null !== $this->weights) {
            $res['weights'] = $this->weights;
        }
        if (null !== $this->isEip) {
            $res['is_eip'] = $this->isEip;
        }
        if (null !== $this->eips) {
            $res['eips'] = $this->eips;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateLoadbalanceVcomputergroupRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['load_balancer_id'])) {
            $model->loadBalancerId = $map['load_balancer_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['computer_ids'])) {
            if (!empty($map['computer_ids'])) {
                $model->computerIds = $map['computer_ids'];
            }
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
        if (isset($map['is_eip'])) {
            $model->isEip = $map['is_eip'];
        }
        if (isset($map['eips'])) {
            if (!empty($map['eips'])) {
                $model->eips = $map['eips'];
            }
        }

        return $model;
    }
}
