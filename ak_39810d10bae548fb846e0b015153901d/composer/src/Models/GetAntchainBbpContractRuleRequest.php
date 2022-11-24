<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_39810d10bae548fb846e0b015153901d\Models;

use AlibabaCloud\Tea\Model;

class GetAntchainBbpContractRuleRequest extends Model
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

    // 服务商code
    /**
     * @var string
     */
    public $supCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'supCode'           => 'sup_code',
    ];

    public function validate()
    {
        Model::validateRequired('supCode', $this->supCode, true);
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
        if (null !== $this->supCode) {
            $res['sup_code'] = $this->supCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAntchainBbpContractRuleRequest
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
        if (isset($map['sup_code'])) {
            $model->supCode = $map['sup_code'];
        }

        return $model;
    }
}
