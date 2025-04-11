<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models;

use AlibabaCloud\Tea\Model;

class VideoTask extends Model
{
    // RUNNING, COMPLETE,FAIL
    /**
     * @example RUNNING
     *
     * @var string
     */
    public $state;

    // 完成状态，会返回视频地址
    /**
     * @example https://sdasdsa.webm
     *
     * @var string
     */
    public $videoUrl;

    // 视频时长
    /**
     * @example 123456
     *
     * @var int
     */
    public $videoDuration;

    // 字幕时间戳信息
    /**
     * @example
     *
     * @var CaptionsInfo
     */
    public $captionsInfo;

    // 短视频生成失败原因
    /**
     * @example 失败原因
     *
     * @var string
     */
    public $failReason;

    // 错误码
    /**
     * @example ILLEGAL_ARGS
     *
     * @var string
     */
    public $errorCode;
    protected $_name = [
        'state'         => 'state',
        'videoUrl'      => 'video_url',
        'videoDuration' => 'video_duration',
        'captionsInfo'  => 'captions_info',
        'failReason'    => 'fail_reason',
        'errorCode'     => 'error_code',
    ];

    public function validate()
    {
        Model::validateRequired('state', $this->state, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->videoUrl) {
            $res['video_url'] = $this->videoUrl;
        }
        if (null !== $this->videoDuration) {
            $res['video_duration'] = $this->videoDuration;
        }
        if (null !== $this->captionsInfo) {
            $res['captions_info'] = null !== $this->captionsInfo ? $this->captionsInfo->toMap() : null;
        }
        if (null !== $this->failReason) {
            $res['fail_reason'] = $this->failReason;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VideoTask
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['video_url'])) {
            $model->videoUrl = $map['video_url'];
        }
        if (isset($map['video_duration'])) {
            $model->videoDuration = $map['video_duration'];
        }
        if (isset($map['captions_info'])) {
            $model->captionsInfo = CaptionsInfo::fromMap($map['captions_info']);
        }
        if (isset($map['fail_reason'])) {
            $model->failReason = $map['fail_reason'];
        }
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }

        return $model;
    }
}
