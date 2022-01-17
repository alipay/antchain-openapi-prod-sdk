<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class BatchImportResult extends Model
{
    // failed_count
    /**
     * @example 1
     *
     * @var int
     */
    public $failedCount;

    // 重复的API列表
    /**
     * @example
     *
     * @var ApiTransferVO[]
     */
    public $repeatApiList;

    // results
    /**
     * @example
     *
     * @var ImportResult[]
     */
    public $results;

    // success_count
    /**
     * @example 3
     *
     * @var int
     */
    public $successCount;

    // total_count
    /**
     * @example 4
     *
     * @var int
     */
    public $totalCount;

    // 导入成功的API列表
    /**
     * @example
     *
     * @var ApiInfoVO[]
     */
    public $successApiList;
    protected $_name = [
        'failedCount'    => 'failed_count',
        'repeatApiList'  => 'repeat_api_list',
        'results'        => 'results',
        'successCount'   => 'success_count',
        'totalCount'     => 'total_count',
        'successApiList' => 'success_api_list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->failedCount) {
            $res['failed_count'] = $this->failedCount;
        }
        if (null !== $this->repeatApiList) {
            $res['repeat_api_list'] = [];
            if (null !== $this->repeatApiList && \is_array($this->repeatApiList)) {
                $n = 0;
                foreach ($this->repeatApiList as $item) {
                    $res['repeat_api_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->results) {
            $res['results'] = [];
            if (null !== $this->results && \is_array($this->results)) {
                $n = 0;
                foreach ($this->results as $item) {
                    $res['results'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->successCount) {
            $res['success_count'] = $this->successCount;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->successApiList) {
            $res['success_api_list'] = [];
            if (null !== $this->successApiList && \is_array($this->successApiList)) {
                $n = 0;
                foreach ($this->successApiList as $item) {
                    $res['success_api_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchImportResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['failed_count'])) {
            $model->failedCount = $map['failed_count'];
        }
        if (isset($map['repeat_api_list'])) {
            if (!empty($map['repeat_api_list'])) {
                $model->repeatApiList = [];
                $n                    = 0;
                foreach ($map['repeat_api_list'] as $item) {
                    $model->repeatApiList[$n++] = null !== $item ? ApiTransferVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['results'])) {
            if (!empty($map['results'])) {
                $model->results = [];
                $n              = 0;
                foreach ($map['results'] as $item) {
                    $model->results[$n++] = null !== $item ? ImportResult::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['success_count'])) {
            $model->successCount = $map['success_count'];
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['success_api_list'])) {
            if (!empty($map['success_api_list'])) {
                $model->successApiList = [];
                $n                     = 0;
                foreach ($map['success_api_list'] as $item) {
                    $model->successApiList[$n++] = null !== $item ? ApiInfoVO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
