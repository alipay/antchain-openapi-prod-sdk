<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class TraasEntityTopoEdge extends Model
{
    // source_node
    /**
     * @example
     *
     * @var TraasEntityTopoNode
     */
    public $sourceNode;

    // target_node
    /**
     * @example
     *
     * @var TraasEntityTopoNode
     */
    public $targetNode;

    // relation
    /**
     * @example 1:n
     *
     * @var string
     */
    public $relation;
    protected $_name = [
        'sourceNode' => 'source_node',
        'targetNode' => 'target_node',
        'relation'   => 'relation',
    ];

    public function validate()
    {
        Model::validateRequired('sourceNode', $this->sourceNode, true);
        Model::validateRequired('targetNode', $this->targetNode, true);
        Model::validateRequired('relation', $this->relation, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->sourceNode) {
            $res['source_node'] = null !== $this->sourceNode ? $this->sourceNode->toMap() : null;
        }
        if (null !== $this->targetNode) {
            $res['target_node'] = null !== $this->targetNode ? $this->targetNode->toMap() : null;
        }
        if (null !== $this->relation) {
            $res['relation'] = $this->relation;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TraasEntityTopoEdge
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['source_node'])) {
            $model->sourceNode = TraasEntityTopoNode::fromMap($map['source_node']);
        }
        if (isset($map['target_node'])) {
            $model->targetNode = TraasEntityTopoNode::fromMap($map['target_node']);
        }
        if (isset($map['relation'])) {
            $model->relation = $map['relation'];
        }

        return $model;
    }
}
