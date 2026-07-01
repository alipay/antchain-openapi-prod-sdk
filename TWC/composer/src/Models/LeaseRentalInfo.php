<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class LeaseRentalInfo extends Model
{
    // 租期编号
    /**
     * @example 1
     *
     * @var int
     */
    public $term;

    // 租金归还状态，1.足额归还2.部分归还3.未归还
    /**
     * @example 1
     *
     * @var int
     */
    public $rentalReturnState;

    // 租金归还金额,精确到毫厘，即123400表示12.34元
    /**
     * @example 123400
     *
     * @var int
     */
    public $rentalMoney;

    // 归还时间
    /**
     * @example 2019-07-31 12:00:00
     *
     * @var string
     */
    public $returnTime;

    // 归还方式，1.预授权代扣2.支付宝代扣3.主动还款4.其他，5网商直付通代扣
    /**
     * @example 1
     *
     * @var int
     */
    public $returnWay;

    // 还款凭证类型，1.支付宝2.平台代收（客户主动还款）3.其他
    /**
     * @example 1
     *
     * @var int
     */
    public $returnVoucherType;

    // 还款凭证编号，不超过128字符，支付宝流水号
    /**
     * @example 20212312312313
     *
     * @var string
     */
    public $returnVoucherSerial;

    // 剩余归还期数
    /**
     * @example 11
     *
     * @var int
     */
    public $remainTerm;
    protected $_name = [
        'term'                => 'term',
        'rentalReturnState'   => 'rental_return_state',
        'rentalMoney'         => 'rental_money',
        'returnTime'          => 'return_time',
        'returnWay'           => 'return_way',
        'returnVoucherType'   => 'return_voucher_type',
        'returnVoucherSerial' => 'return_voucher_serial',
        'remainTerm'          => 'remain_term',
    ];

    public function validate()
    {
        Model::validateRequired('term', $this->term, true);
        Model::validateRequired('rentalReturnState', $this->rentalReturnState, true);
        Model::validateRequired('rentalMoney', $this->rentalMoney, true);
        Model::validateRequired('returnTime', $this->returnTime, true);
        Model::validateRequired('returnWay', $this->returnWay, true);
        Model::validateRequired('returnVoucherType', $this->returnVoucherType, true);
        Model::validateRequired('returnVoucherSerial', $this->returnVoucherSerial, true);
        Model::validateRequired('remainTerm', $this->remainTerm, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->term) {
            $res['term'] = $this->term;
        }
        if (null !== $this->rentalReturnState) {
            $res['rental_return_state'] = $this->rentalReturnState;
        }
        if (null !== $this->rentalMoney) {
            $res['rental_money'] = $this->rentalMoney;
        }
        if (null !== $this->returnTime) {
            $res['return_time'] = $this->returnTime;
        }
        if (null !== $this->returnWay) {
            $res['return_way'] = $this->returnWay;
        }
        if (null !== $this->returnVoucherType) {
            $res['return_voucher_type'] = $this->returnVoucherType;
        }
        if (null !== $this->returnVoucherSerial) {
            $res['return_voucher_serial'] = $this->returnVoucherSerial;
        }
        if (null !== $this->remainTerm) {
            $res['remain_term'] = $this->remainTerm;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LeaseRentalInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['term'])) {
            $model->term = $map['term'];
        }
        if (isset($map['rental_return_state'])) {
            $model->rentalReturnState = $map['rental_return_state'];
        }
        if (isset($map['rental_money'])) {
            $model->rentalMoney = $map['rental_money'];
        }
        if (isset($map['return_time'])) {
            $model->returnTime = $map['return_time'];
        }
        if (isset($map['return_way'])) {
            $model->returnWay = $map['return_way'];
        }
        if (isset($map['return_voucher_type'])) {
            $model->returnVoucherType = $map['return_voucher_type'];
        }
        if (isset($map['return_voucher_serial'])) {
            $model->returnVoucherSerial = $map['return_voucher_serial'];
        }
        if (isset($map['remain_term'])) {
            $model->remainTerm = $map['remain_term'];
        }

        return $model;
    }
}
