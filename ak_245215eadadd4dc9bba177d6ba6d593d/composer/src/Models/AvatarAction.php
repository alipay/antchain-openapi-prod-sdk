<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models;

use AlibabaCloud\Tea\Model;

class AvatarAction extends Model
{
    // 动作序列id
    /**
     * @example 1
     *
     * @var int
     */
    public $actionId;

    // 动作时长，单位毫秒
    /**
     * @example 1200
     *
     * @var int
     */
    public $duration;

    // 动作预览链接
    /**
     * @example http://14.103.114.23/action_0.mp4
     *
     * @var string
     */
    public $videoPath;
    protected $_name = [
        'actionId'  => 'action_id',
        'duration'  => 'duration',
        'videoPath' => 'video_path',
    ];

    public function validate()
    {
        Model::validateRequired('actionId', $this->actionId, true);
        Model::validateRequired('duration', $this->duration, true);
        Model::validateRequired('videoPath', $this->videoPath, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->actionId) {
            $res['action_id'] = $this->actionId;
        }
        if (null !== $this->duration) {
            $res['duration'] = $this->duration;
        }
        if (null !== $this->videoPath) {
            $res['video_path'] = $this->videoPath;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AvatarAction
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['action_id'])) {
            $model->actionId = $map['action_id'];
        }
        if (isset($map['duration'])) {
            $model->duration = $map['duration'];
        }
        if (isset($map['video_path'])) {
            $model->videoPath = $map['video_path'];
        }

        return $model;
    }
}
