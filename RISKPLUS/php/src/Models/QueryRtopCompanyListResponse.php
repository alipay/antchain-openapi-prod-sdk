<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryRtopCompanyListResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'companyIds' => 'company_ids',
        'responseCode' => 'response_code',
        'success' => 'success',
        'totalNum' => 'total_num',
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
        if (null !== $this->companyIds) {
            $res['company_ids'] = $this->companyIds;
        }
        if (null !== $this->responseCode) {
            $res['response_code'] = $this->responseCode;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->totalNum) {
            $res['total_num'] = $this->totalNum;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryRtopCompanyListResponse
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
        if(isset($map['company_ids'])){
            if(!empty($map['company_ids'])){
                $model->companyIds = $map['company_ids'];
            }
        }
        if(isset($map['response_code'])){
            $model->responseCode = $map['response_code'];
        }
        if(isset($map['success'])){
            $model->success = $map['success'];
        }
        if(isset($map['total_num'])){
            $model->totalNum = $map['total_num'];
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

    // 企业id列表
    /**
     * @var string[]
     */
    public $companyIds;

    // 返回码
    /**
     * @var string
     */
    public $responseCode;

    // 是否调用成功
    /**
     * @var bool
     */
    public $success;

    // 总条数
    /**
     * @var int
     */
    public $totalNum;

}
