<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVE\Models;

use AlibabaCloud\Tea\Model;

class AudioList extends Model {
    protected $_name = [
        'audioUrl' => 'audio_url',
        'audioFormat' => 'audio_format',
        'durationSeconds' => 'duration_seconds',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->audioUrl) {
            $res['audio_url'] = $this->audioUrl;
        }
        if (null !== $this->audioFormat) {
            $res['audio_format'] = $this->audioFormat;
        }
        if (null !== $this->durationSeconds) {
            $res['duration_seconds'] = $this->durationSeconds;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AudioList
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['audio_url'])){
            $model->audioUrl = $map['audio_url'];
        }
        if(isset($map['audio_format'])){
            $model->audioFormat = $map['audio_format'];
        }
        if(isset($map['duration_seconds'])){
            $model->durationSeconds = $map['duration_seconds'];
        }
        return $model;
    }
    // 音频 URL 列表
    /**
     * @example www.test.com/123
     * @var string
     */
    public $audioUrl;

    // 音频格式
    /**
     * @example wav
     * @var string
     */
    public $audioFormat;

    // 处理后播放时长（秒）
    /**
     * @example 10.6
     * @var string
     */
    public $durationSeconds;

}
