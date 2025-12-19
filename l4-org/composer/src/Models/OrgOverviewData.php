<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ORG\Models;

use AlibabaCloud\Tea\Model;

class OrgOverviewData extends Model
{
    // 预算总金额
    /**
     * @example 100.01
     *
     * @var string
     */
    public $totalBudgetAmt;

    // 花呗预算金额
    /**
     * @example 100.01
     *
     * @var string
     */
    public $huabeiBudgetAmt;

    // 借呗预算金额
    /**
     * @example 100.01
     *
     * @var string
     */
    public $jiebeiBudgetAmt;

    // 小微预算金额
    /**
     * @example 100.01
     *
     * @var string
     */
    public $xiaoweiBudgetAmt;

    // 服务费预算金额
    /**
     * @example 100.01
     *
     * @var string
     */
    public $serviceBudgetAmt;

    // 总回款金额
    /**
     * @example 100.01
     *
     * @var string
     */
    public $totalRepaymentAmt;

    // 花呗回款金额
    /**
     * @example 100.01
     *
     * @var string
     */
    public $huabeiRepaymentAmt;

    // 借呗回款金额
    /**
     * @example 100.01
     *
     * @var string
     */
    public $jiebeiRepaymentAmt;

    // 小微回款金额
    /**
     * @example 100.01
     *
     * @var string
     */
    public $xiaoweiRepaymentAmt;

    // 总交易金额
    /**
     * @example 100.01
     *
     * @var string
     */
    public $totalTradeAmt;

    // 花呗交易金额
    /**
     * @example 100.01
     *
     * @var string
     */
    public $huabeiTradeAmt;

    // 借呗交易金额
    /**
     * @example 100.01
     *
     * @var string
     */
    public $jiebeiTradeAmt;

    // 小微交易金额
    /**
     * @example 100.01
     *
     * @var string
     */
    public $xiaoweiTradeAmt;

    // 内部补贴金额
    /**
     * @example 100.01
     *
     * @var string
     */
    public $internalSubsidyAmt;

    // 净回款额
    /**
     * @example 100.01
     *
     * @var string
     */
    public $totalNetRepaymentAmt;

    // 活动roi
    /**
     * @example 2.1
     *
     * @var string
     */
    public $activityRoi;

    // 花呗roi
    /**
     * @example 2.1
     *
     * @var string
     */
    public $huabeiRoi;

    // 借呗roi
    /**
     * @example 2.1
     *
     * @var string
     */
    public $jiebeiRoi;

    // 小微roi
    /**
     * @example 2.1
     *
     * @var string
     */
    public $xiaoweiRoi;
    protected $_name = [
        'totalBudgetAmt'       => 'total_budget_amt',
        'huabeiBudgetAmt'      => 'huabei_budget_amt',
        'jiebeiBudgetAmt'      => 'jiebei_budget_amt',
        'xiaoweiBudgetAmt'     => 'xiaowei_budget_amt',
        'serviceBudgetAmt'     => 'service_budget_amt',
        'totalRepaymentAmt'    => 'total_repayment_amt',
        'huabeiRepaymentAmt'   => 'huabei_repayment_amt',
        'jiebeiRepaymentAmt'   => 'jiebei_repayment_amt',
        'xiaoweiRepaymentAmt'  => 'xiaowei_repayment_amt',
        'totalTradeAmt'        => 'total_trade_amt',
        'huabeiTradeAmt'       => 'huabei_trade_amt',
        'jiebeiTradeAmt'       => 'jiebei_trade_amt',
        'xiaoweiTradeAmt'      => 'xiaowei_trade_amt',
        'internalSubsidyAmt'   => 'internal_subsidy_amt',
        'totalNetRepaymentAmt' => 'total_net_repayment_amt',
        'activityRoi'          => 'activity_roi',
        'huabeiRoi'            => 'huabei_roi',
        'jiebeiRoi'            => 'jiebei_roi',
        'xiaoweiRoi'           => 'xiaowei_roi',
    ];

    public function validate()
    {
        Model::validateRequired('totalBudgetAmt', $this->totalBudgetAmt, true);
        Model::validateRequired('huabeiBudgetAmt', $this->huabeiBudgetAmt, true);
        Model::validateRequired('jiebeiBudgetAmt', $this->jiebeiBudgetAmt, true);
        Model::validateRequired('xiaoweiBudgetAmt', $this->xiaoweiBudgetAmt, true);
        Model::validateRequired('serviceBudgetAmt', $this->serviceBudgetAmt, true);
        Model::validateRequired('totalRepaymentAmt', $this->totalRepaymentAmt, true);
        Model::validateRequired('huabeiRepaymentAmt', $this->huabeiRepaymentAmt, true);
        Model::validateRequired('jiebeiRepaymentAmt', $this->jiebeiRepaymentAmt, true);
        Model::validateRequired('xiaoweiRepaymentAmt', $this->xiaoweiRepaymentAmt, true);
        Model::validateRequired('totalTradeAmt', $this->totalTradeAmt, true);
        Model::validateRequired('huabeiTradeAmt', $this->huabeiTradeAmt, true);
        Model::validateRequired('jiebeiTradeAmt', $this->jiebeiTradeAmt, true);
        Model::validateRequired('xiaoweiTradeAmt', $this->xiaoweiTradeAmt, true);
        Model::validateRequired('internalSubsidyAmt', $this->internalSubsidyAmt, true);
        Model::validateRequired('totalNetRepaymentAmt', $this->totalNetRepaymentAmt, true);
        Model::validateRequired('activityRoi', $this->activityRoi, true);
        Model::validateRequired('huabeiRoi', $this->huabeiRoi, true);
        Model::validateRequired('jiebeiRoi', $this->jiebeiRoi, true);
        Model::validateRequired('xiaoweiRoi', $this->xiaoweiRoi, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->totalBudgetAmt) {
            $res['total_budget_amt'] = $this->totalBudgetAmt;
        }
        if (null !== $this->huabeiBudgetAmt) {
            $res['huabei_budget_amt'] = $this->huabeiBudgetAmt;
        }
        if (null !== $this->jiebeiBudgetAmt) {
            $res['jiebei_budget_amt'] = $this->jiebeiBudgetAmt;
        }
        if (null !== $this->xiaoweiBudgetAmt) {
            $res['xiaowei_budget_amt'] = $this->xiaoweiBudgetAmt;
        }
        if (null !== $this->serviceBudgetAmt) {
            $res['service_budget_amt'] = $this->serviceBudgetAmt;
        }
        if (null !== $this->totalRepaymentAmt) {
            $res['total_repayment_amt'] = $this->totalRepaymentAmt;
        }
        if (null !== $this->huabeiRepaymentAmt) {
            $res['huabei_repayment_amt'] = $this->huabeiRepaymentAmt;
        }
        if (null !== $this->jiebeiRepaymentAmt) {
            $res['jiebei_repayment_amt'] = $this->jiebeiRepaymentAmt;
        }
        if (null !== $this->xiaoweiRepaymentAmt) {
            $res['xiaowei_repayment_amt'] = $this->xiaoweiRepaymentAmt;
        }
        if (null !== $this->totalTradeAmt) {
            $res['total_trade_amt'] = $this->totalTradeAmt;
        }
        if (null !== $this->huabeiTradeAmt) {
            $res['huabei_trade_amt'] = $this->huabeiTradeAmt;
        }
        if (null !== $this->jiebeiTradeAmt) {
            $res['jiebei_trade_amt'] = $this->jiebeiTradeAmt;
        }
        if (null !== $this->xiaoweiTradeAmt) {
            $res['xiaowei_trade_amt'] = $this->xiaoweiTradeAmt;
        }
        if (null !== $this->internalSubsidyAmt) {
            $res['internal_subsidy_amt'] = $this->internalSubsidyAmt;
        }
        if (null !== $this->totalNetRepaymentAmt) {
            $res['total_net_repayment_amt'] = $this->totalNetRepaymentAmt;
        }
        if (null !== $this->activityRoi) {
            $res['activity_roi'] = $this->activityRoi;
        }
        if (null !== $this->huabeiRoi) {
            $res['huabei_roi'] = $this->huabeiRoi;
        }
        if (null !== $this->jiebeiRoi) {
            $res['jiebei_roi'] = $this->jiebeiRoi;
        }
        if (null !== $this->xiaoweiRoi) {
            $res['xiaowei_roi'] = $this->xiaoweiRoi;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OrgOverviewData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['total_budget_amt'])) {
            $model->totalBudgetAmt = $map['total_budget_amt'];
        }
        if (isset($map['huabei_budget_amt'])) {
            $model->huabeiBudgetAmt = $map['huabei_budget_amt'];
        }
        if (isset($map['jiebei_budget_amt'])) {
            $model->jiebeiBudgetAmt = $map['jiebei_budget_amt'];
        }
        if (isset($map['xiaowei_budget_amt'])) {
            $model->xiaoweiBudgetAmt = $map['xiaowei_budget_amt'];
        }
        if (isset($map['service_budget_amt'])) {
            $model->serviceBudgetAmt = $map['service_budget_amt'];
        }
        if (isset($map['total_repayment_amt'])) {
            $model->totalRepaymentAmt = $map['total_repayment_amt'];
        }
        if (isset($map['huabei_repayment_amt'])) {
            $model->huabeiRepaymentAmt = $map['huabei_repayment_amt'];
        }
        if (isset($map['jiebei_repayment_amt'])) {
            $model->jiebeiRepaymentAmt = $map['jiebei_repayment_amt'];
        }
        if (isset($map['xiaowei_repayment_amt'])) {
            $model->xiaoweiRepaymentAmt = $map['xiaowei_repayment_amt'];
        }
        if (isset($map['total_trade_amt'])) {
            $model->totalTradeAmt = $map['total_trade_amt'];
        }
        if (isset($map['huabei_trade_amt'])) {
            $model->huabeiTradeAmt = $map['huabei_trade_amt'];
        }
        if (isset($map['jiebei_trade_amt'])) {
            $model->jiebeiTradeAmt = $map['jiebei_trade_amt'];
        }
        if (isset($map['xiaowei_trade_amt'])) {
            $model->xiaoweiTradeAmt = $map['xiaowei_trade_amt'];
        }
        if (isset($map['internal_subsidy_amt'])) {
            $model->internalSubsidyAmt = $map['internal_subsidy_amt'];
        }
        if (isset($map['total_net_repayment_amt'])) {
            $model->totalNetRepaymentAmt = $map['total_net_repayment_amt'];
        }
        if (isset($map['activity_roi'])) {
            $model->activityRoi = $map['activity_roi'];
        }
        if (isset($map['huabei_roi'])) {
            $model->huabeiRoi = $map['huabei_roi'];
        }
        if (isset($map['jiebei_roi'])) {
            $model->jiebeiRoi = $map['jiebei_roi'];
        }
        if (isset($map['xiaowei_roi'])) {
            $model->xiaoweiRoi = $map['xiaowei_roi'];
        }

        return $model;
    }
}
