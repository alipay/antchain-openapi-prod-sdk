<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ApplyDubbridgePetcashierResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'pageRedirectionData' => 'page_redirection_data',
        'originUrl' => 'origin_url',
        'tradeNo' => 'trade_no',
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
        if (null !== $this->pageRedirectionData) {
            $res['page_redirection_data'] = $this->pageRedirectionData;
        }
        if (null !== $this->originUrl) {
            $res['origin_url'] = $this->originUrl;
        }
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ApplyDubbridgePetcashierResponse
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
        if(isset($map['page_redirection_data'])){
            $model->pageRedirectionData = $map['page_redirection_data'];
        }
        if(isset($map['origin_url'])){
            $model->originUrl = $map['origin_url'];
        }
        if(isset($map['trade_no'])){
            $model->tradeNo = $map['trade_no'];
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

    // 跳转url（短链）/小程序场景为支付宝侧单号
    /**
     * @var string
     */
    public $pageRedirectionData;

    // 原始跳转url
    /**
     * @var string
     */
    public $originUrl;

    // 交易单号
    /**
     * @var string
     */
    public $tradeNo;

}
