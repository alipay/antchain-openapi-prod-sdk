<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INDUSTRY\Models;

use AlibabaCloud\Tea\Model;

class QueryMerchantAgreementResponse extends Model
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

    // 协议产品code
    /**
     * @var string
     */
    public $personalProductCode;

    // 签约主体
    /**
     * @var string
     */
    public $merchantUserId;

    // 签约客户支付宝uid
    /**
     * @var string
     */
    public $customerAlipayUserId;

    // 商户签约协议号
    /**
     * @var string
     */
    public $merchantAgreementNo;

    // 签约协议号，仅签约成功后有
    /**
     * @var string
     */
    public $agreementNo;

    // 实际签约时间，仅签约成功后有
    /**
     * @var string
     */
    public $signTime;

    // 实际生效时间，仅签约成功后有
    /**
     * @var string
     */
    public $validTime;

    // 实际失效时间，仅签约成功后有
    /**
     * @var string
     */
    public $invalidTime;

    // 协议状态
    // TEMP-暂存
    // NORMAL-正常
    // STOP-暂停
    /**
     * @var string
     */
    public $status;
    protected $_name = [
        'reqMsgId'             => 'req_msg_id',
        'resultCode'           => 'result_code',
        'resultMsg'            => 'result_msg',
        'personalProductCode'  => 'personal_product_code',
        'merchantUserId'       => 'merchant_user_id',
        'customerAlipayUserId' => 'customer_alipay_user_id',
        'merchantAgreementNo'  => 'merchant_agreement_no',
        'agreementNo'          => 'agreement_no',
        'signTime'             => 'sign_time',
        'validTime'            => 'valid_time',
        'invalidTime'          => 'invalid_time',
        'status'               => 'status',
    ];

    public function validate()
    {
        Model::validatePattern('signTime', $this->signTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('validTime', $this->validTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('invalidTime', $this->invalidTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->personalProductCode) {
            $res['personal_product_code'] = $this->personalProductCode;
        }
        if (null !== $this->merchantUserId) {
            $res['merchant_user_id'] = $this->merchantUserId;
        }
        if (null !== $this->customerAlipayUserId) {
            $res['customer_alipay_user_id'] = $this->customerAlipayUserId;
        }
        if (null !== $this->merchantAgreementNo) {
            $res['merchant_agreement_no'] = $this->merchantAgreementNo;
        }
        if (null !== $this->agreementNo) {
            $res['agreement_no'] = $this->agreementNo;
        }
        if (null !== $this->signTime) {
            $res['sign_time'] = $this->signTime;
        }
        if (null !== $this->validTime) {
            $res['valid_time'] = $this->validTime;
        }
        if (null !== $this->invalidTime) {
            $res['invalid_time'] = $this->invalidTime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryMerchantAgreementResponse
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
        if (isset($map['personal_product_code'])) {
            $model->personalProductCode = $map['personal_product_code'];
        }
        if (isset($map['merchant_user_id'])) {
            $model->merchantUserId = $map['merchant_user_id'];
        }
        if (isset($map['customer_alipay_user_id'])) {
            $model->customerAlipayUserId = $map['customer_alipay_user_id'];
        }
        if (isset($map['merchant_agreement_no'])) {
            $model->merchantAgreementNo = $map['merchant_agreement_no'];
        }
        if (isset($map['agreement_no'])) {
            $model->agreementNo = $map['agreement_no'];
        }
        if (isset($map['sign_time'])) {
            $model->signTime = $map['sign_time'];
        }
        if (isset($map['valid_time'])) {
            $model->validTime = $map['valid_time'];
        }
        if (isset($map['invalid_time'])) {
            $model->invalidTime = $map['invalid_time'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
