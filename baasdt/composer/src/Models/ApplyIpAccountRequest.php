<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ApplyIpAccountRequest extends Model
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

    // 基础参数
    /**
     * @var BaseRequestInfo
     */
    public $baseRequest;

    // 版权方的链上账户Id
    /**
     * @var string
     */
    public $accountId;

    // 支付宝的登陆用户名(必须实名制)
    /**
     * @var string
     */
    public $alipayLoginName;

    // 商户别名, 会展示在账单以及支付结果页中
    /**
     * @var string
     */
    public $merchantAliasName;

    // 商户类型(本期仅支持:  1:企业, 6:个人商户)
    /**
     * @var int
     */
    public $merchantType;

    // 商户证件类型(本期仅支持: 201: 营业执照, 100: 个人商户身份证)
    // 如果merchant_type为企业, 需要传入201; 如果merchant_type为个人, 需要传入100
    /**
     * @var int
     */
    public $merchantCertType;

    // 商户证件编号(企业提供营业执照),本期人工审核
    /**
     * @var string
     */
    public $merchantCertNumber;

    // 商户营业执照的图片地址,本期人工审核
    /**
     * @var string
     */
    public $merchantCertImage;

    // 税务登记证明的图片,本期人工审核
    /**
     * @var string
     */
    public $merchantSignImage;

    // 商户类别码mcc，参见https://gw.alipayobjects.com/os/bmw-prod/05c9a32e-42d1-436b-ace7-13101d91f672.xlsx
    /**
     * @var string
     */
    public $mcc;

    // 商户法人名称, merchant_type = 01时必填
    /**
     * @var string
     */
    public $legalName;

    // 商户法人身份证号码, merchant_type = 1时必填
    /**
     * @var string
     */
    public $legalCertNo;

    // 商户经营地址
    /**
     * @var IPAddressInfo
     */
    public $addressInfo;

    // 商户联系人信息
    /**
     * @var IPContactInfo
     */
    public $contactInfo;

    // 默认结算规则
    /**
     * @var IPSettleRule
     */
    public $settleRule;

    // 银行卡结算信息, 结算到银行卡时必填, 当前仅支持填入一张卡
    /**
     * @var IPCardInfo
     */
    public $cardInfo;

    // 备注信息
    /**
     * @var string
     */
    public $memo;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'baseRequest'        => 'base_request',
        'accountId'          => 'account_id',
        'alipayLoginName'    => 'alipay_login_name',
        'merchantAliasName'  => 'merchant_alias_name',
        'merchantType'       => 'merchant_type',
        'merchantCertType'   => 'merchant_cert_type',
        'merchantCertNumber' => 'merchant_cert_number',
        'merchantCertImage'  => 'merchant_cert_image',
        'merchantSignImage'  => 'merchant_sign_image',
        'mcc'                => 'mcc',
        'legalName'          => 'legal_name',
        'legalCertNo'        => 'legal_cert_no',
        'addressInfo'        => 'address_info',
        'contactInfo'        => 'contact_info',
        'settleRule'         => 'settle_rule',
        'cardInfo'           => 'card_info',
        'memo'               => 'memo',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('alipayLoginName', $this->alipayLoginName, true);
        Model::validateRequired('merchantAliasName', $this->merchantAliasName, true);
        Model::validateRequired('merchantType', $this->merchantType, true);
        Model::validateRequired('merchantCertType', $this->merchantCertType, true);
        Model::validateRequired('mcc', $this->mcc, true);
        Model::validateRequired('addressInfo', $this->addressInfo, true);
        Model::validateRequired('contactInfo', $this->contactInfo, true);
        Model::validateRequired('settleRule', $this->settleRule, true);
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
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->alipayLoginName) {
            $res['alipay_login_name'] = $this->alipayLoginName;
        }
        if (null !== $this->merchantAliasName) {
            $res['merchant_alias_name'] = $this->merchantAliasName;
        }
        if (null !== $this->merchantType) {
            $res['merchant_type'] = $this->merchantType;
        }
        if (null !== $this->merchantCertType) {
            $res['merchant_cert_type'] = $this->merchantCertType;
        }
        if (null !== $this->merchantCertNumber) {
            $res['merchant_cert_number'] = $this->merchantCertNumber;
        }
        if (null !== $this->merchantCertImage) {
            $res['merchant_cert_image'] = $this->merchantCertImage;
        }
        if (null !== $this->merchantSignImage) {
            $res['merchant_sign_image'] = $this->merchantSignImage;
        }
        if (null !== $this->mcc) {
            $res['mcc'] = $this->mcc;
        }
        if (null !== $this->legalName) {
            $res['legal_name'] = $this->legalName;
        }
        if (null !== $this->legalCertNo) {
            $res['legal_cert_no'] = $this->legalCertNo;
        }
        if (null !== $this->addressInfo) {
            $res['address_info'] = null !== $this->addressInfo ? $this->addressInfo->toMap() : null;
        }
        if (null !== $this->contactInfo) {
            $res['contact_info'] = null !== $this->contactInfo ? $this->contactInfo->toMap() : null;
        }
        if (null !== $this->settleRule) {
            $res['settle_rule'] = null !== $this->settleRule ? $this->settleRule->toMap() : null;
        }
        if (null !== $this->cardInfo) {
            $res['card_info'] = null !== $this->cardInfo ? $this->cardInfo->toMap() : null;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyIpAccountRequest
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
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequestInfo::fromMap($map['base_request']);
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['alipay_login_name'])) {
            $model->alipayLoginName = $map['alipay_login_name'];
        }
        if (isset($map['merchant_alias_name'])) {
            $model->merchantAliasName = $map['merchant_alias_name'];
        }
        if (isset($map['merchant_type'])) {
            $model->merchantType = $map['merchant_type'];
        }
        if (isset($map['merchant_cert_type'])) {
            $model->merchantCertType = $map['merchant_cert_type'];
        }
        if (isset($map['merchant_cert_number'])) {
            $model->merchantCertNumber = $map['merchant_cert_number'];
        }
        if (isset($map['merchant_cert_image'])) {
            $model->merchantCertImage = $map['merchant_cert_image'];
        }
        if (isset($map['merchant_sign_image'])) {
            $model->merchantSignImage = $map['merchant_sign_image'];
        }
        if (isset($map['mcc'])) {
            $model->mcc = $map['mcc'];
        }
        if (isset($map['legal_name'])) {
            $model->legalName = $map['legal_name'];
        }
        if (isset($map['legal_cert_no'])) {
            $model->legalCertNo = $map['legal_cert_no'];
        }
        if (isset($map['address_info'])) {
            $model->addressInfo = IPAddressInfo::fromMap($map['address_info']);
        }
        if (isset($map['contact_info'])) {
            $model->contactInfo = IPContactInfo::fromMap($map['contact_info']);
        }
        if (isset($map['settle_rule'])) {
            $model->settleRule = IPSettleRule::fromMap($map['settle_rule']);
        }
        if (isset($map['card_info'])) {
            $model->cardInfo = IPCardInfo::fromMap($map['card_info']);
        }
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }

        return $model;
    }
}
