<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateWithholdAgreementRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'creditAmount' => 'credit_amount',
        'externalAgreementNo' => 'external_agreement_no',
        'merchantId' => 'merchant_id',
        'merchantName' => 'merchant_name',
        'merchantServiceDescription' => 'merchant_service_description',
        'merchantServiceName' => 'merchant_service_name',
        'nameCertHash' => 'name_cert_hash',
        'repaymentUrl' => 'repayment_url',
        'returnUrl' => 'return_url',
        'thirdPartyId' => 'third_party_id',
    ];
    public function validate() {
        Model::validateRequired('creditAmount', $this->creditAmount, true);
        Model::validateRequired('externalAgreementNo', $this->externalAgreementNo, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('merchantName', $this->merchantName, true);
        Model::validateRequired('merchantServiceName', $this->merchantServiceName, true);
        Model::validateRequired('nameCertHash', $this->nameCertHash, true);
        Model::validateRequired('repaymentUrl', $this->repaymentUrl, true);
        Model::validateRequired('thirdPartyId', $this->thirdPartyId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->creditAmount) {
            $res['credit_amount'] = $this->creditAmount;
        }
        if (null !== $this->externalAgreementNo) {
            $res['external_agreement_no'] = $this->externalAgreementNo;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->merchantName) {
            $res['merchant_name'] = $this->merchantName;
        }
        if (null !== $this->merchantServiceDescription) {
            $res['merchant_service_description'] = $this->merchantServiceDescription;
        }
        if (null !== $this->merchantServiceName) {
            $res['merchant_service_name'] = $this->merchantServiceName;
        }
        if (null !== $this->nameCertHash) {
            $res['name_cert_hash'] = $this->nameCertHash;
        }
        if (null !== $this->repaymentUrl) {
            $res['repayment_url'] = $this->repaymentUrl;
        }
        if (null !== $this->returnUrl) {
            $res['return_url'] = $this->returnUrl;
        }
        if (null !== $this->thirdPartyId) {
            $res['third_party_id'] = $this->thirdPartyId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateWithholdAgreementRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['credit_amount'])){
            $model->creditAmount = $map['credit_amount'];
        }
        if(isset($map['external_agreement_no'])){
            $model->externalAgreementNo = $map['external_agreement_no'];
        }
        if(isset($map['merchant_id'])){
            $model->merchantId = $map['merchant_id'];
        }
        if(isset($map['merchant_name'])){
            $model->merchantName = $map['merchant_name'];
        }
        if(isset($map['merchant_service_description'])){
            $model->merchantServiceDescription = $map['merchant_service_description'];
        }
        if(isset($map['merchant_service_name'])){
            $model->merchantServiceName = $map['merchant_service_name'];
        }
        if(isset($map['name_cert_hash'])){
            $model->nameCertHash = $map['name_cert_hash'];
        }
        if(isset($map['repayment_url'])){
            $model->repaymentUrl = $map['repayment_url'];
        }
        if(isset($map['return_url'])){
            $model->returnUrl = $map['return_url'];
        }
        if(isset($map['third_party_id'])){
            $model->thirdPartyId = $map['third_party_id'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 授信总金额，单位元
    /**
     * @var string
     */
    public $creditAmount;

    // 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）
    /**
     * @var string
     */
    public $externalAgreementNo;

    // 收款方账号类型，可取值：ALIPAY_USER_ID（支付宝uid);商户id，2088123412341234
    /**
     * @var string
     */
    public $merchantId;

    // 商户名称
    /**
     * @var string
     */
    public $merchantName;

    // 对服务产品的描述
    /**
     * @var string
     */
    public $merchantServiceDescription;

    // 商户的服务名称，滴滴出行免密支付
    /**
     * @var string
     */
    public $merchantServiceName;

    // 姓名和身份证号拼接sha256的hash
    /**
     * @var string
     */
    public $nameCertHash;

    // 还款计划的链接
    /**
     * @var string
     */
    public $repaymentUrl;

    // 签约成功后回调的地址
    /**
     * @var string
     */
    public $returnUrl;

    // 第三方用户id
    /**
     * @var string
     */
    public $thirdPartyId;

}
