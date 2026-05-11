<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ABC\Models;

use AlibabaCloud\Tea\Model;

class PreviewDemoResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 字符串回参
    /**
     * @var string
     */
    public $outputString;

    // Long型回参
    /**
     * @var int
     */
    public $outputNumber;

    // 布尔型回参
    /**
     * @var bool
     */
    public $outputBoolean;

    // ISO8602格式字符串：yyyy-MM-dd_T_HH:mm:ss_Z_
    /**
     * @var string
     */
    public $outputDate;

    // 字符串数组
    /**
     * @var string[]
     */
    public $outputStringList;

    // 结构体回参
    /**
     * @var AbcDemoStruct
     */
    public $outputStruct;

    // 结构体列表回参
    /**
     * @var AbcDemoStruct[]
     */
    public $outputStructList;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'outputString'     => 'output_string',
        'outputNumber'     => 'output_number',
        'outputBoolean'    => 'output_boolean',
        'outputDate'       => 'output_date',
        'outputStringList' => 'output_string_list',
        'outputStruct'     => 'output_struct',
        'outputStructList' => 'output_struct_list',
    ];

    public function validate()
    {
        Model::validatePattern('outputDate', $this->outputDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->outputString) {
            $res['output_string'] = $this->outputString;
        }
        if (null !== $this->outputNumber) {
            $res['output_number'] = $this->outputNumber;
        }
        if (null !== $this->outputBoolean) {
            $res['output_boolean'] = $this->outputBoolean;
        }
        if (null !== $this->outputDate) {
            $res['output_date'] = $this->outputDate;
        }
        if (null !== $this->outputStringList) {
            $res['output_string_list'] = $this->outputStringList;
        }
        if (null !== $this->outputStruct) {
            $res['output_struct'] = null !== $this->outputStruct ? $this->outputStruct->toMap() : null;
        }
        if (null !== $this->outputStructList) {
            $res['output_struct_list'] = [];
            if (null !== $this->outputStructList && \is_array($this->outputStructList)) {
                $n = 0;
                foreach ($this->outputStructList as $item) {
                    $res['output_struct_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PreviewDemoResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['output_string'])) {
            $model->outputString = $map['output_string'];
        }
        if (isset($map['output_number'])) {
            $model->outputNumber = $map['output_number'];
        }
        if (isset($map['output_boolean'])) {
            $model->outputBoolean = $map['output_boolean'];
        }
        if (isset($map['output_date'])) {
            $model->outputDate = $map['output_date'];
        }
        if (isset($map['output_string_list'])) {
            if (!empty($map['output_string_list'])) {
                $model->outputStringList = $map['output_string_list'];
            }
        }
        if (isset($map['output_struct'])) {
            $model->outputStruct = AbcDemoStruct::fromMap($map['output_struct']);
        }
        if (isset($map['output_struct_list'])) {
            if (!empty($map['output_struct_list'])) {
                $model->outputStructList = [];
                $n                       = 0;
                foreach ($map['output_struct_list'] as $item) {
                    $model->outputStructList[$n++] = null !== $item ? AbcDemoStruct::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
