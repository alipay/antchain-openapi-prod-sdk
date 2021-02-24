<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RISKPLUS\Models\RtopCompanyOpinionCount;

class QueryRtopCompanyOpinionResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'companyOpinionCount' => 'company_opinion_count',
        'pageNum' => 'page_num',
        'pageSize' => 'page_size',
        'totalCount' => 'total_count',
    ];
    public function validate() {
        Model::validateRequired('companyOpinionCount', $this->companyOpinionCount, true);
        Model::validateRequired('pageNum', $this->pageNum, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('totalCount', $this->totalCount, true);
    }
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
        if (null !== $this->companyOpinionCount) {
            $res['company_opinion_count'] = [];
            if(null !== $this->companyOpinionCount && is_array($this->companyOpinionCount)){
                $n = 0;
                foreach($this->companyOpinionCount as $item){
                    $res['company_opinion_count'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryRtopCompanyOpinionResponse
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
        if(isset($map['company_opinion_count'])){
            if(!empty($map['company_opinion_count'])){
                $model->companyOpinionCount = [];
                $n = 0;
                foreach($map['company_opinion_count'] as $item) {
                    $model->companyOpinionCount[$n++] = null !== $item ? RtopCompanyOpinionCount::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['page_num'])){
            $model->pageNum = $map['page_num'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['total_count'])){
            $model->totalCount = $map['total_count'];
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

    /**
     * @var RtopCompanyOpinionCount[]
     */
    public $companyOpinionCount;

    // 页码
    /**
     * @var int
     */
    public $pageNum;

    // 一页的数量
    /**
     * @var int
     */
    public $pageSize;

    // 总的记录数
    /**
     * @var int
     */
    public $totalCount;

}
