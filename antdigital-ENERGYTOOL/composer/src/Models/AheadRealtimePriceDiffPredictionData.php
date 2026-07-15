<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

class AheadRealtimePriceDiffPredictionData extends Model {
    protected $_name = [
        'period' => 'period',
        'realDirection' => 'real_direction',
        'preDirection' => 'pre_direction',
        'realDayAheadDiff' => 'real_day_ahead_diff',
        'preDayAheadDiff' => 'pre_day_ahead_diff',
    ];
    public function validate() {
        Model::validateRequired('period', $this->period, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->period) {
            $res['period'] = $this->period;
        }
        if (null !== $this->realDirection) {
            $res['real_direction'] = $this->realDirection;
        }
        if (null !== $this->preDirection) {
            $res['pre_direction'] = $this->preDirection;
        }
        if (null !== $this->realDayAheadDiff) {
            $res['real_day_ahead_diff'] = $this->realDayAheadDiff;
        }
        if (null !== $this->preDayAheadDiff) {
            $res['pre_day_ahead_diff'] = $this->preDayAheadDiff;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AheadRealtimePriceDiffPredictionData
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['period'])){
            $model->period = $map['period'];
        }
        if(isset($map['real_direction'])){
            $model->realDirection = $map['real_direction'];
        }
        if(isset($map['pre_direction'])){
            $model->preDirection = $map['pre_direction'];
        }
        if(isset($map['real_day_ahead_diff'])){
            $model->realDayAheadDiff = $map['real_day_ahead_diff'];
        }
        if(isset($map['pre_day_ahead_diff'])){
            $model->preDayAheadDiff = $map['pre_day_ahead_diff'];
        }
        return $model;
    }
    // 时间点位
    /**
     * @example 01:00
     * @var string
     */
    public $period;

    // 实际价差方向
    /**
     * @example 10.0
     * @var string
     */
    public $realDirection;

    // 预测价差方向
    /**
     * @example 10.0
     * @var string
     */
    public $preDirection;

    // 实际日前实时价差
    /**
     * @example 10.0
     * @var string
     */
    public $realDayAheadDiff;

    // 预测日前实时价差
    /**
     * @example 10.0
     * @var string
     */
    public $preDayAheadDiff;

}
