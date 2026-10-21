<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGENT\Models;

use AlibabaCloud\Tea\Model;

class DetailKmTreeResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'treeId' => 'tree_id',
        'name' => 'name',
        'description' => 'description',
        'icon' => 'icon',
        'version' => 'version',
        'activeVersion' => 'active_version',
        'nodeCount' => 'node_count',
        'documentCount' => 'document_count',
        'graphEnabled' => 'graph_enabled',
        'compileTaskCount' => 'compile_task_count',
        'rootNodeJson' => 'root_node_json',
        'gmtCreate' => 'gmt_create',
        'gmtModified' => 'gmt_modified',
        'tenantTag' => 'tenant_tag',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
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
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->activeVersion) {
            $res['active_version'] = $this->activeVersion;
        }
        if (null !== $this->nodeCount) {
            $res['node_count'] = $this->nodeCount;
        }
        if (null !== $this->documentCount) {
            $res['document_count'] = $this->documentCount;
        }
        if (null !== $this->graphEnabled) {
            $res['graph_enabled'] = $this->graphEnabled;
        }
        if (null !== $this->compileTaskCount) {
            $res['compile_task_count'] = $this->compileTaskCount;
        }
        if (null !== $this->rootNodeJson) {
            $res['root_node_json'] = $this->rootNodeJson;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->tenantTag) {
            $res['tenant_tag'] = $this->tenantTag;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DetailKmTreeResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
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
        if(isset($map['version'])){
            $model->version = $map['version'];
        }
        if(isset($map['active_version'])){
            $model->activeVersion = $map['active_version'];
        }
        if(isset($map['node_count'])){
            $model->nodeCount = $map['node_count'];
        }
        if(isset($map['document_count'])){
            $model->documentCount = $map['document_count'];
        }
        if(isset($map['graph_enabled'])){
            $model->graphEnabled = $map['graph_enabled'];
        }
        if(isset($map['compile_task_count'])){
            $model->compileTaskCount = $map['compile_task_count'];
        }
        if(isset($map['root_node_json'])){
            $model->rootNodeJson = $map['root_node_json'];
        }
        if(isset($map['gmt_create'])){
            $model->gmtCreate = $map['gmt_create'];
        }
        if(isset($map['gmt_modified'])){
            $model->gmtModified = $map['gmt_modified'];
        }
        if(isset($map['tenant_tag'])){
            $model->tenantTag = $map['tenant_tag'];
        }
        return $model;
    }
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

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

    // 最新版本号(无版本为空)
    /**
     * @var string
     */
    public $version;

    // 当前激活版本号(未激活为空)
    /**
     * @var string
     */
    public $activeVersion;

    // 节点总数
    /**
     * @var int
     */
    public $nodeCount;

    // 文档总数
    /**
     * @var int
     */
    public $documentCount;

    // 是否开启图谱编译
    /**
     * @var bool
     */
    public $graphEnabled;

    // 处理中(未终态)编译任务数(仅图谱开启返回)
    /**
     * @var int
     */
    public $compileTaskCount;

    // 根节点树JSON文本(OpenNode字段定义见文档)
    /**
     * @var string
     */
    public $rootNodeJson;

    // 创建时间
    /**
     * @var string
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @var string
     */
    public $gmtModified;

    // 租户标签(官方租户数据为official)
    /**
     * @var string
     */
    public $tenantTag;

}
