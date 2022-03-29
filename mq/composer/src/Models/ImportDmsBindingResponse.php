<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ImportDmsBindingResponse extends Model
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

    // 导入总数
    /**
     * @var int
     */
    public $totalCount;

    // 导入成功总数
    /**
     * @var int
     */
    public $successCount;

    // 格式化或者参数错误元素列表
    /**
     * @var BindingDTO[]
     */
    public $formatErrorRecords;

    // 导入错误元素列表
    /**
     * @var BindingDTO[]
     */
    public $processErrorRecords;

    // 已存在元素列表
    /**
     * @var BindingDTO[]
     */
    public $existRecords;
    protected $_name = [
        'reqMsgId'            => 'req_msg_id',
        'resultCode'          => 'result_code',
        'resultMsg'           => 'result_msg',
        'totalCount'          => 'total_count',
        'successCount'        => 'success_count',
        'formatErrorRecords'  => 'format_error_records',
        'processErrorRecords' => 'process_error_records',
        'existRecords'        => 'exist_records',
    ];

    public function validate()
    {
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
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->successCount) {
            $res['success_count'] = $this->successCount;
        }
        if (null !== $this->formatErrorRecords) {
            $res['format_error_records'] = [];
            if (null !== $this->formatErrorRecords && \is_array($this->formatErrorRecords)) {
                $n = 0;
                foreach ($this->formatErrorRecords as $item) {
                    $res['format_error_records'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->processErrorRecords) {
            $res['process_error_records'] = [];
            if (null !== $this->processErrorRecords && \is_array($this->processErrorRecords)) {
                $n = 0;
                foreach ($this->processErrorRecords as $item) {
                    $res['process_error_records'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->existRecords) {
            $res['exist_records'] = [];
            if (null !== $this->existRecords && \is_array($this->existRecords)) {
                $n = 0;
                foreach ($this->existRecords as $item) {
                    $res['exist_records'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportDmsBindingResponse
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
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['success_count'])) {
            $model->successCount = $map['success_count'];
        }
        if (isset($map['format_error_records'])) {
            if (!empty($map['format_error_records'])) {
                $model->formatErrorRecords = [];
                $n                         = 0;
                foreach ($map['format_error_records'] as $item) {
                    $model->formatErrorRecords[$n++] = null !== $item ? BindingDTO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['process_error_records'])) {
            if (!empty($map['process_error_records'])) {
                $model->processErrorRecords = [];
                $n                          = 0;
                foreach ($map['process_error_records'] as $item) {
                    $model->processErrorRecords[$n++] = null !== $item ? BindingDTO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['exist_records'])) {
            if (!empty($map['exist_records'])) {
                $model->existRecords = [];
                $n                   = 0;
                foreach ($map['exist_records'] as $item) {
                    $model->existRecords[$n++] = null !== $item ? BindingDTO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
