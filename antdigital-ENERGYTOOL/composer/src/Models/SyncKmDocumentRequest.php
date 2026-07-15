<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

class SyncKmDocumentRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'treeId' => 'tree_id',
        'nodeId' => 'node_id',
        'docMapId' => 'doc_map_id',
    ];
    public function validate() {
        Model::validateRequired('treeId', $this->treeId, true);
        Model::validateRequired('nodeId', $this->nodeId, true);
        Model::validateRequired('docMapId', $this->docMapId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->treeId) {
            $res['tree_id'] = $this->treeId;
        }
        if (null !== $this->nodeId) {
            $res['node_id'] = $this->nodeId;
        }
        if (null !== $this->docMapId) {
            $res['doc_map_id'] = $this->docMapId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SyncKmDocumentRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tree_id'])){
            $model->treeId = $map['tree_id'];
        }
        if(isset($map['node_id'])){
            $model->nodeId = $map['node_id'];
        }
        if(isset($map['doc_map_id'])){
            $model->docMapId = $map['doc_map_id'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 树ID
    /**
     * @var string
     */
    public $treeId;

    // 节点ID
    /**
     * @var string
     */
    public $nodeId;

    // 向量文档ID
    /**
     * @var string
     */
    public $docMapId;

}
