<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

class AheadRealtimePriceCompareData extends Model {
    protected $_name = [
        'period' => 'period',
        'realtimeRate' => 'realtime_rate',
        'dayaheadRate' => 'dayahead_rate',
        'equalRate' => 'equal_rate',
        'deviationData' => 'deviation_data',
        'realtimeAvg' => 'realtime_avg',
        'dayAheadAvg' => 'day_ahead_avg',
        'deviationAvg' => 'deviation_avg',
        'priceDiff' => 'price_diff',
        'priceDiffAvg' => 'price_diff_avg',
    ];
    public function validate() {
        Model::validateRequired('period', $this->period, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->period) {
            $res['period'] = $this->period;
        }
        if (null !== $this->realtimeRate) {
            $res['realtime_rate'] = $this->realtimeRate;
        }
        if (null !== $this->dayaheadRate) {
            $res['dayahead_rate'] = $this->dayaheadRate;
        }
        if (null !== $this->equalRate) {
            $res['equal_rate'] = $this->equalRate;
        }
        if (null !== $this->deviationData) {
            $res['deviation_data'] = $this->deviationData;
        }
        if (null !== $this->realtimeAvg) {
            $res['realtime_avg'] = $this->realtimeAvg;
        }
        if (null !== $this->dayAheadAvg) {
            $res['day_ahead_avg'] = $this->dayAheadAvg;
        }
        if (null !== $this->deviationAvg) {
            $res['deviation_avg'] = $this->deviationAvg;
        }
        if (null !== $this->priceDiff) {
            $res['price_diff'] = $this->priceDiff;
        }
        if (null !== $this->priceDiffAvg) {
            $res['price_diff_avg'] = $this->priceDiffAvg;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AheadRealtimePriceCompareData
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['period'])){
            $model->period = $map['period'];
        }
        if(isset($map['realtime_rate'])){
            $model->realtimeRate = $map['realtime_rate'];
        }
        if(isset($map['dayahead_rate'])){
            $model->dayaheadRate = $map['dayahead_rate'];
        }
        if(isset($map['equal_rate'])){
            $model->equalRate = $map['equal_rate'];
        }
        if(isset($map['deviation_data'])){
            $model->deviationData = $map['deviation_data'];
        }
        if(isset($map['realtime_avg'])){
            $model->realtimeAvg = $map['realtime_avg'];
        }
        if(isset($map['day_ahead_avg'])){
            $model->dayAheadAvg = $map['day_ahead_avg'];
        }
        if(isset($map['deviation_avg'])){
            $model->deviationAvg = $map['deviation_avg'];
        }
        if(isset($map['price_diff'])){
            $model->priceDiff = $map['price_diff'];
        }
        if(isset($map['price_diff_avg'])){
            $model->priceDiffAvg = $map['price_diff_avg'];
        }
        return $model;
    }
    // 时间点位
    /**
     * @example 01:00
     * @var string
     */
    public $period;

    // 日前大于实时占比
    /**
     * @example 10.0
     * @var string
     */
    public $realtimeRate;

    // 日前等于实时占比
    /**
     * @example 10.0
     * @var string
     */
    public $dayaheadRate;

    // 日前小于实时占比
    /**
     * @example 10.0
     * @var string
     */
    public $equalRate;

    // 偏差值
    /**
     * @example 10.0
     * @var string
     */
    public $deviationData;

    // 实时电价均值
    /**
     * @example 10.0
     * @var string
     */
    public $realtimeAvg;

    // 日前电价均值
    /**
     * @example 10.0
     * @var string
     */
    public $dayAheadAvg;

    // 偏差均值
    /**
     * @example 10.0
     * @var string
     */
    public $deviationAvg;

    // 差价数值
    /**
     * @example 10.0
     * @var string
     */
    public $priceDiff;

    // 价差均值
    /**
     * @example 10.0
     * @var string
     */
    public $priceDiffAvg;

}
