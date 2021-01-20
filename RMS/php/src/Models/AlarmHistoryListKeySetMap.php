<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RMS\Models\AlarmHistoryListKeySet;

class AlarmHistoryListKeySetMap extends Model {
    protected $_name = [
        'key' => 'key',
        'entity' => 'entity',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->entity) {
            $res['entity'] = [];
            if(null !== $this->entity && is_array($this->entity)){
                $n = 0;
                foreach($this->entity as $item){
                    $res['entity'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AlarmHistoryListKeySetMap
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['key'])){
            $model->key = $map['key'];
        }
        if(isset($map['entity'])){
            if(!empty($map['entity'])){
                $model->entity = [];
                $n = 0;
                foreach($map['entity'] as $item) {
                    $model->entity[$n++] = null !== $item ? AlarmHistoryListKeySet::fromMap($item) : $item;
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

    // value
    /**
     * @example value
     * @var AlarmHistoryListKeySet[]
     */
    public $entity;

}
