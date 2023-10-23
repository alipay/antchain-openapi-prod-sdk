<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ANTVERSE\Models;

use AlibabaCloud\Tea\Model;

class QueryAvatarVideoResponse extends Model
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

    // 视频任务id
    /**
     * @var string
     */
    public $taskId;

    // 视频合成任务状态（EXPORTING：导出中，NORMAL：成功，FAILED：失败）
    /**
     * @var string
     */
    public $videoStatus;

    // 视频url
    /**
     * @var string
     */
    public $videoUrl;

    // 提示消息
    /**
     * @var string
     */
    public $message;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'taskId'      => 'task_id',
        'videoStatus' => 'video_status',
        'videoUrl'    => 'video_url',
        'message'     => 'message',
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
        if (null !== $this->videoStatus) {
            $res['video_status'] = $this->videoStatus;
        }
        if (null !== $this->videoUrl) {
            $res['video_url'] = $this->videoUrl;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAvatarVideoResponse
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
        if (isset($map['video_status'])) {
            $model->videoStatus = $map['video_status'];
        }
        if (isset($map['video_url'])) {
            $model->videoUrl = $map['video_url'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }

        return $model;
    }
}
