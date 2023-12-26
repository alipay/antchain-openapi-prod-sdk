<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class OpenChainServiceRequest extends Model
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

    // 2e7e22c42bb8419bbf99b7f56aa2f17f
    /**
     * @var string
     */
    public $antChainId;

    // 联盟id
    /**
     * @var string
     */
    public $consortiumId;

    // 内部产品code
    /**
     * @var string
     */
    public $productCode;

    // 自定义信息，json格式
    /**
     * @var string
     */
    public $extend;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'antChainId'        => 'ant_chain_id',
        'consortiumId'      => 'consortium_id',
        'productCode'       => 'product_code',
        'extend'            => 'extend',
    ];

    public function validate()
    {
        Model::validateRequired('antChainId', $this->antChainId, true);
        Model::validateRequired('consortiumId', $this->consortiumId, true);
        Model::validateRequired('productCode', $this->productCode, true);
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
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->extend) {
            $res['extend'] = $this->extend;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OpenChainServiceRequest
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
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['extend'])) {
            $model->extend = $map['extend'];
        }

        return $model;
    }
}
