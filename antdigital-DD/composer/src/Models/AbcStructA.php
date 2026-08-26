<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\AbcStructB;

class AbcStructA extends Model {
    protected $_name = [
        'stringParamA' => 'string_param_a',
        'numberParamA' => 'number_param_a',
        'booleanParamA' => 'boolean_param_a',
        'dateParamA' => 'date_param_a',
        'structParamA' => 'struct_param_a',
    ];
    public function validate() {
        Model::validatePattern('dateParamA', $this->dateParamA, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->stringParamA) {
            $res['string_param_a'] = $this->stringParamA;
        }
        if (null !== $this->numberParamA) {
            $res['number_param_a'] = $this->numberParamA;
        }
        if (null !== $this->booleanParamA) {
            $res['boolean_param_a'] = $this->booleanParamA;
        }
        if (null !== $this->dateParamA) {
            $res['date_param_a'] = $this->dateParamA;
        }
        if (null !== $this->structParamA) {
            $res['struct_param_a'] = null !== $this->structParamA ? $this->structParamA->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AbcStructA
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['string_param_a'])){
            $model->stringParamA = $map['string_param_a'];
        }
        if(isset($map['number_param_a'])){
            $model->numberParamA = $map['number_param_a'];
        }
        if(isset($map['boolean_param_a'])){
            $model->booleanParamA = $map['boolean_param_a'];
        }
        if(isset($map['date_param_a'])){
            $model->dateParamA = $map['date_param_a'];
        }
        if(isset($map['struct_param_a'])){
            $model->structParamA = AbcStructB::fromMap($map['struct_param_a']);
        }
        return $model;
    }
    // string_a
    /**
     * @example string
     * @var string
     */
    public $stringParamA;

    // number_a
    /**
     * @example 800
     * @var int
     */
    public $numberParamA;

    // boolean_a
    /**
     * @example true, false
     * @var bool
     */
    public $booleanParamA;

    // date_a
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $dateParamA;

    // struct_a
    /**
     * @example struct_param
     * @var AbcStructB
     */
    public $structParamA;

}
