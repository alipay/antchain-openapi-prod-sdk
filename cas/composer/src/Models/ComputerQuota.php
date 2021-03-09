<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ComputerQuota extends Model
{
    // cpu shared
    /**
     * @example
     *
     * @var int
     */
    public $cpuShared;

    // cpu
    /**
     * @example
     *
     * @var int
     */
    public $cpu;

    // memory
    /**
     * @example
     *
     * @var int
     */
    public $memory;

    // disk
    /**
     * @example
     *
     * @var int
     */
    public $disk;
    protected $_name = [
        'cpuShared' => 'cpu_shared',
        'cpu'       => 'cpu',
        'memory'    => 'memory',
        'disk'      => 'disk',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cpuShared) {
            $res['cpu_shared'] = $this->cpuShared;
        }
        if (null !== $this->cpu) {
            $res['cpu'] = $this->cpu;
        }
        if (null !== $this->memory) {
            $res['memory'] = $this->memory;
        }
        if (null !== $this->disk) {
            $res['disk'] = $this->disk;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ComputerQuota
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cpu_shared'])) {
            $model->cpuShared = $map['cpu_shared'];
        }
        if (isset($map['cpu'])) {
            $model->cpu = $map['cpu'];
        }
        if (isset($map['memory'])) {
            $model->memory = $map['memory'];
        }
        if (isset($map['disk'])) {
            $model->disk = $map['disk'];
        }

        return $model;
    }
}
