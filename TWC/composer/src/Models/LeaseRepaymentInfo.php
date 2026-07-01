<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class LeaseRepaymentInfo extends Model
{
    // 融资租赁还款流水
    /**
     * @example 20211231123000123
     *
     * @var string
     */
    public $repaymentUniqueId;

    // 还款批次
    /**
     * @example 1
     *
     * @var string
     */
    public $returnIndex;

    // 还款日期
    /**
     * @example 2019-07-31 12:00:00
     *
     * @var string
     */
    public $returnTime;

    // 还款总额,本金+利息，精确到毫厘，即123400表示12.34元
    /**
     * @example 123400
     *
     * @var int
     */
    public $returnMoney;

    // 还款结果状态,1.成功 2.失败
    /**
     * @example 1
     *
     * @var int
     */
    public $returnStatus;

    // 还款结果简要描述,长度不超过256
    /**
     * @example ""
     *
     * @var string
     */
    public $returnDescription;

    // 还款来源,1.共管账号，2.网商清分
    /**
     * @example 2
     *
     * @var int
     */
    public $source;

    // 剩余应还期数
    /**
     * @example 1
     *
     * @var int
     */
    public $remainReturnTerm;

    // 本期剩余应还金额，精确到毫厘，即123400表示12.34元
    /**
     * @example 123400
     *
     * @var int
     */
    public $remainReturnMoney;

    // 逾期状态,0为未逾期，1表示逾期
    /**
     * @example 0
     *
     * @var int
     */
    public $overdueStatus;

    // 逾期利率（日利率）,精确到小数点后四位 12.34% 表示为1234
    /**
     * @example 0
     *
     * @var int
     */
    public $overdueRate;

    // 逾期天数,支用到期日开始计算
    /**
     * @example 0
     *
     * @var int
     */
    public $overdueDay;

    // 逾期应还款总额,本金+利息+逾期利息,精确到毫厘，即123400表示12.34元
    /**
     * @example 0
     *
     * @var int
     */
    public $overdueMoney;
    protected $_name = [
        'repaymentUniqueId' => 'repayment_unique_id',
        'returnIndex'       => 'return_index',
        'returnTime'        => 'return_time',
        'returnMoney'       => 'return_money',
        'returnStatus'      => 'return_status',
        'returnDescription' => 'return_description',
        'source'            => 'source',
        'remainReturnTerm'  => 'remain_return_term',
        'remainReturnMoney' => 'remain_return_money',
        'overdueStatus'     => 'overdue_status',
        'overdueRate'       => 'overdue_rate',
        'overdueDay'        => 'overdue_day',
        'overdueMoney'      => 'overdue_money',
    ];

    public function validate()
    {
        Model::validateRequired('repaymentUniqueId', $this->repaymentUniqueId, true);
        Model::validateRequired('returnIndex', $this->returnIndex, true);
        Model::validateRequired('returnTime', $this->returnTime, true);
        Model::validateRequired('returnMoney', $this->returnMoney, true);
        Model::validateRequired('returnStatus', $this->returnStatus, true);
        Model::validateRequired('returnDescription', $this->returnDescription, true);
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('remainReturnTerm', $this->remainReturnTerm, true);
        Model::validateRequired('remainReturnMoney', $this->remainReturnMoney, true);
        Model::validateRequired('overdueStatus', $this->overdueStatus, true);
        Model::validateRequired('overdueRate', $this->overdueRate, true);
        Model::validateRequired('overdueDay', $this->overdueDay, true);
        Model::validateRequired('overdueMoney', $this->overdueMoney, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->repaymentUniqueId) {
            $res['repayment_unique_id'] = $this->repaymentUniqueId;
        }
        if (null !== $this->returnIndex) {
            $res['return_index'] = $this->returnIndex;
        }
        if (null !== $this->returnTime) {
            $res['return_time'] = $this->returnTime;
        }
        if (null !== $this->returnMoney) {
            $res['return_money'] = $this->returnMoney;
        }
        if (null !== $this->returnStatus) {
            $res['return_status'] = $this->returnStatus;
        }
        if (null !== $this->returnDescription) {
            $res['return_description'] = $this->returnDescription;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->remainReturnTerm) {
            $res['remain_return_term'] = $this->remainReturnTerm;
        }
        if (null !== $this->remainReturnMoney) {
            $res['remain_return_money'] = $this->remainReturnMoney;
        }
        if (null !== $this->overdueStatus) {
            $res['overdue_status'] = $this->overdueStatus;
        }
        if (null !== $this->overdueRate) {
            $res['overdue_rate'] = $this->overdueRate;
        }
        if (null !== $this->overdueDay) {
            $res['overdue_day'] = $this->overdueDay;
        }
        if (null !== $this->overdueMoney) {
            $res['overdue_money'] = $this->overdueMoney;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LeaseRepaymentInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['repayment_unique_id'])) {
            $model->repaymentUniqueId = $map['repayment_unique_id'];
        }
        if (isset($map['return_index'])) {
            $model->returnIndex = $map['return_index'];
        }
        if (isset($map['return_time'])) {
            $model->returnTime = $map['return_time'];
        }
        if (isset($map['return_money'])) {
            $model->returnMoney = $map['return_money'];
        }
        if (isset($map['return_status'])) {
            $model->returnStatus = $map['return_status'];
        }
        if (isset($map['return_description'])) {
            $model->returnDescription = $map['return_description'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['remain_return_term'])) {
            $model->remainReturnTerm = $map['remain_return_term'];
        }
        if (isset($map['remain_return_money'])) {
            $model->remainReturnMoney = $map['remain_return_money'];
        }
        if (isset($map['overdue_status'])) {
            $model->overdueStatus = $map['overdue_status'];
        }
        if (isset($map['overdue_rate'])) {
            $model->overdueRate = $map['overdue_rate'];
        }
        if (isset($map['overdue_day'])) {
            $model->overdueDay = $map['overdue_day'];
        }
        if (isset($map['overdue_money'])) {
            $model->overdueMoney = $map['overdue_money'];
        }

        return $model;
    }
}
