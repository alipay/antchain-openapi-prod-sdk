<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

use AntChain\STLR\Models\ProcessDetail;

class GclLcaModel extends Model {
    protected $_name = [
        'modelName' => 'model_name',
        'processList' => 'process_list',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->modelName) {
            $res['model_name'] = $this->modelName;
        }
        if (null !== $this->processList) {
            $res['process_list'] = [];
            if(null !== $this->processList && is_array($this->processList)){
                $n = 0;
                foreach($this->processList as $item){
                    $res['process_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GclLcaModel
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['model_name'])){
            $model->modelName = $map['model_name'];
        }
        if(isset($map['process_list'])){
            if(!empty($map['process_list'])){
                $model->processList = [];
                $n = 0;
                foreach($map['process_list'] as $item) {
                    $model->processList[$n++] = null !== $item ? ProcessDetail::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 模型名称
    /**
     * @example xxxx
     * @var string
     */
    public $modelName;

    // 过程信息
    /**
     * @example undefined
     * @var ProcessDetail[]
     */
    public $processList;

}
