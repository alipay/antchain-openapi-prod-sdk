<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DeleteVpcVroutertableRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 目标网段
    /**
     * @var string
     */
    public $destinationCidrBlock;

    // 下一跳实例 iaas id
    /**
     * @var string
     */
    public $nextHopId;

    // 路由表 iaasId
    /**
     * @var string
     */
    public $vRouteTableId;

    // vpc paas id
    /**
     * @var string
     */
    public $vpcSequence;
    protected $_name = [
        'authToken'            => 'auth_token',
        'destinationCidrBlock' => 'destination_cidr_block',
        'nextHopId'            => 'next_hop_id',
        'vRouteTableId'        => 'v_route_table_id',
        'vpcSequence'          => 'vpc_sequence',
    ];

    public function validate()
    {
        Model::validateRequired('destinationCidrBlock', $this->destinationCidrBlock, true);
        Model::validateRequired('nextHopId', $this->nextHopId, true);
        Model::validateRequired('vRouteTableId', $this->vRouteTableId, true);
        Model::validateRequired('vpcSequence', $this->vpcSequence, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->destinationCidrBlock) {
            $res['destination_cidr_block'] = $this->destinationCidrBlock;
        }
        if (null !== $this->nextHopId) {
            $res['next_hop_id'] = $this->nextHopId;
        }
        if (null !== $this->vRouteTableId) {
            $res['v_route_table_id'] = $this->vRouteTableId;
        }
        if (null !== $this->vpcSequence) {
            $res['vpc_sequence'] = $this->vpcSequence;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteVpcVroutertableRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['destination_cidr_block'])) {
            $model->destinationCidrBlock = $map['destination_cidr_block'];
        }
        if (isset($map['next_hop_id'])) {
            $model->nextHopId = $map['next_hop_id'];
        }
        if (isset($map['v_route_table_id'])) {
            $model->vRouteTableId = $map['v_route_table_id'];
        }
        if (isset($map['vpc_sequence'])) {
            $model->vpcSequence = $map['vpc_sequence'];
        }

        return $model;
    }
}
