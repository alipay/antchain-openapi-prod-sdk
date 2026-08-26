<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class AbcStructC extends Model {
    protected $_name = [
        'stringParamC' => 'string_param_c',
        'numberParamC' => 'number_param_c',
        'booleanParamC' => 'boolean_param_c',
        'dateParamC' => 'date_param_c',
        'arrayParamC' => 'array_param_c',
    ];
    public function validate() {
        Model::validatePattern('dateParamC', $this->dateParamC, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->stringParamC) {
            $res['string_param_c'] = $this->stringParamC;
        }
        if (null !== $this->numberParamC) {
            $res['number_param_c'] = $this->numberParamC;
        }
        if (null !== $this->booleanParamC) {
            $res['boolean_param_c'] = $this->booleanParamC;
        }
        if (null !== $this->dateParamC) {
            $res['date_param_c'] = $this->dateParamC;
        }
        if (null !== $this->arrayParamC) {
            $res['array_param_c'] = $this->arrayParamC;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AbcStructC
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['string_param_c'])){
            $model->stringParamC = $map['string_param_c'];
        }
        if(isset($map['number_param_c'])){
            $model->numberParamC = $map['number_param_c'];
        }
        if(isset($map['boolean_param_c'])){
            $model->booleanParamC = $map['boolean_param_c'];
        }
        if(isset($map['date_param_c'])){
            $model->dateParamC = $map['date_param_c'];
        }
        if(isset($map['array_param_c'])){
            if(!empty($map['array_param_c'])){
                $model->arrayParamC = $map['array_param_c'];
            }
        }
        return $model;
    }
    // string_c
    /**
     * @example string_c
     * @var string
     */
    public $stringParamC;

    // number_c
    /**
     * @example 200
     * @var int
     */
    public $numberParamC;

    // boolean_c
    /**
     * @example true, false
     * @var bool
     */
    public $booleanParamC;

    // date_c
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $dateParamC;

    // string_c
    /**
     * @example string_c
     * @var string[]
     */
    public $arrayParamC;

}
