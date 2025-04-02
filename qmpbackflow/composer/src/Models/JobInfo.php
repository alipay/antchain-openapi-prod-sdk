<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class JobInfo extends Model
{
    // 职业
    /**
     * @example xxx
     *
     * @var string
     */
    public $jobType;

    // 职务
    /**
     * @example xxx
     *
     * @var string
     */
    public $workPosition;

    // 工作年限
    /**
     * @example 2
     *
     * @var string
     */
    public $jobLife;

    // 本单位工作年限
    /**
     * @example 1
     *
     * @var int
     */
    public $currentJobLife;

    // 公司名称
    /**
     * @example xxx
     *
     * @var string
     */
    public $companyName;

    // 公司行业类型
    /**
     * @example xx
     *
     * @var string
     */
    public $companyIndustryType;

    // 公司电话
    /**
     * @example 111
     *
     * @var string
     */
    public $companyTel;

    // 公司省份
    /**
     * @example 浙江
     *
     * @var string
     */
    public $companyProvince;

    // 公司城市
    /**
     * @example 公司城市
     *
     * @var string
     */
    public $companyCity;

    // 公司区域
    /**
     * @example 公司区域
     *
     * @var string
     */
    public $companyArea;

    // 公司街道
    /**
     * @example 公司街道
     *
     * @var string
     */
    public $companyStreet;

    // 公司详细地址
    /**
     * @example 公司详细地址
     *
     * @var string
     */
    public $companyAddress;

    // 年收入
    /**
     * @example 年收入
     *
     * @var int
     */
    public $yearSalary;
    protected $_name = [
        'jobType'             => 'job_type',
        'workPosition'        => 'work_position',
        'jobLife'             => 'job_life',
        'currentJobLife'      => 'current_job_life',
        'companyName'         => 'company_name',
        'companyIndustryType' => 'company_industry_type',
        'companyTel'          => 'company_tel',
        'companyProvince'     => 'company_province',
        'companyCity'         => 'company_city',
        'companyArea'         => 'company_area',
        'companyStreet'       => 'company_street',
        'companyAddress'      => 'company_address',
        'yearSalary'          => 'year_salary',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->jobType) {
            $res['job_type'] = $this->jobType;
        }
        if (null !== $this->workPosition) {
            $res['work_position'] = $this->workPosition;
        }
        if (null !== $this->jobLife) {
            $res['job_life'] = $this->jobLife;
        }
        if (null !== $this->currentJobLife) {
            $res['current_job_life'] = $this->currentJobLife;
        }
        if (null !== $this->companyName) {
            $res['company_name'] = $this->companyName;
        }
        if (null !== $this->companyIndustryType) {
            $res['company_industry_type'] = $this->companyIndustryType;
        }
        if (null !== $this->companyTel) {
            $res['company_tel'] = $this->companyTel;
        }
        if (null !== $this->companyProvince) {
            $res['company_province'] = $this->companyProvince;
        }
        if (null !== $this->companyCity) {
            $res['company_city'] = $this->companyCity;
        }
        if (null !== $this->companyArea) {
            $res['company_area'] = $this->companyArea;
        }
        if (null !== $this->companyStreet) {
            $res['company_street'] = $this->companyStreet;
        }
        if (null !== $this->companyAddress) {
            $res['company_address'] = $this->companyAddress;
        }
        if (null !== $this->yearSalary) {
            $res['year_salary'] = $this->yearSalary;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return JobInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['job_type'])) {
            $model->jobType = $map['job_type'];
        }
        if (isset($map['work_position'])) {
            $model->workPosition = $map['work_position'];
        }
        if (isset($map['job_life'])) {
            $model->jobLife = $map['job_life'];
        }
        if (isset($map['current_job_life'])) {
            $model->currentJobLife = $map['current_job_life'];
        }
        if (isset($map['company_name'])) {
            $model->companyName = $map['company_name'];
        }
        if (isset($map['company_industry_type'])) {
            $model->companyIndustryType = $map['company_industry_type'];
        }
        if (isset($map['company_tel'])) {
            $model->companyTel = $map['company_tel'];
        }
        if (isset($map['company_province'])) {
            $model->companyProvince = $map['company_province'];
        }
        if (isset($map['company_city'])) {
            $model->companyCity = $map['company_city'];
        }
        if (isset($map['company_area'])) {
            $model->companyArea = $map['company_area'];
        }
        if (isset($map['company_street'])) {
            $model->companyStreet = $map['company_street'];
        }
        if (isset($map['company_address'])) {
            $model->companyAddress = $map['company_address'];
        }
        if (isset($map['year_salary'])) {
            $model->yearSalary = $map['year_salary'];
        }

        return $model;
    }
}
