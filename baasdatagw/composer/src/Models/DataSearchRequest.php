<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class DataSearchRequest extends Model
{
    // 所有请求字符串，支持使用 and, or 逻辑连接词和括号
    /**
     * @example data
     *
     * @var string
     */
    public $query;

    // 分页，返回数据结果起始位置
    /**
     * @example 0
     *
     * @var int
     */
    public $offset;

    // 请求的结果数量，默认值 10
    /**
     * @example 10
     *
     * @var int
     */
    public $size;

    // 是否按时间降序排列
    /**
     * @example true, false
     *
     * @var bool
     */
    public $reverse;

    // 检索数据的截止时间范围，Unix时间戳（秒）
    /**
     * @example 1635229141
     *
     * @var int
     */
    public $to;

    // 检索结果的总条数
    /**
     * @example 341
     *
     * @var int
     */
    public $total;
    protected $_name = [
        'query'   => 'query',
        'offset'  => 'offset',
        'size'    => 'size',
        'reverse' => 'reverse',
        'to'      => 'to',
        'total'   => 'total',
    ];

    public function validate()
    {
        Model::validateRequired('query', $this->query, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->query) {
            $res['query'] = $this->query;
        }
        if (null !== $this->offset) {
            $res['offset'] = $this->offset;
        }
        if (null !== $this->size) {
            $res['size'] = $this->size;
        }
        if (null !== $this->reverse) {
            $res['reverse'] = $this->reverse;
        }
        if (null !== $this->to) {
            $res['to'] = $this->to;
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DataSearchRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['query'])) {
            $model->query = $map['query'];
        }
        if (isset($map['offset'])) {
            $model->offset = $map['offset'];
        }
        if (isset($map['size'])) {
            $model->size = $map['size'];
        }
        if (isset($map['reverse'])) {
            $model->reverse = $map['reverse'];
        }
        if (isset($map['to'])) {
            $model->to = $map['to'];
        }
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }

        return $model;
    }
}
