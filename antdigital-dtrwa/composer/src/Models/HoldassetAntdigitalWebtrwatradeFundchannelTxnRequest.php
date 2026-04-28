<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTRWA\Models;

use AlibabaCloud\Tea\Model;

class HoldassetAntdigitalWebtrwatradeFundchannelTxnRequest extends Model
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

    // jetco生成的ID,由第一个指示代理分配的唯一标识，用于明确标识在整个银行间链中传递的、不变的交易
    /**
     * @var string
     */
    public $e2eId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'e2eId'             => 'e2e_id',
    ];

    public function validate()
    {
        Model::validateRequired('e2eId', $this->e2eId, true);
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
        if (null !== $this->e2eId) {
            $res['e2e_id'] = $this->e2eId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return HoldassetAntdigitalWebtrwatradeFundchannelTxnRequest
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
        if (isset($map['e2e_id'])) {
            $model->e2eId = $map['e2e_id'];
        }

        return $model;
    }
}
