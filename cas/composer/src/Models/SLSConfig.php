<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class SLSConfig extends Model
{
    // Logtail配置名称，同一Project下配置名必须唯一。
    // 只能包括小写字母、数字、连字符（-）和下划线（_）。
    // 必须以小写字母或者数字开头和结尾。
    // 长度必须为2~128字节。
    /**
     * @example testLogConfig
     *
     * @var string
     */
    public $name;

    // 配置类型，支持plugin、file。
    /**
     * @example file, plugin
     *
     * @var string
     */
    public $inputType;

    // 输出类型，目前只支持LogService。
    /**
     * @example LogService
     *
     * @var string
     */
    public $outputType;

    // 日志样例
    /**
     * @example 无
     *
     * @var string
     */
    public $logSample;

    // 输入类型配置
    /**
     * @example
     *
     * @var SLSConfigInputDetail
     */
    public $inputDetail;

    // 输出类型配置
    /**
     * @example
     *
     * @var SLSConfigOutputDetail
     */
    public $outputDetail;
    protected $_name = [
        'name'         => 'name',
        'inputType'    => 'input_type',
        'outputType'   => 'output_type',
        'logSample'    => 'log_sample',
        'inputDetail'  => 'input_detail',
        'outputDetail' => 'output_detail',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('inputType', $this->inputType, true);
        Model::validateRequired('inputDetail', $this->inputDetail, true);
        Model::validateRequired('outputDetail', $this->outputDetail, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->inputType) {
            $res['input_type'] = $this->inputType;
        }
        if (null !== $this->outputType) {
            $res['output_type'] = $this->outputType;
        }
        if (null !== $this->logSample) {
            $res['log_sample'] = $this->logSample;
        }
        if (null !== $this->inputDetail) {
            $res['input_detail'] = null !== $this->inputDetail ? $this->inputDetail->toMap() : null;
        }
        if (null !== $this->outputDetail) {
            $res['output_detail'] = null !== $this->outputDetail ? $this->outputDetail->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SLSConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['input_type'])) {
            $model->inputType = $map['input_type'];
        }
        if (isset($map['output_type'])) {
            $model->outputType = $map['output_type'];
        }
        if (isset($map['log_sample'])) {
            $model->logSample = $map['log_sample'];
        }
        if (isset($map['input_detail'])) {
            $model->inputDetail = SLSConfigInputDetail::fromMap($map['input_detail']);
        }
        if (isset($map['output_detail'])) {
            $model->outputDetail = SLSConfigOutputDetail::fromMap($map['output_detail']);
        }

        return $model;
    }
}
