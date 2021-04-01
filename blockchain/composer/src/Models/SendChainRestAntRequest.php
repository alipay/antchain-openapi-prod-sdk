<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class SendChainRestAntRequest extends Model
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

    // access_id
    /**
     * @var string
     */
    public $accessId;

    // ant_chain_id
    /**
     * @var string
     */
    public $antChainId;

    // consortium_id
    /**
     * @var string
     */
    public $consortiumId;

    // region_id
    /**
     * @var string
     */
    public $regionId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'accessId'          => 'access_id',
        'antChainId'        => 'ant_chain_id',
        'consortiumId'      => 'consortium_id',
        'regionId'          => 'region_id',
    ];

    public function validate()
    {
        Model::validateRequired('accessId', $this->accessId, true);
        Model::validateRequired('antChainId', $this->antChainId, true);
        Model::validateRequired('consortiumId', $this->consortiumId, true);
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
        if (null !== $this->accessId) {
            $res['access_id'] = $this->accessId;
        }
        if (null !== $this->antChainId) {
            $res['ant_chain_id'] = $this->antChainId;
        }
        if (null !== $this->consortiumId) {
            $res['consortium_id'] = $this->consortiumId;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendChainRestAntRequest
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
        if (isset($map['access_id'])) {
            $model->accessId = $map['access_id'];
        }
        if (isset($map['ant_chain_id'])) {
            $model->antChainId = $map['ant_chain_id'];
        }
        if (isset($map['consortium_id'])) {
            $model->consortiumId = $map['consortium_id'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }

        return $model;
    }
}
