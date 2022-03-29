<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class TranslateMapping extends Model
{
    // 原始列值
    /**
     * @example origin_column
     *
     * @var string
     */
    public $from;

    // 翻译后列值
    /**
     * @example target_column
     *
     * @var string
     */
    public $to;

    // 正则类型 (完整正则或简单正则)
    /**
     * @example simpleRegex
     *
     * @var string
     */
    public $mode;
    protected $_name = [
        'from' => 'from',
        'to'   => 'to',
        'mode' => 'mode',
    ];

    public function validate()
    {
        Model::validateRequired('from', $this->from, true);
        Model::validateRequired('to', $this->to, true);
        Model::validateRequired('mode', $this->mode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->from) {
            $res['from'] = $this->from;
        }
        if (null !== $this->to) {
            $res['to'] = $this->to;
        }
        if (null !== $this->mode) {
            $res['mode'] = $this->mode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TranslateMapping
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['from'])) {
            $model->from = $map['from'];
        }
        if (isset($map['to'])) {
            $model->to = $map['to'];
        }
        if (isset($map['mode'])) {
            $model->mode = $map['mode'];
        }

        return $model;
    }
}
