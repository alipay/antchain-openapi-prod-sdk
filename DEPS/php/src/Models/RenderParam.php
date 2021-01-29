<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\ParamVal;

class RenderParam extends Model {
    protected $_name = [
        'key' => 'key',
        'value' => 'value',
        'type' => 'type',
        'desc' => 'desc',
        'dataLevel' => 'data_level',
        'renderVals' => 'render_vals',
    ];
    public function validate() {
        Model::validateRequired('key', $this->key, true);
        Model::validateRequired('value', $this->value, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('dataLevel', $this->dataLevel, true);
        Model::validateRequired('renderVals', $this->renderVals, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->dataLevel) {
            $res['data_level'] = $this->dataLevel;
        }
        if (null !== $this->renderVals) {
            $res['render_vals'] = [];
            if(null !== $this->renderVals && is_array($this->renderVals)){
                $n = 0;
                foreach($this->renderVals as $item){
                    $res['render_vals'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return RenderParam
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['key'])){
            $model->key = $map['key'];
        }
        if(isset($map['value'])){
            $model->value = $map['value'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['desc'])){
            $model->desc = $map['desc'];
        }
        if(isset($map['data_level'])){
            $model->dataLevel = $map['data_level'];
        }
        if(isset($map['render_vals'])){
            if(!empty($map['render_vals'])){
                $model->renderVals = [];
                $n = 0;
                foreach($map['render_vals'] as $item) {
                    $model->renderVals[$n++] = null !== $item ? ParamVal::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 参数名
    /**
     * @example appName
     * @var string
     */
    public $key;

    // 参数值，可能是一个常量或者表达式
    /**
     * @example {{app.cell.name}}
     * @var string
     */
    public $value;

    // 参数值类型，CONST/EXPR
    /**
     * @example CONST,EXPR
     * @var string
     */
    public $type;

    // 参数描述
    /**
     * @example 应用名称
     * @var string
     */
    public $desc;

    // 数据保密级别，L1,L2,L3
    /**
     * @example L1,L2,L3
     * @var string
     */
    public $dataLevel;

    // 参数渲染后的值
    /**
     * @example []
     * @var ParamVal[]
     */
    public $renderVals;

}
