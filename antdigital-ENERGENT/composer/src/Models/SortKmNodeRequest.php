<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGENT\Models;

use AlibabaCloud\Tea\Model;

class SortKmNodeRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'treeId' => 'tree_id',
        'parentNodeId' => 'parent_node_id',
        'nodeIds' => 'node_ids',
    ];
    public function validate() {
        Model::validateRequired('treeId', $this->treeId, true);
        Model::validateRequired('nodeIds', $this->nodeIds, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->treeId) {
            $res['tree_id'] = $this->treeId;
        }
        if (null !== $this->parentNodeId) {
            $res['parent_node_id'] = $this->parentNodeId;
        }
        if (null !== $this->nodeIds) {
            $res['node_ids'] = $this->nodeIds;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SortKmNodeRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['tree_id'])){
            $model->treeId = $map['tree_id'];
        }
        if(isset($map['parent_node_id'])){
            $model->parentNodeId = $map['parent_node_id'];
        }
        if(isset($map['node_ids'])){
            $model->nodeIds = $map['node_ids'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 知识库ID
    /**
     * @var string
     */
    public $treeId;

    // 父节点ID(空为顶层)
    /**
     * @var string
     */
    public $parentNodeId;

    // 按新顺序排列的节点ID(逗号分隔)
    /**
     * @var string
     */
    public $nodeIds;

}
