<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class QueryInsureResultRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 保险产品编码
    /**
     * @var string
     */
    public $trustworthyValueInsuranceTypeCode;

    // 保司编码
    /**
     * @var string
     */
    public $insuranceCompanyNo;

    // 通知单号,投保申请时会返回
    /**
     * @var string
     */
    public $noticeNo;
    protected $_name = [
        'authToken'                         => 'auth_token',
        'trustworthyValueInsuranceTypeCode' => 'trustworthy_value_insurance_type_code',
        'insuranceCompanyNo'                => 'insurance_company_no',
        'noticeNo'                          => 'notice_no',
    ];

    public function validate()
    {
        Model::validateRequired('trustworthyValueInsuranceTypeCode', $this->trustworthyValueInsuranceTypeCode, true);
        Model::validateRequired('insuranceCompanyNo', $this->insuranceCompanyNo, true);
        Model::validateRequired('noticeNo', $this->noticeNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->trustworthyValueInsuranceTypeCode) {
            $res['trustworthy_value_insurance_type_code'] = $this->trustworthyValueInsuranceTypeCode;
        }
        if (null !== $this->insuranceCompanyNo) {
            $res['insurance_company_no'] = $this->insuranceCompanyNo;
        }
        if (null !== $this->noticeNo) {
            $res['notice_no'] = $this->noticeNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInsureResultRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['trustworthy_value_insurance_type_code'])) {
            $model->trustworthyValueInsuranceTypeCode = $map['trustworthy_value_insurance_type_code'];
        }
        if (isset($map['insurance_company_no'])) {
            $model->insuranceCompanyNo = $map['insurance_company_no'];
        }
        if (isset($map['notice_no'])) {
            $model->noticeNo = $map['notice_no'];
        }

        return $model;
    }
}
