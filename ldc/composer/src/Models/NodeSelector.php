<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class NodeSelector extends Model
{
    // node selector terms
    /**
     * @example
     *
     * @var NodeSelectorTerm[]
     */
    public $nodeSelectorTerms;
    protected $_name = [
        'nodeSelectorTerms' => 'node_selector_terms',
    ];

    public function validate()
    {
        Model::validateRequired('nodeSelectorTerms', $this->nodeSelectorTerms, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->nodeSelectorTerms) {
            $res['node_selector_terms'] = [];
            if (null !== $this->nodeSelectorTerms && \is_array($this->nodeSelectorTerms)) {
                $n = 0;
                foreach ($this->nodeSelectorTerms as $item) {
                    $res['node_selector_terms'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NodeSelector
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['node_selector_terms'])) {
            if (!empty($map['node_selector_terms'])) {
                $model->nodeSelectorTerms = [];
                $n                        = 0;
                foreach ($map['node_selector_terms'] as $item) {
                    $model->nodeSelectorTerms[$n++] = null !== $item ? NodeSelectorTerm::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
