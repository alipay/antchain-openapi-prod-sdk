<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class HPABasedElasticConfig extends Model
{
    // pod要发布的部署单元及每个部署单元副本数的映射关系列表
    /**
     * @example [{}]
     *
     * @var CellReplicasMap[]
     */
    public $cells;

    // 最小副本数
    /**
     * @example 1
     *
     * @var int
     */
    public $minReplica;

    // 最大副本数
    /**
     * @example 10
     *
     * @var int
     */
    public $maxReplica;

    // 弹性伸缩指标列表
    /**
     * @example
     *
     * @var HPABasedElasticConfigMetric[]
     */
    public $metrics;

    // 扩缩容规则高级配置
    /**
     * @example
     *
     * @var HPAScaleBehavior
     */
    public $behavior;
    protected $_name = [
        'cells'      => 'cells',
        'minReplica' => 'min_replica',
        'maxReplica' => 'max_replica',
        'metrics'    => 'metrics',
        'behavior'   => 'behavior',
    ];

    public function validate()
    {
        Model::validateRequired('cells', $this->cells, true);
        Model::validateRequired('minReplica', $this->minReplica, true);
        Model::validateRequired('maxReplica', $this->maxReplica, true);
        Model::validateRequired('metrics', $this->metrics, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cells) {
            $res['cells'] = [];
            if (null !== $this->cells && \is_array($this->cells)) {
                $n = 0;
                foreach ($this->cells as $item) {
                    $res['cells'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->minReplica) {
            $res['min_replica'] = $this->minReplica;
        }
        if (null !== $this->maxReplica) {
            $res['max_replica'] = $this->maxReplica;
        }
        if (null !== $this->metrics) {
            $res['metrics'] = [];
            if (null !== $this->metrics && \is_array($this->metrics)) {
                $n = 0;
                foreach ($this->metrics as $item) {
                    $res['metrics'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->behavior) {
            $res['behavior'] = null !== $this->behavior ? $this->behavior->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return HPABasedElasticConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cells'])) {
            if (!empty($map['cells'])) {
                $model->cells = [];
                $n            = 0;
                foreach ($map['cells'] as $item) {
                    $model->cells[$n++] = null !== $item ? CellReplicasMap::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['min_replica'])) {
            $model->minReplica = $map['min_replica'];
        }
        if (isset($map['max_replica'])) {
            $model->maxReplica = $map['max_replica'];
        }
        if (isset($map['metrics'])) {
            if (!empty($map['metrics'])) {
                $model->metrics = [];
                $n              = 0;
                foreach ($map['metrics'] as $item) {
                    $model->metrics[$n++] = null !== $item ? HPABasedElasticConfigMetric::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['behavior'])) {
            $model->behavior = HPAScaleBehavior::fromMap($map['behavior']);
        }

        return $model;
    }
}
