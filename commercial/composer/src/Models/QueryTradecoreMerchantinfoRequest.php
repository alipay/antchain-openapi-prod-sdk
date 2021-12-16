<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class QueryTradecoreMerchantinfoRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 商业中台唯一标识商户的id
    /**
     * @var string
     */
    public $merchantId;
    protected $_name = [
        'authToken'  => 'auth_token',
        'merchantId' => 'merchant_id',
    ];

    public function validate()
    {
        Model::validateRequired('merchantId', $this->merchantId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTradecoreMerchantinfoRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }

        return $model;
    }
}
