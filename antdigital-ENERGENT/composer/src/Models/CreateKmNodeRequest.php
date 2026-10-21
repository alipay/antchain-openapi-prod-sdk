<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGENT\Models;

use AlibabaCloud\Tea\Model;

class CreateKmNodeRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'treeId' => 'tree_id',
        'parentNodeId' => 'parent_node_id',
        'slotKey' => 'slot_key',
        'slotValue' => 'slot_value',
    ];
    public function validate() {
        Model::validateRequired('treeId', $this->treeId, true);
        Model::validateRequired('parentNodeId', $this->parentNodeId, true);
        Model::validateRequired('slotKey', $this->slotKey, true);
        Model::validateRequired('slotValue', $this->slotValue, true);
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
        if (null !== $this->slotKey) {
            $res['slot_key'] = $this->slotKey;
        }
        if (null !== $this->slotValue) {
            $res['slot_value'] = $this->slotValue;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateKmNodeRequest
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
        if(isset($map['slot_key'])){
            $model->slotKey = $map['slot_key'];
        }
        if(isset($map['slot_value'])){
            $model->slotValue = $map['slot_value'];
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

    // 父节点ID
    /**
     * @var string
     */
    public $parentNodeId;

    // 节点键名(最长50)
    /**
     * @var string
     */
    public $slotKey;

    // 节点值(最长100)
    /**
     * @var string
     */
    public $slotValue;

}
