<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NOTIFICATION\Models;

use AlibabaCloud\Tea\Model;

class TaskCount extends Model
{
    // 总数量
    /**
     * @example 1
     *
     * @var int
     */
    public $totalCount;

    // 成功数量
    /**
     * @example 1
     *
     * @var int
     */
    public $successCount;

    // 处理中的数量
    /**
     * @example 1
     *
     * @var int
     */
    public $processingCount;

    // 失败数量
    /**
     * @example 1
     *
     * @var int
     */
    public $failureCount;
    protected $_name = [
        'totalCount'      => 'total_count',
        'successCount'    => 'success_count',
        'processingCount' => 'processing_count',
        'failureCount'    => 'failure_count',
    ];

    public function validate()
    {
        Model::validateRequired('totalCount', $this->totalCount, true);
        Model::validateRequired('successCount', $this->successCount, true);
        Model::validateRequired('processingCount', $this->processingCount, true);
        Model::validateRequired('failureCount', $this->failureCount, true);
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
        if (null !== $this->processingCount) {
            $res['processing_count'] = $this->processingCount;
        }
        if (null !== $this->failureCount) {
            $res['failure_count'] = $this->failureCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TaskCount
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
        if (isset($map['processing_count'])) {
            $model->processingCount = $map['processing_count'];
        }
        if (isset($map['failure_count'])) {
            $model->failureCount = $map['failure_count'];
        }

        return $model;
    }
}
