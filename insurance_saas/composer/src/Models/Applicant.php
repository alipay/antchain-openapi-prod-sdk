<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class Applicant extends Model
{
    // 投保人名称
    /**
     * @example 李三
     *
     * @var string
     */
    public $applicantName;

    // 投保人证件类型
    /**
     * @example 01--居民身份证、03--营业执照
     *
     * @var string
     */
    public $applicantCardType;

    // 投保人证件号码
    /**
     * @example xxxxxx
     *
     * @var string
     */
    public $applicantCardCode;

    // 投保人联系方式
    /**
     * @example 123456789
     *
     * @var string
     */
    public $applicantContactInfo;
    protected $_name = [
        'applicantName'        => 'applicant_name',
        'applicantCardType'    => 'applicant_card_type',
        'applicantCardCode'    => 'applicant_card_code',
        'applicantContactInfo' => 'applicant_contact_info',
    ];

    public function validate()
    {
        Model::validateRequired('applicantName', $this->applicantName, true);
        Model::validateRequired('applicantCardType', $this->applicantCardType, true);
        Model::validateRequired('applicantCardCode', $this->applicantCardCode, true);
        Model::validateMaxLength('applicantName', $this->applicantName, 32);
        Model::validateMaxLength('applicantCardType', $this->applicantCardType, 32);
        Model::validateMaxLength('applicantCardCode', $this->applicantCardCode, 32);
        Model::validateMaxLength('applicantContactInfo', $this->applicantContactInfo, 128);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->applicantName) {
            $res['applicant_name'] = $this->applicantName;
        }
        if (null !== $this->applicantCardType) {
            $res['applicant_card_type'] = $this->applicantCardType;
        }
        if (null !== $this->applicantCardCode) {
            $res['applicant_card_code'] = $this->applicantCardCode;
        }
        if (null !== $this->applicantContactInfo) {
            $res['applicant_contact_info'] = $this->applicantContactInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Applicant
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['applicant_name'])) {
            $model->applicantName = $map['applicant_name'];
        }
        if (isset($map['applicant_card_type'])) {
            $model->applicantCardType = $map['applicant_card_type'];
        }
        if (isset($map['applicant_card_code'])) {
            $model->applicantCardCode = $map['applicant_card_code'];
        }
        if (isset($map['applicant_contact_info'])) {
            $model->applicantContactInfo = $map['applicant_contact_info'];
        }

        return $model;
    }
}
