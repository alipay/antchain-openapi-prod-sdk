<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COLLABINV\Models;

use AlibabaCloud\Tea\Model;

class IndustryData extends Model
{
    // 行业
    /**
     * @example 餐饮美食
     *
     * @var string
     */
    public $industry;

    // 区域
    /**
     * @example 北京
     *
     * @var string
     */
    public $province;

    // 日期
    /**
     * @example 202506
     *
     * @var string
     */
    public $tradeDate;

    // 线上线下 1:线下，0:线上，-1:全部
    /**
     * @example -1
     *
     * @var string
     */
    public $ofpType;

    // 消费规模指数(销售金额)
    /**
     * @example 1
     *
     * @var string
     */
    public $tradeScale;

    // 交易活跃指数(次数)
    /**
     * @example 1
     *
     * @var string
     */
    public $tradeActivity;

    // 消费价值指数(金额/次数)
    /**
     * @example 1
     *
     * @var string
     */
    public $tradeValue;

    // 交易覆盖指数(去重人数)
    /**
     * @example 1
     *
     * @var string
     */
    public $tradeCoverage;
    protected $_name = [
        'industry'      => 'industry',
        'province'      => 'province',
        'tradeDate'     => 'trade_date',
        'ofpType'       => 'ofp_type',
        'tradeScale'    => 'trade_scale',
        'tradeActivity' => 'trade_activity',
        'tradeValue'    => 'trade_value',
        'tradeCoverage' => 'trade_coverage',
    ];

    public function validate()
    {
        Model::validateRequired('industry', $this->industry, true);
        Model::validateRequired('province', $this->province, true);
        Model::validateRequired('tradeDate', $this->tradeDate, true);
        Model::validateRequired('ofpType', $this->ofpType, true);
        Model::validateRequired('tradeScale', $this->tradeScale, true);
        Model::validateRequired('tradeActivity', $this->tradeActivity, true);
        Model::validateRequired('tradeValue', $this->tradeValue, true);
        Model::validateRequired('tradeCoverage', $this->tradeCoverage, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->industry) {
            $res['industry'] = $this->industry;
        }
        if (null !== $this->province) {
            $res['province'] = $this->province;
        }
        if (null !== $this->tradeDate) {
            $res['trade_date'] = $this->tradeDate;
        }
        if (null !== $this->ofpType) {
            $res['ofp_type'] = $this->ofpType;
        }
        if (null !== $this->tradeScale) {
            $res['trade_scale'] = $this->tradeScale;
        }
        if (null !== $this->tradeActivity) {
            $res['trade_activity'] = $this->tradeActivity;
        }
        if (null !== $this->tradeValue) {
            $res['trade_value'] = $this->tradeValue;
        }
        if (null !== $this->tradeCoverage) {
            $res['trade_coverage'] = $this->tradeCoverage;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IndustryData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['industry'])) {
            $model->industry = $map['industry'];
        }
        if (isset($map['province'])) {
            $model->province = $map['province'];
        }
        if (isset($map['trade_date'])) {
            $model->tradeDate = $map['trade_date'];
        }
        if (isset($map['ofp_type'])) {
            $model->ofpType = $map['ofp_type'];
        }
        if (isset($map['trade_scale'])) {
            $model->tradeScale = $map['trade_scale'];
        }
        if (isset($map['trade_activity'])) {
            $model->tradeActivity = $map['trade_activity'];
        }
        if (isset($map['trade_value'])) {
            $model->tradeValue = $map['trade_value'];
        }
        if (isset($map['trade_coverage'])) {
            $model->tradeCoverage = $map['trade_coverage'];
        }

        return $model;
    }
}
