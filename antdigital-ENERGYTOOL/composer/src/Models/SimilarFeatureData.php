<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

class SimilarFeatureData extends Model {
    protected $_name = [
        'period' => 'period',
        'runDayAheadPrice' => 'run_day_ahead_price',
        'similarDayAheadPrice' => 'similar_day_ahead_price',
        'similarRealtimePrice' => 'similar_realtime_price',
        'runPreclearingData' => 'run_preclearing_data',
        'similarPreclearingData' => 'similar_preclearing_data',
        'similarRealtimeData' => 'similar_realtime_data',
        'deviationData' => 'deviation_data',
    ];
    public function validate() {
        Model::validateRequired('period', $this->period, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->period) {
            $res['period'] = $this->period;
        }
        if (null !== $this->runDayAheadPrice) {
            $res['run_day_ahead_price'] = $this->runDayAheadPrice;
        }
        if (null !== $this->similarDayAheadPrice) {
            $res['similar_day_ahead_price'] = $this->similarDayAheadPrice;
        }
        if (null !== $this->similarRealtimePrice) {
            $res['similar_realtime_price'] = $this->similarRealtimePrice;
        }
        if (null !== $this->runPreclearingData) {
            $res['run_preclearing_data'] = $this->runPreclearingData;
        }
        if (null !== $this->similarPreclearingData) {
            $res['similar_preclearing_data'] = $this->similarPreclearingData;
        }
        if (null !== $this->similarRealtimeData) {
            $res['similar_realtime_data'] = $this->similarRealtimeData;
        }
        if (null !== $this->deviationData) {
            $res['deviation_data'] = $this->deviationData;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SimilarFeatureData
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['period'])){
            $model->period = $map['period'];
        }
        if(isset($map['run_day_ahead_price'])){
            $model->runDayAheadPrice = $map['run_day_ahead_price'];
        }
        if(isset($map['similar_day_ahead_price'])){
            $model->similarDayAheadPrice = $map['similar_day_ahead_price'];
        }
        if(isset($map['similar_realtime_price'])){
            $model->similarRealtimePrice = $map['similar_realtime_price'];
        }
        if(isset($map['run_preclearing_data'])){
            $model->runPreclearingData = $map['run_preclearing_data'];
        }
        if(isset($map['similar_preclearing_data'])){
            $model->similarPreclearingData = $map['similar_preclearing_data'];
        }
        if(isset($map['similar_realtime_data'])){
            $model->similarRealtimeData = $map['similar_realtime_data'];
        }
        if(isset($map['deviation_data'])){
            $model->deviationData = $map['deviation_data'];
        }
        return $model;
    }
    // 时间点位
    /**
     * @example 时间点位
     * @var string
     */
    public $period;

    // 运行日日前电价
    /**
     * @example 10.0
     * @var string
     */
    public $runDayAheadPrice;

    // 相似日日前电价
    /**
     * @example 10.0
     * @var string
     */
    public $similarDayAheadPrice;

    // 相似日实际电价
    /**
     * @example 10.0
     * @var string
     */
    public $similarRealtimePrice;

    // 运行日预出清数据值
    /**
     * @example 10.0
     * @var string
     */
    public $runPreclearingData;

    // 相似日预出清数据值
    /**
     * @example 10.0
     * @var string
     */
    public $similarPreclearingData;

    // 相似日实际数据值
    /**
     * @example 10.0
     * @var string
     */
    public $similarRealtimeData;

    // 预出清数据偏差值, =运行日预出清数据值-相似日预出清数据值
    /**
     * @example 0.0
     * @var string
     */
    public $deviationData;

}
