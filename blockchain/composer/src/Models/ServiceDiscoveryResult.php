<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ServiceDiscoveryResult extends Model
{
    // 提供该服务能力的did
    /**
     * @example did:mychain:...
     *
     * @var string
     */
    public $did;

    // 提供该服务能力的endpoint信息
    /**
     * @example
     *
     * @var DidDocServicesInfo[]
     */
    public $services;
    protected $_name = [
        'did'      => 'did',
        'services' => 'services',
    ];

    public function validate()
    {
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('services', $this->services, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->services) {
            $res['services'] = [];
            if (null !== $this->services && \is_array($this->services)) {
                $n = 0;
                foreach ($this->services as $item) {
                    $res['services'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ServiceDiscoveryResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['services'])) {
            if (!empty($map['services'])) {
                $model->services = [];
                $n               = 0;
                foreach ($map['services'] as $item) {
                    $model->services[$n++] = null !== $item ? DidDocServicesInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
