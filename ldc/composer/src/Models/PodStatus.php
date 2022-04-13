<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class PodStatus extends Model
{
    // 节点ip
    /**
     * @example 100.1.1.2
     *
     * @var string
     */
    public $hostIp;

    // pod状态
    /**
     * @example Pending
     *
     * @var string
     */
    public $phase;

    // podip
    /**
     * @example 10.1.1.2
     *
     * @var string
     */
    public $podIp;

    // pod container status
    /**
     * @example [{}]
     *
     * @var ContainerStatus[]
     */
    public $containerStatuses;
    protected $_name = [
        'hostIp'            => 'host_ip',
        'phase'             => 'phase',
        'podIp'             => 'pod_ip',
        'containerStatuses' => 'container_statuses',
    ];

    public function validate()
    {
        Model::validateRequired('phase', $this->phase, true);
        Model::validateRequired('containerStatuses', $this->containerStatuses, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->hostIp) {
            $res['host_ip'] = $this->hostIp;
        }
        if (null !== $this->phase) {
            $res['phase'] = $this->phase;
        }
        if (null !== $this->podIp) {
            $res['pod_ip'] = $this->podIp;
        }
        if (null !== $this->containerStatuses) {
            $res['container_statuses'] = [];
            if (null !== $this->containerStatuses && \is_array($this->containerStatuses)) {
                $n = 0;
                foreach ($this->containerStatuses as $item) {
                    $res['container_statuses'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PodStatus
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['host_ip'])) {
            $model->hostIp = $map['host_ip'];
        }
        if (isset($map['phase'])) {
            $model->phase = $map['phase'];
        }
        if (isset($map['pod_ip'])) {
            $model->podIp = $map['pod_ip'];
        }
        if (isset($map['container_statuses'])) {
            if (!empty($map['container_statuses'])) {
                $model->containerStatuses = [];
                $n                        = 0;
                foreach ($map['container_statuses'] as $item) {
                    $model->containerStatuses[$n++] = null !== $item ? ContainerStatus::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
