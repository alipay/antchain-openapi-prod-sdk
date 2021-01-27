<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

use AntChain\IAM\Models\Condition;

class AuthenticateEvent extends Model {
    protected $_name = [
        'actions' => 'actions',
        'actorId' => 'actor_id',
        'conditions' => 'conditions',
        'id' => 'id',
    ];
    public function validate() {
        Model::validateRequired('actions', $this->actions, true);
        Model::validateRequired('actorId', $this->actorId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->actions) {
            $res['actions'] = $this->actions;
        }
        if (null !== $this->actorId) {
            $res['actor_id'] = $this->actorId;
        }
        if (null !== $this->conditions) {
            $res['conditions'] = [];
            if(null !== $this->conditions && is_array($this->conditions)){
                $n = 0;
                foreach($this->conditions as $item){
                    $res['conditions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AuthenticateEvent
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['actions'])){
            if(!empty($map['actions'])){
                $model->actions = $map['actions'];
            }
        }
        if(isset($map['actor_id'])){
            $model->actorId = $map['actor_id'];
        }
        if(isset($map['conditions'])){
            if(!empty($map['conditions'])){
                $model->conditions = [];
                $n = 0;
                foreach($map['conditions'] as $item) {
                    $model->conditions[$n++] = null !== $item ? Condition::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        return $model;
    }
    // 鉴权操作列表
    /**
     * @example 
     * @var string[]
     */
    public $actions;

    // 鉴权对象ID
    /**
     * @example 123
     * @var string
     */
    public $actorId;

    // 鉴权条件
    /**
     * @example 
     * @var Condition[]
     */
    public $conditions;

    // 唯一ID
    /**
     * @example 123
     * @var string
     */
    public $id;

}
