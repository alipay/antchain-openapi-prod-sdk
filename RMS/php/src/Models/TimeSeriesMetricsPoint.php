<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RMS\Models\TimeSeriesMetricsField;

class TimeSeriesMetricsPoint extends Model {
    protected $_name = [
        'timestamp' => 'timestamp',
        'value' => 'value',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->value) {
            $res['value'] = [];
            if(null !== $this->value && is_array($this->value)){
                $n = 0;
                foreach($this->value as $item){
                    $res['value'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return TimeSeriesMetricsPoint
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['timestamp'])){
            $model->timestamp = $map['timestamp'];
        }
        if(isset($map['value'])){
            if(!empty($map['value'])){
                $model->value = [];
                $n = 0;
                foreach($map['value'] as $item) {
                    $model->value[$n++] = null !== $item ? TimeSeriesMetricsField::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 时间戳 (毫秒)
    /**
     * @example 1574664720333
     * @var int
     */
    public $timestamp;

    // Metrics 某时间点的具体值
    /**
     * @example [{"key":"callCount","value":102},{"key":"errorCount","value":1},{"key":"rps","value":12.01}]
     * @var TimeSeriesMetricsField[]
     */
    public $value;

}
