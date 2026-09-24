<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class QueryAasDataBankcardlivenessResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'historyRequestId' => 'history_request_id',
        'livenessInfo' => 'liveness_info',
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
        if (null !== $this->historyRequestId) {
            $res['history_request_id'] = $this->historyRequestId;
        }
        if (null !== $this->livenessInfo) {
            $res['liveness_info'] = $this->livenessInfo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAasDataBankcardlivenessResponse
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
        if(isset($map['history_request_id'])){
            $model->historyRequestId = $map['history_request_id'];
        }
        if(isset($map['liveness_info'])){
            $model->livenessInfo = $map['liveness_info'];
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

    // 响应ID（安科req_msg_id），回传接口必传
    /**
     * @var string
     */
    public $historyRequestId;

    // 银行活跃度详情（JSONArray，排最前最活跃）
    /**
     * @var string
     */
    public $livenessInfo;

}
