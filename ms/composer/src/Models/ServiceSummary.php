<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class ServiceSummary extends Model
{
    // 应用数
    /**
     * @example 1
     *
     * @var int
     */
    public $appCount;

    // 服务数
    /**
     * @example 2
     *
     * @var int
     */
    public $serviceCount;

    // 节点数
    /**
     * @example 3
     *
     * @var int
     */
    public $nodeCount;
    protected $_name = [
        'appCount'     => 'app_count',
        'serviceCount' => 'service_count',
        'nodeCount'    => 'node_count',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appCount) {
            $res['app_count'] = $this->appCount;
        }
        if (null !== $this->serviceCount) {
            $res['service_count'] = $this->serviceCount;
        }
        if (null !== $this->nodeCount) {
            $res['node_count'] = $this->nodeCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ServiceSummary
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_count'])) {
            $model->appCount = $map['app_count'];
        }
        if (isset($map['service_count'])) {
            $model->serviceCount = $map['service_count'];
        }
        if (isset($map['node_count'])) {
            $model->nodeCount = $map['node_count'];
        }

        return $model;
    }
}
