<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryBaasPlusEnterpriseidFaceauthinternalResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'bizNo' => 'biz_no',
        'failedCode' => 'failed_code',
        'failedMessage' => 'failed_message',
        'passed' => 'passed',
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
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
        }
        if (null !== $this->failedCode) {
            $res['failed_code'] = $this->failedCode;
        }
        if (null !== $this->failedMessage) {
            $res['failed_message'] = $this->failedMessage;
        }
        if (null !== $this->passed) {
            $res['passed'] = $this->passed;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBaasPlusEnterpriseidFaceauthinternalResponse
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
        if(isset($map['biz_no'])){
            $model->bizNo = $map['biz_no'];
        }
        if(isset($map['failed_code'])){
            $model->failedCode = $map['failed_code'];
        }
        if(isset($map['failed_message'])){
            $model->failedMessage = $map['failed_message'];
        }
        if(isset($map['passed'])){
            $model->passed = $map['passed'];
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

    // 
    // 认证的唯一性标示
    /**
     * @var string
     */
    public $bizNo;

    // 认证失败错误码
    // 
    /**
     * @var string
     */
    public $failedCode;

    // 认证失败原因信息
    // 
    /**
     * @var string
     */
    public $failedMessage;

    // 是否认证通过
    /**
     * @var bool
     */
    public $passed;

}
