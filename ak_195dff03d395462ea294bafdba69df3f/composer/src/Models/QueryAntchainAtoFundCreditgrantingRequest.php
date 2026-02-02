<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class QueryAntchainAtoFundCreditgrantingRequest extends Model
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

    // 授信id
    /**
     * @var string
     */
    public $grantingId;

    // 资方社会信用代码
    /**
     * @var string
     */
    public $fundId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'grantingId'        => 'granting_id',
        'fundId'            => 'fund_id',
    ];

    public function validate()
    {
        Model::validateRequired('grantingId', $this->grantingId, true);
        Model::validateRequired('fundId', $this->fundId, true);
        Model::validateMaxLength('grantingId', $this->grantingId, 50);
        Model::validateMaxLength('fundId', $this->fundId, 32);
        Model::validateMinLength('grantingId', $this->grantingId, 1);
        Model::validateMinLength('fundId', $this->fundId, 1);
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
        if (null !== $this->grantingId) {
            $res['granting_id'] = $this->grantingId;
        }
        if (null !== $this->fundId) {
            $res['fund_id'] = $this->fundId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntchainAtoFundCreditgrantingRequest
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
        if (isset($map['granting_id'])) {
            $model->grantingId = $map['granting_id'];
        }
        if (isset($map['fund_id'])) {
            $model->fundId = $map['fund_id'];
        }

        return $model;
    }
}
