<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class ChainInsightSearchRequest extends Model
{
    // 插叙偏移量，用于分页；= (pageNo - 1 * pageSize); 最大值 500
    /**
     * @example 0
     *
     * @var int
     */
    public $offset;

    // 搜索的上下文，在查询下一页时，需要在请求中带入 Response 返回的 context
    /**
     * @example DAgy567NTwPe0v8N6bmWi9FGfF/G2mZK1iCUpd+sbEVLJnjZgsdG
     *
     * @var string
     */
    public $context;

    // 页大小
    /**
     * @example 10
     *
     * @var int
     */
    public $pagSize;

    // 需要搜索的请求内容，可以使用 and、or、not、括号 组合查询逻辑
    /**
     * @example *
     *
     * @var string
     */
    public $query;

    // 查询某个合约或者存证账户的时间轴返回结果
    /**
     * @example 13fe9940d10389c1df1bb4f253c5ec9bf7e0b8719020385e3aa96681bd13a0b4
     *
     * @var string
     */
    public $timelineQuery;

    // 查询范围的开始时间戳，毫秒
    /**
     * @example 0
     *
     * @var int
     */
    public $startTime;

    // 查询范围的终止时间戳，单位毫秒
    /**
     * @example 1666081939568
     *
     * @var int
     */
    public $endTime;

    // 搜索的类型范围，枚举：Chain、ChainData、ChainAddress、ChainBlock、ChainTx、ChainTxTimeline
    /**
     * @example ChainAddress
     *
     * @var string[]
     */
    public $enabledTypes;
    protected $_name = [
        'offset'        => 'offset',
        'context'       => 'context',
        'pagSize'       => 'pag_size',
        'query'         => 'query',
        'timelineQuery' => 'timeline_query',
        'startTime'     => 'start_time',
        'endTime'       => 'end_time',
        'enabledTypes'  => 'enabled_types',
    ];

    public function validate()
    {
        Model::validateRequired('offset', $this->offset, true);
        Model::validateRequired('pagSize', $this->pagSize, true);
        Model::validateRequired('query', $this->query, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('endTime', $this->endTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->offset) {
            $res['offset'] = $this->offset;
        }
        if (null !== $this->context) {
            $res['context'] = $this->context;
        }
        if (null !== $this->pagSize) {
            $res['pag_size'] = $this->pagSize;
        }
        if (null !== $this->query) {
            $res['query'] = $this->query;
        }
        if (null !== $this->timelineQuery) {
            $res['timeline_query'] = $this->timelineQuery;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->enabledTypes) {
            $res['enabled_types'] = $this->enabledTypes;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChainInsightSearchRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['offset'])) {
            $model->offset = $map['offset'];
        }
        if (isset($map['context'])) {
            $model->context = $map['context'];
        }
        if (isset($map['pag_size'])) {
            $model->pagSize = $map['pag_size'];
        }
        if (isset($map['query'])) {
            $model->query = $map['query'];
        }
        if (isset($map['timeline_query'])) {
            $model->timelineQuery = $map['timeline_query'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['enabled_types'])) {
            if (!empty($map['enabled_types'])) {
                $model->enabledTypes = $map['enabled_types'];
            }
        }

        return $model;
    }
}
