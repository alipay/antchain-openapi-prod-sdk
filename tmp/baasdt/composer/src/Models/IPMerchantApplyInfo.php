<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IPMerchantApplyInfo extends Model
{
    // 链上账户Id
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb16
     *
     * @var string
     */
    public $accountId;

    // 支付宝的登陆用户名(必须实名制)
    /**
     * @example 2088201963199815
     *
     * @var string
     */
    public $alipayLoginName;

    // 商户别名, 会展示在账单以及支付结果页中
    /**
     * @example 支付宝中国
     *
     * @var string
     */
    public $merchantAliasName;

    // 商户类型(本期仅支持: 1:企业, 6:个人商户)
    /**
     * @example 1
     *
     * @var int
     */
    public $merchantType;

    // 商户证件类型(本期仅支持: 201: 营业执照, 100: 个人商户身份证) 如果merchant_type为企业, 需要传入201; 如果merchant_type为个人, 需要传入100
    /**
     * @example 201
     *
     * @var int
     */
    public $merchantCertType;

    // 商户证件编号(企业提供营业执照),本期人工审核
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb16
     *
     * @var string
     */
    public $merchantCertNumber;

    // 商户营业执照的图片地址,本期人工审核
    /**
     * @example oss://381055Afc982d96fAB65.jpg
     *
     * @var string
     */
    public $merchantCertImage;

    // 税务登记证明的图片,本期人工审核
    /**
     * @example oss://381055Afc982d96fAB65,jpg
     *
     * @var string
     */
    public $merchantSignImage;

    // 商户类别码mcc，参见https://gw.alipayobjects.com/os/bmw-prod/05c9a32e-42d1-436b-ace7-13101d91f672.xlsx
    /**
     * @example 8351
     *
     * @var string
     */
    public $mcc;

    // 商户法人名称, merchant_type = 01时必填
    //
    /**
     * @example 马老师
     *
     * @var string
     */
    public $legalName;

    // 商户法人身份证号码, merchant_type = 1时必填
    //
    /**
     * @example 100100198811110001
     *
     * @var string
     */
    public $legalCertNo;

    // 商户经营地址
    //
    /**
     * @example
     *
     * @var IPAddressInfo
     */
    public $addressInfo;

    // 默认结算规则
    //
    /**
     * @example
     *
     * @var IPSettleRule
     */
    public $settleRule;

    // 商户联系人信息
    //
    /**
     * @example
     *
     * @var IPContactInfo
     */
    public $contactInfo;

    // 银行卡结算信息, 结算到银行卡时必填, 当前仅支持填入一张卡
    //
    /**
     * @example
     *
     * @var IPCardInfo
     */
    public $cardInfo;
    protected $_name = [
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
        'settleRule'         => 'settle_rule',
        'contactInfo'        => 'contact_info',
        'cardInfo'           => 'card_info',
    ];

    public function validate()
    {
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('alipayLoginName', $this->alipayLoginName, true);
        Model::validateRequired('merchantAliasName', $this->merchantAliasName, true);
        Model::validateRequired('merchantType', $this->merchantType, true);
        Model::validateRequired('merchantCertType', $this->merchantCertType, true);
        Model::validateRequired('merchantCertNumber', $this->merchantCertNumber, true);
        Model::validateRequired('merchantCertImage', $this->merchantCertImage, true);
        Model::validateRequired('merchantSignImage', $this->merchantSignImage, true);
        Model::validateRequired('mcc', $this->mcc, true);
        Model::validateRequired('legalName', $this->legalName, true);
        Model::validateRequired('legalCertNo', $this->legalCertNo, true);
        Model::validateRequired('addressInfo', $this->addressInfo, true);
        Model::validateRequired('settleRule', $this->settleRule, true);
        Model::validateRequired('contactInfo', $this->contactInfo, true);
        Model::validateRequired('cardInfo', $this->cardInfo, true);
    }

    public function toMap()
    {
        $res = [];
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
        if (null !== $this->settleRule) {
            $res['settle_rule'] = null !== $this->settleRule ? $this->settleRule->toMap() : null;
        }
        if (null !== $this->contactInfo) {
            $res['contact_info'] = null !== $this->contactInfo ? $this->contactInfo->toMap() : null;
        }
        if (null !== $this->cardInfo) {
            $res['card_info'] = null !== $this->cardInfo ? $this->cardInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IPMerchantApplyInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
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
        if (isset($map['settle_rule'])) {
            $model->settleRule = IPSettleRule::fromMap($map['settle_rule']);
        }
        if (isset($map['contact_info'])) {
            $model->contactInfo = IPContactInfo::fromMap($map['contact_info']);
        }
        if (isset($map['card_info'])) {
            $model->cardInfo = IPCardInfo::fromMap($map['card_info']);
        }

        return $model;
    }
}
