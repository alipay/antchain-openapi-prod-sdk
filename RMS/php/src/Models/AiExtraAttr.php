<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class AiExtraAttr extends Model {
    protected $_name = [
        'timeRangeThres' => 'time_range_thres',
        'abnormalValueThres' => 'abnormal_value_thres',
        'valueRangeThres' => 'value_range_thres',
        'algoScoreThres' => 'algo_score_thres',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->timeRangeThres) {
            $res['time_range_thres'] = $this->timeRangeThres;
        }
        if (null !== $this->abnormalValueThres) {
            $res['abnormal_value_thres'] = $this->abnormalValueThres;
        }
        if (null !== $this->valueRangeThres) {
            $res['value_range_thres'] = $this->valueRangeThres;
        }
        if (null !== $this->algoScoreThres) {
            $res['algo_score_thres'] = $this->algoScoreThres;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AiExtraAttr
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['time_range_thres'])){
            $model->timeRangeThres = $map['time_range_thres'];
        }
        if(isset($map['abnormal_value_thres'])){
            $model->abnormalValueThres = $map['abnormal_value_thres'];
        }
        if(isset($map['value_range_thres'])){
            $model->valueRangeThres = $map['value_range_thres'];
        }
        if(isset($map['algo_score_thres'])){
            $model->algoScoreThres = $map['algo_score_thres'];
        }
        return $model;
    }
    // time_range_thres
    /**
     * @example time_range_thres
     * @var string
     */
    public $timeRangeThres;

    // abnormal_value_thres
    /**
     * @example abnormal_value_thres
     * @var string
     */
    public $abnormalValueThres;

    // value_range_thres
    /**
     * @example value_range_thres
     * @var string
     */
    public $valueRangeThres;

    // algo_score_thres
    /**
     * @example algo_score_thres
     * @var string
     */
    public $algoScoreThres;

}
