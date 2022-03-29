<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ThreadTrackDTO extends Model
{
    // 线程名称
    /**
     * @example ConsumeMessageThread_0
     *
     * @var string
     */
    public $thread;

    // Jstack 堆栈信息字符串
    /**
     * @example
     *
     * @var string[]
     */
    public $trackList;
    protected $_name = [
        'thread'    => 'thread',
        'trackList' => 'track_list',
    ];

    public function validate()
    {
        Model::validateRequired('thread', $this->thread, true);
        Model::validateRequired('trackList', $this->trackList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->thread) {
            $res['thread'] = $this->thread;
        }
        if (null !== $this->trackList) {
            $res['track_list'] = $this->trackList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ThreadTrackDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['thread'])) {
            $model->thread = $map['thread'];
        }
        if (isset($map['track_list'])) {
            if (!empty($map['track_list'])) {
                $model->trackList = $map['track_list'];
            }
        }

        return $model;
    }
}
