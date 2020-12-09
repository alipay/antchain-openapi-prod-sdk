<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

use AntChain\SHUZIWULIU\Models\TrackCheckResult;

class QueryDigitalLogisticWaybillStatusResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'status' => 'status',
        'trackCheckResult' => 'track_check_result',
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->trackCheckResult) {
            $res['track_check_result'] = null !== $this->trackCheckResult ? $this->trackCheckResult->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryDigitalLogisticWaybillStatusResponse
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
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['track_check_result'])){
            $model->trackCheckResult = TrackCheckResult::fromMap($map['track_check_result']);
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

    // 运单状态
    // 
    /**
     * @var string
     */
    public $status;

    // 轨迹核验结果
    /**
     * @var TrackCheckResult
     */
    public $trackCheckResult;

}
