<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SubmitAcctSignflowRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId' => 'order_id',
        'userIdType' => 'user_id_type',
        'userIdNumber' => 'user_id_number',
        'userName' => 'user_name',
        'userMobile' => 'user_mobile',
        'businessScene' => 'business_scene',
        'signedRedirectUrl' => 'signed_redirect_url',
        'templateList' => 'template_list',
        'merchantName' => 'merchant_name',
        'merchantTag' => 'merchant_tag',
        'merchantIdType' => 'merchant_id_type',
        'merchantIdNumber' => 'merchant_id_number',
        'merchantLegalName' => 'merchant_legal_name',
        'merchantLegalIdNumber' => 'merchant_legal_id_number',
        'merchantLegalMobile' => 'merchant_legal_mobile',
        'sealType' => 'seal_type',
    ];
    public function validate() {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('businessScene', $this->businessScene, true);
        Model::validateRequired('templateList', $this->templateList, true);
        Model::validateRequired('merchantName', $this->merchantName, true);
        Model::validateRequired('merchantIdType', $this->merchantIdType, true);
        Model::validateRequired('merchantIdNumber', $this->merchantIdNumber, true);
    }
    public function toMap() {
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
        if (null !== $this->businessScene) {
            $res['business_scene'] = $this->businessScene;
        }
        if (null !== $this->signedRedirectUrl) {
            $res['signed_redirect_url'] = $this->signedRedirectUrl;
        }
        if (null !== $this->templateList) {
            $res['template_list'] = $this->templateList;
        }
        if (null !== $this->merchantName) {
            $res['merchant_name'] = $this->merchantName;
        }
        if (null !== $this->merchantTag) {
            $res['merchant_tag'] = $this->merchantTag;
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
        if (null !== $this->merchantLegalMobile) {
            $res['merchant_legal_mobile'] = $this->merchantLegalMobile;
        }
        if (null !== $this->sealType) {
            $res['seal_type'] = $this->sealType;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SubmitAcctSignflowRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['order_id'])){
            $model->orderId = $map['order_id'];
        }
        if(isset($map['user_id_type'])){
            $model->userIdType = $map['user_id_type'];
        }
        if(isset($map['user_id_number'])){
            $model->userIdNumber = $map['user_id_number'];
        }
        if(isset($map['user_name'])){
            $model->userName = $map['user_name'];
        }
        if(isset($map['user_mobile'])){
            $model->userMobile = $map['user_mobile'];
        }
        if(isset($map['business_scene'])){
            $model->businessScene = $map['business_scene'];
        }
        if(isset($map['signed_redirect_url'])){
            $model->signedRedirectUrl = $map['signed_redirect_url'];
        }
        if(isset($map['template_list'])){
            $model->templateList = $map['template_list'];
        }
        if(isset($map['merchant_name'])){
            $model->merchantName = $map['merchant_name'];
        }
        if(isset($map['merchant_tag'])){
            $model->merchantTag = $map['merchant_tag'];
        }
        if(isset($map['merchant_id_type'])){
            $model->merchantIdType = $map['merchant_id_type'];
        }
        if(isset($map['merchant_id_number'])){
            $model->merchantIdNumber = $map['merchant_id_number'];
        }
        if(isset($map['merchant_legal_name'])){
            $model->merchantLegalName = $map['merchant_legal_name'];
        }
        if(isset($map['merchant_legal_id_number'])){
            $model->merchantLegalIdNumber = $map['merchant_legal_id_number'];
        }
        if(isset($map['merchant_legal_mobile'])){
            $model->merchantLegalMobile = $map['merchant_legal_mobile'];
        }
        if(isset($map['seal_type'])){
            $model->sealType = $map['seal_type'];
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

    // 订单号
    /**
     * @var string
     */
    public $orderId;

    // CRED_PSN_CH_IDCARD大陆身份证
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
    /**
     * @var string
     */
    public $userName;

    // 用户手机号，可不传；传的话需要采用RSA加密传输
    /**
     * @var string
     */
    public $userMobile;

    // 业务场景，电子合同签署协议的时候的标题
    /**
     * @var string
     */
    public $businessScene;

    // 签署完成跳转链接
    /**
     * @var string
     */
    public $signedRedirectUrl;

    // 签署的电子合同模板信息，JSONArray格式，可以传入多个templateId和templateArgs。注意templateArgs的格式为key-value，其中key为模板文件中表单域的名称，value为需要填充的值。
    /**
     * @var string
     */
    public $templateList;

    // 公司名称
    /**
     * @var string
     */
    public $merchantName;

    // 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
    /**
     * @var string
     */
    public $merchantTag;

    // CRED_ORG_USCC：统一社会信用代码
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
    /**
     * @var string
     */
    public $merchantLegalName;

    // 法人证件号，需要采用RSA加密传输
    /**
     * @var string
     */
    public $merchantLegalIdNumber;

    // 法人手机号，需RSA加密
    /**
     * @var string
     */
    public $merchantLegalMobile;

    // 0-手绘签名 1-模板印章签名 多种类型时逗号分割，为空不限制
    /**
     * @var string
     */
    public $sealType;

}
