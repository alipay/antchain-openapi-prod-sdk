<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class AudioMeta extends Model
{
    // 采样率
    /**
     * @example 16000
     *
     * @var int
     */
    public $sampleFreq;

    // 音频道数
    /**
     * @example 1
     *
     * @var int
     */
    public $channelsNum;

    // 音频数据采样点所占位数
    /**
     * @example 16
     *
     * @var int
     */
    public $bits;

    // 语音信道分离标识
    /**
     * @example 0
     *
     * @var int
     */
    public $channel;
    protected $_name = [
        'sampleFreq'  => 'sample_freq',
        'channelsNum' => 'channels_num',
        'bits'        => 'bits',
        'channel'     => 'channel',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->sampleFreq) {
            $res['sample_freq'] = $this->sampleFreq;
        }
        if (null !== $this->channelsNum) {
            $res['channels_num'] = $this->channelsNum;
        }
        if (null !== $this->bits) {
            $res['bits'] = $this->bits;
        }
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AudioMeta
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sample_freq'])) {
            $model->sampleFreq = $map['sample_freq'];
        }
        if (isset($map['channels_num'])) {
            $model->channelsNum = $map['channels_num'];
        }
        if (isset($map['bits'])) {
            $model->bits = $map['bits'];
        }
        if (isset($map['channel'])) {
            $model->channel = $map['channel'];
        }

        return $model;
    }
}
