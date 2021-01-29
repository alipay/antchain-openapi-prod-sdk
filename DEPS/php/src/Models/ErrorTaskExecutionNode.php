<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class ErrorTaskExecutionNode extends Model {
    protected $_name = [
        'nodeId' => 'node_id',
        'nodeName' => 'node_name',
        'code' => 'code',
        'message' => 'message',
    ];
    public function validate() {
        Model::validateRequired('nodeId', $this->nodeId, true);
        Model::validateRequired('nodeName', $this->nodeName, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('message', $this->message, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->nodeId) {
            $res['node_id'] = $this->nodeId;
        }
        if (null !== $this->nodeName) {
            $res['node_name'] = $this->nodeName;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ErrorTaskExecutionNode
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['node_id'])){
            $model->nodeId = $map['node_id'];
        }
        if(isset($map['node_name'])){
            $model->nodeName = $map['node_name'];
        }
        if(isset($map['code'])){
            $model->code = $map['code'];
        }
        if(isset($map['message'])){
            $model->message = $map['message'];
        }
        return $model;
    }
    // 节点 ID
    /**
     * @example 123
     * @var string
     */
    public $nodeId;

    // 节点名
    /**
     * @example test
     * @var string
     */
    public $nodeName;

    // 错误码
    /**
     * @example 001
     * @var string
     */
    public $code;

    // 错误信息
    /**
     * @example rpc error
     * @var string
     */
    public $message;

}
