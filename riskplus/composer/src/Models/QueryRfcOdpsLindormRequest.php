<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryRfcOdpsLindormRequest extends Model
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

    // 服务编码
    /**
     * @var string
     */
    public $bizCode;

    // 加密后的唯一id
    /**
     * @var string
     */
    public $keyId;

    // 渠道code
    /**
     * @var string
     */
    public $channelCode;

    // 授权码
    /**
     * @var string
     */
    public $authCode;

    // 加密方式
    /**
     * @var string
     */
    public $encryptType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizCode'           => 'biz_code',
        'keyId'             => 'key_id',
        'channelCode'       => 'channel_code',
        'authCode'          => 'auth_code',
        'encryptType'       => 'encrypt_type',
    ];

    public function validate()
    {
        Model::validateRequired('bizCode', $this->bizCode, true);
        Model::validateRequired('keyId', $this->keyId, true);
        Model::validateRequired('channelCode', $this->channelCode, true);
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
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }
        if (null !== $this->keyId) {
            $res['key_id'] = $this->keyId;
        }
        if (null !== $this->channelCode) {
            $res['channel_code'] = $this->channelCode;
        }
        if (null !== $this->authCode) {
            $res['auth_code'] = $this->authCode;
        }
        if (null !== $this->encryptType) {
            $res['encrypt_type'] = $this->encryptType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRfcOdpsLindormRequest
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
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }
        if (isset($map['key_id'])) {
            $model->keyId = $map['key_id'];
        }
        if (isset($map['channel_code'])) {
            $model->channelCode = $map['channel_code'];
        }
        if (isset($map['auth_code'])) {
            $model->authCode = $map['auth_code'];
        }
        if (isset($map['encrypt_type'])) {
            $model->encryptType = $map['encrypt_type'];
        }

        return $model;
    }
}
