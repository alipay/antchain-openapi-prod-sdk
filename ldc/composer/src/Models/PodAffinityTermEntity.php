<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class PodAffinityTermEntity extends Model
{
    // label_selector
    /**
     * @example
     *
     * @var MapStringToString[]
     */
    public $labelSelector;

    // namespaces
    /**
     * @example namespaces
     *
     * @var string[]
     */
    public $namespaces;

    // topology_key
    /**
     * @example topology_key
     *
     * @var string
     */
    public $topologyKey;
    protected $_name = [
        'labelSelector' => 'label_selector',
        'namespaces'    => 'namespaces',
        'topologyKey'   => 'topology_key',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->labelSelector) {
            $res['label_selector'] = [];
            if (null !== $this->labelSelector && \is_array($this->labelSelector)) {
                $n = 0;
                foreach ($this->labelSelector as $item) {
                    $res['label_selector'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->namespaces) {
            $res['namespaces'] = $this->namespaces;
        }
        if (null !== $this->topologyKey) {
            $res['topology_key'] = $this->topologyKey;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PodAffinityTermEntity
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['label_selector'])) {
            if (!empty($map['label_selector'])) {
                $model->labelSelector = [];
                $n                    = 0;
                foreach ($map['label_selector'] as $item) {
                    $model->labelSelector[$n++] = null !== $item ? MapStringToString::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['namespaces'])) {
            if (!empty($map['namespaces'])) {
                $model->namespaces = $map['namespaces'];
            }
        }
        if (isset($map['topology_key'])) {
            $model->topologyKey = $map['topology_key'];
        }

        return $model;
    }
}
