<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class FedDeploymentClusterOverride extends Model
{
    // 集群名称
    /**
     * @example cluster-name
     *
     * @var string
     */
    public $cluster;

    // 集群Deployment replica数量
    /**
     * @example
     *
     * @var int
     */
    public $replica;

    // 环境变量配置覆盖
    /**
     * @example
     *
     * @var EnvVarClusterOverride[]
     */
    public $envVarOverride;
    protected $_name = [
        'cluster'        => 'cluster',
        'replica'        => 'replica',
        'envVarOverride' => 'env_var_override',
    ];

    public function validate()
    {
        Model::validateRequired('cluster', $this->cluster, true);
        Model::validateRequired('replica', $this->replica, true);
        Model::validateRequired('envVarOverride', $this->envVarOverride, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cluster) {
            $res['cluster'] = $this->cluster;
        }
        if (null !== $this->replica) {
            $res['replica'] = $this->replica;
        }
        if (null !== $this->envVarOverride) {
            $res['env_var_override'] = [];
            if (null !== $this->envVarOverride && \is_array($this->envVarOverride)) {
                $n = 0;
                foreach ($this->envVarOverride as $item) {
                    $res['env_var_override'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FedDeploymentClusterOverride
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cluster'])) {
            $model->cluster = $map['cluster'];
        }
        if (isset($map['replica'])) {
            $model->replica = $map['replica'];
        }
        if (isset($map['env_var_override'])) {
            if (!empty($map['env_var_override'])) {
                $model->envVarOverride = [];
                $n                     = 0;
                foreach ($map['env_var_override'] as $item) {
                    $model->envVarOverride[$n++] = null !== $item ? EnvVarClusterOverride::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
