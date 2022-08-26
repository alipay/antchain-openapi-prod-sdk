<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_7365e031a87c467bbe817bec28a2a1dc\Models;

use AlibabaCloud\Tea\Model;

class CheckPointStructBody extends Model
{
    // 高度
    /**
     * @example 100
     *
     * @var string
     */
    public $height;

    // 序号
    /**
     * @example 0
     *
     * @var string
     */
    public $index;

    // 类型
    /**
     * @example "Block"
     *
     * @var string
     */
    public $type;

    // last_error
    /**
     * @example “”
     *
     * @var string
     */
    public $lastError;

    // 错误统计
    /**
     * @example 0
     *
     * @var string
     */
    public $errorCount;

    // 统计
    /**
     * @example 0
     *
     * @var string
     */
    public $totalCount;
    protected $_name = [
        'height'     => 'height',
        'index'      => 'index',
        'type'       => 'type',
        'lastError'  => 'last_error',
        'errorCount' => 'error_count',
        'totalCount' => 'total_count',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->height) {
            $res['height'] = $this->height;
        }
        if (null !== $this->index) {
            $res['index'] = $this->index;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->lastError) {
            $res['last_error'] = $this->lastError;
        }
        if (null !== $this->errorCount) {
            $res['error_count'] = $this->errorCount;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckPointStructBody
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['height'])) {
            $model->height = $map['height'];
        }
        if (isset($map['index'])) {
            $model->index = $map['index'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['last_error'])) {
            $model->lastError = $map['last_error'];
        }
        if (isset($map['error_count'])) {
            $model->errorCount = $map['error_count'];
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }

        return $model;
    }
}
