<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGENT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\ENERGENT\Models\TreeDetailResponse;

class QueryKmKnowledgelistResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'datalist' => 'datalist',
        'totalrecords' => 'totalrecords',
        'trees' => 'trees',
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
        if (null !== $this->datalist) {
            $res['datalist'] = null !== $this->datalist ? $this->datalist->toMap() : null;
        }
        if (null !== $this->totalrecords) {
            $res['totalrecords'] = $this->totalrecords;
        }
        if (null !== $this->trees) {
            $res['trees'] = $this->trees;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryKmKnowledgelistResponse
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
        if(isset($map['datalist'])){
            $model->datalist = TreeDetailResponse::fromMap($map['datalist']);
        }
        if(isset($map['totalrecords'])){
            $model->totalrecords = $map['totalrecords'];
        }
        if(isset($map['trees'])){
            $model->trees = $map['trees'];
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

    // 知识库datalist
    /**
     * @var TreeDetailResponse
     */
    public $datalist;

    // 总数据量
    /**
     * @var int
     */
    public $totalrecords;

    // 知识库树列表JSON数组(元素字段见语雀文档)
    /**
     * @var string
     */
    public $trees;

}
