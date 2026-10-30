<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DEMOSDK\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DEMOSDK\Models\McpTestStruct;

class TypeMcpResponseRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'stringParameter' => 'string_parameter',
        'numberParameter' => 'number_parameter',
        'booleanParameter' => 'boolean_parameter',
        'dateParameter' => 'date_parameter',
        'listParameter' => 'list_parameter',
        'structParameter' => 'struct_parameter',
        'timeout' => 'timeout',
    ];
    public function validate() {
        Model::validatePattern('dateParameter', $this->dateParameter, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validateRequired('timeout', $this->timeout, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->stringParameter) {
            $res['string_parameter'] = $this->stringParameter;
        }
        if (null !== $this->numberParameter) {
            $res['number_parameter'] = $this->numberParameter;
        }
        if (null !== $this->booleanParameter) {
            $res['boolean_parameter'] = $this->booleanParameter;
        }
        if (null !== $this->dateParameter) {
            $res['date_parameter'] = $this->dateParameter;
        }
        if (null !== $this->listParameter) {
            $res['list_parameter'] = [];
            if(null !== $this->listParameter && is_array($this->listParameter)){
                $n = 0;
                foreach($this->listParameter as $item){
                    $res['list_parameter'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->structParameter) {
            $res['struct_parameter'] = null !== $this->structParameter ? $this->structParameter->toMap() : null;
        }
        if (null !== $this->timeout) {
            $res['timeout'] = $this->timeout;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return TypeMcpResponseRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['string_parameter'])){
            $model->stringParameter = $map['string_parameter'];
        }
        if(isset($map['number_parameter'])){
            $model->numberParameter = $map['number_parameter'];
        }
        if(isset($map['boolean_parameter'])){
            $model->booleanParameter = $map['boolean_parameter'];
        }
        if(isset($map['date_parameter'])){
            $model->dateParameter = $map['date_parameter'];
        }
        if(isset($map['list_parameter'])){
            if(!empty($map['list_parameter'])){
                $model->listParameter = [];
                $n = 0;
                foreach($map['list_parameter'] as $item) {
                    $model->listParameter[$n++] = null !== $item ? McpTestStruct::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['struct_parameter'])){
            $model->structParameter = McpTestStruct::fromMap($map['struct_parameter']);
        }
        if(isset($map['timeout'])){
            $model->timeout = $map['timeout'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // string类型入参
    /**
     * @var string
     */
    public $stringParameter;

    // number类型入参
    /**
     * @var int
     */
    public $numberParameter;

    // boolean类型入参
    /**
     * @var bool
     */
    public $booleanParameter;

    // date类型入参
    /**
     * @var string
     */
    public $dateParameter;

    // list_struct类型入参
    /**
     * @var McpTestStruct[]
     */
    public $listParameter;

    // struct类型入参
    /**
     * @var McpTestStruct
     */
    public $structParameter;

    // 超时时间
    /**
     * @var string
     */
    public $timeout;

}
