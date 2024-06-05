<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models;

use AlibabaCloud\Tea\Model;

class SignBlockchainBotDigitalkeyWithholdRequest extends Model
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

    // 个人签约产品码
    /**
     * @var string
     */
    public $personalProductCode;

    // 销售产品码
    /**
     * @var string
     */
    public $productCode;

    // 请按当前接入的方式进行填充，且输入值必须为文档中的参数取值范围。 扫码或者短信页面签约需要拼装http的请求地址访问中间页面，钱包h5页面签约可直接拼接scheme的请求地址
    /**
     * @var string
     */
    public $channel;

    // 支付宝App主动回跳商户App里指定的页面 http/https 路径。建议商户使用 https。
    /**
     * @var string
     */
    public $returnUrl;

    // 用户在商户网站的登录账号，用于在签约页面展示
    /**
     * @var string
     */
    public $externalLogonId;

    // 支付宝用户ID
    /**
     * @var string
     */
    public $alipayUserId;

    // 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）。 格式规则：支持大写小写字母和数字，最长32位。 商户系统按需自定义传入，如果同一用户在同一产品码、同一签约场景下，签订了多份代扣协议，那么需要指定并传入该值
    /**
     * @var string
     */
    public $signScene;

    // 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）。 格式规则：支持大写小写字母和数字，最长32位。 商户系统按需自定义传入，如果同一用户在同一产品码、同一签约场景下，签订了多份代扣协议，那么需要指定并传入该值
    /**
     * @var string
     */
    public $externalAgreementNo;

    // 当前用户签约请求的协议有效周期。 整形数字加上时间单位的协议有效期，从发起签约请求的时间开始算起。 目前支持的时间单位： 1. d：天 2. m：月 如果未传入，默认为长期有效。
    /**
     * @var string
     */
    public $signValidityPeriod;

    // 签约有效时间限制，单位是秒，有效范围是0-86400，商户传入此字段会用商户传入的值否则使用支付宝侧默认值，在有效时间外进行签约，会进行安全拦截；（备注：此字段适用于需要开通安全防控的商户，且依赖商户传入生成签约时的时间戳字段timestamp）
    /**
     * @var int
     */
    public $effectTime;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'personalProductCode' => 'personal_product_code',
        'productCode'         => 'product_code',
        'channel'             => 'channel',
        'returnUrl'           => 'return_url',
        'externalLogonId'     => 'external_logon_id',
        'alipayUserId'        => 'alipay_user_id',
        'signScene'           => 'sign_scene',
        'externalAgreementNo' => 'external_agreement_no',
        'signValidityPeriod'  => 'sign_validity_period',
        'effectTime'          => 'effect_time',
    ];

    public function validate()
    {
        Model::validateRequired('personalProductCode', $this->personalProductCode, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('channel', $this->channel, true);
        Model::validateRequired('returnUrl', $this->returnUrl, true);
        Model::validateRequired('externalLogonId', $this->externalLogonId, true);
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
        if (null !== $this->personalProductCode) {
            $res['personal_product_code'] = $this->personalProductCode;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }
        if (null !== $this->returnUrl) {
            $res['return_url'] = $this->returnUrl;
        }
        if (null !== $this->externalLogonId) {
            $res['external_logon_id'] = $this->externalLogonId;
        }
        if (null !== $this->alipayUserId) {
            $res['alipay_user_id'] = $this->alipayUserId;
        }
        if (null !== $this->signScene) {
            $res['sign_scene'] = $this->signScene;
        }
        if (null !== $this->externalAgreementNo) {
            $res['external_agreement_no'] = $this->externalAgreementNo;
        }
        if (null !== $this->signValidityPeriod) {
            $res['sign_validity_period'] = $this->signValidityPeriod;
        }
        if (null !== $this->effectTime) {
            $res['effect_time'] = $this->effectTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SignBlockchainBotDigitalkeyWithholdRequest
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
        if (isset($map['personal_product_code'])) {
            $model->personalProductCode = $map['personal_product_code'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['channel'])) {
            $model->channel = $map['channel'];
        }
        if (isset($map['return_url'])) {
            $model->returnUrl = $map['return_url'];
        }
        if (isset($map['external_logon_id'])) {
            $model->externalLogonId = $map['external_logon_id'];
        }
        if (isset($map['alipay_user_id'])) {
            $model->alipayUserId = $map['alipay_user_id'];
        }
        if (isset($map['sign_scene'])) {
            $model->signScene = $map['sign_scene'];
        }
        if (isset($map['external_agreement_no'])) {
            $model->externalAgreementNo = $map['external_agreement_no'];
        }
        if (isset($map['sign_validity_period'])) {
            $model->signValidityPeriod = $map['sign_validity_period'];
        }
        if (isset($map['effect_time'])) {
            $model->effectTime = $map['effect_time'];
        }

        return $model;
    }
}
