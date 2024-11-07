<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models;

use AlibabaCloud\Tea\Model;

class CreateUniversalsaasDigitalhumanVoiceTaskRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 话术脚本
    /**
     * @var string
     */
    public $text;

    // 语速，支持 0.5-2 倍速
    /**
     * @var string
     */
    public $speed;

    // 音调，[0.1, 3]，默认为1，通常保留一位小数即可
    /**
     * @var string
     */
    public $pitch;

    // [0.1, 3]，默认为1，通常保留一位小数即可
    /**
     * @var string
     */
    public $volume;

    // 音色id
    /**
     * @var string
     */
    public $voiceId;

    // 是否返回字幕信息，默认不返回
    /**
     * @var bool
     */
    public $openCaption;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'text'              => 'text',
        'speed'             => 'speed',
        'pitch'             => 'pitch',
        'volume'            => 'volume',
        'voiceId'           => 'voice_id',
        'openCaption'       => 'open_caption',
    ];

    public function validate()
    {
        Model::validateRequired('text', $this->text, true);
        Model::validateRequired('speed', $this->speed, true);
        Model::validateRequired('voiceId', $this->voiceId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->text) {
            $res['text'] = $this->text;
        }
        if (null !== $this->speed) {
            $res['speed'] = $this->speed;
        }
        if (null !== $this->pitch) {
            $res['pitch'] = $this->pitch;
        }
        if (null !== $this->volume) {
            $res['volume'] = $this->volume;
        }
        if (null !== $this->voiceId) {
            $res['voice_id'] = $this->voiceId;
        }
        if (null !== $this->openCaption) {
            $res['open_caption'] = $this->openCaption;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateUniversalsaasDigitalhumanVoiceTaskRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['text'])) {
            $model->text = $map['text'];
        }
        if (isset($map['speed'])) {
            $model->speed = $map['speed'];
        }
        if (isset($map['pitch'])) {
            $model->pitch = $map['pitch'];
        }
        if (isset($map['volume'])) {
            $model->volume = $map['volume'];
        }
        if (isset($map['voice_id'])) {
            $model->voiceId = $map['voice_id'];
        }
        if (isset($map['open_caption'])) {
            $model->openCaption = $map['open_caption'];
        }

        return $model;
    }
}
