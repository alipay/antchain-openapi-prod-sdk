<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryDigitalLogisticCreditIssuefinanceResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'errMsg' => 'err_msg',
        'failAmt' => 'fail_amt',
        'failTransferAmt' => 'fail_transfer_amt',
        'outBizNo' => 'out_biz_no',
        'status' => 'status',
        'successAmt' => 'success_amt',
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
        if (null !== $this->errMsg) {
            $res['err_msg'] = $this->errMsg;
        }
        if (null !== $this->failAmt) {
            $res['fail_amt'] = $this->failAmt;
        }
        if (null !== $this->failTransferAmt) {
            $res['fail_transfer_amt'] = $this->failTransferAmt;
        }
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->successAmt) {
            $res['success_amt'] = $this->successAmt;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryDigitalLogisticCreditIssuefinanceResponse
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
        if(isset($map['err_msg'])){
            $model->errMsg = $map['err_msg'];
        }
        if(isset($map['fail_amt'])){
            $model->failAmt = $map['fail_amt'];
        }
        if(isset($map['fail_transfer_amt'])){
            $model->failTransferAmt = $map['fail_transfer_amt'];
        }
        if(isset($map['out_biz_no'])){
            $model->outBizNo = $map['out_biz_no'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['success_amt'])){
            $model->successAmt = $map['success_amt'];
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

    // 错误信息
    /**
     * @var string
     */
    public $errMsg;

    // 融资失败，回转至无车承运平台失败金额
    /**
     * @var string
     */
    public $failAmt;

    // 融资失败，回转至无车承运平台成功金额
    /**
     * @var string
     */
    public $failTransferAmt;

    // 请求时传入的全局业务号
    /**
     * @var string
     */
    public $outBizNo;

    // 融资结果状态 -1:融资未完成， 0:融资完成， 1:融资全部失败，逆流转回平台全部成功，2:融资部分成功，逆流转回平台全部成功，3:逆流转回平台发生失败，需人工介入
    /**
     * @var int
     */
    public $status;

    // 融资成功金额
    /**
     * @var string
     */
    public $successAmt;

}
