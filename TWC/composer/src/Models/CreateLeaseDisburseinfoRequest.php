<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateLeaseDisburseinfoRequest extends Model
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

    // 共管账户，网商清分
    /**
     * @var string
     */
    public $activeAccount;

    // 对结果的简要描述信息
    /**
     * @var string
     */
    public $activeResultDesc;

    // 成功/失败 0表示失败，1表示成功
    /**
     * @var int
     */
    public $activeResultStatus;

    // 授信成功日期，格式为"2019-07-31 12:00:00"
    /**
     * @var string
     */
    public $activeReturnDate;

    // 本金+利息，精确到毫厘，即123400表示12.34元
    /**
     * @var int
     */
    public $activeReturnMoney;

    // 支用期限，精确到毫秒
    /**
     * @var int
     */
    public $disburseLimit;

    // 支用金额，精确到毫厘，即123400表示12.34元
    /**
     * @var int
     */
    public $disburseMoney;

    // 支用科目，服务费/租金，精确到毫厘，即123400表示12.34元
    /**
     * @var int
     */
    public $disburseService;

    // 逾期天数，支用到期日开始计算，天数为单位
    /**
     * @var int
     */
    public $exceedDuration;

    // 1未还款，2已还款
    /**
     * @var int
     */
    public $exceedPayBackStatus;

    // 逾期利率，精确到小数点后四位 12.34% 表示为1234
    /**
     * @var int
     */
    public $exceedRate;

    // 逾期应还款总额，本金+利息+逾期利息，精确到毫厘，即123400表示12.34元
    /**
     * @var int
     */
    public $exceedReturnMoney;

    // 贷款利率,银行同步利率，年化8%-15%,精确到小数点后四位 12.34% 表示为1234
    /**
     * @var int
     */
    public $loanRate;

    // 订单id 长度不可超过50
    /**
     * @var string
     */
    public $orderId;

    // 到期还款日，T+支用期限，节假日顺延至第一个工作日，格式为"2019-07-31 12:00:00"
    /**
     * @var string
     */
    public $payBackDate;

    // 到期还款金额，本金+利息，精确到毫厘，即123400表示12.34元
    /**
     * @var int
     */
    public $payBackMoney;

    // 应还利息，系统自动计算当日应还利息（T+1），精确到毫厘，即123400表示12.34元
    /**
     * @var int
     */
    public $returnInterest;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'activeAccount'       => 'active_account',
        'activeResultDesc'    => 'active_result_desc',
        'activeResultStatus'  => 'active_result_status',
        'activeReturnDate'    => 'active_return_date',
        'activeReturnMoney'   => 'active_return_money',
        'disburseLimit'       => 'disburse_limit',
        'disburseMoney'       => 'disburse_money',
        'disburseService'     => 'disburse_service',
        'exceedDuration'      => 'exceed_duration',
        'exceedPayBackStatus' => 'exceed_pay_back_status',
        'exceedRate'          => 'exceed_rate',
        'exceedReturnMoney'   => 'exceed_return_money',
        'loanRate'            => 'loan_rate',
        'orderId'             => 'order_id',
        'payBackDate'         => 'pay_back_date',
        'payBackMoney'        => 'pay_back_money',
        'returnInterest'      => 'return_interest',
    ];

    public function validate()
    {
        Model::validateRequired('activeAccount', $this->activeAccount, true);
        Model::validateRequired('activeResultDesc', $this->activeResultDesc, true);
        Model::validateRequired('activeResultStatus', $this->activeResultStatus, true);
        Model::validateRequired('activeReturnDate', $this->activeReturnDate, true);
        Model::validateRequired('activeReturnMoney', $this->activeReturnMoney, true);
        Model::validateRequired('disburseLimit', $this->disburseLimit, true);
        Model::validateRequired('disburseMoney', $this->disburseMoney, true);
        Model::validateRequired('disburseService', $this->disburseService, true);
        Model::validateRequired('exceedDuration', $this->exceedDuration, true);
        Model::validateRequired('exceedPayBackStatus', $this->exceedPayBackStatus, true);
        Model::validateRequired('exceedRate', $this->exceedRate, true);
        Model::validateRequired('exceedReturnMoney', $this->exceedReturnMoney, true);
        Model::validateRequired('loanRate', $this->loanRate, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('payBackDate', $this->payBackDate, true);
        Model::validateRequired('payBackMoney', $this->payBackMoney, true);
        Model::validateRequired('returnInterest', $this->returnInterest, true);
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
        if (null !== $this->activeAccount) {
            $res['active_account'] = $this->activeAccount;
        }
        if (null !== $this->activeResultDesc) {
            $res['active_result_desc'] = $this->activeResultDesc;
        }
        if (null !== $this->activeResultStatus) {
            $res['active_result_status'] = $this->activeResultStatus;
        }
        if (null !== $this->activeReturnDate) {
            $res['active_return_date'] = $this->activeReturnDate;
        }
        if (null !== $this->activeReturnMoney) {
            $res['active_return_money'] = $this->activeReturnMoney;
        }
        if (null !== $this->disburseLimit) {
            $res['disburse_limit'] = $this->disburseLimit;
        }
        if (null !== $this->disburseMoney) {
            $res['disburse_money'] = $this->disburseMoney;
        }
        if (null !== $this->disburseService) {
            $res['disburse_service'] = $this->disburseService;
        }
        if (null !== $this->exceedDuration) {
            $res['exceed_duration'] = $this->exceedDuration;
        }
        if (null !== $this->exceedPayBackStatus) {
            $res['exceed_pay_back_status'] = $this->exceedPayBackStatus;
        }
        if (null !== $this->exceedRate) {
            $res['exceed_rate'] = $this->exceedRate;
        }
        if (null !== $this->exceedReturnMoney) {
            $res['exceed_return_money'] = $this->exceedReturnMoney;
        }
        if (null !== $this->loanRate) {
            $res['loan_rate'] = $this->loanRate;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->payBackDate) {
            $res['pay_back_date'] = $this->payBackDate;
        }
        if (null !== $this->payBackMoney) {
            $res['pay_back_money'] = $this->payBackMoney;
        }
        if (null !== $this->returnInterest) {
            $res['return_interest'] = $this->returnInterest;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateLeaseDisburseinfoRequest
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
        if (isset($map['active_account'])) {
            $model->activeAccount = $map['active_account'];
        }
        if (isset($map['active_result_desc'])) {
            $model->activeResultDesc = $map['active_result_desc'];
        }
        if (isset($map['active_result_status'])) {
            $model->activeResultStatus = $map['active_result_status'];
        }
        if (isset($map['active_return_date'])) {
            $model->activeReturnDate = $map['active_return_date'];
        }
        if (isset($map['active_return_money'])) {
            $model->activeReturnMoney = $map['active_return_money'];
        }
        if (isset($map['disburse_limit'])) {
            $model->disburseLimit = $map['disburse_limit'];
        }
        if (isset($map['disburse_money'])) {
            $model->disburseMoney = $map['disburse_money'];
        }
        if (isset($map['disburse_service'])) {
            $model->disburseService = $map['disburse_service'];
        }
        if (isset($map['exceed_duration'])) {
            $model->exceedDuration = $map['exceed_duration'];
        }
        if (isset($map['exceed_pay_back_status'])) {
            $model->exceedPayBackStatus = $map['exceed_pay_back_status'];
        }
        if (isset($map['exceed_rate'])) {
            $model->exceedRate = $map['exceed_rate'];
        }
        if (isset($map['exceed_return_money'])) {
            $model->exceedReturnMoney = $map['exceed_return_money'];
        }
        if (isset($map['loan_rate'])) {
            $model->loanRate = $map['loan_rate'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['pay_back_date'])) {
            $model->payBackDate = $map['pay_back_date'];
        }
        if (isset($map['pay_back_money'])) {
            $model->payBackMoney = $map['pay_back_money'];
        }
        if (isset($map['return_interest'])) {
            $model->returnInterest = $map['return_interest'];
        }

        return $model;
    }
}
