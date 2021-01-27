<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

use AntChain\IAM\Models\AuthenticateEvent;

class AuthenticateBatchEvent extends Model {
    protected $_name = [
        'events' => 'events',
    ];
    public function validate() {
        Model::validateRequired('events', $this->events, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->events) {
            $res['events'] = [];
            if(null !== $this->events && is_array($this->events)){
                $n = 0;
                foreach($this->events as $item){
                    $res['events'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AuthenticateBatchEvent
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['events'])){
            if(!empty($map['events'])){
                $model->events = [];
                $n = 0;
                foreach($map['events'] as $item) {
                    $model->events[$n++] = null !== $item ? AuthenticateEvent::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 鉴权事件列表
    /**
     * @example 
     * @var AuthenticateEvent[]
     */
    public $events;

}
