<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models;

use AlibabaCloud\Tea\Model;

class VoiceTask extends Model
{
    // RUNNING, COMPLETE,FAIL
    /**
     * @example RUNNING
     *
     * @var string
     */
    public $state;

    // 音频地址
    /**
     * @example https://sdasdsa.mp3
     *
     * @var string
     */
    public $audioUrl;

    // 音频时长
    /**
     * @example 123
     *
     * @var int
     */
    public $audioTime;

    // 字幕信息
    /**
     * @example
     *
     * @var CaptionsInfo
     */
    public $captionsInfo;
    protected $_name = [
        'state'        => 'state',
        'audioUrl'     => 'audio_url',
        'audioTime'    => 'audio_time',
        'captionsInfo' => 'captions_info',
    ];

    public function validate()
    {
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('audioUrl', $this->audioUrl, true);
        Model::validateRequired('audioTime', $this->audioTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->audioUrl) {
            $res['audio_url'] = $this->audioUrl;
        }
        if (null !== $this->audioTime) {
            $res['audio_time'] = $this->audioTime;
        }
        if (null !== $this->captionsInfo) {
            $res['captions_info'] = null !== $this->captionsInfo ? $this->captionsInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VoiceTask
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['audio_url'])) {
            $model->audioUrl = $map['audio_url'];
        }
        if (isset($map['audio_time'])) {
            $model->audioTime = $map['audio_time'];
        }
        if (isset($map['captions_info'])) {
            $model->captionsInfo = CaptionsInfo::fromMap($map['captions_info']);
        }

        return $model;
    }
}
