<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class UpdateMachinegroupSlbmountweightResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'requestIds' => 'request_ids',
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
        if (null !== $this->requestIds) {
            $res['request_ids'] = $this->requestIds;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateMachinegroupSlbmountweightResponse
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
        if(isset($map['request_ids'])){
            if(!empty($map['request_ids'])){
                $model->requestIds = $map['request_ids'];
            }
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

    // 请求 ID，用于追踪后续结果
    /**
     * @var string[]
     */
    public $requestIds;

}
