<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class MortGuaranteeInfo extends Model
{
    // 争议处理方式,比如：COUNT_PROCEEDING=有管辖权的人民法院提起诉讼
    /**
     * @example COUNT_PROCEEDING
     *
     * @var string
     */
    public $conflictHandleMethod;

    // 评估价值，人民币默认单位为元，小数点保留2位
    /**
     * @example 1000000.00
     *
     * @var string
     */
    public $evaluationAmt;

    // 评估价值货币类型,比如：CNY=人民币
    /**
     * @example CNY
     *
     * @var string
     */
    public $evaluationAmtCurrency;

    // 担保范围列表,比如：MAIN_CLAIM=主债权
    /**
     * @example MAIN_CLAIM
     *
     * @var string[]
     */
    public $guaranteeScopeJson;

    // 担保范围备注
    /**
     * @example 其他担保范围
     *
     * @var string
     */
    public $guaranteeScopeNote;

    // 抵押方式，比如：MAX_AMOUNT_MORT=最高额抵押权
    /**
     * @example MAX_AMOUNT_MORT
     *
     * @var string
     */
    public $mortgageType;

    // 被担保主债权数额,人民币默认单位元，保留两位小数点
    /**
     * @example 500000.00
     *
     * @var string
     */
    public $debtAmt;

    // 被担保主债权数额货币类型，比如：CNY=人民币
    /**
     * @example CNY
     *
     * @var string
     */
    public $debtAmtCurrency;

    // 履债结束日期
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $debtEndDate;

    // 履债起始日期
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $debtStartDate;

    // 抵押物属性,比如：REGISTED_BUILDING=已建成并登记发证建筑物
    /**
     * @example REGISTED_BUILDING
     *
     * @var string
     */
    public $mortRealtyProperty;

    // 合同债权金额币种
    /**
     * @example CNY
     *
     * @var string
     */
    public $arDebtAmtCurrency;

    // 合同债权金额
    /**
     * @example 1500000.00
     *
     * @var string
     */
    public $arDebtAmt;

    // 房产链内部抵押单号
    /**
     * @example 20200810001220100000000000000001
     *
     * @var string
     */
    public $mgOrderNo;
    protected $_name = [
        'conflictHandleMethod'  => 'conflict_handle_method',
        'evaluationAmt'         => 'evaluation_amt',
        'evaluationAmtCurrency' => 'evaluation_amt_currency',
        'guaranteeScopeJson'    => 'guarantee_scope_json',
        'guaranteeScopeNote'    => 'guarantee_scope_note',
        'mortgageType'          => 'mortgage_type',
        'debtAmt'               => 'debt_amt',
        'debtAmtCurrency'       => 'debt_amt_currency',
        'debtEndDate'           => 'debt_end_date',
        'debtStartDate'         => 'debt_start_date',
        'mortRealtyProperty'    => 'mort_realty_property',
        'arDebtAmtCurrency'     => 'ar_debt_amt_currency',
        'arDebtAmt'             => 'ar_debt_amt',
        'mgOrderNo'             => 'mg_order_no',
    ];

    public function validate()
    {
        Model::validatePattern('debtEndDate', $this->debtEndDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('debtStartDate', $this->debtStartDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->conflictHandleMethod) {
            $res['conflict_handle_method'] = $this->conflictHandleMethod;
        }
        if (null !== $this->evaluationAmt) {
            $res['evaluation_amt'] = $this->evaluationAmt;
        }
        if (null !== $this->evaluationAmtCurrency) {
            $res['evaluation_amt_currency'] = $this->evaluationAmtCurrency;
        }
        if (null !== $this->guaranteeScopeJson) {
            $res['guarantee_scope_json'] = $this->guaranteeScopeJson;
        }
        if (null !== $this->guaranteeScopeNote) {
            $res['guarantee_scope_note'] = $this->guaranteeScopeNote;
        }
        if (null !== $this->mortgageType) {
            $res['mortgage_type'] = $this->mortgageType;
        }
        if (null !== $this->debtAmt) {
            $res['debt_amt'] = $this->debtAmt;
        }
        if (null !== $this->debtAmtCurrency) {
            $res['debt_amt_currency'] = $this->debtAmtCurrency;
        }
        if (null !== $this->debtEndDate) {
            $res['debt_end_date'] = $this->debtEndDate;
        }
        if (null !== $this->debtStartDate) {
            $res['debt_start_date'] = $this->debtStartDate;
        }
        if (null !== $this->mortRealtyProperty) {
            $res['mort_realty_property'] = $this->mortRealtyProperty;
        }
        if (null !== $this->arDebtAmtCurrency) {
            $res['ar_debt_amt_currency'] = $this->arDebtAmtCurrency;
        }
        if (null !== $this->arDebtAmt) {
            $res['ar_debt_amt'] = $this->arDebtAmt;
        }
        if (null !== $this->mgOrderNo) {
            $res['mg_order_no'] = $this->mgOrderNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MortGuaranteeInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['conflict_handle_method'])) {
            $model->conflictHandleMethod = $map['conflict_handle_method'];
        }
        if (isset($map['evaluation_amt'])) {
            $model->evaluationAmt = $map['evaluation_amt'];
        }
        if (isset($map['evaluation_amt_currency'])) {
            $model->evaluationAmtCurrency = $map['evaluation_amt_currency'];
        }
        if (isset($map['guarantee_scope_json'])) {
            if (!empty($map['guarantee_scope_json'])) {
                $model->guaranteeScopeJson = $map['guarantee_scope_json'];
            }
        }
        if (isset($map['guarantee_scope_note'])) {
            $model->guaranteeScopeNote = $map['guarantee_scope_note'];
        }
        if (isset($map['mortgage_type'])) {
            $model->mortgageType = $map['mortgage_type'];
        }
        if (isset($map['debt_amt'])) {
            $model->debtAmt = $map['debt_amt'];
        }
        if (isset($map['debt_amt_currency'])) {
            $model->debtAmtCurrency = $map['debt_amt_currency'];
        }
        if (isset($map['debt_end_date'])) {
            $model->debtEndDate = $map['debt_end_date'];
        }
        if (isset($map['debt_start_date'])) {
            $model->debtStartDate = $map['debt_start_date'];
        }
        if (isset($map['mort_realty_property'])) {
            $model->mortRealtyProperty = $map['mort_realty_property'];
        }
        if (isset($map['ar_debt_amt_currency'])) {
            $model->arDebtAmtCurrency = $map['ar_debt_amt_currency'];
        }
        if (isset($map['ar_debt_amt'])) {
            $model->arDebtAmt = $map['ar_debt_amt'];
        }
        if (isset($map['mg_order_no'])) {
            $model->mgOrderNo = $map['mg_order_no'];
        }

        return $model;
    }
}
