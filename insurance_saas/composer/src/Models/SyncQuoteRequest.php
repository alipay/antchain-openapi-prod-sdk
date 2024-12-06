<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class SyncQuoteRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 询价申请号
    /**
     * @var string
     */
    public $inquiryNo;

    // 询价平台
    /**
     * @var string
     */
    public $inquirePlatform;

    // 单次保额
    /**
     * @var string
     */
    public $singleInsuranceAmount;

    // 总保额
    /**
     * @var string
     */
    public $totalInsuranceAmount;

    // 询价基础材料
    /**
     * @var string
     */
    public $materialList;

    // 标的材料列表
    /**
     * @var string
     */
    public $objectList;

    // 保司编号
    /**
     * @var string
     */
    public $insuranceCompanyNo;

    // 保险产品编码
    /**
     * @var string
     */
    public $trustworthyValueInsuranceTypeCode;

    // 保司项目代码
    /**
     * @var string
     */
    public $insuranceProjectCode;

    // 保司方案代码
    /**
     * @var string
     */
    public $insuranceOptionsCode;

    // 询价人
    /**
     * @var string
     */
    public $inquirer;

    // 投保人
    /**
     * @var string
     */
    public $applicant;

    // 被保人列表
    /**
     * @var string
     */
    public $insuredList;

    // 报价结果
    /**
     * @var string
     */
    public $quotation;
    protected $_name = [
        'authToken'                         => 'auth_token',
        'inquiryNo'                         => 'inquiry_no',
        'inquirePlatform'                   => 'inquire_platform',
        'singleInsuranceAmount'             => 'single_insurance_amount',
        'totalInsuranceAmount'              => 'total_insurance_amount',
        'materialList'                      => 'material_list',
        'objectList'                        => 'object_list',
        'insuranceCompanyNo'                => 'insurance_company_no',
        'trustworthyValueInsuranceTypeCode' => 'trustworthy_value_insurance_type_code',
        'insuranceProjectCode'              => 'insurance_project_code',
        'insuranceOptionsCode'              => 'insurance_options_code',
        'inquirer'                          => 'inquirer',
        'applicant'                         => 'applicant',
        'insuredList'                       => 'insured_list',
        'quotation'                         => 'quotation',
    ];

    public function validate()
    {
        Model::validateRequired('singleInsuranceAmount', $this->singleInsuranceAmount, true);
        Model::validateRequired('totalInsuranceAmount', $this->totalInsuranceAmount, true);
        Model::validateRequired('insuranceCompanyNo', $this->insuranceCompanyNo, true);
        Model::validateRequired('trustworthyValueInsuranceTypeCode', $this->trustworthyValueInsuranceTypeCode, true);
        Model::validateRequired('insuranceProjectCode', $this->insuranceProjectCode, true);
        Model::validateRequired('insuranceOptionsCode', $this->insuranceOptionsCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->inquiryNo) {
            $res['inquiry_no'] = $this->inquiryNo;
        }
        if (null !== $this->inquirePlatform) {
            $res['inquire_platform'] = $this->inquirePlatform;
        }
        if (null !== $this->singleInsuranceAmount) {
            $res['single_insurance_amount'] = $this->singleInsuranceAmount;
        }
        if (null !== $this->totalInsuranceAmount) {
            $res['total_insurance_amount'] = $this->totalInsuranceAmount;
        }
        if (null !== $this->materialList) {
            $res['material_list'] = $this->materialList;
        }
        if (null !== $this->objectList) {
            $res['object_list'] = $this->objectList;
        }
        if (null !== $this->insuranceCompanyNo) {
            $res['insurance_company_no'] = $this->insuranceCompanyNo;
        }
        if (null !== $this->trustworthyValueInsuranceTypeCode) {
            $res['trustworthy_value_insurance_type_code'] = $this->trustworthyValueInsuranceTypeCode;
        }
        if (null !== $this->insuranceProjectCode) {
            $res['insurance_project_code'] = $this->insuranceProjectCode;
        }
        if (null !== $this->insuranceOptionsCode) {
            $res['insurance_options_code'] = $this->insuranceOptionsCode;
        }
        if (null !== $this->inquirer) {
            $res['inquirer'] = $this->inquirer;
        }
        if (null !== $this->applicant) {
            $res['applicant'] = $this->applicant;
        }
        if (null !== $this->insuredList) {
            $res['insured_list'] = $this->insuredList;
        }
        if (null !== $this->quotation) {
            $res['quotation'] = $this->quotation;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncQuoteRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['inquiry_no'])) {
            $model->inquiryNo = $map['inquiry_no'];
        }
        if (isset($map['inquire_platform'])) {
            $model->inquirePlatform = $map['inquire_platform'];
        }
        if (isset($map['single_insurance_amount'])) {
            $model->singleInsuranceAmount = $map['single_insurance_amount'];
        }
        if (isset($map['total_insurance_amount'])) {
            $model->totalInsuranceAmount = $map['total_insurance_amount'];
        }
        if (isset($map['material_list'])) {
            $model->materialList = $map['material_list'];
        }
        if (isset($map['object_list'])) {
            $model->objectList = $map['object_list'];
        }
        if (isset($map['insurance_company_no'])) {
            $model->insuranceCompanyNo = $map['insurance_company_no'];
        }
        if (isset($map['trustworthy_value_insurance_type_code'])) {
            $model->trustworthyValueInsuranceTypeCode = $map['trustworthy_value_insurance_type_code'];
        }
        if (isset($map['insurance_project_code'])) {
            $model->insuranceProjectCode = $map['insurance_project_code'];
        }
        if (isset($map['insurance_options_code'])) {
            $model->insuranceOptionsCode = $map['insurance_options_code'];
        }
        if (isset($map['inquirer'])) {
            $model->inquirer = $map['inquirer'];
        }
        if (isset($map['applicant'])) {
            $model->applicant = $map['applicant'];
        }
        if (isset($map['insured_list'])) {
            $model->insuredList = $map['insured_list'];
        }
        if (isset($map['quotation'])) {
            $model->quotation = $map['quotation'];
        }

        return $model;
    }
}
