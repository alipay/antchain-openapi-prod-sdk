<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models;

use AlibabaCloud\Tea\Model;

class ScriptVoiceConfig extends Model
{
    // 音色id，合成驱动选择text时必填
    /**
     * @example 322290
     *
     * @var string
     */
    public $voiceId;

    // 话术脚本内容，合成驱动选择text时必填
    /**
     * @example 今天你好吗
     *
     * @var string
     */
    public $text;

    // 0.5～2，语速，合成驱动选择text时必填
    /**
     * @example 0.8
     *
     * @var string
     */
    public $speed;

    // 音频URL，合成驱动选择audio时必填
    /**
     * @example https://xxxxx.23.wav
     *
     * @var string
     */
    public $audioUrl;
    protected $_name = [
        'voiceId'  => 'voice_id',
        'text'     => 'text',
        'speed'    => 'speed',
        'audioUrl' => 'audio_url',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->voiceId) {
            $res['voice_id'] = $this->voiceId;
        }
        if (null !== $this->text) {
            $res['text'] = $this->text;
        }
        if (null !== $this->speed) {
            $res['speed'] = $this->speed;
        }
        if (null !== $this->audioUrl) {
            $res['audio_url'] = $this->audioUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ScriptVoiceConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['voice_id'])) {
            $model->voiceId = $map['voice_id'];
        }
        if (isset($map['text'])) {
            $model->text = $map['text'];
        }
        if (isset($map['speed'])) {
            $model->speed = $map['speed'];
        }
        if (isset($map['audio_url'])) {
            $model->audioUrl = $map['audio_url'];
        }

        return $model;
    }
}
