<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class PositionStructBody extends Model
{
    // 错误计数
    /**
     * @example "1"
     *
     * @var string
     */
    public $errorCount;

    // 高度
    /**
     * @example "10"
     *
     * @var string
     */
    public $height;

    // 序号
    /**
     * @example “1”
     *
     * @var string
     */
    public $index;

    // 最后一个错误
    /**
     * @example “”
     *
     * @var string
     */
    public $lastError;

    // 类型
    /**
     * @example ""
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'errorCount' => 'error_count',
        'height'     => 'height',
        'index'      => 'index',
        'lastError'  => 'last_error',
        'type'       => 'type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->errorCount) {
            $res['error_count'] = $this->errorCount;
        }
        if (null !== $this->height) {
            $res['height'] = $this->height;
        }
        if (null !== $this->index) {
            $res['index'] = $this->index;
        }
        if (null !== $this->lastError) {
            $res['last_error'] = $this->lastError;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PositionStructBody
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['error_count'])) {
            $model->errorCount = $map['error_count'];
        }
        if (isset($map['height'])) {
            $model->height = $map['height'];
        }
        if (isset($map['index'])) {
            $model->index = $map['index'];
        }
        if (isset($map['last_error'])) {
            $model->lastError = $map['last_error'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
