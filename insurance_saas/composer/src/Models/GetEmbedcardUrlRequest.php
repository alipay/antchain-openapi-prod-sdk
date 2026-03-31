<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class GetEmbedcardUrlRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

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

    // 是否需要询价
    /**
     * @var bool
     */
    public $isNeedInquiry;

    // 交易流水号，调用方生成的唯一编码，格式为 yyyyMMdd_身份标识_其他编码，系统会根据该流水号做防重、幂等判断逻辑。 yyyyMMdd请传递当前时间。 身份标识可自定义。 其他编码建议为随机值。 当极端场景中，系统会返回错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；
    /**
     * @var string
     */
    public $tradeNo;

    // 方案名称
    /**
     * @var string
     */
    public $schemeName;

    // 投保人
    /**
     * @var Applicant
     */
    public $applicant;

    // 被保人
    /**
     * @var Insured
     */
    public $insured;

    // 投保标的
    /**
     * @var string
     */
    public $subjectInfo;
    protected $_name = [
        'authToken'          => 'auth_token',
        'insuranceTypeCode'  => 'insurance_type_code',
        'insuranceCompanyNo' => 'insurance_company_no',
        'embedProductCode'   => 'embed_product_code',
        'isNeedInquiry'      => 'is_need_inquiry',
        'tradeNo'            => 'trade_no',
        'schemeName'         => 'scheme_name',
        'applicant'          => 'applicant',
        'insured'            => 'insured',
        'subjectInfo'        => 'subject_info',
    ];

    public function validate()
    {
        Model::validateRequired('insuranceTypeCode', $this->insuranceTypeCode, true);
        Model::validateRequired('insuranceCompanyNo', $this->insuranceCompanyNo, true);
        Model::validateRequired('embedProductCode', $this->embedProductCode, true);
        Model::validateRequired('isNeedInquiry', $this->isNeedInquiry, true);
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateRequired('schemeName', $this->schemeName, true);
        Model::validateRequired('applicant', $this->applicant, true);
        Model::validateRequired('insured', $this->insured, true);
        Model::validateRequired('subjectInfo', $this->subjectInfo, true);
        Model::validateMaxLength('insuranceTypeCode', $this->insuranceTypeCode, 32);
        Model::validateMaxLength('insuranceCompanyNo', $this->insuranceCompanyNo, 32);
        Model::validateMaxLength('embedProductCode', $this->embedProductCode, 32);
        Model::validateMaxLength('tradeNo', $this->tradeNo, 128);
        Model::validateMaxLength('schemeName', $this->schemeName, 32);
        Model::validateMaxLength('subjectInfo', $this->subjectInfo, 1000);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
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
        if (null !== $this->isNeedInquiry) {
            $res['is_need_inquiry'] = $this->isNeedInquiry;
        }
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->schemeName) {
            $res['scheme_name'] = $this->schemeName;
        }
        if (null !== $this->applicant) {
            $res['applicant'] = null !== $this->applicant ? $this->applicant->toMap() : null;
        }
        if (null !== $this->insured) {
            $res['insured'] = null !== $this->insured ? $this->insured->toMap() : null;
        }
        if (null !== $this->subjectInfo) {
            $res['subject_info'] = $this->subjectInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetEmbedcardUrlRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
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
        if (isset($map['is_need_inquiry'])) {
            $model->isNeedInquiry = $map['is_need_inquiry'];
        }
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
        }
        if (isset($map['scheme_name'])) {
            $model->schemeName = $map['scheme_name'];
        }
        if (isset($map['applicant'])) {
            $model->applicant = Applicant::fromMap($map['applicant']);
        }
        if (isset($map['insured'])) {
            $model->insured = Insured::fromMap($map['insured']);
        }
        if (isset($map['subject_info'])) {
            $model->subjectInfo = $map['subject_info'];
        }

        return $model;
    }
}
