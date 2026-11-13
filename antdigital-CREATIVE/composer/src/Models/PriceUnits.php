<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVE\Models;

use AlibabaCloud\Tea\Model;

class PriceUnits extends Model {
    protected $_name = [
        'dimensions' => 'dimensions',
        'metrics' => 'metrics',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->dimensions) {
            $res['dimensions'] = $this->dimensions;
        }
        if (null !== $this->metrics) {
            $res['metrics'] = $this->metrics;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PriceUnits
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['dimensions'])){
            $model->dimensions = $map['dimensions'];
        }
        if(isset($map['metrics'])){
            $model->metrics = $map['metrics'];
        }
        return $model;
    }
    // 当前输出单元定价维度
    /**
     * @example {"test":"1"}
     * @var string
     */
    public $dimensions;

    // 当前输出单元计量指标
    /**
     * @example {"test":"1"}
     * @var string
     */
    public $metrics;

}
