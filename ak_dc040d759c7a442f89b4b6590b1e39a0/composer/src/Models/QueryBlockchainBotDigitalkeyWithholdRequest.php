<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models;

use AlibabaCloud\Tea\Model;

class QueryBlockchainBotDigitalkeyWithholdRequest extends Model
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

    // 用户的支付宝账号对应的支付宝唯一用户号，以 2088 开头的 16 位纯数字组成。
    /**
     * @var string
     */
    public $alipayUserId;

    // 协议产品码，商户和支付宝签约时确定，不同业务场景对应不同的签约产品码，解约时传入签约时的产品码，销售产品码，商户代扣场景固定为 GENERAL_WITHHOLDING_P。
    /**
     * @var string
     */
    public $personalProductCode;

    // 签约协议场景，商户和支付宝签约时确定，解约时，传入签约指定的场景信息。
    /**
     * @var string
     */
    public $signScene;

    // 代扣协议中标示用户的唯一签约号(确保在商户系统中唯一)，传入签约时传入的签约号。
    /**
     * @var string
     */
    public $externalAgreementNo;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'alipayUserId'        => 'alipay_user_id',
        'personalProductCode' => 'personal_product_code',
        'signScene'           => 'sign_scene',
        'externalAgreementNo' => 'external_agreement_no',
    ];

    public function validate()
    {
        Model::validateRequired('alipayUserId', $this->alipayUserId, true);
        Model::validateRequired('personalProductCode', $this->personalProductCode, true);
        Model::validateRequired('signScene', $this->signScene, true);
        Model::validateRequired('externalAgreementNo', $this->externalAgreementNo, true);
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
        if (null !== $this->alipayUserId) {
            $res['alipay_user_id'] = $this->alipayUserId;
        }
        if (null !== $this->personalProductCode) {
            $res['personal_product_code'] = $this->personalProductCode;
        }
        if (null !== $this->signScene) {
            $res['sign_scene'] = $this->signScene;
        }
        if (null !== $this->externalAgreementNo) {
            $res['external_agreement_no'] = $this->externalAgreementNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBlockchainBotDigitalkeyWithholdRequest
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
        if (isset($map['alipay_user_id'])) {
            $model->alipayUserId = $map['alipay_user_id'];
        }
        if (isset($map['personal_product_code'])) {
            $model->personalProductCode = $map['personal_product_code'];
        }
        if (isset($map['sign_scene'])) {
            $model->signScene = $map['sign_scene'];
        }
        if (isset($map['external_agreement_no'])) {
            $model->externalAgreementNo = $map['external_agreement_no'];
        }

        return $model;
    }
}
