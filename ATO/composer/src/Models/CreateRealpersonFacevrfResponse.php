<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class CreateRealpersonFacevrfResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'realPersonVerificationCode' => 'real_person_verification_code',
        'webUrl' => 'web_url',
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
        if (null !== $this->realPersonVerificationCode) {
            $res['real_person_verification_code'] = $this->realPersonVerificationCode;
        }
        if (null !== $this->webUrl) {
            $res['web_url'] = $this->webUrl;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateRealpersonFacevrfResponse
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
        if(isset($map['real_person_verification_code'])){
            $model->realPersonVerificationCode = $map['real_person_verification_code'];
        }
        if(isset($map['web_url'])){
            $model->webUrl = $map['web_url'];
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

    // 请求唯一ID标识，为空则是异常
    /**
     * @var string
     */
    public $realPersonVerificationCode;

    // 【solution_type=H5 | ZFB返回】
    // 人脸核身url地址
    /**
     * @var string
     */
    public $webUrl;

}
