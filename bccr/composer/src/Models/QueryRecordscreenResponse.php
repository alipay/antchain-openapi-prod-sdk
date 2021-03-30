<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class QueryRecordscreenResponse extends Model
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

    // 取证id
    /**
     * @var string
     */
    public $evidenceId;

    // 取证状态 具体见附录 RecordScreenStatus
    /**
     * @var string
     */
    public $status;

    // 取证操作Url （状态为INIT和DOING 时返回 可以重复打开使用）
    /**
     * @var string
     */
    public $operateUrl;

    // 取证详情（状态为PACKAGING,SUCCESS,FAIL才有数据）
    /**
     * @var RecordScreenData
     */
    public $data;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'evidenceId' => 'evidence_id',
        'status'     => 'status',
        'operateUrl' => 'operate_url',
        'data'       => 'data',
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
        if (null !== $this->evidenceId) {
            $res['evidence_id'] = $this->evidenceId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->operateUrl) {
            $res['operate_url'] = $this->operateUrl;
        }
        if (null !== $this->data) {
            $res['data'] = null !== $this->data ? $this->data->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRecordscreenResponse
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
        if (isset($map['evidence_id'])) {
            $model->evidenceId = $map['evidence_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['operate_url'])) {
            $model->operateUrl = $map['operate_url'];
        }
        if (isset($map['data'])) {
            $model->data = RecordScreenData::fromMap($map['data']);
        }

        return $model;
    }
}
