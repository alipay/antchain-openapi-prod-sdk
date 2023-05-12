<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class GlobalStats extends Model
{
    // 异常事务数
    /**
     * @example
     *
     * @var int
     */
    public $exception;

    // 进行中事务数
    /**
     * @example
     *
     * @var int
     */
    public $activity;

    // 当天事务数
    /**
     * @example
     *
     * @var int
     */
    public $today;

    // connection
    /**
     * @example 1
     *
     * @var int
     */
    public $connection;
    protected $_name = [
        'exception'  => 'exception',
        'activity'   => 'activity',
        'today'      => 'today',
        'connection' => 'connection',
    ];

    public function validate()
    {
        Model::validateRequired('exception', $this->exception, true);
        Model::validateRequired('activity', $this->activity, true);
        Model::validateRequired('today', $this->today, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->exception) {
            $res['exception'] = $this->exception;
        }
        if (null !== $this->activity) {
            $res['activity'] = $this->activity;
        }
        if (null !== $this->today) {
            $res['today'] = $this->today;
        }
        if (null !== $this->connection) {
            $res['connection'] = $this->connection;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GlobalStats
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['exception'])) {
            $model->exception = $map['exception'];
        }
        if (isset($map['activity'])) {
            $model->activity = $map['activity'];
        }
        if (isset($map['today'])) {
            $model->today = $map['today'];
        }
        if (isset($map['connection'])) {
            $model->connection = $map['connection'];
        }

        return $model;
    }
}
