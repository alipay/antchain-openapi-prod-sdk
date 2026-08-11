<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AGORAX\Models;

use AlibabaCloud\Tea\Model;

class SignAgreementAppRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'privacyAgreementNo' => 'privacy_agreement_no',
        'userAgreementNo' => 'user_agreement_no',
        'openId' => 'open_id',
        'signTime' => 'sign_time',
    ];
    public function validate() {
        Model::validateRequired('openId', $this->openId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->privacyAgreementNo) {
            $res['privacy_agreement_no'] = $this->privacyAgreementNo;
        }
        if (null !== $this->userAgreementNo) {
            $res['user_agreement_no'] = $this->userAgreementNo;
        }
        if (null !== $this->openId) {
            $res['open_id'] = $this->openId;
        }
        if (null !== $this->signTime) {
            $res['sign_time'] = $this->signTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SignAgreementAppRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['privacy_agreement_no'])){
            $model->privacyAgreementNo = $map['privacy_agreement_no'];
        }
        if(isset($map['user_agreement_no'])){
            $model->userAgreementNo = $map['user_agreement_no'];
        }
        if(isset($map['open_id'])){
            $model->openId = $map['open_id'];
        }
        if(isset($map['sign_time'])){
            $model->signTime = $map['sign_time'];
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

    // 隐私协议号
    /**
     * @var string
     */
    public $privacyAgreementNo;

    // 用户协议号
    /**
     * @var string
     */
    public $userAgreementNo;

    // 小程序用户openId
    /**
     * @var string
     */
    public $openId;

    // 签署时间
    /**
     * @var string
     */
    public $signTime;

}
