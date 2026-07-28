<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\MSCENE\Models;

use AlibabaCloud\Tea\Model;

use AntChain\MSCENE\Models\MpaasUserAuthCheckResponse;

class QueryUserAuthcheckResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'success' => 'success',
        'mpaasUserAuthCheckResponse' => 'mpaas_user_auth_check_response',
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
        if (null !== $this->mpaasUserAuthCheckResponse) {
            $res['mpaas_user_auth_check_response'] = null !== $this->mpaasUserAuthCheckResponse ? $this->mpaasUserAuthCheckResponse->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryUserAuthcheckResponse
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
        if(isset($map['mpaas_user_auth_check_response'])){
            $model->mpaasUserAuthCheckResponse = MpaasUserAuthCheckResponse::fromMap($map['mpaas_user_auth_check_response']);
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

    // 用户校验响应结果
    /**
     * @var MpaasUserAuthCheckResponse
     */
    public $mpaasUserAuthCheckResponse;

}
