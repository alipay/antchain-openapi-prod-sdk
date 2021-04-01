<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class PullAuthClaimVcResponse extends Model
{
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

    // 长度不超过64字符的业务唯一ID，用于对一个业务流的追踪，与请求中的biz_id一致方便业务方使用。
    /**
     * @var string
     */
    public $bizId;

    // 具体的业务类型，长度不超过32字符，具体需要对接确定新增的业务类型。
    /**
     * @var string
     */
    public $bizType;

    // 当前声明的状态说明：
    // 0：用户未授权
    // 1：用户授权成功，此时vc_content字段会包含授权后的声明内容
    // 101：业务方发起声明claim_content中的用户三要素（姓名，电话，身份证号），与目标用户真实的三要素匹配失败
    //
    // 其它状态码，待定义后增加。
    /**
     * @var string
     */
    public $status;

    // 申请授权的用户did
    /**
     * @var string
     */
    public $userDid;

    // 如果status的值是“1”，则此字段就是用户授权成功后的声明（vc）的完整内容。
    /**
     * @var string
     */
    public $vcContent;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'bizId'      => 'biz_id',
        'bizType'    => 'biz_type',
        'status'     => 'status',
        'userDid'    => 'user_did',
        'vcContent'  => 'vc_content',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
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
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->userDid) {
            $res['user_did'] = $this->userDid;
        }
        if (null !== $this->vcContent) {
            $res['vc_content'] = $this->vcContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PullAuthClaimVcResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['user_did'])) {
            $model->userDid = $map['user_did'];
        }
        if (isset($map['vc_content'])) {
            $model->vcContent = $map['vc_content'];
        }

        return $model;
    }
}
