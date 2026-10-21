<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGENT\Models;

use AlibabaCloud\Tea\Model;

class RetrieveKgGraphRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'kbId' => 'kb_id',
        'entityTypes' => 'entity_types',
        'relationTypes' => 'relation_types',
        'showIsolated' => 'show_isolated',
        'includeAnchors' => 'include_anchors',
    ];
    public function validate() {
        Model::validateRequired('kbId', $this->kbId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->kbId) {
            $res['kb_id'] = $this->kbId;
        }
        if (null !== $this->entityTypes) {
            $res['entity_types'] = $this->entityTypes;
        }
        if (null !== $this->relationTypes) {
            $res['relation_types'] = $this->relationTypes;
        }
        if (null !== $this->showIsolated) {
            $res['show_isolated'] = $this->showIsolated;
        }
        if (null !== $this->includeAnchors) {
            $res['include_anchors'] = $this->includeAnchors;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return RetrieveKgGraphRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['kb_id'])){
            $model->kbId = $map['kb_id'];
        }
        if(isset($map['entity_types'])){
            $model->entityTypes = $map['entity_types'];
        }
        if(isset($map['relation_types'])){
            $model->relationTypes = $map['relation_types'];
        }
        if(isset($map['show_isolated'])){
            $model->showIsolated = $map['show_isolated'];
        }
        if(isset($map['include_anchors'])){
            $model->includeAnchors = $map['include_anchors'];
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
    public $kbId;

    // 限定实体类型集合(逗号分隔)
    /**
     * @var string
     */
    public $entityTypes;

    // 限定关系类型集合(逗号分隔)
    /**
     * @var string
     */
    public $relationTypes;

    // 是否包含孤立节点
    /**
     * @var bool
     */
    public $showIsolated;

    // 是否包含锚点节点
    /**
     * @var bool
     */
    public $includeAnchors;

}
