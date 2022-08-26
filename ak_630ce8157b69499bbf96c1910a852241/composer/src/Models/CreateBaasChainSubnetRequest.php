<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models;

use AlibabaCloud\Tea\Model;

class CreateBaasChainSubnetRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 主链id
    /**
     * @var string
     */
    public $antChainId;

    // 子链名称
    /**
     * @var string
     */
    public $subnetName;

    // 节点的id
    /**
     * @var string
     */
    public $nodeId;

    // 联盟成员
    /**
     * @var string
     */
    public $consortiumMember;

    // 联盟id
    /**
     * @var string
     */
    public $consortiumId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'antChainId'        => 'ant_chain_id',
        'subnetName'        => 'subnet_name',
        'nodeId'            => 'node_id',
        'consortiumMember'  => 'consortium_member',
        'consortiumId'      => 'consortium_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->antChainId) {
            $res['ant_chain_id'] = $this->antChainId;
        }
        if (null !== $this->subnetName) {
            $res['subnet_name'] = $this->subnetName;
        }
        if (null !== $this->nodeId) {
            $res['node_id'] = $this->nodeId;
        }
        if (null !== $this->consortiumMember) {
            $res['consortium_member'] = $this->consortiumMember;
        }
        if (null !== $this->consortiumId) {
            $res['consortium_id'] = $this->consortiumId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateBaasChainSubnetRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['ant_chain_id'])) {
            $model->antChainId = $map['ant_chain_id'];
        }
        if (isset($map['subnet_name'])) {
            $model->subnetName = $map['subnet_name'];
        }
        if (isset($map['node_id'])) {
            $model->nodeId = $map['node_id'];
        }
        if (isset($map['consortium_member'])) {
            $model->consortiumMember = $map['consortium_member'];
        }
        if (isset($map['consortium_id'])) {
            $model->consortiumId = $map['consortium_id'];
        }

        return $model;
    }
}
