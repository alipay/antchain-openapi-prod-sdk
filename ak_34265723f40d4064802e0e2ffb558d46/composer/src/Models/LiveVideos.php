<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_34265723f40d4064802e0e2ffb558d46\Models;

use AlibabaCloud\Tea\Model;

class LiveVideos extends Model
{
    // 蚂蚁数字人平台直播id
    /**
     * @example 123
     *
     * @var string
     */
    public $liveId;

    // 场景id
    /**
     * @example 123
     *
     * @var string
     */
    public $sceneId;

    // 视频片段id
    /**
     * @example 123
     *
     * @var string
     */
    public $sectionId;

    // 视频地址
    /**
     * @example http://1212/aa.mp4
     *
     * @var string
     */
    public $url;

    // 是否插播，默认false
    /**
     * @example true, false
     *
     * @var bool
     */
    public $tempVideo;

    // 触发插播行为的时间戳，当isTemp为true时，存在该值
    /**
     * @example 2312321
     *
     * @var int
     */
    public $occurrenceTimeStamp;

    // 视频类型（start欢迎语、end结束、trans转场、normal普通、temporary评论插播）
    /**
     * @example start
     *
     * @var string
     */
    public $type;

    // 视频剧本
    /**
     * @example asd
     *
     * @var string
     */
    public $text;
    protected $_name = [
        'liveId'              => 'live_id',
        'sceneId'             => 'scene_id',
        'sectionId'           => 'section_id',
        'url'                 => 'url',
        'tempVideo'           => 'temp_video',
        'occurrenceTimeStamp' => 'occurrence_time_stamp',
        'type'                => 'type',
        'text'                => 'text',
    ];

    public function validate()
    {
        Model::validateRequired('liveId', $this->liveId, true);
        Model::validateRequired('sceneId', $this->sceneId, true);
        Model::validateRequired('sectionId', $this->sectionId, true);
        Model::validateRequired('url', $this->url, true);
        Model::validateRequired('tempVideo', $this->tempVideo, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('text', $this->text, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->liveId) {
            $res['live_id'] = $this->liveId;
        }
        if (null !== $this->sceneId) {
            $res['scene_id'] = $this->sceneId;
        }
        if (null !== $this->sectionId) {
            $res['section_id'] = $this->sectionId;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->tempVideo) {
            $res['temp_video'] = $this->tempVideo;
        }
        if (null !== $this->occurrenceTimeStamp) {
            $res['occurrence_time_stamp'] = $this->occurrenceTimeStamp;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->text) {
            $res['text'] = $this->text;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LiveVideos
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['live_id'])) {
            $model->liveId = $map['live_id'];
        }
        if (isset($map['scene_id'])) {
            $model->sceneId = $map['scene_id'];
        }
        if (isset($map['section_id'])) {
            $model->sectionId = $map['section_id'];
        }
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }
        if (isset($map['temp_video'])) {
            $model->tempVideo = $map['temp_video'];
        }
        if (isset($map['occurrence_time_stamp'])) {
            $model->occurrenceTimeStamp = $map['occurrence_time_stamp'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['text'])) {
            $model->text = $map['text'];
        }

        return $model;
    }
}
