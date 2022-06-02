<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class TreeNode extends Model
{
    // 节点id，按树的前序排列
    /**
     * @example
     *
     * @var int
     */
    public $id;

    // 父节点id，不存在为null
    /**
     * @example 父节点id，不存在为null
     *
     * @var string
     */
    public $parentNodeId;

    // 深度
    /**
     * @example 1
     *
     * @var int
     */
    public $depth;

    // 是否叶子结点
    /**
     * @example true：是，false：否
     *
     * @var string
     */
    public $isLeefNode;

    // 模版
    /**
     * @example 模版
     *
     * @var Card
     */
    public $card;
    protected $_name = [
        'id'           => 'id',
        'parentNodeId' => 'parent_node_id',
        'depth'        => 'depth',
        'isLeefNode'   => 'is_leef_node',
        'card'         => 'card',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('parentNodeId', $this->parentNodeId, true);
        Model::validateRequired('depth', $this->depth, true);
        Model::validateRequired('isLeefNode', $this->isLeefNode, true);
        Model::validateRequired('card', $this->card, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->parentNodeId) {
            $res['parent_node_id'] = $this->parentNodeId;
        }
        if (null !== $this->depth) {
            $res['depth'] = $this->depth;
        }
        if (null !== $this->isLeefNode) {
            $res['is_leef_node'] = $this->isLeefNode;
        }
        if (null !== $this->card) {
            $res['card'] = null !== $this->card ? $this->card->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TreeNode
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['parent_node_id'])) {
            $model->parentNodeId = $map['parent_node_id'];
        }
        if (isset($map['depth'])) {
            $model->depth = $map['depth'];
        }
        if (isset($map['is_leef_node'])) {
            $model->isLeefNode = $map['is_leef_node'];
        }
        if (isset($map['card'])) {
            $model->card = Card::fromMap($map['card']);
        }

        return $model;
    }
}
