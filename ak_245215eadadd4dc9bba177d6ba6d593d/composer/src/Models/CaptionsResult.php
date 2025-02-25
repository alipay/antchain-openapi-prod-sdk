<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models;

use AlibabaCloud\Tea\Model;

class CaptionsResult extends Model
{
    // 音频时长
    /**
     * @example 123
     *
     * @var int
     */
    public $duration;

    // 字幕时间戳信息
    /**
     * @example
     *
     * @var Sentence[]
     */
    public $sentences;
    protected $_name = [
        'duration'  => 'duration',
        'sentences' => 'sentences',
    ];

    public function validate()
    {
        Model::validateRequired('duration', $this->duration, true);
        Model::validateRequired('sentences', $this->sentences, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->duration) {
            $res['duration'] = $this->duration;
        }
        if (null !== $this->sentences) {
            $res['sentences'] = [];
            if (null !== $this->sentences && \is_array($this->sentences)) {
                $n = 0;
                foreach ($this->sentences as $item) {
                    $res['sentences'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CaptionsResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['duration'])) {
            $model->duration = $map['duration'];
        }
        if (isset($map['sentences'])) {
            if (!empty($map['sentences'])) {
                $model->sentences = [];
                $n                = 0;
                foreach ($map['sentences'] as $item) {
                    $model->sentences[$n++] = null !== $item ? Sentence::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
