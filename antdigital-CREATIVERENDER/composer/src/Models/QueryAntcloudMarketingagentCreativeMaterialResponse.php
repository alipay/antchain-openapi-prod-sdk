<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;

use AntChain\CREATIVERENDER\Models\CreativeMaterial;

class QueryAntcloudMarketingagentCreativeMaterialResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'totalCount' => 'total_count',
        'pageNum' => 'page_num',
        'pageSize' => 'page_size',
        'pageCount' => 'page_count',
        'materials' => 'materials',
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
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->pageCount) {
            $res['page_count'] = $this->pageCount;
        }
        if (null !== $this->materials) {
            $res['materials'] = [];
            if(null !== $this->materials && is_array($this->materials)){
                $n = 0;
                foreach($this->materials as $item){
                    $res['materials'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAntcloudMarketingagentCreativeMaterialResponse
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
        if(isset($map['total_count'])){
            $model->totalCount = $map['total_count'];
        }
        if(isset($map['page_num'])){
            $model->pageNum = $map['page_num'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['page_count'])){
            $model->pageCount = $map['page_count'];
        }
        if(isset($map['materials'])){
            if(!empty($map['materials'])){
                $model->materials = [];
                $n = 0;
                foreach($map['materials'] as $item) {
                    $model->materials[$n++] = null !== $item ? CreativeMaterial::fromMap($item) : $item;
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

    // 总记录数
    /**
     * @var int
     */
    public $totalCount;

    // 当前页码
    /**
     * @var int
     */
    public $pageNum;

    // 每页条数
    /**
     * @var int
     */
    public $pageSize;

    // 总页数
    /**
     * @var int
     */
    public $pageCount;

    // 当前页素材列表
    /**
     * @var CreativeMaterial[]
     */
    public $materials;

}
