<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGENT\Models;

use AlibabaCloud\Tea\Model;

class UnmountKmDocumentRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'treeId' => 'tree_id',
        'nodeId' => 'node_id',
        'vectorStoreMapId' => 'vector_store_map_id',
    ];
    public function validate() {
        Model::validateRequired('treeId', $this->treeId, true);
        Model::validateRequired('nodeId', $this->nodeId, true);
        Model::validateRequired('vectorStoreMapId', $this->vectorStoreMapId, true);
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
        if (null !== $this->vectorStoreMapId) {
            $res['vector_store_map_id'] = $this->vectorStoreMapId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UnmountKmDocumentRequest
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
        if(isset($map['vector_store_map_id'])){
            $model->vectorStoreMapId = $map['vector_store_map_id'];
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

    // 向量库映射ID
    /**
     * @var string
     */
    public $vectorStoreMapId;

}
