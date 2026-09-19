<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class UpdateDubbridgePetmallorderResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'bizOrderNo' => 'biz_order_no',
        'updateResult' => 'update_result',
        'failReason' => 'fail_reason',
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
        if (null !== $this->bizOrderNo) {
            $res['biz_order_no'] = $this->bizOrderNo;
        }
        if (null !== $this->updateResult) {
            $res['update_result'] = $this->updateResult;
        }
        if (null !== $this->failReason) {
            $res['fail_reason'] = $this->failReason;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateDubbridgePetmallorderResponse
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
        if(isset($map['biz_order_no'])){
            $model->bizOrderNo = $map['biz_order_no'];
        }
        if(isset($map['update_result'])){
            $model->updateResult = $map['update_result'];
        }
        if(isset($map['fail_reason'])){
            $model->failReason = $map['fail_reason'];
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

    // 商城业务订单号
    /**
     * @var string
     */
    public $bizOrderNo;

    // Y-成功
    // N-失败
    /**
     * @var string
     */
    public $updateResult;

    // 失败原因
    /**
     * @var string
     */
    public $failReason;

}
