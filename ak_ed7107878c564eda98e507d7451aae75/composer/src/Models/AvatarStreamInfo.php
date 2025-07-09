<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models;

use AlibabaCloud\Tea\Model;

class AvatarStreamInfo extends Model
{
    // 形象id
    /**
     * @example 1861
     *
     * @var string
     */
    public $modelId;

    // 音色编码
    /**
     * @example 269
     *
     * @var string
     */
    public $voiceCode;

    // 背景信息
    /**
     * @example www.123.com
     *
     * @var string
     */
    public $background;

    // 流id
    /**
     * @example live-avatar-6741_20250410104550
     *
     * @var string
     */
    public $streamId;

    // 设备sn号
    /**
     * @example 1234
     *
     * @var string
     */
    public $serialNumber;

    // 开播时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $startTime;
    protected $_name = [
        'modelId'      => 'model_id',
        'voiceCode'    => 'voice_code',
        'background'   => 'background',
        'streamId'     => 'stream_id',
        'serialNumber' => 'serial_number',
        'startTime'    => 'start_time',
    ];

    public function validate()
    {
        Model::validateRequired('streamId', $this->streamId, true);
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->modelId) {
            $res['model_id'] = $this->modelId;
        }
        if (null !== $this->voiceCode) {
            $res['voice_code'] = $this->voiceCode;
        }
        if (null !== $this->background) {
            $res['background'] = $this->background;
        }
        if (null !== $this->streamId) {
            $res['stream_id'] = $this->streamId;
        }
        if (null !== $this->serialNumber) {
            $res['serial_number'] = $this->serialNumber;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AvatarStreamInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['model_id'])) {
            $model->modelId = $map['model_id'];
        }
        if (isset($map['voice_code'])) {
            $model->voiceCode = $map['voice_code'];
        }
        if (isset($map['background'])) {
            $model->background = $map['background'];
        }
        if (isset($map['stream_id'])) {
            $model->streamId = $map['stream_id'];
        }
        if (isset($map['serial_number'])) {
            $model->serialNumber = $map['serial_number'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }

        return $model;
    }
}
