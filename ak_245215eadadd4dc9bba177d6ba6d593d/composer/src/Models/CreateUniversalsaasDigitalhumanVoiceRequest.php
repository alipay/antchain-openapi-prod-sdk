<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models;

use AlibabaCloud\Tea\Model;

class CreateUniversalsaasDigitalhumanVoiceRequest extends Model
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

    // 需要转语音的文字
    /**
     * @var string
     */
    public $text;

    // 语速，[0.5,2.0]，默认1.0
    /**
     * @var string
     */
    public $speed;

    // 音调，[0.1,3.0]，默认1.0
    /**
     * @var string
     */
    public $pitch;

    // 音量，[0.1,3.0]，默认1.0
    /**
     * @var string
     */
    public $volume;

    // 音色id
    /**
     * @var string
     */
    public $voice;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'text'              => 'text',
        'speed'             => 'speed',
        'pitch'             => 'pitch',
        'volume'            => 'volume',
        'voice'             => 'voice',
    ];

    public function validate()
    {
        Model::validateRequired('text', $this->text, true);
        Model::validateRequired('voice', $this->voice, true);
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
        if (null !== $this->voice) {
            $res['voice'] = $this->voice;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateUniversalsaasDigitalhumanVoiceRequest
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
        if (isset($map['voice'])) {
            $model->voice = $map['voice'];
        }

        return $model;
    }
}
