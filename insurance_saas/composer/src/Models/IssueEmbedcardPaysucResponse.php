<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class IssueEmbedcardPaysucResponse extends Model
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

    // 交易流水号
    /**
     * @var string
     */
    public $tradeNo;

    // 险种编码
    /**
     * @var string
     */
    public $insuranceTypeCode;

    // 保司编码
    /**
     * @var string
     */
    public $insuranceCompanyNo;

    // 嵌入式产品编码
    /**
     * @var string
     */
    public $embedProductCode;

    // 方案名称
    /**
     * @var string
     */
    public $schemeName;

    // 保险起期
    /**
     * @var string
     */
    public $insureStart;

    // 保险止期
    /**
     * @var string
     */
    public $insureEnd;

    // 保费，保留2位小数
    /**
     * @var string
     */
    public $premium;

    // 保额，保留2位小数
    /**
     * @var string
     */
    public $amount;

    // 询价编码
    /**
     * @var string
     */
    public $inquiryNo;

    // 保险凭证号
    /**
     * @var string
     */
    public $voucherNo;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'tradeNo'            => 'trade_no',
        'insuranceTypeCode'  => 'insurance_type_code',
        'insuranceCompanyNo' => 'insurance_company_no',
        'embedProductCode'   => 'embed_product_code',
        'schemeName'         => 'scheme_name',
        'insureStart'        => 'insure_start',
        'insureEnd'          => 'insure_end',
        'premium'            => 'premium',
        'amount'             => 'amount',
        'inquiryNo'          => 'inquiry_no',
        'voucherNo'          => 'voucher_no',
    ];

    public function validate()
    {
        Model::validatePattern('insureStart', $this->insureStart, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('insureEnd', $this->insureEnd, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->insuranceTypeCode) {
            $res['insurance_type_code'] = $this->insuranceTypeCode;
        }
        if (null !== $this->insuranceCompanyNo) {
            $res['insurance_company_no'] = $this->insuranceCompanyNo;
        }
        if (null !== $this->embedProductCode) {
            $res['embed_product_code'] = $this->embedProductCode;
        }
        if (null !== $this->schemeName) {
            $res['scheme_name'] = $this->schemeName;
        }
        if (null !== $this->insureStart) {
            $res['insure_start'] = $this->insureStart;
        }
        if (null !== $this->insureEnd) {
            $res['insure_end'] = $this->insureEnd;
        }
        if (null !== $this->premium) {
            $res['premium'] = $this->premium;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->inquiryNo) {
            $res['inquiry_no'] = $this->inquiryNo;
        }
        if (null !== $this->voucherNo) {
            $res['voucher_no'] = $this->voucherNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IssueEmbedcardPaysucResponse
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
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
        }
        if (isset($map['insurance_type_code'])) {
            $model->insuranceTypeCode = $map['insurance_type_code'];
        }
        if (isset($map['insurance_company_no'])) {
            $model->insuranceCompanyNo = $map['insurance_company_no'];
        }
        if (isset($map['embed_product_code'])) {
            $model->embedProductCode = $map['embed_product_code'];
        }
        if (isset($map['scheme_name'])) {
            $model->schemeName = $map['scheme_name'];
        }
        if (isset($map['insure_start'])) {
            $model->insureStart = $map['insure_start'];
        }
        if (isset($map['insure_end'])) {
            $model->insureEnd = $map['insure_end'];
        }
        if (isset($map['premium'])) {
            $model->premium = $map['premium'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['inquiry_no'])) {
            $model->inquiryNo = $map['inquiry_no'];
        }
        if (isset($map['voucher_no'])) {
            $model->voucherNo = $map['voucher_no'];
        }

        return $model;
    }
}
