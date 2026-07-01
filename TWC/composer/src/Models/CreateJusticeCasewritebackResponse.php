<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateJusticeCasewritebackResponse extends Model
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

    // 创建成功状态
    // success, fail
    /**
     * @var string
     */
    public $createStatus;

    // 创建状态说明
    /**
     * @var string
     */
    public $createStatusMessage;

    // 创建时间（如创建成功，则返回创建日期时间）
    /**
     * @var string
     */
    public $createTime;

    // 业务来源主键
    /**
     * @var string
     */
    public $inputSourceId;

    // 案件ID
    /**
     * @var string
     */
    public $caseId;

    // 业务码 0表示成功
    /**
     * @var int
     */
    public $code;

    // 业务码描述
    /**
     * @var string
     */
    public $message;
    protected $_name = [
        'reqMsgId'            => 'req_msg_id',
        'resultCode'          => 'result_code',
        'resultMsg'           => 'result_msg',
        'createStatus'        => 'create_status',
        'createStatusMessage' => 'create_status_message',
        'createTime'          => 'create_time',
        'inputSourceId'       => 'input_source_id',
        'caseId'              => 'case_id',
        'code'                => 'code',
        'message'             => 'message',
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
        if (null !== $this->createStatus) {
            $res['create_status'] = $this->createStatus;
        }
        if (null !== $this->createStatusMessage) {
            $res['create_status_message'] = $this->createStatusMessage;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->inputSourceId) {
            $res['input_source_id'] = $this->inputSourceId;
        }
        if (null !== $this->caseId) {
            $res['case_id'] = $this->caseId;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateJusticeCasewritebackResponse
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
        if (isset($map['create_status'])) {
            $model->createStatus = $map['create_status'];
        }
        if (isset($map['create_status_message'])) {
            $model->createStatusMessage = $map['create_status_message'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['input_source_id'])) {
            $model->inputSourceId = $map['input_source_id'];
        }
        if (isset($map['case_id'])) {
            $model->caseId = $map['case_id'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }

        return $model;
    }
}
