<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ASSET\Models;

use AlibabaCloud\Tea\Model;

class ConversionData extends Model
{
    // 渠道
    /**
     * @example HUABEI
     *
     * @var string
     */
    public $channel;

    // 投放人数
    /**
     * @example 10000
     *
     * @var int
     */
    public $sendCnt;

    // 核销人数
    /**
     * @example 10
     *
     * @var int
     */
    public $useCnt;

    // 核销率
    /**
     * @example 20.78
     *
     * @var string
     */
    public $useRate;
    protected $_name = [
        'channel' => 'channel',
        'sendCnt' => 'send_cnt',
        'useCnt'  => 'use_cnt',
        'useRate' => 'use_rate',
    ];

    public function validate()
    {
        Model::validateRequired('channel', $this->channel, true);
        Model::validateRequired('sendCnt', $this->sendCnt, true);
        Model::validateRequired('useCnt', $this->useCnt, true);
        Model::validateRequired('useRate', $this->useRate, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }
        if (null !== $this->sendCnt) {
            $res['send_cnt'] = $this->sendCnt;
        }
        if (null !== $this->useCnt) {
            $res['use_cnt'] = $this->useCnt;
        }
        if (null !== $this->useRate) {
            $res['use_rate'] = $this->useRate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConversionData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['channel'])) {
            $model->channel = $map['channel'];
        }
        if (isset($map['send_cnt'])) {
            $model->sendCnt = $map['send_cnt'];
        }
        if (isset($map['use_cnt'])) {
            $model->useCnt = $map['use_cnt'];
        }
        if (isset($map['use_rate'])) {
            $model->useRate = $map['use_rate'];
        }

        return $model;
    }
}
