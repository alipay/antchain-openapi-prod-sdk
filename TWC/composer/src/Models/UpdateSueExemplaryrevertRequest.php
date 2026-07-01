<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class UpdateSueExemplaryrevertRequest extends Model
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

    // 用户管理合约id
    /**
     * @var string
     */
    public $contractId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'contractId'        => 'contract_id',
    ];

    public function validate()
    {
        Model::validateRequired('contractId', $this->contractId, true);
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
        if (null !== $this->contractId) {
            $res['contract_id'] = $this->contractId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateSueExemplaryrevertRequest
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
        if (isset($map['contract_id'])) {
            $model->contractId = $map['contract_id'];
        }

        return $model;
    }
}
