<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AICLAIM\Models;

use AlibabaCloud\Tea\Model;

class Extraction extends Model
{
    // 提取出的具体信息的基类，不同类型的影像材料，有不同的数据结构，下文会详细展开。不同的sub_type映射不同的BaseExtractionData子类。
    /**
     * @example ""
     *
     * @var string
     */
    public $data;

    // 失败原因(失败时填写)，成功时为null
    /**
     * @example category_not_supported
     *
     * @var string
     */
    public $failureReason;

    // 提取状态: success/not_supported
    /**
     * @example not_supported
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'data'          => 'data',
        'failureReason' => 'failure_reason',
        'status'        => 'status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->failureReason) {
            $res['failure_reason'] = $this->failureReason;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Extraction
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }
        if (isset($map['failure_reason'])) {
            $model->failureReason = $map['failure_reason'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
