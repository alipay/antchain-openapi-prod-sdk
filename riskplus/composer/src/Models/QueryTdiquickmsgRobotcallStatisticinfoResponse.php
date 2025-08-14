<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryTdiquickmsgRobotcallStatisticinfoResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 全量手机号数量
    /**
     * @var int
     */
    public $totalCount;

    // 累计拨打次数
    /**
     * @var int
     */
    public $callCount;

    // 已经拨打的手机号数量
    /**
     * @var string
     */
    public $calleeCount;

    // 已拨打次数中接通的数量
    /**
     * @var int
     */
    public $connectCount;

    // 拨打率
    /**
     * @var string
     */
    public $callRate;

    // 接通率
    /**
     * @var string
     */
    public $connectRate;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'totalCount'   => 'total_count',
        'callCount'    => 'call_count',
        'calleeCount'  => 'callee_count',
        'connectCount' => 'connect_count',
        'callRate'     => 'call_rate',
        'connectRate'  => 'connect_rate',
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
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->callCount) {
            $res['call_count'] = $this->callCount;
        }
        if (null !== $this->calleeCount) {
            $res['callee_count'] = $this->calleeCount;
        }
        if (null !== $this->connectCount) {
            $res['connect_count'] = $this->connectCount;
        }
        if (null !== $this->callRate) {
            $res['call_rate'] = $this->callRate;
        }
        if (null !== $this->connectRate) {
            $res['connect_rate'] = $this->connectRate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTdiquickmsgRobotcallStatisticinfoResponse
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
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['call_count'])) {
            $model->callCount = $map['call_count'];
        }
        if (isset($map['callee_count'])) {
            $model->calleeCount = $map['callee_count'];
        }
        if (isset($map['connect_count'])) {
            $model->connectCount = $map['connect_count'];
        }
        if (isset($map['call_rate'])) {
            $model->callRate = $map['call_rate'];
        }
        if (isset($map['connect_rate'])) {
            $model->connectRate = $map['connect_rate'];
        }

        return $model;
    }
}
