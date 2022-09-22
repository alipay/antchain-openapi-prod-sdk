<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ClusterState extends Model
{
    // 集群名称
    /**
     * @example cluster
     *
     * @var string
     */
    public $clusterName;

    // 联邦资源的分发状态，空字符串代表成功，否则为错误码
    /**
     * @example CreationFailed
     *
     * @var string
     */
    public $state;

    // 详细错误信息
    /**
     * @example some detailed message
     *
     * @var string
     */
    public $message;
    protected $_name = [
        'clusterName' => 'cluster_name',
        'state'       => 'state',
        'message'     => 'message',
    ];

    public function validate()
    {
        Model::validateRequired('clusterName', $this->clusterName, true);
        Model::validateRequired('state', $this->state, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->clusterName) {
            $res['cluster_name'] = $this->clusterName;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ClusterState
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cluster_name'])) {
            $model->clusterName = $map['cluster_name'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }

        return $model;
    }
}
