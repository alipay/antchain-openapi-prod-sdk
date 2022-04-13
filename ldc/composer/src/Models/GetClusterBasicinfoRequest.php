<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class GetClusterBasicinfoRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // cluster name
    /**
     * @var string
     */
    public $clusterName;
    protected $_name = [
        'authToken'   => 'auth_token',
        'clusterName' => 'cluster_name',
    ];

    public function validate()
    {
        Model::validateRequired('clusterName', $this->clusterName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->clusterName) {
            $res['cluster_name'] = $this->clusterName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetClusterBasicinfoRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['cluster_name'])) {
            $model->clusterName = $map['cluster_name'];
        }

        return $model;
    }
}
