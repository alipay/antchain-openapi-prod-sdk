<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

use AntChain\STLR\Models\RoleList;

class QueryEsgListrolesResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'current' => 'current',
        'pageSize' => 'page_size',
        'total' => 'total',
        'list' => 'list',
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
        if (null !== $this->current) {
            $res['current'] = $this->current;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->list) {
            $res['list'] = null !== $this->list ? $this->list->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryEsgListrolesResponse
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
        if(isset($map['current'])){
            $model->current = $map['current'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['total'])){
            $model->total = $map['total'];
        }
        if(isset($map['list'])){
            $model->list = RoleList::fromMap($map['list']);
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

    // 页码
    /**
     * @var int
     */
    public $current;

    // 页数
    /**
     * @var int
     */
    public $pageSize;

    // 符合条件的角色总数
    /**
     * @var int
     */
    public $total;

    // 当前页角色列表
    /**
     * @var RoleList
     */
    public $list;

}
