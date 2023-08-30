<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class QueryPdataSocialincomeResponse extends Model
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

    // 查询结果
    /**
     * @var string
     */
    public $scoreResult;

    // 收入评分
    /**
     * @var string
     */
    public $rangeScore;

    // 历史稳定性评估
    /**
     * @var string
     */
    public $historyScore;

    // 近期稳定性评估
    /**
     * @var string
     */
    public $stabilityScore;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'scoreResult'    => 'score_result',
        'rangeScore'     => 'range_score',
        'historyScore'   => 'history_score',
        'stabilityScore' => 'stability_score',
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
        if (null !== $this->scoreResult) {
            $res['score_result'] = $this->scoreResult;
        }
        if (null !== $this->rangeScore) {
            $res['range_score'] = $this->rangeScore;
        }
        if (null !== $this->historyScore) {
            $res['history_score'] = $this->historyScore;
        }
        if (null !== $this->stabilityScore) {
            $res['stability_score'] = $this->stabilityScore;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryPdataSocialincomeResponse
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
        if (isset($map['score_result'])) {
            $model->scoreResult = $map['score_result'];
        }
        if (isset($map['range_score'])) {
            $model->rangeScore = $map['range_score'];
        }
        if (isset($map['history_score'])) {
            $model->historyScore = $map['history_score'];
        }
        if (isset($map['stability_score'])) {
            $model->stabilityScore = $map['stability_score'];
        }

        return $model;
    }
}
