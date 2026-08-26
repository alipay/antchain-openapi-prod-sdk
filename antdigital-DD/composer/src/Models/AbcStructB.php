<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\AbcStructC;

class AbcStructB extends Model {
    protected $_name = [
        'stringParamB' => 'string_param_b',
        'numberParamB' => 'number_param_b',
        'booleanParamB' => 'boolean_param_b',
        'dateParamB' => 'date_param_b',
        'arrayParamB' => 'array_param_b',
        'structParamB' => 'struct_param_b',
    ];
    public function validate() {
        Model::validatePattern('dateParamB', $this->dateParamB, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->stringParamB) {
            $res['string_param_b'] = $this->stringParamB;
        }
        if (null !== $this->numberParamB) {
            $res['number_param_b'] = $this->numberParamB;
        }
        if (null !== $this->booleanParamB) {
            $res['boolean_param_b'] = $this->booleanParamB;
        }
        if (null !== $this->dateParamB) {
            $res['date_param_b'] = $this->dateParamB;
        }
        if (null !== $this->arrayParamB) {
            $res['array_param_b'] = [];
            if(null !== $this->arrayParamB && is_array($this->arrayParamB)){
                $n = 0;
                foreach($this->arrayParamB as $item){
                    $res['array_param_b'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->structParamB) {
            $res['struct_param_b'] = null !== $this->structParamB ? $this->structParamB->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AbcStructB
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['string_param_b'])){
            $model->stringParamB = $map['string_param_b'];
        }
        if(isset($map['number_param_b'])){
            $model->numberParamB = $map['number_param_b'];
        }
        if(isset($map['boolean_param_b'])){
            $model->booleanParamB = $map['boolean_param_b'];
        }
        if(isset($map['date_param_b'])){
            $model->dateParamB = $map['date_param_b'];
        }
        if(isset($map['array_param_b'])){
            if(!empty($map['array_param_b'])){
                $model->arrayParamB = [];
                $n = 0;
                foreach($map['array_param_b'] as $item) {
                    $model->arrayParamB[$n++] = null !== $item ? AbcStructC::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['struct_param_b'])){
            $model->structParamB = AbcStructC::fromMap($map['struct_param_b']);
        }
        return $model;
    }
    // string_b
    /**
     * @example string_b
     * @var string
     */
    public $stringParamB;

    // number_b
    /**
     * @example 200
     * @var int
     */
    public $numberParamB;

    // boolean_b
    /**
     * @example true, false
     * @var bool
     */
    public $booleanParamB;

    // date_b
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $dateParamB;

    // array_b
    /**
     * @example array_param
     * @var AbcStructC[]
     */
    public $arrayParamB;

    // struct_b
    /**
     * @example struct_param
     * @var AbcStructC
     */
    public $structParamB;

}
