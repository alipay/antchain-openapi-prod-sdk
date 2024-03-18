<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models;

use AlibabaCloud\Tea\Model;

class VideoTask extends Model
{
    // RUNNING, COMPLETE,FAIL
    /**
     * @example RUNNING
     *
     * @var string
     */
    public $state;

    // 完成状态，会返回视频地址
    /**
     * @example https://sdasdsa.webm
     *
     * @var string
     */
    public $videoUrl;
    protected $_name = [
        'state'    => 'state',
        'videoUrl' => 'video_url',
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
        if (null !== $this->videoUrl) {
            $res['video_url'] = $this->videoUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VideoTask
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['video_url'])) {
            $model->videoUrl = $map['video_url'];
        }

        return $model;
    }
}
