<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class QueryClusterScanRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群id
    /**
     * @var string
     */
    public $clusterId;

    // 扫描id
    /**
     * @var string
     */
    public $scanId;
    protected $_name = [
        'authToken' => 'auth_token',
        'clusterId' => 'cluster_id',
        'scanId'    => 'scan_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->clusterId) {
            $res['cluster_id'] = $this->clusterId;
        }
        if (null !== $this->scanId) {
            $res['scan_id'] = $this->scanId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryClusterScanRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['cluster_id'])) {
            $model->clusterId = $map['cluster_id'];
        }
        if (isset($map['scan_id'])) {
            $model->scanId = $map['scan_id'];
        }

        return $model;
    }
}
