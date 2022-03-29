<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class MessageTraceDTO extends Model
{
    // 查询结果
    /**
     * @example
     *
     * @var MessageTrackDTO[]
     */
    public $trackList;
    protected $_name = [
        'trackList' => 'track_list',
    ];

    public function validate()
    {
        Model::validateRequired('trackList', $this->trackList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->trackList) {
            $res['track_list'] = [];
            if (null !== $this->trackList && \is_array($this->trackList)) {
                $n = 0;
                foreach ($this->trackList as $item) {
                    $res['track_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MessageTraceDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['track_list'])) {
            if (!empty($map['track_list'])) {
                $model->trackList = [];
                $n                = 0;
                foreach ($map['track_list'] as $item) {
                    $model->trackList[$n++] = null !== $item ? MessageTrackDTO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
