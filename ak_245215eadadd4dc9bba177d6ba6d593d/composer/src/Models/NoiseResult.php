<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models;

use AlibabaCloud\Tea\Model;

class NoiseResult extends Model
{
    // success/failed/queuing/processing
    /**
     * @example 音色检测任务状态
     *
     * @var string
     */
    public $state;

    // 声音大小
    /**
     * @example -19.43278193473816
     *
     * @var string
     */
    public $speakerDb;

    // 噪音值
    /**
     * @example -62.71892070770264
     *
     * @var string
     */
    public $noiseDb;
    protected $_name = [
        'state'     => 'state',
        'speakerDb' => 'speaker_db',
        'noiseDb'   => 'noise_db',
    ];

    public function validate()
    {
        Model::validateRequired('state', $this->state, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->speakerDb) {
            $res['speaker_db'] = $this->speakerDb;
        }
        if (null !== $this->noiseDb) {
            $res['noise_db'] = $this->noiseDb;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NoiseResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['speaker_db'])) {
            $model->speakerDb = $map['speaker_db'];
        }
        if (isset($map['noise_db'])) {
            $model->noiseDb = $map['noise_db'];
        }

        return $model;
    }
}
