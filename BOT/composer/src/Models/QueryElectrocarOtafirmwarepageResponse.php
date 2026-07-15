<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\BOT\Models\IotxOTAFirmwareResponse;

class QueryElectrocarOtafirmwarepageResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'pageIndex' => 'page_index',
        'pageSize' => 'page_size',
        'totalSize' => 'total_size',
        'totalPages' => 'total_pages',
        'pageData' => 'page_data',
        'success' => 'success',
        'code' => 'code',
        'message' => 'message',
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
        if (null !== $this->pageIndex) {
            $res['page_index'] = $this->pageIndex;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->totalSize) {
            $res['total_size'] = $this->totalSize;
        }
        if (null !== $this->totalPages) {
            $res['total_pages'] = $this->totalPages;
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
        if (null !== $this->success) {
            $res['success'] = $this->success;
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
     * @return QueryElectrocarOtafirmwarepageResponse
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
        if(isset($map['page_index'])){
            $model->pageIndex = $map['page_index'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['total_size'])){
            $model->totalSize = $map['total_size'];
        }
        if(isset($map['total_pages'])){
            $model->totalPages = $map['total_pages'];
        }
        if(isset($map['page_data'])){
            if(!empty($map['page_data'])){
                $model->pageData = [];
                $n = 0;
                foreach($map['page_data'] as $item) {
                    $model->pageData[$n++] = null !== $item ? IotxOTAFirmwareResponse::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['success'])){
            $model->success = $map['success'];
        }
        if(isset($map['code'])){
            $model->code = $map['code'];
        }
        if(isset($map['message'])){
            $model->message = $map['message'];
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

    // 当前页码
    /**
     * @var int
     */
    public $pageIndex;

    // 单页数量
    /**
     * @var int
     */
    public $pageSize;

    // 记录总数
    /**
     * @var int
     */
    public $totalSize;

    // 页总数
    /**
     * @var int
     */
    public $totalPages;

    // 分页数据
    /**
     * @var IotxOTAFirmwareResponse[]
     */
    public $pageData;

    // 是否操作成功
    /**
     * @var bool
     */
    public $success;

    // 响应编码
    /**
     * @var bool
     */
    public $code;

    // 响应内容
    /**
     * @var string
     */
    public $message;

}
