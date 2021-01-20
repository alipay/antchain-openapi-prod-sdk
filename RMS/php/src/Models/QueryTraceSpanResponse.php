<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RMS\Models\TraceSpan;

class QueryTraceSpanResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'pageNumber' => 'page_number',
        'pageSize' => 'page_size',
        'totalPage' => 'total_page',
        'totalNumber' => 'total_number',
        'spans' => 'spans',
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
        if (null !== $this->pageNumber) {
            $res['page_number'] = $this->pageNumber;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->totalPage) {
            $res['total_page'] = $this->totalPage;
        }
        if (null !== $this->totalNumber) {
            $res['total_number'] = $this->totalNumber;
        }
        if (null !== $this->spans) {
            $res['spans'] = [];
            if(null !== $this->spans && is_array($this->spans)){
                $n = 0;
                foreach($this->spans as $item){
                    $res['spans'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryTraceSpanResponse
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
        if(isset($map['page_number'])){
            $model->pageNumber = $map['page_number'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['total_page'])){
            $model->totalPage = $map['total_page'];
        }
        if(isset($map['total_number'])){
            $model->totalNumber = $map['total_number'];
        }
        if(isset($map['spans'])){
            if(!empty($map['spans'])){
                $model->spans = [];
                $n = 0;
                foreach($map['spans'] as $item) {
                    $model->spans[$n++] = null !== $item ? TraceSpan::fromMap($item) : $item;
                }
            }
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

    // 分页号
    /**
     * @var int
     */
    public $pageNumber;

    // 分页大小
    /**
     * @var int
     */
    public $pageSize;

    // 总页数
    /**
     * @var int
     */
    public $totalPage;

    // 查询总数
    /**
     * @var int
     */
    public $totalNumber;

    // 搜索出的spans, 查无结果时为空数组
    /**
     * @var TraceSpan[]
     */
    public $spans;

}
