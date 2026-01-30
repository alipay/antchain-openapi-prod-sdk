<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models;

use AlibabaCloud\Tea\Model;

class QueryAntdigitalWebtrwatradeDistributorCrosschainaccountRequest extends Model
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

    // 对侧链用户地址
    /**
     * @var string
     */
    public $targetUserAddress;

    // 目标链
    /**
     * @var string
     */
    public $tagetChainType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'targetUserAddress' => 'target_user_address',
        'tagetChainType'    => 'taget_chain_type',
    ];

    public function validate()
    {
        Model::validateRequired('targetUserAddress', $this->targetUserAddress, true);
        Model::validateRequired('tagetChainType', $this->tagetChainType, true);
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
        if (null !== $this->targetUserAddress) {
            $res['target_user_address'] = $this->targetUserAddress;
        }
        if (null !== $this->tagetChainType) {
            $res['taget_chain_type'] = $this->tagetChainType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntdigitalWebtrwatradeDistributorCrosschainaccountRequest
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
        if (isset($map['target_user_address'])) {
            $model->targetUserAddress = $map['target_user_address'];
        }
        if (isset($map['taget_chain_type'])) {
            $model->tagetChainType = $map['taget_chain_type'];
        }

        return $model;
    }
}
