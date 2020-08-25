<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateTwcNotaryContractCommontriggerResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'code' => 'code',
        'errMessage' => 'err_message',
        'flowId' => 'flow_id',
        'platformTuid' => 'platform_tuid',
        'userTuid' => 'user_tuid',
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
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->errMessage) {
            $res['err_message'] = $this->errMessage;
        }
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->platformTuid) {
            $res['platform_tuid'] = $this->platformTuid;
        }
        if (null !== $this->userTuid) {
            $res['user_tuid'] = $this->userTuid;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateTwcNotaryContractCommontriggerResponse
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
        if(isset($map['code'])){
            $model->code = $map['code'];
        }
        if(isset($map['err_message'])){
            $model->errMessage = $map['err_message'];
        }
        if(isset($map['flow_id'])){
            $model->flowId = $map['flow_id'];
        }
        if(isset($map['platform_tuid'])){
            $model->platformTuid = $map['platform_tuid'];
        }
        if(isset($map['user_tuid'])){
            $model->userTuid = $map['user_tuid'];
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

    // 错误码
    /**
     * @var int
     */
    public $code;

    // 错误信息描述
    /**
     * @var string
     */
    public $errMessage;

    // 合同id
    /**
     * @var string
     */
    public $flowId;

    // 商户在智能合同平台id
    /**
     * @var string
     */
    public $platformTuid;

    // 用户在智能合同平台的id
    /**
     * @var string
     */
    public $userTuid;

}
