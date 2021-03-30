<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class TotalStatement extends Model
{
    // 企业编号
    /**
     * @example companyNo
     *
     * @var string
     */
    public $companyNo;

    // 记账日期 yyyy-mm-dd
    /**
     * @example 2018-10-10
     *
     * @var string
     */
    public $accountDate;

    // 总分润金额
    /**
     * @example 0
     *
     * @var int
     */
    public $amount;

    // 风险承担方金额
    /**
     * @example 0
     *
     * @var int
     */
    public $riskTaker;

    // 货物监管方金额
    /**
     * @example 0
     *
     * @var int
     */
    public $cargoSupervision;

    // 资金推荐方金额
    /**
     * @example 0
     *
     * @var int
     */
    public $capitalRecommend;

    // 融资推荐方金额
    /**
     * @example 0
     *
     * @var int
     */
    public $funderRecommend;

    // 运营管理方金额
    /**
     * @example 0
     *
     * @var int
     */
    public $management;

    // 技术支持方金额
    /**
     * @example 0
     *
     * @var int
     */
    public $technical;
    protected $_name = [
        'companyNo'        => 'company_no',
        'accountDate'      => 'account_date',
        'amount'           => 'amount',
        'riskTaker'        => 'risk_taker',
        'cargoSupervision' => 'cargo_supervision',
        'capitalRecommend' => 'capital_recommend',
        'funderRecommend'  => 'funder_recommend',
        'management'       => 'management',
        'technical'        => 'technical',
    ];

    public function validate()
    {
        Model::validateRequired('companyNo', $this->companyNo, true);
        Model::validateRequired('accountDate', $this->accountDate, true);
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('riskTaker', $this->riskTaker, true);
        Model::validateRequired('cargoSupervision', $this->cargoSupervision, true);
        Model::validateRequired('capitalRecommend', $this->capitalRecommend, true);
        Model::validateRequired('funderRecommend', $this->funderRecommend, true);
        Model::validateRequired('management', $this->management, true);
        Model::validateRequired('technical', $this->technical, true);
        Model::validatePattern('accountDate', $this->accountDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->companyNo) {
            $res['company_no'] = $this->companyNo;
        }
        if (null !== $this->accountDate) {
            $res['account_date'] = $this->accountDate;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->riskTaker) {
            $res['risk_taker'] = $this->riskTaker;
        }
        if (null !== $this->cargoSupervision) {
            $res['cargo_supervision'] = $this->cargoSupervision;
        }
        if (null !== $this->capitalRecommend) {
            $res['capital_recommend'] = $this->capitalRecommend;
        }
        if (null !== $this->funderRecommend) {
            $res['funder_recommend'] = $this->funderRecommend;
        }
        if (null !== $this->management) {
            $res['management'] = $this->management;
        }
        if (null !== $this->technical) {
            $res['technical'] = $this->technical;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TotalStatement
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['company_no'])) {
            $model->companyNo = $map['company_no'];
        }
        if (isset($map['account_date'])) {
            $model->accountDate = $map['account_date'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['risk_taker'])) {
            $model->riskTaker = $map['risk_taker'];
        }
        if (isset($map['cargo_supervision'])) {
            $model->cargoSupervision = $map['cargo_supervision'];
        }
        if (isset($map['capital_recommend'])) {
            $model->capitalRecommend = $map['capital_recommend'];
        }
        if (isset($map['funder_recommend'])) {
            $model->funderRecommend = $map['funder_recommend'];
        }
        if (isset($map['management'])) {
            $model->management = $map['management'];
        }
        if (isset($map['technical'])) {
            $model->technical = $map['technical'];
        }

        return $model;
    }
}
