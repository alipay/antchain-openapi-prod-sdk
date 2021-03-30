<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CreateStandardAccountRequest extends Model
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

    // 账户的code
    /**
     * @var string
     */
    public $accountCode;

    // 账户的公钥
    /**
     * @var string
     */
    public $publicKey;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'accountCode'       => 'account_code',
        'publicKey'         => 'public_key',
    ];

    public function validate()
    {
        Model::validateRequired('accountCode', $this->accountCode, true);
        Model::validateRequired('publicKey', $this->publicKey, true);
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
        if (null !== $this->accountCode) {
            $res['account_code'] = $this->accountCode;
        }
        if (null !== $this->publicKey) {
            $res['public_key'] = $this->publicKey;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateStandardAccountRequest
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
        if (isset($map['account_code'])) {
            $model->accountCode = $map['account_code'];
        }
        if (isset($map['public_key'])) {
            $model->publicKey = $map['public_key'];
        }

        return $model;
    }
}
