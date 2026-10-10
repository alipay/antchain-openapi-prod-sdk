<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class AudioSpec extends Model {
    protected $_name = [
        'container' => 'container',
        'codec' => 'codec',
        'sampleRate' => 'sample_rate',
        'channels' => 'channels',
    ];
    public function validate() {
        Model::validateRequired('container', $this->container, true);
        Model::validateRequired('codec', $this->codec, true);
        Model::validateRequired('sampleRate', $this->sampleRate, true);
        Model::validateRequired('channels', $this->channels, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->container) {
            $res['container'] = $this->container;
        }
        if (null !== $this->codec) {
            $res['codec'] = $this->codec;
        }
        if (null !== $this->sampleRate) {
            $res['sample_rate'] = $this->sampleRate;
        }
        if (null !== $this->channels) {
            $res['channels'] = $this->channels;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AudioSpec
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['container'])){
            $model->container = $map['container'];
        }
        if(isset($map['codec'])){
            $model->codec = $map['codec'];
        }
        if(isset($map['sample_rate'])){
            $model->sampleRate = $map['sample_rate'];
        }
        if(isset($map['channels'])){
            $model->channels = $map['channels'];
        }
        return $model;
    }
    // 容器，如 WAV
    /**
     * @example WAV
     * @var string
     */
    public $container;

    // 编码，如 PCM_S16LE
    /**
     * @example PCM_S16LE
     * @var string
     */
    public $codec;

    // 采样率，单位 Hz，如 16000
    /**
     * @example 16000
     * @var int
     */
    public $sampleRate;

    // 声道数，如 1
    /**
     * @example 1
     * @var int
     */
    public $channels;

}
