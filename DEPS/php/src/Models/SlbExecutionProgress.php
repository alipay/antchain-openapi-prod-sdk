<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\Pair;

class SlbExecutionProgress extends Model {
    protected $_name = [
        'id' => 'id',
        'name' => 'name',
        'state' => 'state',
        'mountWeights' => 'mount_weights',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->mountWeights) {
            $res['mount_weights'] = [];
            if(null !== $this->mountWeights && is_array($this->mountWeights)){
                $n = 0;
                foreach($this->mountWeights as $item){
                    $res['mount_weights'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SlbExecutionProgress
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['state'])){
            $model->state = $map['state'];
        }
        if(isset($map['mount_weights'])){
            if(!empty($map['mount_weights'])){
                $model->mountWeights = [];
                $n = 0;
                foreach($map['mount_weights'] as $item) {
                    $model->mountWeights[$n++] = null !== $item ? Pair::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 进度 ID
    /**
     * @example 123
     * @var string
     */
    public $id;

    // 进度名称
    /**
     * @example aa
     * @var string
     */
    public $name;

    // 状态
    /**
     * @example FAILED
     * @var string
     */
    public $state;

    // 挂载权重
    /**
     * @example 
     * @var Pair[]
     */
    public $mountWeights;

}
