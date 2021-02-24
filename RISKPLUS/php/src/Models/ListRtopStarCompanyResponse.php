<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RISKPLUS\Models\RtopStarCompanyInfo;

class ListRtopStarCompanyResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'companyInfos' => 'company_infos',
        'pageNo' => 'page_no',
        'pageSize' => 'page_size',
        'totalCount' => 'total_count',
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
        if (null !== $this->companyInfos) {
            $res['company_infos'] = [];
            if(null !== $this->companyInfos && is_array($this->companyInfos)){
                $n = 0;
                foreach($this->companyInfos as $item){
                    $res['company_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->pageNo) {
            $res['page_no'] = $this->pageNo;
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
     * @return ListRtopStarCompanyResponse
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
        if(isset($map['company_infos'])){
            if(!empty($map['company_infos'])){
                $model->companyInfos = [];
                $n = 0;
                foreach($map['company_infos'] as $item) {
                    $model->companyInfos[$n++] = null !== $item ? RtopStarCompanyInfo::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['page_no'])){
            $model->pageNo = $map['page_no'];
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

    // 企业列表
    /**
     * @var RtopStarCompanyInfo[]
     */
    public $companyInfos;

    // 页码
    /**
     * @var int
     */
    public $pageNo;

    // 一页条数
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
