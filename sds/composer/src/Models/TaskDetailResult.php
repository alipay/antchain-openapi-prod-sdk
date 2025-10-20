<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SDS\Models;

use AlibabaCloud\Tea\Model;

class TaskDetailResult extends Model
{
    // 总数量
    /**
     * @example 100
     *
     * @var int
     */
    public $totalCount;

    // 成功数量
    /**
     * @example 100
     *
     * @var int
     */
    public $successCount;

    // 失败数量
    /**
     * @example 0
     *
     * @var int
     */
    public $failCount;

    // 处理中数量
    /**
     * @example 0
     *
     * @var int
     */
    public $processingCount;

    // 当状态为无效时，显示具体的错误信息
    /**
     * @example xxx
     *
     * @var string
     */
    public $errorInfo;
    protected $_name = [
        'totalCount'      => 'total_count',
        'successCount'    => 'success_count',
        'failCount'       => 'fail_count',
        'processingCount' => 'processing_count',
        'errorInfo'       => 'error_info',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->successCount) {
            $res['success_count'] = $this->successCount;
        }
        if (null !== $this->failCount) {
            $res['fail_count'] = $this->failCount;
        }
        if (null !== $this->processingCount) {
            $res['processing_count'] = $this->processingCount;
        }
        if (null !== $this->errorInfo) {
            $res['error_info'] = $this->errorInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TaskDetailResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['success_count'])) {
            $model->successCount = $map['success_count'];
        }
        if (isset($map['fail_count'])) {
            $model->failCount = $map['fail_count'];
        }
        if (isset($map['processing_count'])) {
            $model->processingCount = $map['processing_count'];
        }
        if (isset($map['error_info'])) {
            $model->errorInfo = $map['error_info'];
        }

        return $model;
    }
}
