<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\MSCENE\Models;

use AlibabaCloud\Tea\Model;

use AntChain\MSCENE\Models\MpaasUserGamecenterPaymentQuerystatusResponse;

class QueryOrderResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'success' => 'success',
        'mpaasUserQueryStatusResponse' => 'mpaas_user_query_status_response',
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
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->mpaasUserQueryStatusResponse) {
            $res['mpaas_user_query_status_response'] = null !== $this->mpaasUserQueryStatusResponse ? $this->mpaasUserQueryStatusResponse->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryOrderResponse
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
        if(isset($map['success'])){
            $model->success = $map['success'];
        }
        if(isset($map['mpaas_user_query_status_response'])){
            $model->mpaasUserQueryStatusResponse = MpaasUserGamecenterPaymentQuerystatusResponse::fromMap($map['mpaas_user_query_status_response']);
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

    // 请求是否成功
    /**
     * @var bool
     */
    public $success;

    // 查询订单响应参数
    /**
     * @var MpaasUserGamecenterPaymentQuerystatusResponse
     */
    public $mpaasUserQueryStatusResponse;

}
