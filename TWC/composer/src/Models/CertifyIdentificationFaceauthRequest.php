<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CertifyIdentificationFaceauthRequest extends Model
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

    // 实人认证流程ID
    /**
     * @var string
     */
    public $certifyId;

    // 认证流程结束回调通知地址，非必传
    /**
     * @var string
     */
    public $callbackUrl;

    // 认证结束后跳转地址，非必填
    /**
     * @var string
     */
    public $redirectUrl;

    // 授权码，针对某些特定场景使用，非必填
    /**
     * @var string
     */
    public $authCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'certifyId'         => 'certify_id',
        'callbackUrl'       => 'callback_url',
        'redirectUrl'       => 'redirect_url',
        'authCode'          => 'auth_code',
    ];

    public function validate()
    {
        Model::validateRequired('certifyId', $this->certifyId, true);
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
        if (null !== $this->certifyId) {
            $res['certify_id'] = $this->certifyId;
        }
        if (null !== $this->callbackUrl) {
            $res['callback_url'] = $this->callbackUrl;
        }
        if (null !== $this->redirectUrl) {
            $res['redirect_url'] = $this->redirectUrl;
        }
        if (null !== $this->authCode) {
            $res['auth_code'] = $this->authCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CertifyIdentificationFaceauthRequest
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
        if (isset($map['certify_id'])) {
            $model->certifyId = $map['certify_id'];
        }
        if (isset($map['callback_url'])) {
            $model->callbackUrl = $map['callback_url'];
        }
        if (isset($map['redirect_url'])) {
            $model->redirectUrl = $map['redirect_url'];
        }
        if (isset($map['auth_code'])) {
            $model->authCode = $map['auth_code'];
        }

        return $model;
    }
}
