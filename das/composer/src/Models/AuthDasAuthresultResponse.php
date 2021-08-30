<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class AuthDasAuthresultResponse extends Model
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

    // 被授权企业ID
    /**
     * @var string
     */
    public $beAuthedPersonId;

    // 被授权企业接入应用ID
    /**
     * @var string
     */
    public $beAuthedPersonAppId;

    // 授权实例ID
    /**
     * @var string
     */
    public $authInstanceId;

    // 授权详情ID
    /**
     * @var string
     */
    public $authResultId;

    // VC 完整信息
    /**
     * @var string
     */
    public $vc;
    protected $_name = [
        'reqMsgId'            => 'req_msg_id',
        'resultCode'          => 'result_code',
        'resultMsg'           => 'result_msg',
        'beAuthedPersonId'    => 'be_authed_person_id',
        'beAuthedPersonAppId' => 'be_authed_person_app_id',
        'authInstanceId'      => 'auth_instance_id',
        'authResultId'        => 'auth_result_id',
        'vc'                  => 'vc',
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
        if (null !== $this->beAuthedPersonId) {
            $res['be_authed_person_id'] = $this->beAuthedPersonId;
        }
        if (null !== $this->beAuthedPersonAppId) {
            $res['be_authed_person_app_id'] = $this->beAuthedPersonAppId;
        }
        if (null !== $this->authInstanceId) {
            $res['auth_instance_id'] = $this->authInstanceId;
        }
        if (null !== $this->authResultId) {
            $res['auth_result_id'] = $this->authResultId;
        }
        if (null !== $this->vc) {
            $res['vc'] = $this->vc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthDasAuthresultResponse
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
        if (isset($map['be_authed_person_id'])) {
            $model->beAuthedPersonId = $map['be_authed_person_id'];
        }
        if (isset($map['be_authed_person_app_id'])) {
            $model->beAuthedPersonAppId = $map['be_authed_person_app_id'];
        }
        if (isset($map['auth_instance_id'])) {
            $model->authInstanceId = $map['auth_instance_id'];
        }
        if (isset($map['auth_result_id'])) {
            $model->authResultId = $map['auth_result_id'];
        }
        if (isset($map['vc'])) {
            $model->vc = $map['vc'];
        }

        return $model;
    }
}
