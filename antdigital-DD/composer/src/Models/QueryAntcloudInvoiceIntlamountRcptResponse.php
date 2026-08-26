<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\IntlRcptDetailItem;

class QueryAntcloudInvoiceIntlamountRcptResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'detailList' => 'detail_list',
        'totalCount' => 'total_count',
        'currentPage' => 'current_page',
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
        if (null !== $this->detailList) {
            $res['detail_list'] = [];
            if(null !== $this->detailList && is_array($this->detailList)){
                $n = 0;
                foreach($this->detailList as $item){
                    $res['detail_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAntcloudInvoiceIntlamountRcptResponse
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
        if(isset($map['detail_list'])){
            if(!empty($map['detail_list'])){
                $model->detailList = [];
                $n = 0;
                foreach($map['detail_list'] as $item) {
                    $model->detailList[$n++] = null !== $item ? IntlRcptDetailItem::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['total_count'])){
            $model->totalCount = $map['total_count'];
        }
        if(isset($map['current_page'])){
            $model->currentPage = $map['current_page'];
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

    // 可开票单列列表
    /**
     * @var IntlRcptDetailItem[]
     */
    public $detailList;

    // 总条数
    /**
     * @var int
     */
    public $totalCount;

    // 当前页
    /**
     * @var int
     */
    public $currentPage;

    // 每页条数
    /**
     * @var int
     */
    public $pageSize;

}
