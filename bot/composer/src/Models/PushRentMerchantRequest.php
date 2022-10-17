<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class PushRentMerchantRequest extends Model
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

    // 企业法人名称(个人可空)
    /**
     * @var string
     */
    public $legalPersonName;

    // 企业法人证件号(个人可空)
    /**
     * @var string
     */
    public $legalPersionIdcard;

    // 企业名称(个人名称)
    /**
     * @var string
     */
    public $merchantName;

    // 企业社会信用代码(个人身份证)
    /**
     * @var string
     */
    public $merchantCreditNo;

    // 支付宝监管户账号
    /**
     * @var string
     */
    public $alipayAccount;

    // 个人或企业
    // 个人：P
    // 企业：E
    /**
     * @var string
     */
    public $merchantType;

    // 企业联系人
    /**
     * @var string
     */
    public $contacts;

    // 企业位置
    /**
     * @var string
     */
    public $addr;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'legalPersonName'    => 'legal_person_name',
        'legalPersionIdcard' => 'legal_persion_idcard',
        'merchantName'       => 'merchant_name',
        'merchantCreditNo'   => 'merchant_credit_no',
        'alipayAccount'      => 'alipay_account',
        'merchantType'       => 'merchant_type',
        'contacts'           => 'contacts',
        'addr'               => 'addr',
    ];

    public function validate()
    {
        Model::validateRequired('merchantName', $this->merchantName, true);
        Model::validateRequired('merchantCreditNo', $this->merchantCreditNo, true);
        Model::validateRequired('merchantType', $this->merchantType, true);
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
        if (null !== $this->legalPersonName) {
            $res['legal_person_name'] = $this->legalPersonName;
        }
        if (null !== $this->legalPersionIdcard) {
            $res['legal_persion_idcard'] = $this->legalPersionIdcard;
        }
        if (null !== $this->merchantName) {
            $res['merchant_name'] = $this->merchantName;
        }
        if (null !== $this->merchantCreditNo) {
            $res['merchant_credit_no'] = $this->merchantCreditNo;
        }
        if (null !== $this->alipayAccount) {
            $res['alipay_account'] = $this->alipayAccount;
        }
        if (null !== $this->merchantType) {
            $res['merchant_type'] = $this->merchantType;
        }
        if (null !== $this->contacts) {
            $res['contacts'] = $this->contacts;
        }
        if (null !== $this->addr) {
            $res['addr'] = $this->addr;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushRentMerchantRequest
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
        if (isset($map['legal_person_name'])) {
            $model->legalPersonName = $map['legal_person_name'];
        }
        if (isset($map['legal_persion_idcard'])) {
            $model->legalPersionIdcard = $map['legal_persion_idcard'];
        }
        if (isset($map['merchant_name'])) {
            $model->merchantName = $map['merchant_name'];
        }
        if (isset($map['merchant_credit_no'])) {
            $model->merchantCreditNo = $map['merchant_credit_no'];
        }
        if (isset($map['alipay_account'])) {
            $model->alipayAccount = $map['alipay_account'];
        }
        if (isset($map['merchant_type'])) {
            $model->merchantType = $map['merchant_type'];
        }
        if (isset($map['contacts'])) {
            $model->contacts = $map['contacts'];
        }
        if (isset($map['addr'])) {
            $model->addr = $map['addr'];
        }

        return $model;
    }
}
