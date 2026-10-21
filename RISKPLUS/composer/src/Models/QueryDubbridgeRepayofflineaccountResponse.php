<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RISKPLUS\Models\AccountDetail;

class QueryDubbridgeRepayofflineaccountResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'totalNum' => 'total_num',
        'totalPage' => 'total_page',
        'accountDetailList' => 'account_detail_list',
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
        if (null !== $this->totalNum) {
            $res['total_num'] = $this->totalNum;
        }
        if (null !== $this->totalPage) {
            $res['total_page'] = $this->totalPage;
        }
        if (null !== $this->accountDetailList) {
            $res['account_detail_list'] = [];
            if(null !== $this->accountDetailList && is_array($this->accountDetailList)){
                $n = 0;
                foreach($this->accountDetailList as $item){
                    $res['account_detail_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryDubbridgeRepayofflineaccountResponse
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
        if(isset($map['total_num'])){
            $model->totalNum = $map['total_num'];
        }
        if(isset($map['total_page'])){
            $model->totalPage = $map['total_page'];
        }
        if(isset($map['account_detail_list'])){
            if(!empty($map['account_detail_list'])){
                $model->accountDetailList = [];
                $n = 0;
                foreach($map['account_detail_list'] as $item) {
                    $model->accountDetailList[$n++] = null !== $item ? AccountDetail::fromMap($item) : $item;
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

    // 总条数
    /**
     * @var string
     */
    public $totalNum;

    // 总页数
    /**
     * @var string
     */
    public $totalPage;

    // 账户流水信息
    /**
     * @var AccountDetail[]
     */
    public $accountDetailList;

}
