<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models;

use AlibabaCloud\Tea\Model;

class AvatarHumanInfo extends Model
{
    // 数字人角色id
    /**
     * @example 100001
     *
     * @var int
     */
    public $id;

    // 数字人角色名
    /**
     * @example 小忆
     *
     * @var string
     */
    public $humanName;

    // 数字人形象id
    /**
     * @example 1886
     *
     * @var int
     */
    public $modelId;

    // 数字人音色编码
    /**
     * @example 269
     *
     * @var string
     */
    public $voiceCode;

    // 数字人音色名
    /**
     * @example 小忆
     *
     * @var string
     */
    public $voiceName;

    // 数字人音色预览图
    /**
     * @example www.123.com
     *
     * @var string
     */
    public $voiceImage;

    // 语速
    /**
     * @example 10
     *
     * @var int
     */
    public $speechRate;

    // 音调
    /**
     * @example 10
     *
     * @var string
     */
    public $pitchRate;

    // 音量
    /**
     * @example 10
     *
     * @var string
     */
    public $volume;
    protected $_name = [
        'id'         => 'id',
        'humanName'  => 'human_name',
        'modelId'    => 'model_id',
        'voiceCode'  => 'voice_code',
        'voiceName'  => 'voice_name',
        'voiceImage' => 'voice_image',
        'speechRate' => 'speech_rate',
        'pitchRate'  => 'pitch_rate',
        'volume'     => 'volume',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('humanName', $this->humanName, true);
        Model::validateRequired('modelId', $this->modelId, true);
        Model::validateRequired('voiceCode', $this->voiceCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->humanName) {
            $res['human_name'] = $this->humanName;
        }
        if (null !== $this->modelId) {
            $res['model_id'] = $this->modelId;
        }
        if (null !== $this->voiceCode) {
            $res['voice_code'] = $this->voiceCode;
        }
        if (null !== $this->voiceName) {
            $res['voice_name'] = $this->voiceName;
        }
        if (null !== $this->voiceImage) {
            $res['voice_image'] = $this->voiceImage;
        }
        if (null !== $this->speechRate) {
            $res['speech_rate'] = $this->speechRate;
        }
        if (null !== $this->pitchRate) {
            $res['pitch_rate'] = $this->pitchRate;
        }
        if (null !== $this->volume) {
            $res['volume'] = $this->volume;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AvatarHumanInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['human_name'])) {
            $model->humanName = $map['human_name'];
        }
        if (isset($map['model_id'])) {
            $model->modelId = $map['model_id'];
        }
        if (isset($map['voice_code'])) {
            $model->voiceCode = $map['voice_code'];
        }
        if (isset($map['voice_name'])) {
            $model->voiceName = $map['voice_name'];
        }
        if (isset($map['voice_image'])) {
            $model->voiceImage = $map['voice_image'];
        }
        if (isset($map['speech_rate'])) {
            $model->speechRate = $map['speech_rate'];
        }
        if (isset($map['pitch_rate'])) {
            $model->pitchRate = $map['pitch_rate'];
        }
        if (isset($map['volume'])) {
            $model->volume = $map['volume'];
        }

        return $model;
    }
}
