<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class SubmitAntchainAtoFrontSignRequest extends Model
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

    // 商户的订单号
    /**
     * @var string
     */
    public $orderId;

    // CRED_PSN_CH_IDCARD： 大陆身份证
    // CRED_PSN_CH_TWCARD：台湾来往大陆通行证
    // CRED_PSN_CH_MACAO"：澳门来往大陆通行证
    // CRED_PSN_CH_HONGKONG：香港来往大陆通行证
    // CRED_PSN_PASSPORT：护照
    /**
     * @var string
     */
    public $userIdType;

    // 用户证件号，需要采用RSA加密传输
    /**
     * @var string
     */
    public $userIdNumber;

    // 姓名，需要采用RSA加密传输
    //
    /**
     * @var string
     */
    public $userName;

    // 用户手机号，可不传；传的话需要采用RSA加密传输
    //
    /**
     * @var string
     */
    public $userMobile;

    // 用户的电子邮箱，可不传；传的话需要采用RSA加密传输
    //
    /**
     * @var string
     */
    public $userEmail;

    // 签署有效期，时间戳，例如：new Date().getTime()
    /**
     * @var string
     */
    public $signValidity;

    // 1-短信；2-邮件
    /**
     * @var string
     */
    public $flowNotifyType;

    // 业务场景，电子合同签署协议的时候的标题
    //
    /**
     * @var string
     */
    public $businessScene;

    // 签署完成跳转链接
    //
    /**
     * @var string
     */
    public $signedRedirectUrl;

    // 签署的电子合同模板信息，List<Object>的JSON格式，Object如下： { templateId:__, // String格式 templateArgs: { "模板参数key":"模板参数值", // 必须为String } }
    /**
     * @var string
     */
    public $templateList;

    // 用户的支付宝uid
    /**
     * @var string
     */
    public $alipayUserId;

    // 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
    /**
     * @var string
     */
    public $merchantName;

    // 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
    /**
     * @var string
     */
    public $merchantTag;

    // 电子合同签署顺序，如果只有1方企业签署，传入1即可。如果是多方，并且需要设置签署顺序，则需要将这个值以及thirdSigner中的signOrder做一个签署顺序。
    /**
     * @var int
     */
    public $merchantSignOrder;

    // 商户需要盖的印章ID
    /**
     * @var string
     */
    public $merchantSealId;

    // CRED_ORG_USCC：统一社会信用代码，
    // CRED_ORG_REGCODE：工商注册号，
    // 只支持这两个值
    /**
     * @var string
     */
    public $merchantIdType;

    // 商户证件号，需要采用RSA加密传输
    /**
     * @var string
     */
    public $merchantIdNumber;

    // 法人姓名，需要RSA加密传输
    //
    /**
     * @var string
     */
    public $merchantLegalName;

    // 法人证件号，需要采用RSA加密传输
    //
    /**
     * @var string
     */
    public $merchantLegalIdNumber;

    // 多方签署的其他参与方的签署信息，json的array格式，参考：[{"tag":"zf_a","orgName":"上海网络科技有限公司","orgIdType":"CRED_ORG_REGCODE","orgIdNumber":"12098760923","orgLegalName":"王大浪","orgLegalIdNumber":"107120196708289012","sealIds":["12b2317-0000-3333-2222-ec087dc97d8b"]}]，其中：orgIdNumber、orgLegalName、orgLegalIdNumber需要加密传输。
    /**
     * @var string
     */
    public $thirdSigner;

    // 用户在支付宝开放平台下应用的 open_id
    /**
     * @var string
     */
    public $alipayOpenId;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'orderId'               => 'order_id',
        'userIdType'            => 'user_id_type',
        'userIdNumber'          => 'user_id_number',
        'userName'              => 'user_name',
        'userMobile'            => 'user_mobile',
        'userEmail'             => 'user_email',
        'signValidity'          => 'sign_validity',
        'flowNotifyType'        => 'flow_notify_type',
        'businessScene'         => 'business_scene',
        'signedRedirectUrl'     => 'signed_redirect_url',
        'templateList'          => 'template_list',
        'alipayUserId'          => 'alipay_user_id',
        'merchantName'          => 'merchant_name',
        'merchantTag'           => 'merchant_tag',
        'merchantSignOrder'     => 'merchant_sign_order',
        'merchantSealId'        => 'merchant_seal_id',
        'merchantIdType'        => 'merchant_id_type',
        'merchantIdNumber'      => 'merchant_id_number',
        'merchantLegalName'     => 'merchant_legal_name',
        'merchantLegalIdNumber' => 'merchant_legal_id_number',
        'thirdSigner'           => 'third_signer',
        'alipayOpenId'          => 'alipay_open_id',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('userIdType', $this->userIdType, true);
        Model::validateRequired('userIdNumber', $this->userIdNumber, true);
        Model::validateRequired('userName', $this->userName, true);
        Model::validateRequired('businessScene', $this->businessScene, true);
        Model::validateRequired('templateList', $this->templateList, true);
        Model::validateRequired('merchantName', $this->merchantName, true);
        Model::validateRequired('merchantIdType', $this->merchantIdType, true);
        Model::validateRequired('merchantIdNumber', $this->merchantIdNumber, true);
        Model::validateMaxLength('orderId', $this->orderId, 64);
        Model::validateMaxLength('userIdType', $this->userIdType, 40);
        Model::validateMaxLength('businessScene', $this->businessScene, 200);
        Model::validateMaxLength('alipayUserId', $this->alipayUserId, 24);
        Model::validateMaxLength('merchantTag', $this->merchantTag, 32);
        Model::validateMaxLength('merchantIdType', $this->merchantIdType, 32);
        Model::validateMaxLength('alipayOpenId', $this->alipayOpenId, 64);
        Model::validateMinLength('orderId', $this->orderId, 4);
        Model::validateMinLength('userIdType', $this->userIdType, 4);
        Model::validateMinLength('businessScene', $this->businessScene, 2);
        Model::validateMinLength('alipayUserId', $this->alipayUserId, 4);
        Model::validateMinLength('merchantTag', $this->merchantTag, 2);
        Model::validateMinLength('merchantIdType', $this->merchantIdType, 4);
        Model::validateMinLength('alipayOpenId', $this->alipayOpenId, 16);
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
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->userIdType) {
            $res['user_id_type'] = $this->userIdType;
        }
        if (null !== $this->userIdNumber) {
            $res['user_id_number'] = $this->userIdNumber;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->userMobile) {
            $res['user_mobile'] = $this->userMobile;
        }
        if (null !== $this->userEmail) {
            $res['user_email'] = $this->userEmail;
        }
        if (null !== $this->signValidity) {
            $res['sign_validity'] = $this->signValidity;
        }
        if (null !== $this->flowNotifyType) {
            $res['flow_notify_type'] = $this->flowNotifyType;
        }
        if (null !== $this->businessScene) {
            $res['business_scene'] = $this->businessScene;
        }
        if (null !== $this->signedRedirectUrl) {
            $res['signed_redirect_url'] = $this->signedRedirectUrl;
        }
        if (null !== $this->templateList) {
            $res['template_list'] = $this->templateList;
        }
        if (null !== $this->alipayUserId) {
            $res['alipay_user_id'] = $this->alipayUserId;
        }
        if (null !== $this->merchantName) {
            $res['merchant_name'] = $this->merchantName;
        }
        if (null !== $this->merchantTag) {
            $res['merchant_tag'] = $this->merchantTag;
        }
        if (null !== $this->merchantSignOrder) {
            $res['merchant_sign_order'] = $this->merchantSignOrder;
        }
        if (null !== $this->merchantSealId) {
            $res['merchant_seal_id'] = $this->merchantSealId;
        }
        if (null !== $this->merchantIdType) {
            $res['merchant_id_type'] = $this->merchantIdType;
        }
        if (null !== $this->merchantIdNumber) {
            $res['merchant_id_number'] = $this->merchantIdNumber;
        }
        if (null !== $this->merchantLegalName) {
            $res['merchant_legal_name'] = $this->merchantLegalName;
        }
        if (null !== $this->merchantLegalIdNumber) {
            $res['merchant_legal_id_number'] = $this->merchantLegalIdNumber;
        }
        if (null !== $this->thirdSigner) {
            $res['third_signer'] = $this->thirdSigner;
        }
        if (null !== $this->alipayOpenId) {
            $res['alipay_open_id'] = $this->alipayOpenId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitAntchainAtoFrontSignRequest
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
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['user_id_type'])) {
            $model->userIdType = $map['user_id_type'];
        }
        if (isset($map['user_id_number'])) {
            $model->userIdNumber = $map['user_id_number'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['user_mobile'])) {
            $model->userMobile = $map['user_mobile'];
        }
        if (isset($map['user_email'])) {
            $model->userEmail = $map['user_email'];
        }
        if (isset($map['sign_validity'])) {
            $model->signValidity = $map['sign_validity'];
        }
        if (isset($map['flow_notify_type'])) {
            $model->flowNotifyType = $map['flow_notify_type'];
        }
        if (isset($map['business_scene'])) {
            $model->businessScene = $map['business_scene'];
        }
        if (isset($map['signed_redirect_url'])) {
            $model->signedRedirectUrl = $map['signed_redirect_url'];
        }
        if (isset($map['template_list'])) {
            $model->templateList = $map['template_list'];
        }
        if (isset($map['alipay_user_id'])) {
            $model->alipayUserId = $map['alipay_user_id'];
        }
        if (isset($map['merchant_name'])) {
            $model->merchantName = $map['merchant_name'];
        }
        if (isset($map['merchant_tag'])) {
            $model->merchantTag = $map['merchant_tag'];
        }
        if (isset($map['merchant_sign_order'])) {
            $model->merchantSignOrder = $map['merchant_sign_order'];
        }
        if (isset($map['merchant_seal_id'])) {
            $model->merchantSealId = $map['merchant_seal_id'];
        }
        if (isset($map['merchant_id_type'])) {
            $model->merchantIdType = $map['merchant_id_type'];
        }
        if (isset($map['merchant_id_number'])) {
            $model->merchantIdNumber = $map['merchant_id_number'];
        }
        if (isset($map['merchant_legal_name'])) {
            $model->merchantLegalName = $map['merchant_legal_name'];
        }
        if (isset($map['merchant_legal_id_number'])) {
            $model->merchantLegalIdNumber = $map['merchant_legal_id_number'];
        }
        if (isset($map['third_signer'])) {
            $model->thirdSigner = $map['third_signer'];
        }
        if (isset($map['alipay_open_id'])) {
            $model->alipayOpenId = $map['alipay_open_id'];
        }

        return $model;
    }
}
