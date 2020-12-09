<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryDigitalLogisticPfPledgeResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'billId' => 'bill_id',
        'desc' => 'desc',
        'financingSubjectDid' => 'financing_subject_did',
        'status' => 'status',
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
        if (null !== $this->billId) {
            $res['bill_id'] = $this->billId;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->financingSubjectDid) {
            $res['financing_subject_did'] = $this->financingSubjectDid;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryDigitalLogisticPfPledgeResponse
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
        if(isset($map['bill_id'])){
            $model->billId = $map['bill_id'];
        }
        if(isset($map['desc'])){
            $model->desc = $map['desc'];
        }
        if(isset($map['financing_subject_did'])){
            $model->financingSubjectDid = $map['financing_subject_did'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
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

    // 账单id
    /**
     * @var string
     */
    public $billId;

    // 状态描述
    /**
     * @var string
     */
    public $desc;

    // 融资主体did
    /**
     * @var string
     */
    public $financingSubjectDid;

    // 推送状态
    /**
     * @var string
     */
    public $status;

}
