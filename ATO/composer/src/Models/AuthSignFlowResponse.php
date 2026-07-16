<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class AuthSignFlowResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'signFieldIds' => 'sign_field_ids',
        'orgSignUrl' => 'org_sign_url',
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
        if (null !== $this->signFieldIds) {
            $res['sign_field_ids'] = $this->signFieldIds;
        }
        if (null !== $this->orgSignUrl) {
            $res['org_sign_url'] = $this->orgSignUrl;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AuthSignFlowResponse
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
        if(isset($map['sign_field_ids'])){
            $model->signFieldIds = $map['sign_field_ids'];
        }
        if(isset($map['org_sign_url'])){
            $model->orgSignUrl = $map['org_sign_url'];
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

    // 签署最后落签的签署区域id列表
    /**
     * @var string
     */
    public $signFieldIds;

    // 手动签署链接，区块链合同签署方式，企业未进行静默授权，会返回一个手动签署链接
    // 如果已授权或者不是区块链签署方式，该字段为空
    /**
     * @var string
     */
    public $orgSignUrl;

}
