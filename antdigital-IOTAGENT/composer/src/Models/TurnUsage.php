<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\IOTAGENT\Models\TurnModelCallsUsages;

class TurnUsage extends Model {
    protected $_name = [
        'turnId' => 'turn_id',
        'complete' => 'complete',
        'modelCalls' => 'model_calls',
    ];
    public function validate() {
        Model::validateRequired('turnId', $this->turnId, true);
        Model::validateRequired('complete', $this->complete, true);
        Model::validateRequired('modelCalls', $this->modelCalls, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->turnId) {
            $res['turn_id'] = $this->turnId;
        }
        if (null !== $this->complete) {
            $res['complete'] = $this->complete;
        }
        if (null !== $this->modelCalls) {
            $res['model_calls'] = [];
            if(null !== $this->modelCalls && is_array($this->modelCalls)){
                $n = 0;
                foreach($this->modelCalls as $item){
                    $res['model_calls'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return TurnUsage
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['turn_id'])){
            $model->turnId = $map['turn_id'];
        }
        if(isset($map['complete'])){
            $model->complete = $map['complete'];
        }
        if(isset($map['model_calls'])){
            if(!empty($map['model_calls'])){
                $model->modelCalls = [];
                $n = 0;
                foreach($map['model_calls'] as $item) {
                    $model->modelCalls[$n++] = null !== $item ? TurnModelCallsUsages::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 对话轮次ID
    /**
     * @example 7468486322254688256
     * @var string
     */
    public $turnId;

    // 该轮用量是否完整
    /**
     * @example true
     * @var bool
     */
    public $complete;

    // 模型调用明细
    /**
     * @example [{},{}]
     * @var TurnModelCallsUsages[]
     */
    public $modelCalls;

}
