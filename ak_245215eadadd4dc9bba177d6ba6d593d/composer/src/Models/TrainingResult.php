<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models;

use AlibabaCloud\Tea\Model;

class TrainingResult extends Model
{
    // 数字人id
    /**
     * @example 1298
     *
     * @var string
     */
    public $modelId;

    // 音色id
    /**
     * @example 269
     *
     * @var string
     */
    public $voiceId;
    protected $_name = [
        'modelId' => 'model_id',
        'voiceId' => 'voice_id',
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TrainingResult
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

        return $model;
    }
}
