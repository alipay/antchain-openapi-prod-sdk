<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RMS\Models\AlarmHistory;

class AlarmHistoryListKeySet extends Model {
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
     * @return AlarmHistoryListKeySet
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['key'])){
            $model->key = $map['key'];
        }
        if(isset($map['value'])){
            if(!empty($map['value'])){
                $model->value = [];
                $n = 0;
                foreach($map['value'] as $item) {
                    $model->value[$n++] = null !== $item ? AlarmHistory::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // key
    /**
     * @example key
     * @var string
     */
    public $key;

    // AlarmHistoryListKeySet
    /**
     * @example AlarmHistoryListKeySet
     * @var AlarmHistory[]
     */
    public $value;

}
