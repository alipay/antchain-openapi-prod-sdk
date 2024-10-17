<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models;

use AlibabaCloud\Tea\Model;

class CloneTask extends Model
{
    // 数字人id
    /**
     * @example model_lhc8ml
     *
     * @var string
     */
    public $modelId;

    // 音色id
    /**
     * @example 238
     *
     * @var string
     */
    public $voiceId;

    // 初始化/训练队列中/声音克隆中/声音克隆完成/形象克隆中/形象克隆完成
    /**
     * @example init/wait_training/tone_training/audio_clone_completed/avatar_cloning/avatar_clone_completed
     *
     * @var string
     */
    public $avatarStatus;
    protected $_name = [
        'modelId'      => 'model_id',
        'voiceId'      => 'voice_id',
        'avatarStatus' => 'avatar_status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->modelId) {
            $res['model_id'] = $this->modelId;
        }
        if (null !== $this->voiceId) {
            $res['voice_id'] = $this->voiceId;
        }
        if (null !== $this->avatarStatus) {
            $res['avatar_status'] = $this->avatarStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CloneTask
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['model_id'])) {
            $model->modelId = $map['model_id'];
        }
        if (isset($map['voice_id'])) {
            $model->voiceId = $map['voice_id'];
        }
        if (isset($map['avatar_status'])) {
            $model->avatarStatus = $map['avatar_status'];
        }

        return $model;
    }
}
