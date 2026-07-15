<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

class BiddingAnalysisData extends Model {
    protected $_name = [
        'period' => 'period',
        'realtimeData' => 'realtime_data',
        'dayAheadData' => 'day_ahead_data',
        'preclearingData' => 'preclearing_data',
        'actualData' => 'actual_data',
        'realtimePredictionData' => 'realtime_prediction_data',
        'dayAheadPredictionData' => 'day_ahead_prediction_data',
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
        if (null !== $this->realtimeData) {
            $res['realtime_data'] = $this->realtimeData;
        }
        if (null !== $this->dayAheadData) {
            $res['day_ahead_data'] = $this->dayAheadData;
        }
        if (null !== $this->preclearingData) {
            $res['preclearing_data'] = $this->preclearingData;
        }
        if (null !== $this->actualData) {
            $res['actual_data'] = $this->actualData;
        }
        if (null !== $this->realtimePredictionData) {
            $res['realtime_prediction_data'] = $this->realtimePredictionData;
        }
        if (null !== $this->dayAheadPredictionData) {
            $res['day_ahead_prediction_data'] = $this->dayAheadPredictionData;
        }
        if (null !== $this->deviationData) {
            $res['deviation_data'] = $this->deviationData;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return BiddingAnalysisData
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['period'])){
            $model->period = $map['period'];
        }
        if(isset($map['realtime_data'])){
            $model->realtimeData = $map['realtime_data'];
        }
        if(isset($map['day_ahead_data'])){
            $model->dayAheadData = $map['day_ahead_data'];
        }
        if(isset($map['preclearing_data'])){
            $model->preclearingData = $map['preclearing_data'];
        }
        if(isset($map['actual_data'])){
            $model->actualData = $map['actual_data'];
        }
        if(isset($map['realtime_prediction_data'])){
            $model->realtimePredictionData = $map['realtime_prediction_data'];
        }
        if(isset($map['day_ahead_prediction_data'])){
            $model->dayAheadPredictionData = $map['day_ahead_prediction_data'];
        }
        if(isset($map['deviation_data'])){
            $model->deviationData = $map['deviation_data'];
        }
        return $model;
    }
    // 时间点位
    /**
     * @example 01:00
     * @var string
     */
    public $period;

    // 实时数据
    /**
     * @example 10.0
     * @var string
     */
    public $realtimeData;

    // 日前数据
    /**
     * @example 10.0
     * @var string
     */
    public $dayAheadData;

    // 预出清数据
    /**
     * @example 10.0
     * @var string
     */
    public $preclearingData;

    // 实际数据
    /**
     * @example 10.0
     * @var string
     */
    public $actualData;

    // 实时预测数据
    /**
     * @example 10.0
     * @var string
     */
    public $realtimePredictionData;

    // 日前预测数据
    /**
     * @example 10.0
     * @var string
     */
    public $dayAheadPredictionData;

    // 偏差值
    /**
     * @example 10.0
     * @var string
     */
    public $deviationData;

}
