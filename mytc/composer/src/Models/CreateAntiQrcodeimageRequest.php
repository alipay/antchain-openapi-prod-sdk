<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYTC\Models;

use AlibabaCloud\Tea\Model;

class CreateAntiQrcodeimageRequest extends Model
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

    // 要生成图片二维码的字符串信息
    /**
     * @var string
     */
    public $qrCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'qrCode'            => 'qr_code',
    ];

    public function validate()
    {
        Model::validateRequired('qrCode', $this->qrCode, true);
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
        if (null !== $this->qrCode) {
            $res['qr_code'] = $this->qrCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAntiQrcodeimageRequest
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
        if (isset($map['qr_code'])) {
            $model->qrCode = $map['qr_code'];
        }

        return $model;
    }
}
