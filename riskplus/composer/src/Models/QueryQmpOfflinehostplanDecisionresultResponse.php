<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryQmpOfflinehostplanDecisionresultResponse extends Model
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

    // 安全托管计划编码
    /**
     * @var string
     */
    public $planCode;

    // EXECUTING/DECISI ON_SUCCESS/DECISION_FAIL/CANCEL。执行中/成功/失败/取消。
    /**
     * @var string
     */
    public $status;

    // 总托管数量
    /**
     * @var int
     */
    public $totalNum;

    // 分层结果数
    /**
     * @var int
     */
    public $decisionNum;

    // 分层结果的oss文件路径
    /**
     * @var string
     */
    public $fileUrl;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'planCode'    => 'plan_code',
        'status'      => 'status',
        'totalNum'    => 'total_num',
        'decisionNum' => 'decision_num',
        'fileUrl'     => 'file_url',
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
        if (null !== $this->planCode) {
            $res['plan_code'] = $this->planCode;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->totalNum) {
            $res['total_num'] = $this->totalNum;
        }
        if (null !== $this->decisionNum) {
            $res['decision_num'] = $this->decisionNum;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryQmpOfflinehostplanDecisionresultResponse
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
        if (isset($map['plan_code'])) {
            $model->planCode = $map['plan_code'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['total_num'])) {
            $model->totalNum = $map['total_num'];
        }
        if (isset($map['decision_num'])) {
            $model->decisionNum = $map['decision_num'];
        }
        if (isset($map['file_url'])) {
            $model->fileUrl = $map['file_url'];
        }

        return $model;
    }
}
