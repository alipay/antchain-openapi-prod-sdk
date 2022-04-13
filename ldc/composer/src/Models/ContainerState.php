<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ContainerState extends Model
{
    // container running state
    /**
     * @example {}
     *
     * @var ContainerStateRunning
     */
    public $running;

    // container terminated state
    /**
     * @example {}
     *
     * @var ContainerStateTerminated
     */
    public $terminated;

    // container waiting state
    /**
     * @example {}
     *
     * @var ContainerStateWaiting
     */
    public $waiting;
    protected $_name = [
        'running'    => 'running',
        'terminated' => 'terminated',
        'waiting'    => 'waiting',
    ];

    public function validate()
    {
        Model::validateRequired('running', $this->running, true);
        Model::validateRequired('terminated', $this->terminated, true);
        Model::validateRequired('waiting', $this->waiting, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->running) {
            $res['running'] = null !== $this->running ? $this->running->toMap() : null;
        }
        if (null !== $this->terminated) {
            $res['terminated'] = null !== $this->terminated ? $this->terminated->toMap() : null;
        }
        if (null !== $this->waiting) {
            $res['waiting'] = null !== $this->waiting ? $this->waiting->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContainerState
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['running'])) {
            $model->running = ContainerStateRunning::fromMap($map['running']);
        }
        if (isset($map['terminated'])) {
            $model->terminated = ContainerStateTerminated::fromMap($map['terminated']);
        }
        if (isset($map['waiting'])) {
            $model->waiting = ContainerStateWaiting::fromMap($map['waiting']);
        }

        return $model;
    }
}
