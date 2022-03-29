<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class TraceQuerySummary extends Model
{
    // local endpoint ip
    /**
     * @example
     *
     * @var string[]
     */
    public $localIp;

    // local endpoint service name
    /**
     * @example
     *
     * @var string[]
     */
    public $localServiceName;

    // remote endpoint ip
    /**
     * @example
     *
     * @var string[]
     */
    public $remoteIp;

    // remote endpoint service name
    /**
     * @example
     *
     * @var string[]
     */
    public $remoteServiceName;

    // 状态
    /**
     * @example
     *
     * @var string[]
     */
    public $status;
    protected $_name = [
        'localIp'           => 'local_ip',
        'localServiceName'  => 'local_service_name',
        'remoteIp'          => 'remote_ip',
        'remoteServiceName' => 'remote_service_name',
        'status'            => 'status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->localIp) {
            $res['local_ip'] = $this->localIp;
        }
        if (null !== $this->localServiceName) {
            $res['local_service_name'] = $this->localServiceName;
        }
        if (null !== $this->remoteIp) {
            $res['remote_ip'] = $this->remoteIp;
        }
        if (null !== $this->remoteServiceName) {
            $res['remote_service_name'] = $this->remoteServiceName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TraceQuerySummary
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['local_ip'])) {
            if (!empty($map['local_ip'])) {
                $model->localIp = $map['local_ip'];
            }
        }
        if (isset($map['local_service_name'])) {
            if (!empty($map['local_service_name'])) {
                $model->localServiceName = $map['local_service_name'];
            }
        }
        if (isset($map['remote_ip'])) {
            if (!empty($map['remote_ip'])) {
                $model->remoteIp = $map['remote_ip'];
            }
        }
        if (isset($map['remote_service_name'])) {
            if (!empty($map['remote_service_name'])) {
                $model->remoteServiceName = $map['remote_service_name'];
            }
        }
        if (isset($map['status'])) {
            if (!empty($map['status'])) {
                $model->status = $map['status'];
            }
        }

        return $model;
    }
}
