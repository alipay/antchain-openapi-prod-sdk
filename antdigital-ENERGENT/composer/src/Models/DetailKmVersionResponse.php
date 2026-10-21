<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGENT\Models;

use AlibabaCloud\Tea\Model;

class DetailKmVersionResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'versionId' => 'version_id',
        'treeId' => 'tree_id',
        'version' => 'version',
        'description' => 'description',
        'snapshot' => 'snapshot',
        'docCount' => 'doc_count',
        'nodeCount' => 'node_count',
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
        if (null !== $this->versionId) {
            $res['version_id'] = $this->versionId;
        }
        if (null !== $this->treeId) {
            $res['tree_id'] = $this->treeId;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->snapshot) {
            $res['snapshot'] = $this->snapshot;
        }
        if (null !== $this->docCount) {
            $res['doc_count'] = $this->docCount;
        }
        if (null !== $this->nodeCount) {
            $res['node_count'] = $this->nodeCount;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DetailKmVersionResponse
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
        if(isset($map['version_id'])){
            $model->versionId = $map['version_id'];
        }
        if(isset($map['tree_id'])){
            $model->treeId = $map['tree_id'];
        }
        if(isset($map['version'])){
            $model->version = $map['version'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['snapshot'])){
            $model->snapshot = $map['snapshot'];
        }
        if(isset($map['doc_count'])){
            $model->docCount = $map['doc_count'];
        }
        if(isset($map['node_count'])){
            $model->nodeCount = $map['node_count'];
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

    // 版本ID
    /**
     * @var string
     */
    public $versionId;

    // 知识库ID
    /**
     * @var string
     */
    public $treeId;

    // 版本号
    /**
     * @var string
     */
    public $version;

    // 版本描述
    /**
     * @var string
     */
    public $description;

    // 版本快照JSON文本(树结构全文)
    /**
     * @var string
     */
    public $snapshot;

    // 文档数
    /**
     * @var int
     */
    public $docCount;

    // 节点数
    /**
     * @var int
     */
    public $nodeCount;

}
