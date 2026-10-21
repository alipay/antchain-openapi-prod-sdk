<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGENT\Models;

use AlibabaCloud\Tea\Model;

class CreateKmTreeResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'treeId' => 'tree_id',
        'rootNodeId' => 'root_node_id',
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
        if (null !== $this->rootNodeId) {
            $res['root_node_id'] = $this->rootNodeId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateKmTreeResponse
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
        if(isset($map['root_node_id'])){
            $model->rootNodeId = $map['root_node_id'];
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

    // 根节点ID
    /**
     * @var string
     */
    public $rootNodeId;

}
