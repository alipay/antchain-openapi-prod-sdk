<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AGORAX\Models;

use AlibabaCloud\Tea\Model;

class QueryAgreementAppResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'privacyAgreementNo' => 'privacy_agreement_no',
        'userAgreementNo' => 'user_agreement_no',
        'privacyAgreementSignTime' => 'privacy_agreement_sign_time',
        'userAgreementSignTime' => 'user_agreement_sign_time',
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
        if (null !== $this->privacyAgreementNo) {
            $res['privacy_agreement_no'] = $this->privacyAgreementNo;
        }
        if (null !== $this->userAgreementNo) {
            $res['user_agreement_no'] = $this->userAgreementNo;
        }
        if (null !== $this->privacyAgreementSignTime) {
            $res['privacy_agreement_sign_time'] = $this->privacyAgreementSignTime;
        }
        if (null !== $this->userAgreementSignTime) {
            $res['user_agreement_sign_time'] = $this->userAgreementSignTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAgreementAppResponse
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
        if(isset($map['privacy_agreement_no'])){
            $model->privacyAgreementNo = $map['privacy_agreement_no'];
        }
        if(isset($map['user_agreement_no'])){
            $model->userAgreementNo = $map['user_agreement_no'];
        }
        if(isset($map['privacy_agreement_sign_time'])){
            $model->privacyAgreementSignTime = $map['privacy_agreement_sign_time'];
        }
        if(isset($map['user_agreement_sign_time'])){
            $model->userAgreementSignTime = $map['user_agreement_sign_time'];
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

    // 隐私协议版本号
    /**
     * @var string
     */
    public $privacyAgreementNo;

    // 用户协议版本号
    /**
     * @var string
     */
    public $userAgreementNo;

    // 隐私协议签署时间
    /**
     * @var string
     */
    public $privacyAgreementSignTime;

    // 用户协议签署时间
    /**
     * @var string
     */
    public $userAgreementSignTime;

}
