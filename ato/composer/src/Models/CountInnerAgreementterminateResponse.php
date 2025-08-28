<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class CountInnerAgreementterminateResponse extends Model
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

    // 待处理-数量
    /**
     * @var int
     */
    public $unHandleStatusNum;

    // 处理中-数量
    /**
     * @var int
     */
    public $handingStatusNum;

    // 已处理-数量
    /**
     * @var int
     */
    public $finishedStatusNum;

    // 已超时-数量
    /**
     * @var int
     */
    public $timeoutStatusNum;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'unHandleStatusNum' => 'un_handle_status_num',
        'handingStatusNum'  => 'handing_status_num',
        'finishedStatusNum' => 'finished_status_num',
        'timeoutStatusNum'  => 'timeout_status_num',
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
        if (null !== $this->unHandleStatusNum) {
            $res['un_handle_status_num'] = $this->unHandleStatusNum;
        }
        if (null !== $this->handingStatusNum) {
            $res['handing_status_num'] = $this->handingStatusNum;
        }
        if (null !== $this->finishedStatusNum) {
            $res['finished_status_num'] = $this->finishedStatusNum;
        }
        if (null !== $this->timeoutStatusNum) {
            $res['timeout_status_num'] = $this->timeoutStatusNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CountInnerAgreementterminateResponse
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
        if (isset($map['un_handle_status_num'])) {
            $model->unHandleStatusNum = $map['un_handle_status_num'];
        }
        if (isset($map['handing_status_num'])) {
            $model->handingStatusNum = $map['handing_status_num'];
        }
        if (isset($map['finished_status_num'])) {
            $model->finishedStatusNum = $map['finished_status_num'];
        }
        if (isset($map['timeout_status_num'])) {
            $model->timeoutStatusNum = $map['timeout_status_num'];
        }

        return $model;
    }
}
