<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class TriggerCheckpoint extends Model
{
    // 当前处理的高度
    /**
     * @example 1023
     *
     * @var int
     */
    public $height;

    // 检查点偏移量
    /**
     * @example 0
     *
     * @var int
     */
    public $index;

    // 检查点的类型
    /**
     * @example Block
     *
     * @var string
     */
    public $type;

    // 最近的错误信息
    /**
     * @example send timeout
     *
     * @var string
     */
    public $lastError;

    // 错误计数
    /**
     * @example 10
     *
     * @var int
     */
    public $errorCount;

    // 推送的事件数量
    /**
     * @example 1000
     *
     * @var int
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
     * @return TriggerCheckpoint
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
