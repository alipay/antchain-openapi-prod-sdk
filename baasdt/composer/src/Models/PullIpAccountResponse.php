<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class PullIpAccountResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

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

    // 商户类型(本期仅支持: 1:企业, 6:个人商户)
    /**
     * @var int
     */
    public $merchantType;

    // 商户证件类型(本期仅支持: 201: 营业执照, 100: 个人商户身份证) 如果merchant_type为企业, 需要传入201; 如果merchant_type为个人, 需要传入100
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

    // 默认结算规则
    /**
     * @var IPSettleRule
     */
    public $settleRule;

    // 商户联系人信息
    /**
     * @var IPContactInfo
     */
    public $contactInfo;

    // 银行卡结算信息, 结算到银行卡时必填, 当前仅支持填入一张卡
    /**
     * @var IPCardInfo
     */
    public $cardInfo;

    // 店铺名称
    /**
     * @var string
     */
    public $shopName;

    // 更多联系方式，用于运营联系商家
    /**
     * @var SimpleContactInfo[]
     */
    public $additionalContactInfo;

    // 创建账户时间
    /**
     * @var int
     */
    public $createTime;
    protected $_name = [
        'reqMsgId'              => 'req_msg_id',
        'resultCode'            => 'result_code',
        'resultMsg'             => 'result_msg',
        'alipayLoginName'       => 'alipay_login_name',
        'merchantAliasName'     => 'merchant_alias_name',
        'merchantType'          => 'merchant_type',
        'merchantCertType'      => 'merchant_cert_type',
        'merchantCertNumber'    => 'merchant_cert_number',
        'merchantCertImage'     => 'merchant_cert_image',
        'merchantSignImage'     => 'merchant_sign_image',
        'mcc'                   => 'mcc',
        'legalName'             => 'legal_name',
        'legalCertNo'           => 'legal_cert_no',
        'addressInfo'           => 'address_info',
        'settleRule'            => 'settle_rule',
        'contactInfo'           => 'contact_info',
        'cardInfo'              => 'card_info',
        'shopName'              => 'shop_name',
        'additionalContactInfo' => 'additional_contact_info',
        'createTime'            => 'create_time',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
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
        if (null !== $this->shopName) {
            $res['shop_name'] = $this->shopName;
        }
        if (null !== $this->additionalContactInfo) {
            $res['additional_contact_info'] = [];
            if (null !== $this->additionalContactInfo && \is_array($this->additionalContactInfo)) {
                $n = 0;
                foreach ($this->additionalContactInfo as $item) {
                    $res['additional_contact_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PullIpAccountResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
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
        if (isset($map['shop_name'])) {
            $model->shopName = $map['shop_name'];
        }
        if (isset($map['additional_contact_info'])) {
            if (!empty($map['additional_contact_info'])) {
                $model->additionalContactInfo = [];
                $n                            = 0;
                foreach ($map['additional_contact_info'] as $item) {
                    $model->additionalContactInfo[$n++] = null !== $item ? SimpleContactInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }

        return $model;
    }
}
