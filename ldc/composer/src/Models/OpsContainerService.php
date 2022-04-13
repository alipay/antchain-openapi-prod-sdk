<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class OpsContainerService extends Model
{
    // 命名空间
    /**
     * @example default
     *
     * @var string
     */
    public $namespace;

    // 容器服务名称
    /**
     * @example test
     *
     * @var string
     */
    public $name;

    // 待操作目标pods列表
    /**
     * @example [{name: "RZ01A", podNames: ["podA", "podB"]}]
     *
     * @var CellPods[]
     */
    public $selectedPods;
    protected $_name = [
        'namespace'    => 'namespace',
        'name'         => 'name',
        'selectedPods' => 'selected_pods',
    ];

    public function validate()
    {
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('name', $this->name, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OpsContainerService
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
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

        return $model;
    }
}
