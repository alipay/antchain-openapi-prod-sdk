<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunChainResouceType extends Model
{
    // type_id
    /**
     * @example type_id
     *
     * @var int
     */
    public $typeId;

    // cpu
    /**
     * @example 24
     *
     * @var int
     */
    public $cpu;

    // memory
    /**
     * @example 24
     *
     * @var int
     */
    public $memory;

    // disk
    /**
     * @example 500
     *
     * @var int
     */
    public $disk;
    protected $_name = [
        'typeId' => 'type_id',
        'cpu'    => 'cpu',
        'memory' => 'memory',
        'disk'   => 'disk',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->typeId) {
            $res['type_id'] = $this->typeId;
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
     * @return ALiYunChainResouceType
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type_id'])) {
            $model->typeId = $map['type_id'];
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
