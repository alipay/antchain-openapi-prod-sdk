<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class DelayDetail extends Model
{
    // 延迟时间
    /**
     * @example 11分11秒
     *
     * @var string
     */
    public $delayTime;

    // store拉取延迟时间
    /**
     * @example 11分11秒
     *
     * @var string
     */
    public $storePullDelay;

    // 延迟时间
    /**
     * @example 11分11秒
     *
     * @var string
     */
    public $lightWriteDelay;

    // 积压数量
    /**
     * @example 12422
     *
     * @var int
     */
    public $backlog;
    protected $_name = [
        'delayTime'       => 'delay_time',
        'storePullDelay'  => 'store_pull_delay',
        'lightWriteDelay' => 'light_write_delay',
        'backlog'         => 'backlog',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->delayTime) {
            $res['delay_time'] = $this->delayTime;
        }
        if (null !== $this->storePullDelay) {
            $res['store_pull_delay'] = $this->storePullDelay;
        }
        if (null !== $this->lightWriteDelay) {
            $res['light_write_delay'] = $this->lightWriteDelay;
        }
        if (null !== $this->backlog) {
            $res['backlog'] = $this->backlog;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DelayDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['delay_time'])) {
            $model->delayTime = $map['delay_time'];
        }
        if (isset($map['store_pull_delay'])) {
            $model->storePullDelay = $map['store_pull_delay'];
        }
        if (isset($map['light_write_delay'])) {
            $model->lightWriteDelay = $map['light_write_delay'];
        }
        if (isset($map['backlog'])) {
            $model->backlog = $map['backlog'];
        }

        return $model;
    }
}
