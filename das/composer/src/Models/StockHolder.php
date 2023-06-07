<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class StockHolder extends Model
{
    // 股东类型
    /**
     * @example 自然人
     *
     * @var string
     */
    public $orgHolderType;

    // 出资时间
    /**
     * @example 2047-04-19
     *
     * @var string
     */
    public $investDate;

    // 占比
    /**
     * @example 100.00%
     *
     * @var string
     */
    public $investRate;

    // 出资金额
    /**
     * @example 1000
     *
     * @var string
     */
    public $subscriptAmt;

    // 股东名
    /**
     * @example xxx
     *
     * @var string
     */
    public $orHolderName;
    protected $_name = [
        'orgHolderType' => 'org_holder_type',
        'investDate'    => 'invest_date',
        'investRate'    => 'invest_rate',
        'subscriptAmt'  => 'subscript_amt',
        'orHolderName'  => 'or_holder_name',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orgHolderType) {
            $res['org_holder_type'] = $this->orgHolderType;
        }
        if (null !== $this->investDate) {
            $res['invest_date'] = $this->investDate;
        }
        if (null !== $this->investRate) {
            $res['invest_rate'] = $this->investRate;
        }
        if (null !== $this->subscriptAmt) {
            $res['subscript_amt'] = $this->subscriptAmt;
        }
        if (null !== $this->orHolderName) {
            $res['or_holder_name'] = $this->orHolderName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StockHolder
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['org_holder_type'])) {
            $model->orgHolderType = $map['org_holder_type'];
        }
        if (isset($map['invest_date'])) {
            $model->investDate = $map['invest_date'];
        }
        if (isset($map['invest_rate'])) {
            $model->investRate = $map['invest_rate'];
        }
        if (isset($map['subscript_amt'])) {
            $model->subscriptAmt = $map['subscript_amt'];
        }
        if (isset($map['or_holder_name'])) {
            $model->orHolderName = $map['or_holder_name'];
        }

        return $model;
    }
}
