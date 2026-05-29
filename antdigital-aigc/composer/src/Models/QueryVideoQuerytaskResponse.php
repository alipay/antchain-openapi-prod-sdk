<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AIGC\Models;

use AlibabaCloud\Tea\Model;

class QueryVideoQuerytaskResponse extends Model
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

    // 任务ID
    /**
     * @var string
     */
    public $taskId;

    // 任务状态
    /**
     * @var string
     */
    public $status;

    // 模型名称
    /**
     * @var string
     */
    public $model;

    // 视频输出URL
    /**
     * @var string
     */
    public $videoUrl;

    // 错误码
    /**
     * @var string
     */
    public $errorCode;

    // 错误信息
    /**
     * @var string
     */
    public $errorMessage;

    // 扩展信息
    /**
     * @var string
     */
    public $ext;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'taskId'       => 'task_id',
        'status'       => 'status',
        'model'        => 'model',
        'videoUrl'     => 'video_url',
        'errorCode'    => 'error_code',
        'errorMessage' => 'error_message',
        'ext'          => 'ext',
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
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->model) {
            $res['model'] = $this->model;
        }
        if (null !== $this->videoUrl) {
            $res['video_url'] = $this->videoUrl;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->errorMessage) {
            $res['error_message'] = $this->errorMessage;
        }
        if (null !== $this->ext) {
            $res['ext'] = $this->ext;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryVideoQuerytaskResponse
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
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['model'])) {
            $model->model = $map['model'];
        }
        if (isset($map['video_url'])) {
            $model->videoUrl = $map['video_url'];
        }
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }
        if (isset($map['error_message'])) {
            $model->errorMessage = $map['error_message'];
        }
        if (isset($map['ext'])) {
            $model->ext = $map['ext'];
        }

        return $model;
    }
}
