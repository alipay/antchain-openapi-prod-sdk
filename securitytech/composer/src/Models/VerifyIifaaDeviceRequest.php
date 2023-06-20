<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class VerifyIifaaDeviceRequest extends Model
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

    // 待验证的数据
    /**
     * @var string
     */
    public $cipherText;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'cipherText'        => 'cipher_text',
    ];

    public function validate()
    {
        Model::validateRequired('cipherText', $this->cipherText, true);
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
        if (null !== $this->cipherText) {
            $res['cipher_text'] = $this->cipherText;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyIifaaDeviceRequest
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
        if (isset($map['cipher_text'])) {
            $model->cipherText = $map['cipher_text'];
        }

        return $model;
    }
}
