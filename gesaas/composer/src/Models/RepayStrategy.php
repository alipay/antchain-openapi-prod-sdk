<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class RepayStrategy extends Model
{
    // 应付租金时间，精确到天 格式为yyyy-MM-dd
    /**
     * @example 2025-09-19
     *
     * @var string
     */
    public $payDay;

    // 用户还款期数，从1开始
    /**
     * @example 1
     *
     * @var int
     */
    public $termIndex;

    // 应付租金，精确到分，即1234表示12.34元 大于0
    /**
     * @example 1234
     *
     * @var int
     */
    public $rentaMoney;

    // 是否经营分账, Y-是、N-否 为空代表否
    /**
     * @example Y
     *
     * @var string
     */
    public $operateDivideFlag;

    // 经营分账收入方列表
    // 当operateDivideFlag 为Y时必填
    /**
     * @example
     *
     * @var OperateDivideTransInModel[]
     */
    public $operateDivideTransInList;
    protected $_name = [
        'payDay'                   => 'pay_day',
        'termIndex'                => 'term_index',
        'rentaMoney'               => 'renta_money',
        'operateDivideFlag'        => 'operate_divide_flag',
        'operateDivideTransInList' => 'operate_divide_trans_in_list',
    ];

    public function validate()
    {
        Model::validateRequired('payDay', $this->payDay, true);
        Model::validateRequired('termIndex', $this->termIndex, true);
        Model::validateRequired('rentaMoney', $this->rentaMoney, true);
        Model::validateRequired('operateDivideTransInList', $this->operateDivideTransInList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->payDay) {
            $res['pay_day'] = $this->payDay;
        }
        if (null !== $this->termIndex) {
            $res['term_index'] = $this->termIndex;
        }
        if (null !== $this->rentaMoney) {
            $res['renta_money'] = $this->rentaMoney;
        }
        if (null !== $this->operateDivideFlag) {
            $res['operate_divide_flag'] = $this->operateDivideFlag;
        }
        if (null !== $this->operateDivideTransInList) {
            $res['operate_divide_trans_in_list'] = [];
            if (null !== $this->operateDivideTransInList && \is_array($this->operateDivideTransInList)) {
                $n = 0;
                foreach ($this->operateDivideTransInList as $item) {
                    $res['operate_divide_trans_in_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RepayStrategy
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['pay_day'])) {
            $model->payDay = $map['pay_day'];
        }
        if (isset($map['term_index'])) {
            $model->termIndex = $map['term_index'];
        }
        if (isset($map['renta_money'])) {
            $model->rentaMoney = $map['renta_money'];
        }
        if (isset($map['operate_divide_flag'])) {
            $model->operateDivideFlag = $map['operate_divide_flag'];
        }
        if (isset($map['operate_divide_trans_in_list'])) {
            if (!empty($map['operate_divide_trans_in_list'])) {
                $model->operateDivideTransInList = [];
                $n                               = 0;
                foreach ($map['operate_divide_trans_in_list'] as $item) {
                    $model->operateDivideTransInList[$n++] = null !== $item ? OperateDivideTransInModel::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
