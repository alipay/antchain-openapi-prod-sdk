<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RISKPLUS\Models\CustCheckInfo;

class QueryDubbridgeJumpresultResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'jumpNo' => 'jump_no',
        'pageUrl' => 'page_url',
        'custCheckInfo' => 'cust_check_info',
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
        if (null !== $this->jumpNo) {
            $res['jump_no'] = $this->jumpNo;
        }
        if (null !== $this->pageUrl) {
            $res['page_url'] = $this->pageUrl;
        }
        if (null !== $this->custCheckInfo) {
            $res['cust_check_info'] = null !== $this->custCheckInfo ? $this->custCheckInfo->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryDubbridgeJumpresultResponse
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
        if(isset($map['jump_no'])){
            $model->jumpNo = $map['jump_no'];
        }
        if(isset($map['page_url'])){
            $model->pageUrl = $map['page_url'];
        }
        if(isset($map['cust_check_info'])){
            $model->custCheckInfo = CustCheckInfo::fromMap($map['cust_check_info']);
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

    // 跳端申请唯一流水号
    /**
     * @var string
     */
    public $jumpNo;

    // 借款确认页URL
    /**
     * @var string
     */
    public $pageUrl;

    // 借款确认页客户确认信息
    /**
     * @var CustCheckInfo
     */
    public $custCheckInfo;

}
