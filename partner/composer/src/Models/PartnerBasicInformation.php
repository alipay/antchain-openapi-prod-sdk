<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class PartnerBasicInformation extends Model
{
    // 行业类型，值列表详见文档：https://yuque.antfin-inc.com/docs/share/684c97a8-bd5f-40e0-aab6-a1a69bc3d881?#
    /**
     * @example EDUCATION
     *
     * @var string
     */
    public $industry;

    // 企业法人
    /**
     * @example 张三
     *
     * @var string
     */
    public $enterpriseLegalPerson;

    // 注册资本
    /**
     * @example 1000
     *
     * @var string
     */
    public $registeredCapital;

    // 人员规模
    /**
     * @example 100
     *
     * @var string
     */
    public $employeeCount;

    // 企业注册省份
    /**
     * @example 浙江
     *
     * @var string
     */
    public $enterpriseRegisterProvince;

    // 企业注册城市
    /**
     * @example 杭州
     *
     * @var string
     */
    public $enterpriseRegisterCity;

    // 公司官网地址
    /**
     * @example https://www.alipay.com
     *
     * @var string
     */
    public $companyUrl;

    // 是否上市公司
    /**
     * @example true/false
     *
     * @var bool
     */
    public $listed;

    // 企业简介
    /**
     * @example 企业简介
     *
     * @var string
     */
    public $briefIntroduction;

    // 二级行业，值列表详见文档：https://yuque.antfin-inc.com/docs/share/684c97a8-bd5f-40e0-aab6-a1a69bc3d881?# 《合作方企业基本信息说明》
    /**
     * @example GOVERNMENT.SMART_GOVERNMENT
     *
     * @var string
     */
    public $subIndustry;
    protected $_name = [
        'industry'                   => 'industry',
        'enterpriseLegalPerson'      => 'enterprise_legal_person',
        'registeredCapital'          => 'registered_capital',
        'employeeCount'              => 'employee_count',
        'enterpriseRegisterProvince' => 'enterprise_register_province',
        'enterpriseRegisterCity'     => 'enterprise_register_city',
        'companyUrl'                 => 'company_url',
        'listed'                     => 'listed',
        'briefIntroduction'          => 'brief_introduction',
        'subIndustry'                => 'sub_industry',
    ];

    public function validate()
    {
        Model::validateRequired('industry', $this->industry, true);
        Model::validateRequired('enterpriseLegalPerson', $this->enterpriseLegalPerson, true);
        Model::validateRequired('registeredCapital', $this->registeredCapital, true);
        Model::validateRequired('employeeCount', $this->employeeCount, true);
        Model::validateRequired('enterpriseRegisterProvince', $this->enterpriseRegisterProvince, true);
        Model::validateRequired('enterpriseRegisterCity', $this->enterpriseRegisterCity, true);
        Model::validateRequired('companyUrl', $this->companyUrl, true);
        Model::validateRequired('listed', $this->listed, true);
        Model::validateRequired('briefIntroduction', $this->briefIntroduction, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->industry) {
            $res['industry'] = $this->industry;
        }
        if (null !== $this->enterpriseLegalPerson) {
            $res['enterprise_legal_person'] = $this->enterpriseLegalPerson;
        }
        if (null !== $this->registeredCapital) {
            $res['registered_capital'] = $this->registeredCapital;
        }
        if (null !== $this->employeeCount) {
            $res['employee_count'] = $this->employeeCount;
        }
        if (null !== $this->enterpriseRegisterProvince) {
            $res['enterprise_register_province'] = $this->enterpriseRegisterProvince;
        }
        if (null !== $this->enterpriseRegisterCity) {
            $res['enterprise_register_city'] = $this->enterpriseRegisterCity;
        }
        if (null !== $this->companyUrl) {
            $res['company_url'] = $this->companyUrl;
        }
        if (null !== $this->listed) {
            $res['listed'] = $this->listed;
        }
        if (null !== $this->briefIntroduction) {
            $res['brief_introduction'] = $this->briefIntroduction;
        }
        if (null !== $this->subIndustry) {
            $res['sub_industry'] = $this->subIndustry;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PartnerBasicInformation
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['industry'])) {
            $model->industry = $map['industry'];
        }
        if (isset($map['enterprise_legal_person'])) {
            $model->enterpriseLegalPerson = $map['enterprise_legal_person'];
        }
        if (isset($map['registered_capital'])) {
            $model->registeredCapital = $map['registered_capital'];
        }
        if (isset($map['employee_count'])) {
            $model->employeeCount = $map['employee_count'];
        }
        if (isset($map['enterprise_register_province'])) {
            $model->enterpriseRegisterProvince = $map['enterprise_register_province'];
        }
        if (isset($map['enterprise_register_city'])) {
            $model->enterpriseRegisterCity = $map['enterprise_register_city'];
        }
        if (isset($map['company_url'])) {
            $model->companyUrl = $map['company_url'];
        }
        if (isset($map['listed'])) {
            $model->listed = $map['listed'];
        }
        if (isset($map['brief_introduction'])) {
            $model->briefIntroduction = $map['brief_introduction'];
        }
        if (isset($map['sub_industry'])) {
            $model->subIndustry = $map['sub_industry'];
        }

        return $model;
    }
}
