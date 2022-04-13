<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class GetClusterNodeinfoRequest extends Model
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

    // node name
    /**
     * @var string
     */
    public $nodeName;
    protected $_name = [
        'authToken'   => 'auth_token',
        'clusterName' => 'cluster_name',
        'nodeName'    => 'node_name',
    ];

    public function validate()
    {
        Model::validateRequired('clusterName', $this->clusterName, true);
        Model::validateRequired('nodeName', $this->nodeName, true);
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
        if (null !== $this->nodeName) {
            $res['node_name'] = $this->nodeName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetClusterNodeinfoRequest
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
        if (isset($map['node_name'])) {
            $model->nodeName = $map['node_name'];
        }

        return $model;
    }
}
