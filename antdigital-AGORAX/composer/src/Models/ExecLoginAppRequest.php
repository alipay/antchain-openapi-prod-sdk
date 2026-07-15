<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AGORAX\Models;

use AlibabaCloud\Tea\Model;

class ExecLoginAppRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'authCode' => 'auth_code',
        'privacyAgreementSigned' => 'privacy_agreement_signed',
    ];
    public function validate() {
        Model::validateRequired('authCode', $this->authCode, true);
        Model::validateRequired('privacyAgreementSigned', $this->privacyAgreementSigned, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->authCode) {
            $res['auth_code'] = $this->authCode;
        }
        if (null !== $this->privacyAgreementSigned) {
            $res['privacy_agreement_signed'] = $this->privacyAgreementSigned;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecLoginAppRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['auth_code'])){
            $model->authCode = $map['auth_code'];
        }
        if(isset($map['privacy_agreement_signed'])){
            $model->privacyAgreementSigned = $map['privacy_agreement_signed'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 支付宝小程序本次取得的一次性授权码
    /**
     * @var string
     */
    public $authCode;

    // 用户是否已签署隐私协议
    /**
     * @var bool
     */
    public $privacyAgreementSigned;

}
