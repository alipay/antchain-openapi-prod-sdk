<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models;

use AlibabaCloud\Tea\Model;

class AddBaasChainSubnetMemberRequest extends Model
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

    // 子链id
    /**
     * @var string
     */
    public $antChainId;

    // 联盟id
    /**
     * @var string
     */
    public $consortiumId;

    // 联盟成员id
    /**
     * @var string
     */
    public $consortiumMemberId;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'antChainId'         => 'ant_chain_id',
        'consortiumId'       => 'consortium_id',
        'consortiumMemberId' => 'consortium_member_id',
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
        if (null !== $this->consortiumMemberId) {
            $res['consortium_member_id'] = $this->consortiumMemberId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddBaasChainSubnetMemberRequest
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
        if (isset($map['consortium_member_id'])) {
            $model->consortiumMemberId = $map['consortium_member_id'];
        }

        return $model;
    }
}
