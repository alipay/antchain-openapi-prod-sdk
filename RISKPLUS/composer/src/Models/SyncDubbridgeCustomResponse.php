<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class SyncDubbridgeCustomResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'syncResult' => 'sync_result',
        'failReason' => 'fail_reason',
        'customerNo' => 'customer_no',
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
        if (null !== $this->syncResult) {
            $res['sync_result'] = $this->syncResult;
        }
        if (null !== $this->failReason) {
            $res['fail_reason'] = $this->failReason;
        }
        if (null !== $this->customerNo) {
            $res['customer_no'] = $this->customerNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SyncDubbridgeCustomResponse
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
        if(isset($map['sync_result'])){
            $model->syncResult = $map['sync_result'];
        }
        if(isset($map['fail_reason'])){
            $model->failReason = $map['fail_reason'];
        }
        if(isset($map['customer_no'])){
            $model->customerNo = $map['customer_no'];
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

    // 信息同步结果， Y-成功；N-失败
    /**
     * @var string
     */
    public $syncResult;

    // 同步失败原因
    /**
     * @var string
     */
    public $failReason;

    // 客户号
    /**
     * @var string
     */
    public $customerNo;

}
