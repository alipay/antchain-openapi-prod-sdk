<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class AddFinanceEmissionRequest extends Model
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

    // 银行碳账号
    /**
     * @var string
     */
    public $enterpriseNo;

    // 企业统一社会信用代码
    /**
     * @var string
     */
    public $companyId;

    // 排放盘查方案
    /**
     * @var string
     */
    public $planCode;

    // 排放量
    /**
     * @var string
     */
    public $emissionDosage;

    // 年份
    /**
     * @var string
     */
    public $year;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'enterpriseNo'      => 'enterprise_no',
        'companyId'         => 'company_id',
        'planCode'          => 'plan_code',
        'emissionDosage'    => 'emission_dosage',
        'year'              => 'year',
    ];

    public function validate()
    {
        Model::validateRequired('enterpriseNo', $this->enterpriseNo, true);
        Model::validateRequired('companyId', $this->companyId, true);
        Model::validateRequired('planCode', $this->planCode, true);
        Model::validateRequired('emissionDosage', $this->emissionDosage, true);
        Model::validateRequired('year', $this->year, true);
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
        if (null !== $this->enterpriseNo) {
            $res['enterprise_no'] = $this->enterpriseNo;
        }
        if (null !== $this->companyId) {
            $res['company_id'] = $this->companyId;
        }
        if (null !== $this->planCode) {
            $res['plan_code'] = $this->planCode;
        }
        if (null !== $this->emissionDosage) {
            $res['emission_dosage'] = $this->emissionDosage;
        }
        if (null !== $this->year) {
            $res['year'] = $this->year;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddFinanceEmissionRequest
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
        if (isset($map['enterprise_no'])) {
            $model->enterpriseNo = $map['enterprise_no'];
        }
        if (isset($map['company_id'])) {
            $model->companyId = $map['company_id'];
        }
        if (isset($map['plan_code'])) {
            $model->planCode = $map['plan_code'];
        }
        if (isset($map['emission_dosage'])) {
            $model->emissionDosage = $map['emission_dosage'];
        }
        if (isset($map['year'])) {
            $model->year = $map['year'];
        }

        return $model;
    }
}
