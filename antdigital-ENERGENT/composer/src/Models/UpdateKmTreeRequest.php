<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGENT\Models;

use AlibabaCloud\Tea\Model;

class UpdateKmTreeRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'treeId' => 'tree_id',
        'name' => 'name',
        'description' => 'description',
        'icon' => 'icon',
        'schemaJson' => 'schema_json',
        'graphEnabled' => 'graph_enabled',
    ];
    public function validate() {
        Model::validateRequired('treeId', $this->treeId, true);
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->icon) {
            $res['icon'] = $this->icon;
        }
        if (null !== $this->schemaJson) {
            $res['schema_json'] = $this->schemaJson;
        }
        if (null !== $this->graphEnabled) {
            $res['graph_enabled'] = $this->graphEnabled;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateKmTreeRequest
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
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['icon'])){
            $model->icon = $map['icon'];
        }
        if(isset($map['schema_json'])){
            $model->schemaJson = $map['schema_json'];
        }
        if(isset($map['graph_enabled'])){
            $model->graphEnabled = $map['graph_enabled'];
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

    // 知识库名称
    /**
     * @var string
     */
    public $name;

    // 知识库描述
    /**
     * @var string
     */
    public $description;

    // 知识库图标
    /**
     * @var string
     */
    public $icon;

    // 图谱本体Schema JSON
    /**
     * @var string
     */
    public $schemaJson;

    // 是否开启图谱编译
    /**
     * @var bool
     */
    public $graphEnabled;

}
