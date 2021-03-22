<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryConsumecardCounterResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 查询的类别（0 商家，1 商品）
    /**
     * @var int
     */
    public $type;

    // 查询的id（type：0 为accountId 1为goodsId）
    /**
     * @var string
     */
    public $queryId;

    // 日统计数据
    /**
     * @var CounterData
     */
    public $dayCounter;

    // 月统计数据
    /**
     * @var CounterData
     */
    public $monthCounter;

    // 年统计数据
    /**
     * @var CounterData
     */
    public $yearCounter;

    // 季度统计数据
    /**
     * @var CounterData
     */
    public $quarterlyCounter;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'type'             => 'type',
        'queryId'          => 'query_id',
        'dayCounter'       => 'day_counter',
        'monthCounter'     => 'month_counter',
        'yearCounter'      => 'year_counter',
        'quarterlyCounter' => 'quarterly_counter',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->queryId) {
            $res['query_id'] = $this->queryId;
        }
        if (null !== $this->dayCounter) {
            $res['day_counter'] = null !== $this->dayCounter ? $this->dayCounter->toMap() : null;
        }
        if (null !== $this->monthCounter) {
            $res['month_counter'] = null !== $this->monthCounter ? $this->monthCounter->toMap() : null;
        }
        if (null !== $this->yearCounter) {
            $res['year_counter'] = null !== $this->yearCounter ? $this->yearCounter->toMap() : null;
        }
        if (null !== $this->quarterlyCounter) {
            $res['quarterly_counter'] = null !== $this->quarterlyCounter ? $this->quarterlyCounter->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryConsumecardCounterResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['query_id'])) {
            $model->queryId = $map['query_id'];
        }
        if (isset($map['day_counter'])) {
            $model->dayCounter = CounterData::fromMap($map['day_counter']);
        }
        if (isset($map['month_counter'])) {
            $model->monthCounter = CounterData::fromMap($map['month_counter']);
        }
        if (isset($map['year_counter'])) {
            $model->yearCounter = CounterData::fromMap($map['year_counter']);
        }
        if (isset($map['quarterly_counter'])) {
            $model->quarterlyCounter = CounterData::fromMap($map['quarterly_counter']);
        }

        return $model;
    }
}
