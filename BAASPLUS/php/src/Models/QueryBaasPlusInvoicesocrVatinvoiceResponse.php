<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryBaasPlusInvoicesocrVatinvoiceResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'algoMsg' => 'algo_msg',
        'algoRet' => 'algo_ret',
        'message' => 'message',
        'result' => 'result',
        'ret' => 'ret',
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
        if (null !== $this->algoMsg) {
            $res['algo_msg'] = $this->algoMsg;
        }
        if (null !== $this->algoRet) {
            $res['algo_ret'] = $this->algoRet;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }
        if (null !== $this->ret) {
            $res['ret'] = $this->ret;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBaasPlusInvoicesocrVatinvoiceResponse
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
        if(isset($map['algo_msg'])){
            $model->algoMsg = $map['algo_msg'];
        }
        if(isset($map['algo_ret'])){
            $model->algoRet = $map['algo_ret'];
        }
        if(isset($map['message'])){
            $model->message = $map['message'];
        }
        if(isset($map['result'])){
            $model->result = $map['result'];
        }
        if(isset($map['ret'])){
            $model->ret = $map['ret'];
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

    // 算法错误信息
    /**
     * @var string
     */
    public $algoMsg;

    // 算法异常错误码
    // 
    /**
     * @var string
     */
    public $algoRet;

    // 框架错误信息
    // 
    /**
     * @var string
     */
    public $message;

    // 算法结果,JSON String
    /**
     * @var string
     */
    public $result;

    // 框架inference服务错误码，0为正常
    /**
     * @var string
     */
    public $ret;

}
