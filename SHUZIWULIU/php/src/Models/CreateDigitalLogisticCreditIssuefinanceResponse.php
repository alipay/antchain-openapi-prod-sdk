<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CreateDigitalLogisticCreditIssuefinanceResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'failApplyAmt' => 'fail_apply_amt',
        'outBizNo' => 'out_biz_no',
        'successApplyAmt' => 'success_apply_amt',
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
        if (null !== $this->failApplyAmt) {
            $res['fail_apply_amt'] = $this->failApplyAmt;
        }
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
        }
        if (null !== $this->successApplyAmt) {
            $res['success_apply_amt'] = $this->successApplyAmt;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateDigitalLogisticCreditIssuefinanceResponse
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
        if(isset($map['fail_apply_amt'])){
            $model->failApplyAmt = $map['fail_apply_amt'];
        }
        if(isset($map['out_biz_no'])){
            $model->outBizNo = $map['out_biz_no'];
        }
        if(isset($map['success_apply_amt'])){
            $model->successApplyAmt = $map['success_apply_amt'];
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

    // 融资申请失败，回转至无车承运平台金额
    /**
     * @var string
     */
    public $failApplyAmt;

    // 请求时传入的全局业务号
    /**
     * @var string
     */
    public $outBizNo;

    // 融资申请成功金额
    /**
     * @var string
     */
    public $successApplyAmt;

}
