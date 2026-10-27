<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class MetricItemInfo extends Model {
    protected $_name = [
        'metricType' => 'metric_type',
        'measureTime' => 'measure_time',
        'value' => 'value',
        'unit' => 'unit',
        'ext' => 'ext',
    ];
    public function validate() {
        Model::validateRequired('metricType', $this->metricType, true);
        Model::validateRequired('measureTime', $this->measureTime, true);
        Model::validateRequired('value', $this->value, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->metricType) {
            $res['metric_type'] = $this->metricType;
        }
        if (null !== $this->measureTime) {
            $res['measure_time'] = $this->measureTime;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->unit) {
            $res['unit'] = $this->unit;
        }
        if (null !== $this->ext) {
            $res['ext'] = $this->ext;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return MetricItemInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['metric_type'])){
            $model->metricType = $map['metric_type'];
        }
        if(isset($map['measure_time'])){
            $model->measureTime = $map['measure_time'];
        }
        if(isset($map['value'])){
            $model->value = $map['value'];
        }
        if(isset($map['unit'])){
            $model->unit = $map['unit'];
        }
        if(isset($map['ext'])){
            $model->ext = $map['ext'];
        }
        return $model;
    }
    // 指标类型 心率:HEART_RATE/血氧:BLOOD_OXYGEN/体温:BODY_TEMP/步数:STEPS/睡眠:SLEEP/呼吸率:RESP_RATE/压力:STRESS/疲劳:FATIGUE/情绪:EMOTION/...
    /**
     * @example HEART_RATE
     * @var string
     */
    public $metricType;

    // 测量时间(毫秒级时间戳)
    /**
     * @example 
     * @var int
     */
    public $measureTime;

    // 指标值
    /**
     * @example 
     * @var string
     */
    public $value;

    // 指标值单位 -平台固定值
    /**
     * @example 
     * @var string
     */
    public $unit;

    // 扩展字段（JSON），如睡眠阶段时长等
    /**
     * @example 
     * @var string
     */
    public $ext;

}
