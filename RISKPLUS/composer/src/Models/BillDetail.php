<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class BillDetail extends Model
{
    // 对账流水号，在扣款回盘文件中返回，用于对账
    /**
     * @example xxxx
     *
     * @var string
     */
    public $serialNumber;

    // 还款期数
    /**
     * @example 1
     *
     * @var int
     */
    public $rpyTerm;

    // 账单维度的还款总额（单位：分），单笔账单本利罚之和
    /**
     * @example 1999.98
     *
     * @var int
     */
    public $rpyAmt;

    // 实还本金（单位：分）
    /**
     * @example 1999.98
     *
     * @var int
     */
    public $rpyPrincipal;

    // 实还利息（单位：分）
    /**
     * @example 1999.98
     *
     * @var int
     */
    public $rpyFeeAmt;

    // 实还罚息（单位：分）
    /**
     * @example 1999.98
     *
     * @var int
     */
    public $rpyMuclt;

    // 其他科目金额，可能会其他类型的金额,用json数组的格式提高扩展性，涉及到保费和咨询服务费的项目，需要提供此字段。
    //
    /**
     * @example [{"fee":"费用（单位：分）","type":"（费用大项）1:保费, 2:信用评估费类","subType":"费用子项） 57:担保咨询服务费（属于信用评估费类型）  50:信用评估费（属于信用评估费类型）  40保费","insureMode":"分期乐内部担保模式号"}]
     *
     * @var string
     */
    public $otherInfo;

    // 用户实还日，用户主动发起是当前日；定时扣款是应还日，格式=yyyy-MM-dd
    /**
     * @example yyyy-MM-dd
     *
     * @var string
     */
    public $rpyDate;
    protected $_name = [
        'serialNumber' => 'serial_number',
        'rpyTerm'      => 'rpy_term',
        'rpyAmt'       => 'rpy_amt',
        'rpyPrincipal' => 'rpy_principal',
        'rpyFeeAmt'    => 'rpy_fee_amt',
        'rpyMuclt'     => 'rpy_muclt',
        'otherInfo'    => 'other_info',
        'rpyDate'      => 'rpy_date',
    ];

    public function validate()
    {
        Model::validateRequired('rpyTerm', $this->rpyTerm, true);
        Model::validateRequired('rpyAmt', $this->rpyAmt, true);
        Model::validateRequired('rpyPrincipal', $this->rpyPrincipal, true);
        Model::validateRequired('rpyFeeAmt', $this->rpyFeeAmt, true);
        Model::validateRequired('rpyMuclt', $this->rpyMuclt, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->serialNumber) {
            $res['serial_number'] = $this->serialNumber;
        }
        if (null !== $this->rpyTerm) {
            $res['rpy_term'] = $this->rpyTerm;
        }
        if (null !== $this->rpyAmt) {
            $res['rpy_amt'] = $this->rpyAmt;
        }
        if (null !== $this->rpyPrincipal) {
            $res['rpy_principal'] = $this->rpyPrincipal;
        }
        if (null !== $this->rpyFeeAmt) {
            $res['rpy_fee_amt'] = $this->rpyFeeAmt;
        }
        if (null !== $this->rpyMuclt) {
            $res['rpy_muclt'] = $this->rpyMuclt;
        }
        if (null !== $this->otherInfo) {
            $res['other_info'] = $this->otherInfo;
        }
        if (null !== $this->rpyDate) {
            $res['rpy_date'] = $this->rpyDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BillDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['serial_number'])) {
            $model->serialNumber = $map['serial_number'];
        }
        if (isset($map['rpy_term'])) {
            $model->rpyTerm = $map['rpy_term'];
        }
        if (isset($map['rpy_amt'])) {
            $model->rpyAmt = $map['rpy_amt'];
        }
        if (isset($map['rpy_principal'])) {
            $model->rpyPrincipal = $map['rpy_principal'];
        }
        if (isset($map['rpy_fee_amt'])) {
            $model->rpyFeeAmt = $map['rpy_fee_amt'];
        }
        if (isset($map['rpy_muclt'])) {
            $model->rpyMuclt = $map['rpy_muclt'];
        }
        if (isset($map['other_info'])) {
            $model->otherInfo = $map['other_info'];
        }
        if (isset($map['rpy_date'])) {
            $model->rpyDate = $map['rpy_date'];
        }

        return $model;
    }
}
