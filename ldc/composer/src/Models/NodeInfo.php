<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class NodeInfo extends Model
{
    // cell name
    /**
     * @example cell01
     *
     * @var string
     */
    public $cellName;

    // node ip
    /**
     * @example 10.121.11.3
     *
     * @var string
     */
    public $ip;

    // true
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isSchedulable;

    // number of capacity cpu core
    /**
     * @example 10
     *
     * @var int
     */
    public $limitedCpu;

    // quantity of capacity memory
    /**
     * @example 10
     *
     * @var int
     */
    public $limitedMemory;

    // node name
    /**
     * @example node01
     *
     * @var string
     */
    public $name;

    // pod number of one node
    /**
     * @example 10
     *
     * @var string
     */
    public $podNumber;

    // node state
    /**
     * @example RUNNING
     *
     * @var string
     */
    public $state;

    // quantity of used cpu core
    /**
     * @example 0
     *
     * @var int
     */
    public $usedCpu;

    // quantity of used memory
    /**
     * @example 0
     *
     * @var int
     */
    public $usedMemory;

    // zone name
    /**
     * @example zone01
     *
     * @var string
     */
    public $zoneName;

    // node labels
    /**
     * @example
     *
     * @var Label[]
     */
    public $labels;

    // node annotations
    /**
     * @example
     *
     * @var Annotation[]
     */
    public $annotations;

    // node created time
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $createdTime;

    // node system infos
    /**
     * @example
     *
     * @var Annotation[]
     */
    public $systemInfos;

    // max pod amount of node
    /**
     * @example
     *
     * @var int
     */
    public $maxPodAmount;

    // running pod amount of node
    /**
     * @example
     *
     * @var int
     */
    public $runningPodAmount;
    protected $_name = [
        'cellName'         => 'cell_name',
        'ip'               => 'ip',
        'isSchedulable'    => 'is_schedulable',
        'limitedCpu'       => 'limited_cpu',
        'limitedMemory'    => 'limited_memory',
        'name'             => 'name',
        'podNumber'        => 'pod_number',
        'state'            => 'state',
        'usedCpu'          => 'used_cpu',
        'usedMemory'       => 'used_memory',
        'zoneName'         => 'zone_name',
        'labels'           => 'labels',
        'annotations'      => 'annotations',
        'createdTime'      => 'created_time',
        'systemInfos'      => 'system_infos',
        'maxPodAmount'     => 'max_pod_amount',
        'runningPodAmount' => 'running_pod_amount',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validatePattern('createdTime', $this->createdTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cellName) {
            $res['cell_name'] = $this->cellName;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->isSchedulable) {
            $res['is_schedulable'] = $this->isSchedulable;
        }
        if (null !== $this->limitedCpu) {
            $res['limited_cpu'] = $this->limitedCpu;
        }
        if (null !== $this->limitedMemory) {
            $res['limited_memory'] = $this->limitedMemory;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->podNumber) {
            $res['pod_number'] = $this->podNumber;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->usedCpu) {
            $res['used_cpu'] = $this->usedCpu;
        }
        if (null !== $this->usedMemory) {
            $res['used_memory'] = $this->usedMemory;
        }
        if (null !== $this->zoneName) {
            $res['zone_name'] = $this->zoneName;
        }
        if (null !== $this->labels) {
            $res['labels'] = [];
            if (null !== $this->labels && \is_array($this->labels)) {
                $n = 0;
                foreach ($this->labels as $item) {
                    $res['labels'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->annotations) {
            $res['annotations'] = [];
            if (null !== $this->annotations && \is_array($this->annotations)) {
                $n = 0;
                foreach ($this->annotations as $item) {
                    $res['annotations'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->createdTime) {
            $res['created_time'] = $this->createdTime;
        }
        if (null !== $this->systemInfos) {
            $res['system_infos'] = [];
            if (null !== $this->systemInfos && \is_array($this->systemInfos)) {
                $n = 0;
                foreach ($this->systemInfos as $item) {
                    $res['system_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->maxPodAmount) {
            $res['max_pod_amount'] = $this->maxPodAmount;
        }
        if (null !== $this->runningPodAmount) {
            $res['running_pod_amount'] = $this->runningPodAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NodeInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cell_name'])) {
            $model->cellName = $map['cell_name'];
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }
        if (isset($map['is_schedulable'])) {
            $model->isSchedulable = $map['is_schedulable'];
        }
        if (isset($map['limited_cpu'])) {
            $model->limitedCpu = $map['limited_cpu'];
        }
        if (isset($map['limited_memory'])) {
            $model->limitedMemory = $map['limited_memory'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['pod_number'])) {
            $model->podNumber = $map['pod_number'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['used_cpu'])) {
            $model->usedCpu = $map['used_cpu'];
        }
        if (isset($map['used_memory'])) {
            $model->usedMemory = $map['used_memory'];
        }
        if (isset($map['zone_name'])) {
            $model->zoneName = $map['zone_name'];
        }
        if (isset($map['labels'])) {
            if (!empty($map['labels'])) {
                $model->labels = [];
                $n             = 0;
                foreach ($map['labels'] as $item) {
                    $model->labels[$n++] = null !== $item ? Label::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['annotations'])) {
            if (!empty($map['annotations'])) {
                $model->annotations = [];
                $n                  = 0;
                foreach ($map['annotations'] as $item) {
                    $model->annotations[$n++] = null !== $item ? Annotation::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['created_time'])) {
            $model->createdTime = $map['created_time'];
        }
        if (isset($map['system_infos'])) {
            if (!empty($map['system_infos'])) {
                $model->systemInfos = [];
                $n                  = 0;
                foreach ($map['system_infos'] as $item) {
                    $model->systemInfos[$n++] = null !== $item ? Annotation::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['max_pod_amount'])) {
            $model->maxPodAmount = $map['max_pod_amount'];
        }
        if (isset($map['running_pod_amount'])) {
            $model->runningPodAmount = $map['running_pod_amount'];
        }

        return $model;
    }
}
