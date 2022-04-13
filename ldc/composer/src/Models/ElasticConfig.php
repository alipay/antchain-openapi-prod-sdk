<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ElasticConfig extends Model
{
    // 固定副本数配置。
    /**
     * @example {}
     *
     * @var FixedReplicaElasticConfig
     */
    public $fixedReplica;

    // 弹性伸缩配置
    /**
     * @example
     *
     * @var HPABasedElasticConfig
     */
    public $hpa;

    // 弹性配置模式：
    // FIXED 固定副本数
    // HPA 弹性伸缩
    /**
     * @example FIXED
     *
     * @var string
     */
    public $mode;
    protected $_name = [
        'fixedReplica' => 'fixed_replica',
        'hpa'          => 'hpa',
        'mode'         => 'mode',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fixedReplica) {
            $res['fixed_replica'] = null !== $this->fixedReplica ? $this->fixedReplica->toMap() : null;
        }
        if (null !== $this->hpa) {
            $res['hpa'] = null !== $this->hpa ? $this->hpa->toMap() : null;
        }
        if (null !== $this->mode) {
            $res['mode'] = $this->mode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ElasticConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['fixed_replica'])) {
            $model->fixedReplica = FixedReplicaElasticConfig::fromMap($map['fixed_replica']);
        }
        if (isset($map['hpa'])) {
            $model->hpa = HPABasedElasticConfig::fromMap($map['hpa']);
        }
        if (isset($map['mode'])) {
            $model->mode = $map['mode'];
        }

        return $model;
    }
}
