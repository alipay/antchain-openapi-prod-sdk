<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class RouteCondition extends Model
{
    // 渠道编号
    /**
     * @example HZZKZTKJ
     *
     * @var string
     */
    public $channelId;
    protected $_name = [
        'channelId' => 'channel_id',
    ];

    public function validate()
    {
        Model::validateRequired('channelId', $this->channelId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->channelId) {
            $res['channel_id'] = $this->channelId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RouteCondition
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['channel_id'])) {
            $model->channelId = $map['channel_id'];
        }

        return $model;
    }
}
