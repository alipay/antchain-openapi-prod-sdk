<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RMS\Models\Threshold;

class Trigger extends Model {
    protected $_name = [
        'valueField' => 'value_field',
        'valueIndex' => 'value_index',
        'type' => 'type',
        'n' => 'n',
        'compare' => 'compare',
        'comparePercent' => 'compare_percent',
        'threshold' => 'threshold',
        'thresholdCopy' => 'threshold_copy',
        'valueIsPercent' => 'value_is_percent',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->valueField) {
            $res['value_field'] = $this->valueField;
        }
        if (null !== $this->valueIndex) {
            $res['value_index'] = $this->valueIndex;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->n) {
            $res['n'] = $this->n;
        }
        if (null !== $this->compare) {
            $res['compare'] = $this->compare;
        }
        if (null !== $this->comparePercent) {
            $res['compare_percent'] = $this->comparePercent;
        }
        if (null !== $this->threshold) {
            $res['threshold'] = null !== $this->threshold ? $this->threshold->toMap() : null;
        }
        if (null !== $this->thresholdCopy) {
            $res['threshold_copy'] = null !== $this->thresholdCopy ? $this->thresholdCopy->toMap() : null;
        }
        if (null !== $this->valueIsPercent) {
            $res['value_is_percent'] = $this->valueIsPercent;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Trigger
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['value_field'])){
            $model->valueField = $map['value_field'];
        }
        if(isset($map['value_index'])){
            $model->valueIndex = $map['value_index'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['n'])){
            $model->n = $map['n'];
        }
        if(isset($map['compare'])){
            $model->compare = $map['compare'];
        }
        if(isset($map['compare_percent'])){
            $model->comparePercent = $map['compare_percent'];
        }
        if(isset($map['threshold'])){
            $model->threshold = Threshold::fromMap($map['threshold']);
        }
        if(isset($map['threshold_copy'])){
            $model->thresholdCopy = Threshold::fromMap($map['threshold_copy']);
        }
        if(isset($map['value_is_percent'])){
            $model->valueIsPercent = $map['value_is_percent'];
        }
        return $model;
    }
    // value_field
    /**
     * @example value_field
     * @var string
     */
    public $valueField;

    // value_index
    /**
     * @example value_index
     * @var int
     */
    public $valueIndex;

    // type
    /**
     * @example type
     * @var string
     */
    public $type;

    // n
    /**
     * @example n
     * @var int
     */
    public $n;

    // compare
    /**
     * @example compare
     * @var string
     */
    public $compare;

    // compare_percent
    /**
     * @example compare_percent
     * @var string
     */
    public $comparePercent;

    // threshold
    /**
     * @example threshold
     * @var Threshold
     */
    public $threshold;

    // threshold_copy
    /**
     * @example threshold_copy
     * @var Threshold
     */
    public $thresholdCopy;

    // value_is_percent
    /**
     * @example true,false
     * @var bool
     */
    public $valueIsPercent;

}
