<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGENT\Models;

use AlibabaCloud\Tea\Model;

class OpenNode extends Model {
    protected $_name = [
        'nodeId' => 'node_id',
        'parentNodeId' => 'parent_node_id',
        'slotKey' => 'slot_key',
        'slotValue' => 'slot_value',
        'level' => 'level',
        'sortOrder' => 'sort_order',
        'gmtCreate' => 'gmt_create',
        'children' => 'children',
    ];
    public function validate() {
        Model::validateRequired('nodeId', $this->nodeId, true);
        Model::validateRequired('parentNodeId', $this->parentNodeId, true);
        Model::validateRequired('slotKey', $this->slotKey, true);
        Model::validateRequired('slotValue', $this->slotValue, true);
        Model::validateRequired('level', $this->level, true);
        Model::validateRequired('sortOrder', $this->sortOrder, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('children', $this->children, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->nodeId) {
            $res['node_id'] = $this->nodeId;
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
        if (null !== $this->level) {
            $res['level'] = $this->level;
        }
        if (null !== $this->sortOrder) {
            $res['sort_order'] = $this->sortOrder;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->children) {
            $res['children'] = $this->children;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OpenNode
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['node_id'])){
            $model->nodeId = $map['node_id'];
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
        if(isset($map['level'])){
            $model->level = $map['level'];
        }
        if(isset($map['sort_order'])){
            $model->sortOrder = $map['sort_order'];
        }
        if(isset($map['gmt_create'])){
            $model->gmtCreate = $map['gmt_create'];
        }
        if(isset($map['children'])){
            $model->children = $map['children'];
        }
        return $model;
    }
    // node ID
    /**
     * @example N1
     * @var string
     */
    public $nodeId;

    // parent node ID
    /**
     * @example 
     * @var string
     */
    public $parentNodeId;

    // slot key
    /**
     * @example system:root
     * @var string
     */
    public $slotKey;

    // slot value
    /**
     * @example 根节点
     * @var string
     */
    public $slotValue;

    // level
    /**
     * @example 0
     * @var int
     */
    public $level;

    // sort订单
    /**
     * @example 0
     * @var int
     */
    public $sortOrder;

    // gmt create
    /**
     * @example 2026-08-01 10:00:00
     * @var string
     */
    public $gmtCreate;

    // children
    /**
     * @example [{"node_id":"N2","parent_node_id":"N1","slot_key":"province","slot_value":"山东","level":1,"sort_order":0,"gmt_create":"2026-08-01 10:00:00","children":[]}]
     * @var string
     */
    public $children;

}
