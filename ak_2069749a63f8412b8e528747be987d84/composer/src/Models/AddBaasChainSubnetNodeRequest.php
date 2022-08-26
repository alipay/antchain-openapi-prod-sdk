<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_2069749a63f8412b8e528747be987d84\Models;

use AlibabaCloud\Tea\Model;

class AddBaasChainSubnetNodeRequest extends Model
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

    // 子链节点
    /**
     * @var string
     */
    public $antChainId;

    // 联盟id
    /**
     * @var string
     */
    public $consortiumId;

    // 节点id
    /**
     * @var string
     */
    public $nodeId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'antChainId'        => 'ant_chain_id',
        'consortiumId'      => 'consortium_id',
        'nodeId'            => 'node_id',
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
        if (null !== $this->consortiumId) {
            $res['consortium_id'] = $this->consortiumId;
        }
        if (null !== $this->nodeId) {
            $res['node_id'] = $this->nodeId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddBaasChainSubnetNodeRequest
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
        if (isset($map['consortium_id'])) {
            $model->consortiumId = $map['consortium_id'];
        }
        if (isset($map['node_id'])) {
            $model->nodeId = $map['node_id'];
        }

        return $model;
    }
}
