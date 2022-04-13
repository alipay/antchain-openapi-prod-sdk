<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ContainerServiceOperation extends Model
{
    // 容器服务名称。
    /**
     * @example nginx
     *
     * @var string
     */
    public $containerServiceName;

    // 依赖的容器应用服务名称。
    /**
     * @example []
     *
     * @var string[]
     */
    public $dependContainerServiceNames;

    // 待操作目标pods列表
    /**
     * @example []
     *
     * @var CellPods[]
     */
    public $selectedPods;

    // 自定义发布批次
    /**
     * @example []
     *
     * @var ReleaseBatchObj[]
     */
    public $batches;

    // 缩放副本数量，扩缩容时使用
    /**
     * @example []
     *
     * @var ReplicaCount[]
     */
    public $scaleReplicas;

    // 应用服务当前版本
    /**
     * @example cafe-8789ffsd89fadisrd3
     *
     * @var string
     */
    public $containerServiceRevision;

    // [huanyu场景使用]，灰度平台pods分批序列化为json的结果
    /**
     * @example [{"podA"}, {"podB, podC"}]
     *
     * @var string
     */
    public $graycoreBatches;
    protected $_name = [
        'containerServiceName'        => 'container_service_name',
        'dependContainerServiceNames' => 'depend_container_service_names',
        'selectedPods'                => 'selected_pods',
        'batches'                     => 'batches',
        'scaleReplicas'               => 'scale_replicas',
        'containerServiceRevision'    => 'container_service_revision',
        'graycoreBatches'             => 'graycore_batches',
    ];

    public function validate()
    {
        Model::validateRequired('containerServiceName', $this->containerServiceName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->containerServiceName) {
            $res['container_service_name'] = $this->containerServiceName;
        }
        if (null !== $this->dependContainerServiceNames) {
            $res['depend_container_service_names'] = $this->dependContainerServiceNames;
        }
        if (null !== $this->selectedPods) {
            $res['selected_pods'] = [];
            if (null !== $this->selectedPods && \is_array($this->selectedPods)) {
                $n = 0;
                foreach ($this->selectedPods as $item) {
                    $res['selected_pods'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->batches) {
            $res['batches'] = [];
            if (null !== $this->batches && \is_array($this->batches)) {
                $n = 0;
                foreach ($this->batches as $item) {
                    $res['batches'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->scaleReplicas) {
            $res['scale_replicas'] = [];
            if (null !== $this->scaleReplicas && \is_array($this->scaleReplicas)) {
                $n = 0;
                foreach ($this->scaleReplicas as $item) {
                    $res['scale_replicas'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->containerServiceRevision) {
            $res['container_service_revision'] = $this->containerServiceRevision;
        }
        if (null !== $this->graycoreBatches) {
            $res['graycore_batches'] = $this->graycoreBatches;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContainerServiceOperation
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['container_service_name'])) {
            $model->containerServiceName = $map['container_service_name'];
        }
        if (isset($map['depend_container_service_names'])) {
            if (!empty($map['depend_container_service_names'])) {
                $model->dependContainerServiceNames = $map['depend_container_service_names'];
            }
        }
        if (isset($map['selected_pods'])) {
            if (!empty($map['selected_pods'])) {
                $model->selectedPods = [];
                $n                   = 0;
                foreach ($map['selected_pods'] as $item) {
                    $model->selectedPods[$n++] = null !== $item ? CellPods::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['batches'])) {
            if (!empty($map['batches'])) {
                $model->batches = [];
                $n              = 0;
                foreach ($map['batches'] as $item) {
                    $model->batches[$n++] = null !== $item ? ReleaseBatchObj::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['scale_replicas'])) {
            if (!empty($map['scale_replicas'])) {
                $model->scaleReplicas = [];
                $n                    = 0;
                foreach ($map['scale_replicas'] as $item) {
                    $model->scaleReplicas[$n++] = null !== $item ? ReplicaCount::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['container_service_revision'])) {
            $model->containerServiceRevision = $map['container_service_revision'];
        }
        if (isset($map['graycore_batches'])) {
            $model->graycoreBatches = $map['graycore_batches'];
        }

        return $model;
    }
}
