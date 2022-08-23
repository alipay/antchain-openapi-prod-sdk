<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class LbBackendServer extends Model
{
    // 应用容器名称
    /**
     * @example zz-xxx-1
     *
     * @var string
     */
    public $containerName;

    // lb backendServer权值
    /**
     * @example 100
     *
     * @var int
     */
    public $weight;

    // lb和backendServer关系
    /**
     * @example ONETOALL
     *
     * @var string
     */
    public $relationType;

    // 环境id
    /**
     * @example 7304000001
     *
     * @var string
     */
    public $envId;
    protected $_name = [
        'containerName' => 'container_name',
        'weight'        => 'weight',
        'relationType'  => 'relation_type',
        'envId'         => 'env_id',
    ];

    public function validate()
    {
        Model::validateRequired('containerName', $this->containerName, true);
        Model::validateRequired('weight', $this->weight, true);
        Model::validateRequired('relationType', $this->relationType, true);
        Model::validateRequired('envId', $this->envId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->containerName) {
            $res['container_name'] = $this->containerName;
        }
        if (null !== $this->weight) {
            $res['weight'] = $this->weight;
        }
        if (null !== $this->relationType) {
            $res['relation_type'] = $this->relationType;
        }
        if (null !== $this->envId) {
            $res['env_id'] = $this->envId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LbBackendServer
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['container_name'])) {
            $model->containerName = $map['container_name'];
        }
        if (isset($map['weight'])) {
            $model->weight = $map['weight'];
        }
        if (isset($map['relation_type'])) {
            $model->relationType = $map['relation_type'];
        }
        if (isset($map['env_id'])) {
            $model->envId = $map['env_id'];
        }

        return $model;
    }
}
