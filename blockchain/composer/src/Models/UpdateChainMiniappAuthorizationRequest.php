<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class UpdateChainMiniappAuthorizationRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // ant_chain_id
    /**
     * @var string
     */
    public $antChainId;

    // q_r_code_type
    /**
     * @var string
     */
    public $qRCodeType;

    // authorization_type
    /**
     * @var string
     */
    public $authorizationType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'antChainId'        => 'ant_chain_id',
        'qRCodeType'        => 'q_r_code_type',
        'authorizationType' => 'authorization_type',
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
        if (null !== $this->qRCodeType) {
            $res['q_r_code_type'] = $this->qRCodeType;
        }
        if (null !== $this->authorizationType) {
            $res['authorization_type'] = $this->authorizationType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateChainMiniappAuthorizationRequest
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
        if (isset($map['q_r_code_type'])) {
            $model->qRCodeType = $map['q_r_code_type'];
        }
        if (isset($map['authorization_type'])) {
            $model->authorizationType = $map['authorization_type'];
        }

        return $model;
    }
}
