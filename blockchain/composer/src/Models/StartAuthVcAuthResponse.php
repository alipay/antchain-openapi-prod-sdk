<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartAuthVcAuthResponse extends Model
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

    // 输入参数的bizId返回
    /**
     * @var string
     */
    public $bizId;

    // 具体业务的类型说明，来自入参。
    /**
     * @var string
     */
    public $bizType;

    // 本次可验证声明颁发者的DID
    /**
     * @var string
     */
    public $issuerDid;

    // 可验证声明的颁发状态说明： 0：未授权 1：授权成功，此时vc_content字段会包含授权后的声明内容，其它状态码，待定义后增加。
    /**
     * @var string
     */
    public $status;

    // 本次可验证声明目标者的DID
    /**
     * @var string
     */
    public $subjectDid;

    // 可验证声明完整内容， status 为 “1” 时候非空
    /**
     * @var string
     */
    public $vcContent;

    // 可验证声明的唯一标识id，status 为 “1” 时候非空
    /**
     * @var string
     */
    public $vcId;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'bizId'      => 'biz_id',
        'bizType'    => 'biz_type',
        'issuerDid'  => 'issuer_did',
        'status'     => 'status',
        'subjectDid' => 'subject_did',
        'vcContent'  => 'vc_content',
        'vcId'       => 'vc_id',
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
        if (null !== $this->issuerDid) {
            $res['issuer_did'] = $this->issuerDid;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->subjectDid) {
            $res['subject_did'] = $this->subjectDid;
        }
        if (null !== $this->vcContent) {
            $res['vc_content'] = $this->vcContent;
        }
        if (null !== $this->vcId) {
            $res['vc_id'] = $this->vcId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartAuthVcAuthResponse
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
        if (isset($map['issuer_did'])) {
            $model->issuerDid = $map['issuer_did'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['subject_did'])) {
            $model->subjectDid = $map['subject_did'];
        }
        if (isset($map['vc_content'])) {
            $model->vcContent = $map['vc_content'];
        }
        if (isset($map['vc_id'])) {
            $model->vcId = $map['vc_id'];
        }

        return $model;
    }
}
