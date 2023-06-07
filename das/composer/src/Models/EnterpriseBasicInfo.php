<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class EnterpriseBasicInfo extends Model
{
    // 企业状态
    /**
     * @example 吊销，未注销
     *
     * @var string
     */
    public $regStatus;

    // 成立日期(注册日期)
    /**
     * @example 2017-04-26
     *
     * @var string
     */
    public $establishTime;

    // 注册资本
    /**
     * @example 1000万人民币
     *
     * @var string
     */
    public $regCapital;

    // 行业
    /**
     * @example 批发业
     *
     * @var string
     */
    public $industry;

    // 主要人员
    /**
     * @example
     *
     * @var EnterpriseStaff[]
     */
    public $staffList;

    // 法人类型，1-人;2-公司
    /**
     * @example 1
     *
     * @var string
     */
    public $type;

    // 注册资本币种:人民币、美元、欧元等
    /**
     * @example 人民币
     *
     * @var string
     */
    public $regCapitalCurrency;

    // 法人姓名
    /**
     * @example 李*东
     *
     * @var string
     */
    public $legalPersonName;

    // 注册号
    /**
     * @example 210213000249529
     *
     * @var string
     */
    public $regNumber;

    // 统一社会信用代码
    /**
     * @example 91210213MA0U32TD
     *
     * @var string
     */
    public $creditCode;

    // 企业名
    /**
     * @example **公司
     *
     * @var string
     */
    public $name;

    // 企业类型
    /**
     * @example 有限责任公司(自然人独资)
     *
     * @var string
     */
    public $companyOrgType;

    // 省份简称
    /**
     * @example ln
     *
     * @var string
     */
    public $base;
    protected $_name = [
        'regStatus'          => 'reg_status',
        'establishTime'      => 'establish_time',
        'regCapital'         => 'reg_capital',
        'industry'           => 'industry',
        'staffList'          => 'staff_list',
        'type'               => 'type',
        'regCapitalCurrency' => 'reg_capital_currency',
        'legalPersonName'    => 'legal_person_name',
        'regNumber'          => 'reg_number',
        'creditCode'         => 'credit_code',
        'name'               => 'name',
        'companyOrgType'     => 'company_org_type',
        'base'               => 'base',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->regStatus) {
            $res['reg_status'] = $this->regStatus;
        }
        if (null !== $this->establishTime) {
            $res['establish_time'] = $this->establishTime;
        }
        if (null !== $this->regCapital) {
            $res['reg_capital'] = $this->regCapital;
        }
        if (null !== $this->industry) {
            $res['industry'] = $this->industry;
        }
        if (null !== $this->staffList) {
            $res['staff_list'] = [];
            if (null !== $this->staffList && \is_array($this->staffList)) {
                $n = 0;
                foreach ($this->staffList as $item) {
                    $res['staff_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->regCapitalCurrency) {
            $res['reg_capital_currency'] = $this->regCapitalCurrency;
        }
        if (null !== $this->legalPersonName) {
            $res['legal_person_name'] = $this->legalPersonName;
        }
        if (null !== $this->regNumber) {
            $res['reg_number'] = $this->regNumber;
        }
        if (null !== $this->creditCode) {
            $res['credit_code'] = $this->creditCode;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->companyOrgType) {
            $res['company_org_type'] = $this->companyOrgType;
        }
        if (null !== $this->base) {
            $res['base'] = $this->base;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EnterpriseBasicInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['reg_status'])) {
            $model->regStatus = $map['reg_status'];
        }
        if (isset($map['establish_time'])) {
            $model->establishTime = $map['establish_time'];
        }
        if (isset($map['reg_capital'])) {
            $model->regCapital = $map['reg_capital'];
        }
        if (isset($map['industry'])) {
            $model->industry = $map['industry'];
        }
        if (isset($map['staff_list'])) {
            if (!empty($map['staff_list'])) {
                $model->staffList = [];
                $n                = 0;
                foreach ($map['staff_list'] as $item) {
                    $model->staffList[$n++] = null !== $item ? EnterpriseStaff::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['reg_capital_currency'])) {
            $model->regCapitalCurrency = $map['reg_capital_currency'];
        }
        if (isset($map['legal_person_name'])) {
            $model->legalPersonName = $map['legal_person_name'];
        }
        if (isset($map['reg_number'])) {
            $model->regNumber = $map['reg_number'];
        }
        if (isset($map['credit_code'])) {
            $model->creditCode = $map['credit_code'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['company_org_type'])) {
            $model->companyOrgType = $map['company_org_type'];
        }
        if (isset($map['base'])) {
            $model->base = $map['base'];
        }

        return $model;
    }
}
