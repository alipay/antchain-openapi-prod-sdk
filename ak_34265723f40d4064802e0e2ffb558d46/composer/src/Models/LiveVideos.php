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
    public $isTemp;

    // 触发插播行为的时间戳，当isTemp为true时，存在该值
    /**
     * @example 2312321
     *
     * @var int
     */
    public $occurrenceTimeStamp;
    protected $_name = [
        'liveId'              => 'live_id',
        'sceneId'             => 'scene_id',
        'sectionId'           => 'section_id',
        'url'                 => 'url',
        'isTemp'              => 'is_temp',
        'occurrenceTimeStamp' => 'occurrence_time_stamp',
    ];

    public function validate()
    {
        Model::validateRequired('liveId', $this->liveId, true);
        Model::validateRequired('sceneId', $this->sceneId, true);
        Model::validateRequired('sectionId', $this->sectionId, true);
        Model::validateRequired('url', $this->url, true);
        Model::validateRequired('isTemp', $this->isTemp, true);
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
        if (null !== $this->isTemp) {
            $res['is_temp'] = $this->isTemp;
        }
        if (null !== $this->occurrenceTimeStamp) {
            $res['occurrence_time_stamp'] = $this->occurrenceTimeStamp;
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
        if (isset($map['is_temp'])) {
            $model->isTemp = $map['is_temp'];
        }
        if (isset($map['occurrence_time_stamp'])) {
            $model->occurrenceTimeStamp = $map['occurrence_time_stamp'];
        }

        return $model;
    }
}
