<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class BatchActionResult extends Model
{
    // 批量挂载结果
    /**
     * @example
     *
     * @var ActionResult[]
     */
    public $results;

    // total_count
    /**
     * @example 10
     *
     * @var int
     */
    public $totalCount;

    // success_count
    /**
     * @example 5
     *
     * @var int
     */
    public $successCount;

    // failed_count
    /**
     * @example 5
     *
     * @var int
     */
    public $failedCount;
    protected $_name = [
        'results'      => 'results',
        'totalCount'   => 'total_count',
        'successCount' => 'success_count',
        'failedCount'  => 'failed_count',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->results) {
            $res['results'] = [];
            if (null !== $this->results && \is_array($this->results)) {
                $n = 0;
                foreach ($this->results as $item) {
                    $res['results'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->successCount) {
            $res['success_count'] = $this->successCount;
        }
        if (null !== $this->failedCount) {
            $res['failed_count'] = $this->failedCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchActionResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['results'])) {
            if (!empty($map['results'])) {
                $model->results = [];
                $n              = 0;
                foreach ($map['results'] as $item) {
                    $model->results[$n++] = null !== $item ? ActionResult::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['success_count'])) {
            $model->successCount = $map['success_count'];
        }
        if (isset($map['failed_count'])) {
            $model->failedCount = $map['failed_count'];
        }

        return $model;
    }
}
