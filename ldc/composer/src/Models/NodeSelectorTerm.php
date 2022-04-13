<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class NodeSelectorTerm extends Model
{
    // A list of node selector requirements by node labels.
    //
    /**
     * @example
     *
     * @var NodeSelectorRequirement[]
     */
    public $matchExpressions;

    // A list of node selector requirements by node fields.
    //
    /**
     * @example
     *
     * @var NodeSelectorRequirement[]
     */
    public $matchFields;
    protected $_name = [
        'matchExpressions' => 'match_expressions',
        'matchFields'      => 'match_fields',
    ];

    public function validate()
    {
        Model::validateRequired('matchFields', $this->matchFields, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->matchExpressions) {
            $res['match_expressions'] = [];
            if (null !== $this->matchExpressions && \is_array($this->matchExpressions)) {
                $n = 0;
                foreach ($this->matchExpressions as $item) {
                    $res['match_expressions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->matchFields) {
            $res['match_fields'] = [];
            if (null !== $this->matchFields && \is_array($this->matchFields)) {
                $n = 0;
                foreach ($this->matchFields as $item) {
                    $res['match_fields'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NodeSelectorTerm
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['match_expressions'])) {
            if (!empty($map['match_expressions'])) {
                $model->matchExpressions = [];
                $n                       = 0;
                foreach ($map['match_expressions'] as $item) {
                    $model->matchExpressions[$n++] = null !== $item ? NodeSelectorRequirement::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['match_fields'])) {
            if (!empty($map['match_fields'])) {
                $model->matchFields = [];
                $n                  = 0;
                foreach ($map['match_fields'] as $item) {
                    $model->matchFields[$n++] = null !== $item ? NodeSelectorRequirement::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
