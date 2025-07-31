<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SalesChannel extends Model
{
    // 渠道码
    /**
     * @example RYQUWEOS
     *
     * @var string
     */
    public $channelCode;

    // 渠道名称
    /**
     * @example 华东大区
     *
     * @var string
     */
    public $channelName;

    // 渠道级别，从小到大代表级别由高到低
    /**
     * @example 4
     *
     * @var int
     */
    public $channelLevel;
    protected $_name = [
        'channelCode'  => 'channel_code',
        'channelName'  => 'channel_name',
        'channelLevel' => 'channel_level',
    ];

    public function validate()
    {
        Model::validateRequired('channelCode', $this->channelCode, true);
        Model::validateRequired('channelName', $this->channelName, true);
        Model::validateRequired('channelLevel', $this->channelLevel, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->channelCode) {
            $res['channel_code'] = $this->channelCode;
        }
        if (null !== $this->channelName) {
            $res['channel_name'] = $this->channelName;
        }
        if (null !== $this->channelLevel) {
            $res['channel_level'] = $this->channelLevel;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SalesChannel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['channel_code'])) {
            $model->channelCode = $map['channel_code'];
        }
        if (isset($map['channel_name'])) {
            $model->channelName = $map['channel_name'];
        }
        if (isset($map['channel_level'])) {
            $model->channelLevel = $map['channel_level'];
        }

        return $model;
    }
}
