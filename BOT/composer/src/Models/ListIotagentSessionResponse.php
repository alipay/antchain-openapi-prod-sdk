<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\BOT\Models\SessionInfo;

class ListIotagentSessionResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'sessionList' => 'session_list',
        'total' => 'total',
        'pages' => 'pages',
        'pageIndex' => 'page_index',
        'pageSize' => 'page_size',
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
        if (null !== $this->sessionList) {
            $res['session_list'] = [];
            if(null !== $this->sessionList && is_array($this->sessionList)){
                $n = 0;
                foreach($this->sessionList as $item){
                    $res['session_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->pages) {
            $res['pages'] = $this->pages;
        }
        if (null !== $this->pageIndex) {
            $res['page_index'] = $this->pageIndex;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ListIotagentSessionResponse
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
        if(isset($map['session_list'])){
            if(!empty($map['session_list'])){
                $model->sessionList = [];
                $n = 0;
                foreach($map['session_list'] as $item) {
                    $model->sessionList[$n++] = null !== $item ? SessionInfo::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['total'])){
            $model->total = $map['total'];
        }
        if(isset($map['pages'])){
            $model->pages = $map['pages'];
        }
        if(isset($map['page_index'])){
            $model->pageIndex = $map['page_index'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
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

    // session 信息
    /**
     * @var SessionInfo[]
     */
    public $sessionList;

    // 总数
    /**
     * @var int
     */
    public $total;

    // 总页数
    /**
     * @var int
     */
    public $pages;

    // 当前页面
    /**
     * @var int
     */
    public $pageIndex;

    // 页面大小
    /**
     * @var int
     */
    public $pageSize;

}
