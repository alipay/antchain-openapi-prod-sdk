<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryWithholdAgreementResponse extends Model
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

    // 总授信金额
    /**
     * @var string
     */
    public $creditAmount;

    // 商家的支付宝uid
    /**
     * @var string
     */
    public $merchantId;

    // 商户名称
    /**
     * @var string
     */
    public $merchantName;

    // 商户的服务名称
    /**
     * @var string
     */
    public $merchantServiceName;

    // 姓名身份证号拼接后的hash
    /**
     * @var string
     */
    public $nameCertHash;

    // 还款计划的超链接
    /**
     * @var string
     */
    public $repaymentUrl;

    // 协议的状态，如果签署成功返回success,未签是空
    /**
     * @var string
     */
    public $status;

    // 第三方的用户id
    /**
     * @var string
     */
    public $thirdPartyId;

    // 商家请求的协议号
    /**
     * @var string
     */
    public $externalAgreementNo;
    protected $_name = [
        'reqMsgId'            => 'req_msg_id',
        'resultCode'          => 'result_code',
        'resultMsg'           => 'result_msg',
        'creditAmount'        => 'credit_amount',
        'merchantId'          => 'merchant_id',
        'merchantName'        => 'merchant_name',
        'merchantServiceName' => 'merchant_service_name',
        'nameCertHash'        => 'name_cert_hash',
        'repaymentUrl'        => 'repayment_url',
        'status'              => 'status',
        'thirdPartyId'        => 'third_party_id',
        'externalAgreementNo' => 'external_agreement_no',
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
        if (null !== $this->creditAmount) {
            $res['credit_amount'] = $this->creditAmount;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->merchantName) {
            $res['merchant_name'] = $this->merchantName;
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->thirdPartyId) {
            $res['third_party_id'] = $this->thirdPartyId;
        }
        if (null !== $this->externalAgreementNo) {
            $res['external_agreement_no'] = $this->externalAgreementNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryWithholdAgreementResponse
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
        if (isset($map['credit_amount'])) {
            $model->creditAmount = $map['credit_amount'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['merchant_name'])) {
            $model->merchantName = $map['merchant_name'];
        }
        if (isset($map['merchant_service_name'])) {
            $model->merchantServiceName = $map['merchant_service_name'];
        }
        if (isset($map['name_cert_hash'])) {
            $model->nameCertHash = $map['name_cert_hash'];
        }
        if (isset($map['repayment_url'])) {
            $model->repaymentUrl = $map['repayment_url'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['third_party_id'])) {
            $model->thirdPartyId = $map['third_party_id'];
        }
        if (isset($map['external_agreement_no'])) {
            $model->externalAgreementNo = $map['external_agreement_no'];
        }

        return $model;
    }
}
