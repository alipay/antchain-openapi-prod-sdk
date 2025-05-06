<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class QueryReverseCommissionRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 案件号-外部唯一
    /**
     * @var string
     */
    public $outCaseNo;

    // 委托的保司ID
    /**
     * @var string
     */
    public $entrustInsuranceCompanyId;
    protected $_name = [
        'authToken'                 => 'auth_token',
        'outCaseNo'                 => 'out_case_no',
        'entrustInsuranceCompanyId' => 'entrust_insurance_company_id',
    ];

    public function validate()
    {
        Model::validateRequired('outCaseNo', $this->outCaseNo, true);
        Model::validateRequired('entrustInsuranceCompanyId', $this->entrustInsuranceCompanyId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->outCaseNo) {
            $res['out_case_no'] = $this->outCaseNo;
        }
        if (null !== $this->entrustInsuranceCompanyId) {
            $res['entrust_insurance_company_id'] = $this->entrustInsuranceCompanyId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryReverseCommissionRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['out_case_no'])) {
            $model->outCaseNo = $map['out_case_no'];
        }
        if (isset($map['entrust_insurance_company_id'])) {
            $model->entrustInsuranceCompanyId = $map['entrust_insurance_company_id'];
        }

        return $model;
    }
}
