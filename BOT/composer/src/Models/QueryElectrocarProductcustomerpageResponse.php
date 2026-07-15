<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\BOT\Models\IotxProductResponse;

class QueryElectrocarProductcustomerpageResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'success' => 'success',
        'pageIndex' => 'page_index',
        'pageSize' => 'page_size',
        'totalPages' => 'total_pages',
        'totalSize' => 'total_size',
        'pageData' => 'page_data',
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
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->pageIndex) {
            $res['page_index'] = $this->pageIndex;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->totalPages) {
            $res['total_pages'] = $this->totalPages;
        }
        if (null !== $this->totalSize) {
            $res['total_size'] = $this->totalSize;
        }
        if (null !== $this->pageData) {
            $res['page_data'] = [];
            if(null !== $this->pageData && is_array($this->pageData)){
                $n = 0;
                foreach($this->pageData as $item){
                    $res['page_data'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryElectrocarProductcustomerpageResponse
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
        if(isset($map['success'])){
            $model->success = $map['success'];
        }
        if(isset($map['page_index'])){
            $model->pageIndex = $map['page_index'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['total_pages'])){
            $model->totalPages = $map['total_pages'];
        }
        if(isset($map['total_size'])){
            $model->totalSize = $map['total_size'];
        }
        if(isset($map['page_data'])){
            if(!empty($map['page_data'])){
                $model->pageData = [];
                $n = 0;
                foreach($map['page_data'] as $item) {
                    $model->pageData[$n++] = null !== $item ? IotxProductResponse::fromMap($item) : $item;
                }
            }
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

    // 是否请求成功
    /**
     * @var bool
     */
    public $success;

    // 分页页码
    /**
     * @var int
     */
    public $pageIndex;

    // 每页展示大小
    /**
     * @var int
     */
    public $pageSize;

    // 总页数
    /**
     * @var int
     */
    public $totalPages;

    // 总数量
    /**
     * @var int
     */
    public $totalSize;

    // 分页数据
    /**
     * @var IotxProductResponse[]
     */
    public $pageData;

}
