<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGENT\Models;

use AlibabaCloud\Tea\Model;

class NextKmVersionResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'treeId' => 'tree_id',
        'nextVersion' => 'next_version',
        'nodeCount' => 'node_count',
        'documentCount' => 'document_count',
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
        if (null !== $this->nextVersion) {
            $res['next_version'] = $this->nextVersion;
        }
        if (null !== $this->nodeCount) {
            $res['node_count'] = $this->nodeCount;
        }
        if (null !== $this->documentCount) {
            $res['document_count'] = $this->documentCount;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return NextKmVersionResponse
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
        if(isset($map['next_version'])){
            $model->nextVersion = $map['next_version'];
        }
        if(isset($map['node_count'])){
            $model->nodeCount = $map['node_count'];
        }
        if(isset($map['document_count'])){
            $model->documentCount = $map['document_count'];
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

    // 下一个版本号
    /**
     * @var string
     */
    public $nextVersion;

    // 节点数
    /**
     * @var int
     */
    public $nodeCount;

    // 文档数
    /**
     * @var int
     */
    public $documentCount;

}
