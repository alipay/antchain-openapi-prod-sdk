<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class Lifecycle extends Model
{
    // 存活探针
    /**
     * @example
     *
     * @var ProbeConfig
     */
    public $liveness;

    // readiness
    /**
     * @example
     *
     * @var ProbeConfig
     */
    public $readiness;

    // preStop
    /**
     * @example
     *
     * @var ProbeConfig
     */
    public $preStop;

    // postStart
    /**
     * @example
     *
     * @var ProbeConfig
     */
    public $postStart;

    // startUp
    /**
     * @example
     *
     * @var ProbeConfig
     */
    public $startUp;

    // entrypoint
    /**
     * @example
     *
     * @var ProbeConfig
     */
    public $entrypoint;
    protected $_name = [
        'liveness'   => 'liveness',
        'readiness'  => 'readiness',
        'preStop'    => 'pre_stop',
        'postStart'  => 'post_start',
        'startUp'    => 'start_up',
        'entrypoint' => 'entrypoint',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->liveness) {
            $res['liveness'] = null !== $this->liveness ? $this->liveness->toMap() : null;
        }
        if (null !== $this->readiness) {
            $res['readiness'] = null !== $this->readiness ? $this->readiness->toMap() : null;
        }
        if (null !== $this->preStop) {
            $res['pre_stop'] = null !== $this->preStop ? $this->preStop->toMap() : null;
        }
        if (null !== $this->postStart) {
            $res['post_start'] = null !== $this->postStart ? $this->postStart->toMap() : null;
        }
        if (null !== $this->startUp) {
            $res['start_up'] = null !== $this->startUp ? $this->startUp->toMap() : null;
        }
        if (null !== $this->entrypoint) {
            $res['entrypoint'] = null !== $this->entrypoint ? $this->entrypoint->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Lifecycle
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['liveness'])) {
            $model->liveness = ProbeConfig::fromMap($map['liveness']);
        }
        if (isset($map['readiness'])) {
            $model->readiness = ProbeConfig::fromMap($map['readiness']);
        }
        if (isset($map['pre_stop'])) {
            $model->preStop = ProbeConfig::fromMap($map['pre_stop']);
        }
        if (isset($map['post_start'])) {
            $model->postStart = ProbeConfig::fromMap($map['post_start']);
        }
        if (isset($map['start_up'])) {
            $model->startUp = ProbeConfig::fromMap($map['start_up']);
        }
        if (isset($map['entrypoint'])) {
            $model->entrypoint = ProbeConfig::fromMap($map['entrypoint']);
        }

        return $model;
    }
}
