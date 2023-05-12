<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class Stats extends Model
{
    // 异常事务数
    /**
     * @example
     *
     * @var ExceptionStats
     */
    public $exception;

    // 进行中事务数统计
    /**
     * @example
     *
     * @var Ongoing
     */
    public $ongoing;

    // 当天事务数统计
    /**
     * @example
     *
     * @var Today
     */
    public $today;
    protected $_name = [
        'exception' => 'exception',
        'ongoing'   => 'ongoing',
        'today'     => 'today',
    ];

    public function validate()
    {
        Model::validateRequired('exception', $this->exception, true);
        Model::validateRequired('ongoing', $this->ongoing, true);
        Model::validateRequired('today', $this->today, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->exception) {
            $res['exception'] = null !== $this->exception ? $this->exception->toMap() : null;
        }
        if (null !== $this->ongoing) {
            $res['ongoing'] = null !== $this->ongoing ? $this->ongoing->toMap() : null;
        }
        if (null !== $this->today) {
            $res['today'] = null !== $this->today ? $this->today->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Stats
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['exception'])) {
            $model->exception = ExceptionStats::fromMap($map['exception']);
        }
        if (isset($map['ongoing'])) {
            $model->ongoing = Ongoing::fromMap($map['ongoing']);
        }
        if (isset($map['today'])) {
            $model->today = Today::fromMap($map['today']);
        }

        return $model;
    }
}
