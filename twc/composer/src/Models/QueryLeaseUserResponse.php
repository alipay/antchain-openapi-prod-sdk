<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryLeaseUserResponse extends Model
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

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 用户登录名，租赁平台会员ID/若支付宝ID必传 长度不可超过50
    /**
     * @var string
     */
    public $loginId;

    // 用户登录名类型 1.商户会员2.支付宝3.其他
    /**
     * @var string
     */
    public $loginType;

    // 用户登录时间 格式为2019-8-31 12:00:00
    /**
     * @var string
     */
    public $loginTime;

    // 承租人姓名，加密返回
    /**
     * @var string
     */
    public $userName;

    // 承租人身份证号，加密返回
    /**
     * @var string
     */
    public $userId;

    // 承租人手机号
    /**
     * @var string
     */
    public $userPhoneNumber;

    // 身份认证类型 1支付宝实人，2芝麻实人，3非蚂蚁实人
    /**
     * @var string
     */
    public $userType;

    // 承租人支付宝账号信息
    /**
     * @var string
     */
    public $alipayUid;

    // 出租企业名称
    /**
     * @var string
     */
    public $leaseCorpName;

    // 出租企业法人名称
    /**
     * @var string
     */
    public $leaseCorpOwnerName;

    // 承租企业统一社会信用代码 长度不可超过50
    /**
     * @var string
     */
    public $leaseCorpId;

    // 错误码
    /**
     * @var string
     */
    public $code;

    // 错误信息描述
    /**
     * @var string
     */
    public $message;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'orderId'            => 'order_id',
        'loginId'            => 'login_id',
        'loginType'          => 'login_type',
        'loginTime'          => 'login_time',
        'userName'           => 'user_name',
        'userId'             => 'user_id',
        'userPhoneNumber'    => 'user_phone_number',
        'userType'           => 'user_type',
        'alipayUid'          => 'alipay_uid',
        'leaseCorpName'      => 'lease_corp_name',
        'leaseCorpOwnerName' => 'lease_corp_owner_name',
        'leaseCorpId'        => 'lease_corp_id',
        'code'               => 'code',
        'message'            => 'message',
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
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->loginId) {
            $res['login_id'] = $this->loginId;
        }
        if (null !== $this->loginType) {
            $res['login_type'] = $this->loginType;
        }
        if (null !== $this->loginTime) {
            $res['login_time'] = $this->loginTime;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userPhoneNumber) {
            $res['user_phone_number'] = $this->userPhoneNumber;
        }
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
        }
        if (null !== $this->alipayUid) {
            $res['alipay_uid'] = $this->alipayUid;
        }
        if (null !== $this->leaseCorpName) {
            $res['lease_corp_name'] = $this->leaseCorpName;
        }
        if (null !== $this->leaseCorpOwnerName) {
            $res['lease_corp_owner_name'] = $this->leaseCorpOwnerName;
        }
        if (null !== $this->leaseCorpId) {
            $res['lease_corp_id'] = $this->leaseCorpId;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryLeaseUserResponse
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
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['login_id'])) {
            $model->loginId = $map['login_id'];
        }
        if (isset($map['login_type'])) {
            $model->loginType = $map['login_type'];
        }
        if (isset($map['login_time'])) {
            $model->loginTime = $map['login_time'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['user_phone_number'])) {
            $model->userPhoneNumber = $map['user_phone_number'];
        }
        if (isset($map['user_type'])) {
            $model->userType = $map['user_type'];
        }
        if (isset($map['alipay_uid'])) {
            $model->alipayUid = $map['alipay_uid'];
        }
        if (isset($map['lease_corp_name'])) {
            $model->leaseCorpName = $map['lease_corp_name'];
        }
        if (isset($map['lease_corp_owner_name'])) {
            $model->leaseCorpOwnerName = $map['lease_corp_owner_name'];
        }
        if (isset($map['lease_corp_id'])) {
            $model->leaseCorpId = $map['lease_corp_id'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }

        return $model;
    }
}
