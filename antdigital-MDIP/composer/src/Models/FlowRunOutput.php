<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\MDIP\Models;

use AlibabaCloud\Tea\Model;

class FlowRunOutput extends Model {
    protected $_name = [
        'outputKey' => 'output_key',
        'outputType' => 'output_type',
        'value' => 'value',
    ];
    public function validate() {
        Model::validateRequired('outputKey', $this->outputKey, true);
        Model::validateRequired('outputType', $this->outputType, true);
        Model::validateRequired('value', $this->value, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->outputKey) {
            $res['output_key'] = $this->outputKey;
        }
        if (null !== $this->outputType) {
            $res['output_type'] = $this->outputType;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return FlowRunOutput
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['output_key'])){
            $model->outputKey = $map['output_key'];
        }
        if(isset($map['output_type'])){
            $model->outputType = $map['output_type'];
        }
        if(isset($map['value'])){
            $model->value = $map['value'];
        }
        return $model;
    }
    // Flow 输出定义中的稳定字段标识。
    /**
     * @example summary
     * @var string
     */
    public $outputKey;

    // 输出类型，支持 STRING、NUMBER、BOOLEAN、JSON、FILE。
    /**
     * @example STRING
     * @var string
     */
    public $outputType;

    // 输出值。FILE 类型直接返回短期下载地址；JSON 类型返回 JSON 字符串；其他类型返回对应值的字符串形式。
    /**
     * @example 风险较低
     * @var string
     */
    public $value;

}
