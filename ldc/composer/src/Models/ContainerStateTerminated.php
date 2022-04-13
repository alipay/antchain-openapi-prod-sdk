<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ContainerStateTerminated extends Model
{
    // container id
    /**
     * @example docker://020066114b989a2c789c8eeee8bfb1f9b64bfdd2d7d48b3a738fa6f91246cb67
     *
     * @var string
     */
    public $containerId;

    // exit code
    /**
     * @example 1
     *
     * @var int
     */
    public $exitCode;

    // container结束时间
    /**
     * @example 2019-10-05
     *
     * @var string
     */
    public $finishedAt;

    // message
    /**
     * @example exit
     *
     * @var string
     */
    public $message;

    // reason
    /**
     * @example killed by OOM
     *
     * @var string
     */
    public $reason;

    // signal
    /**
     * @example 136
     *
     * @var string
     */
    public $signal;

    // container start time
    /**
     * @example 2019-12-05
     *
     * @var string
     */
    public $startedAt;
    protected $_name = [
        'containerId' => 'container_id',
        'exitCode'    => 'exit_code',
        'finishedAt'  => 'finished_at',
        'message'     => 'message',
        'reason'      => 'reason',
        'signal'      => 'signal',
        'startedAt'   => 'started_at',
    ];

    public function validate()
    {
        Model::validateRequired('containerId', $this->containerId, true);
        Model::validateRequired('exitCode', $this->exitCode, true);
        Model::validateRequired('finishedAt', $this->finishedAt, true);
        Model::validateRequired('message', $this->message, true);
        Model::validateRequired('reason', $this->reason, true);
        Model::validateRequired('signal', $this->signal, true);
        Model::validateRequired('startedAt', $this->startedAt, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->containerId) {
            $res['container_id'] = $this->containerId;
        }
        if (null !== $this->exitCode) {
            $res['exit_code'] = $this->exitCode;
        }
        if (null !== $this->finishedAt) {
            $res['finished_at'] = $this->finishedAt;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->reason) {
            $res['reason'] = $this->reason;
        }
        if (null !== $this->signal) {
            $res['signal'] = $this->signal;
        }
        if (null !== $this->startedAt) {
            $res['started_at'] = $this->startedAt;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContainerStateTerminated
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['container_id'])) {
            $model->containerId = $map['container_id'];
        }
        if (isset($map['exit_code'])) {
            $model->exitCode = $map['exit_code'];
        }
        if (isset($map['finished_at'])) {
            $model->finishedAt = $map['finished_at'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['reason'])) {
            $model->reason = $map['reason'];
        }
        if (isset($map['signal'])) {
            $model->signal = $map['signal'];
        }
        if (isset($map['started_at'])) {
            $model->startedAt = $map['started_at'];
        }

        return $model;
    }
}
