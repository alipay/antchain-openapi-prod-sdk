<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGENT\Models;

use AlibabaCloud\Tea\Model;

class UpdateKmNodeRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'treeId' => 'tree_id',
        'nodeId' => 'node_id',
        'slotKey' => 'slot_key',
        'slotValue' => 'slot_value',
    ];
    public function validate() {
        Model::validateRequired('treeId', $this->treeId, true);
        Model::validateRequired('nodeId', $this->nodeId, true);
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
        if (null !== $this->nodeId) {
            $res['node_id'] = $this->nodeId;
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
     * @return UpdateKmNodeRequest
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
        if(isset($map['node_id'])){
            $model->nodeId = $map['node_id'];
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

    // 节点ID
    /**
     * @var string
     */
    public $nodeId;

    // 节点键名
    /**
     * @var string
     */
    public $slotKey;

    // 节点值
    /**
     * @var string
     */
    public $slotValue;

}
