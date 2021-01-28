<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\TWC\Models\WitnessSignResult;

class AuthWitnessFlowResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'code' => 'code',
        'message' => 'message',
        'qrcodeContent' => 'qrcode_content',
        'signlogId' => 'signlog_id',
        'signResult' => 'sign_result',
        'signResults' => 'sign_results',
        'signWay' => 'sign_way',
        'taskId' => 'task_id',
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
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->qrcodeContent) {
            $res['qrcode_content'] = $this->qrcodeContent;
        }
        if (null !== $this->signlogId) {
            $res['signlog_id'] = $this->signlogId;
        }
        if (null !== $this->signResult) {
            $res['sign_result'] = $this->signResult;
        }
        if (null !== $this->signResults) {
            $res['sign_results'] = [];
            if(null !== $this->signResults && is_array($this->signResults)){
                $n = 0;
                foreach($this->signResults as $item){
                    $res['sign_results'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->signWay) {
            $res['sign_way'] = $this->signWay;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AuthWitnessFlowResponse
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
        if(isset($map['message'])){
            $model->message = $map['message'];
        }
        if(isset($map['qrcode_content'])){
            $model->qrcodeContent = $map['qrcode_content'];
        }
        if(isset($map['signlog_id'])){
            $model->signlogId = $map['signlog_id'];
        }
        if(isset($map['sign_result'])){
            $model->signResult = $map['sign_result'];
        }
        if(isset($map['sign_results'])){
            if(!empty($map['sign_results'])){
                $model->signResults = [];
                $n = 0;
                foreach($map['sign_results'] as $item) {
                    $model->signResults[$n++] = null !== $item ? WitnessSignResult::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['sign_way'])){
            $model->signWay = $map['sign_way'];
        }
        if(isset($map['task_id'])){
            $model->taskId = $map['task_id'];
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

    // 错误信息
    /**
     * @var string
     */
    public $message;

    // 二维码内容
    /**
     * @var string
     */
    public $qrcodeContent;

    // 签署日志id，外部用户签署返回
    /**
     * @var string
     */
    public $signlogId;

    // 签名结果，外部用户签署返回
    /**
     * @var string
     */
    public $signResult;

    // 签署结果，批量签署返回
    /**
     * @var WitnessSignResult[]
     */
    public $signResults;

    // 签署方式，1-单个签署，2-批量签署
    /**
     * @var int
     */
    public $signWay;

    // 手机盾用户签署返回
    /**
     * @var string
     */
    public $taskId;

}
