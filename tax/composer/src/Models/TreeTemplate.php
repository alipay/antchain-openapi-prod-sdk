<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class TreeTemplate extends Model
{
    // 树节点
    /**
     * @example
     *
     * @var TreeNode
     */
    public $treeNode;

    // Id
    /**
     * @example 123
     *
     * @var string
     */
    public $id;

    // 版本号
    /**
     * @example 1.0.8
     *
     * @var string
     */
    public $version;

    // 向上兼容的最小版本号
    /**
     * @example 1.0.06
     *
     * @var string
     */
    public $compatibleMinVersion;
    protected $_name = [
        'treeNode'             => 'tree_node',
        'id'                   => 'id',
        'version'              => 'version',
        'compatibleMinVersion' => 'compatible_min_version',
    ];

    public function validate()
    {
        Model::validateRequired('treeNode', $this->treeNode, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('version', $this->version, true);
        Model::validateRequired('compatibleMinVersion', $this->compatibleMinVersion, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->treeNode) {
            $res['tree_node'] = null !== $this->treeNode ? $this->treeNode->toMap() : null;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->compatibleMinVersion) {
            $res['compatible_min_version'] = $this->compatibleMinVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TreeTemplate
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tree_node'])) {
            $model->treeNode = TreeNode::fromMap($map['tree_node']);
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['compatible_min_version'])) {
            $model->compatibleMinVersion = $map['compatible_min_version'];
        }

        return $model;
    }
}
