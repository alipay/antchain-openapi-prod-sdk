<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CertifyTwcNotaryIdentificationFaceauthRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'authCode' => 'auth_code',
        'callbackUrl' => 'callback_url',
        'certifyId' => 'certify_id',
        'redirectUrl' => 'redirect_url',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->authCode) {
            $res['auth_code'] = $this->authCode;
        }
        if (null !== $this->callbackUrl) {
            $res['callback_url'] = $this->callbackUrl;
        }
        if (null !== $this->certifyId) {
            $res['certify_id'] = $this->certifyId;
        }
        if (null !== $this->redirectUrl) {
            $res['redirect_url'] = $this->redirectUrl;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CertifyTwcNotaryIdentificationFaceauthRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['auth_code'])){
            $model->authCode = $map['auth_code'];
        }
        if(isset($map['callback_url'])){
            $model->callbackUrl = $map['callback_url'];
        }
        if(isset($map['certify_id'])){
            $model->certifyId = $map['certify_id'];
        }
        if(isset($map['redirect_url'])){
            $model->redirectUrl = $map['redirect_url'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 授权码，针对某些特定场景使用，非必填
    /**
     * @var string
     */
    public $authCode;

    // 认证流程结束回调通知地址，非必传
    /**
     * @var string
     */
    public $callbackUrl;

    // 实人认证流程ID
    /**
     * @var string
     */
    public $certifyId;

    // 认证结束后跳转地址，非必填
    /**
     * @var string
     */
    public $redirectUrl;

}
