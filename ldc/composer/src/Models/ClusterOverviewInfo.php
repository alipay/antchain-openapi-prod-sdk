<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ClusterOverviewInfo extends Model
{
    // available cpu core
    /**
     * @example 1
     *
     * @var int
     */
    public $availableCPU;

    // available disk
    /**
     * @example 10
     *
     * @var int
     */
    public $availableDisk;

    // available memory
    /**
     * @example 1
     *
     * @var int
     */
    public $availableMemory;

    // available Node Number
    /**
     * @example 1
     *
     * @var int
     */
    public $availableNodeNumber;

    // total cpu core number
    /**
     * @example 1
     *
     * @var int
     */
    public $totalCPU;

    // total disk
    /**
     * @example 10
     *
     * @var int
     */
    public $totalDisk;

    // total memory
    /**
     * @example 1
     *
     * @var int
     */
    public $totalMemory;

    // total node number
    /**
     * @example 1
     *
     * @var int
     */
    public $totalNodeNumber;
    protected $_name = [
        'availableCPU'        => 'available_c_p_u',
        'availableDisk'       => 'available_disk',
        'availableMemory'     => 'available_memory',
        'availableNodeNumber' => 'available_node_number',
        'totalCPU'            => 'total_c_p_u',
        'totalDisk'           => 'total_disk',
        'totalMemory'         => 'total_memory',
        'totalNodeNumber'     => 'total_node_number',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->availableCPU) {
            $res['available_c_p_u'] = $this->availableCPU;
        }
        if (null !== $this->availableDisk) {
            $res['available_disk'] = $this->availableDisk;
        }
        if (null !== $this->availableMemory) {
            $res['available_memory'] = $this->availableMemory;
        }
        if (null !== $this->availableNodeNumber) {
            $res['available_node_number'] = $this->availableNodeNumber;
        }
        if (null !== $this->totalCPU) {
            $res['total_c_p_u'] = $this->totalCPU;
        }
        if (null !== $this->totalDisk) {
            $res['total_disk'] = $this->totalDisk;
        }
        if (null !== $this->totalMemory) {
            $res['total_memory'] = $this->totalMemory;
        }
        if (null !== $this->totalNodeNumber) {
            $res['total_node_number'] = $this->totalNodeNumber;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ClusterOverviewInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['available_c_p_u'])) {
            $model->availableCPU = $map['available_c_p_u'];
        }
        if (isset($map['available_disk'])) {
            $model->availableDisk = $map['available_disk'];
        }
        if (isset($map['available_memory'])) {
            $model->availableMemory = $map['available_memory'];
        }
        if (isset($map['available_node_number'])) {
            $model->availableNodeNumber = $map['available_node_number'];
        }
        if (isset($map['total_c_p_u'])) {
            $model->totalCPU = $map['total_c_p_u'];
        }
        if (isset($map['total_disk'])) {
            $model->totalDisk = $map['total_disk'];
        }
        if (isset($map['total_memory'])) {
            $model->totalMemory = $map['total_memory'];
        }
        if (isset($map['total_node_number'])) {
            $model->totalNodeNumber = $map['total_node_number'];
        }

        return $model;
    }
}
