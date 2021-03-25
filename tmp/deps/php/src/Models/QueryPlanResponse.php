<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryPlanResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'list' => 'list',
        'pageNo' => 'page_no',
        'pageSize' => 'page_size',
        'totalSize' => 'total_size',
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
        if (null !== $this->list) {
            $res['list'] = $this->list;
        }
        if (null !== $this->pageNo) {
            $res['page_no'] = $this->pageNo;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->totalSize) {
            $res['total_size'] = $this->totalSize;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryPlanResponse
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
        if(isset($map['list'])){
            if(!empty($map['list'])){
                $model->list = $map['list'];
            }
        }
        if(isset($map['page_no'])){
            $model->pageNo = $map['page_no'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['total_size'])){
            $model->totalSize = $map['total_size'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 列表
    /**
     * @var string[]
     */
    public $list;

    // page_no
    /**
     * @var int
     */
    public $pageNo;

    // page_size
    /**
     * @var int
     */
    public $pageSize;

    // total_size
    /**
     * @var int
     */
    public $totalSize;

}
