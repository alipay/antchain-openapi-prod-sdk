<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryFundCreditauthResponse extends Model
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

    // 授权id
    /**
     * @var string
     */
    public $authId;

    // 授权类型
    // ● CREDIT_GRANTING 授信
    // ● CREDIT_UTILIZATION 用信
    /**
     * @var string
     */
    public $authType;

    // 授权结果
    // AUTHORIZED 已同意
    // REJECTED 已拒绝
    // EXPIRED 已过期
    /**
     * @var string
     */
    public $authResult;

    // 授权开始时间
    /**
     * @var string
     */
    public $authBeginTime;

    // 授权结束时间
    /**
     * @var string
     */
    public $authEndTime;

    // 授权申请过期时间
    /**
     * @var string
     */
    public $authApplyExpireTime;

    // 授信/用信授权信息,json结构
    /**
     * @var string
     */
    public $authInfo;
    protected $_name = [
        'reqMsgId'            => 'req_msg_id',
        'resultCode'          => 'result_code',
        'resultMsg'           => 'result_msg',
        'authId'              => 'auth_id',
        'authType'            => 'auth_type',
        'authResult'          => 'auth_result',
        'authBeginTime'       => 'auth_begin_time',
        'authEndTime'         => 'auth_end_time',
        'authApplyExpireTime' => 'auth_apply_expire_time',
        'authInfo'            => 'auth_info',
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
        if (null !== $this->authId) {
            $res['auth_id'] = $this->authId;
        }
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }
        if (null !== $this->authResult) {
            $res['auth_result'] = $this->authResult;
        }
        if (null !== $this->authBeginTime) {
            $res['auth_begin_time'] = $this->authBeginTime;
        }
        if (null !== $this->authEndTime) {
            $res['auth_end_time'] = $this->authEndTime;
        }
        if (null !== $this->authApplyExpireTime) {
            $res['auth_apply_expire_time'] = $this->authApplyExpireTime;
        }
        if (null !== $this->authInfo) {
            $res['auth_info'] = $this->authInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryFundCreditauthResponse
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
        if (isset($map['auth_id'])) {
            $model->authId = $map['auth_id'];
        }
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }
        if (isset($map['auth_result'])) {
            $model->authResult = $map['auth_result'];
        }
        if (isset($map['auth_begin_time'])) {
            $model->authBeginTime = $map['auth_begin_time'];
        }
        if (isset($map['auth_end_time'])) {
            $model->authEndTime = $map['auth_end_time'];
        }
        if (isset($map['auth_apply_expire_time'])) {
            $model->authApplyExpireTime = $map['auth_apply_expire_time'];
        }
        if (isset($map['auth_info'])) {
            $model->authInfo = $map['auth_info'];
        }

        return $model;
    }
}
