<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RMS\Models\AlarmTypeStatsVO;

class AlarmTypeStatsVOKeySet extends Model {
    protected $_name = [
        'key' => 'key',
        'value' => 'value',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->value) {
            $res['value'] = null !== $this->value ? $this->value->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AlarmTypeStatsVOKeySet
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['key'])){
            $model->key = $map['key'];
        }
        if(isset($map['value'])){
            $model->value = AlarmTypeStatsVO::fromMap($map['value']);
        }
        return $model;
    }
    // key
    /**
     * @example key
     * @var string
     */
    public $key;

    // value
    /**
     * @example value
     * @var AlarmTypeStatsVO
     */
    public $value;

}
