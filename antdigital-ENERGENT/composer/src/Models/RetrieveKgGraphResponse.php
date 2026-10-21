<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGENT\Models;

use AlibabaCloud\Tea\Model;

class RetrieveKgGraphResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'truncated' => 'truncated',
        'nodes' => 'nodes',
        'edges' => 'edges',
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
        if (null !== $this->truncated) {
            $res['truncated'] = $this->truncated;
        }
        if (null !== $this->nodes) {
            $res['nodes'] = $this->nodes;
        }
        if (null !== $this->edges) {
            $res['edges'] = $this->edges;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return RetrieveKgGraphResponse
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
        if(isset($map['truncated'])){
            $model->truncated = $map['truncated'];
        }
        if(isset($map['nodes'])){
            $model->nodes = $map['nodes'];
        }
        if(isset($map['edges'])){
            $model->edges = $map['edges'];
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

    // 结果是否被截断
    /**
     * @var bool
     */
    public $truncated;

    // 节点JSON数组(KbGraphNode字段定义见文档)
    /**
     * @var string
     */
    public $nodes;

    // 关系JSON数组(KbGraphEdge字段定义见文档)
    /**
     * @var string
     */
    public $edges;

}
