<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DEMOSDK\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DEMOSDK\Models\TestParamB;

class TestParamA extends Model {
    protected $_name = [
        'stringParam' => 'string_param',
        'numberParam' => 'number_param',
        'booleanParam' => 'boolean_param',
        'dateParam' => 'date_param',
        'structParama' => 'struct_parama',
        'structListA' => 'struct_list_a',
    ];
    public function validate() {
        Model::validatePattern('dateParam', $this->dateParam, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validateRequired('structParama', $this->structParama, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->stringParam) {
            $res['string_param'] = $this->stringParam;
        }
        if (null !== $this->numberParam) {
            $res['number_param'] = $this->numberParam;
        }
        if (null !== $this->booleanParam) {
            $res['boolean_param'] = $this->booleanParam;
        }
        if (null !== $this->dateParam) {
            $res['date_param'] = $this->dateParam;
        }
        if (null !== $this->structParama) {
            $res['struct_parama'] = null !== $this->structParama ? $this->structParama->toMap() : null;
        }
        if (null !== $this->structListA) {
            $res['struct_list_a'] = [];
            if(null !== $this->structListA && is_array($this->structListA)){
                $n = 0;
                foreach($this->structListA as $item){
                    $res['struct_list_a'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return TestParamA
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['string_param'])){
            $model->stringParam = $map['string_param'];
        }
        if(isset($map['number_param'])){
            $model->numberParam = $map['number_param'];
        }
        if(isset($map['boolean_param'])){
            $model->booleanParam = $map['boolean_param'];
        }
        if(isset($map['date_param'])){
            $model->dateParam = $map['date_param'];
        }
        if(isset($map['struct_parama'])){
            $model->structParama = TestParamB::fromMap($map['struct_parama']);
        }
        if(isset($map['struct_list_a'])){
            if(!empty($map['struct_list_a'])){
                $model->structListA = [];
                $n = 0;
                foreach($map['struct_list_a'] as $item) {
                    $model->structListA[$n++] = null !== $item ? TestParamB::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // string_param
    /**
     * @example string_param
     * @var string
     */
    public $stringParam;

    // number_param
    /**
     * @example 1
     * @var int
     */
    public $numberParam;

    // boolean_param
    /**
     * @example true, false
     * @var bool
     */
    public $booleanParam;

    // date_param
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $dateParam;

    // struct_parama
    /**
     * @example 
     * @var TestParamB
     */
    public $structParama;

    // 结构体列表a
    /**
     * @example undefined
     * @var TestParamB[]
     */
    public $structListA;

}
