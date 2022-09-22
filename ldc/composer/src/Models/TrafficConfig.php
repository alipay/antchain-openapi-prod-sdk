<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class TrafficConfig extends Model
{
    // 是否摘除注册中心流量
    /**
     * @example true, false
     *
     * @var bool
     */
    public $registryManaged;

    // 摘流等待时间
    /**
     * @example 10
     *
     * @var int
     */
    public $registryTrafficOffWaitSec;
    protected $_name = [
        'registryManaged'           => 'registry_managed',
        'registryTrafficOffWaitSec' => 'registry_traffic_off_wait_sec',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->registryManaged) {
            $res['registry_managed'] = $this->registryManaged;
        }
        if (null !== $this->registryTrafficOffWaitSec) {
            $res['registry_traffic_off_wait_sec'] = $this->registryTrafficOffWaitSec;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TrafficConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['registry_managed'])) {
            $model->registryManaged = $map['registry_managed'];
        }
        if (isset($map['registry_traffic_off_wait_sec'])) {
            $model->registryTrafficOffWaitSec = $map['registry_traffic_off_wait_sec'];
        }

        return $model;
    }
}
