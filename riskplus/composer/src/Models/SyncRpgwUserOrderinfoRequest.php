<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class SyncRpgwUserOrderinfoRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 订单号
    /**
     * @var string
     */
    public $orderNumber;

    // REGISTER与PURCHASE二选一
    /**
     * @var string
     */
    public $orderType;

    // 时间，格式为yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $orderTime;

    // 邀请人id
    /**
     * @var string
     */
    public $inviterId;

    // 邀请人姓名
    /**
     * @var string
     */
    public $inviterName;

    // 邀请人手机号
    /**
     * @var string
     */
    public $inviterPhoneNumber;

    // 邀请人身份证号
    /**
     * @var string
     */
    public $inviterIdNumber;

    // 邀请码
    /**
     * @var string
     */
    public $invitationCode;

    // 被邀请人id
    /**
     * @var string
     */
    public $inviteeId;

    // 被邀请人姓名
    /**
     * @var string
     */
    public $inviteeName;

    // 被邀请人手机号
    /**
     * @var string
     */
    public $inviteePhoneNumber;

    // 被邀请人身份证
    /**
     * @var string
     */
    public $inviteeIdNumber;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'orderNumber'        => 'order_number',
        'orderType'          => 'order_type',
        'orderTime'          => 'order_time',
        'inviterId'          => 'inviter_id',
        'inviterName'        => 'inviter_name',
        'inviterPhoneNumber' => 'inviter_phone_number',
        'inviterIdNumber'    => 'inviter_id_number',
        'invitationCode'     => 'invitation_code',
        'inviteeId'          => 'invitee_id',
        'inviteeName'        => 'invitee_name',
        'inviteePhoneNumber' => 'invitee_phone_number',
        'inviteeIdNumber'    => 'invitee_id_number',
    ];

    public function validate()
    {
        Model::validateRequired('orderNumber', $this->orderNumber, true);
        Model::validateRequired('orderType', $this->orderType, true);
        Model::validateRequired('orderTime', $this->orderTime, true);
        Model::validateRequired('inviterId', $this->inviterId, true);
        Model::validateRequired('inviterName', $this->inviterName, true);
        Model::validateRequired('inviterPhoneNumber', $this->inviterPhoneNumber, true);
        Model::validateRequired('inviterIdNumber', $this->inviterIdNumber, true);
        Model::validateRequired('inviteeId', $this->inviteeId, true);
        Model::validateRequired('inviteePhoneNumber', $this->inviteePhoneNumber, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->orderNumber) {
            $res['order_number'] = $this->orderNumber;
        }
        if (null !== $this->orderType) {
            $res['order_type'] = $this->orderType;
        }
        if (null !== $this->orderTime) {
            $res['order_time'] = $this->orderTime;
        }
        if (null !== $this->inviterId) {
            $res['inviter_id'] = $this->inviterId;
        }
        if (null !== $this->inviterName) {
            $res['inviter_name'] = $this->inviterName;
        }
        if (null !== $this->inviterPhoneNumber) {
            $res['inviter_phone_number'] = $this->inviterPhoneNumber;
        }
        if (null !== $this->inviterIdNumber) {
            $res['inviter_id_number'] = $this->inviterIdNumber;
        }
        if (null !== $this->invitationCode) {
            $res['invitation_code'] = $this->invitationCode;
        }
        if (null !== $this->inviteeId) {
            $res['invitee_id'] = $this->inviteeId;
        }
        if (null !== $this->inviteeName) {
            $res['invitee_name'] = $this->inviteeName;
        }
        if (null !== $this->inviteePhoneNumber) {
            $res['invitee_phone_number'] = $this->inviteePhoneNumber;
        }
        if (null !== $this->inviteeIdNumber) {
            $res['invitee_id_number'] = $this->inviteeIdNumber;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncRpgwUserOrderinfoRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['order_number'])) {
            $model->orderNumber = $map['order_number'];
        }
        if (isset($map['order_type'])) {
            $model->orderType = $map['order_type'];
        }
        if (isset($map['order_time'])) {
            $model->orderTime = $map['order_time'];
        }
        if (isset($map['inviter_id'])) {
            $model->inviterId = $map['inviter_id'];
        }
        if (isset($map['inviter_name'])) {
            $model->inviterName = $map['inviter_name'];
        }
        if (isset($map['inviter_phone_number'])) {
            $model->inviterPhoneNumber = $map['inviter_phone_number'];
        }
        if (isset($map['inviter_id_number'])) {
            $model->inviterIdNumber = $map['inviter_id_number'];
        }
        if (isset($map['invitation_code'])) {
            $model->invitationCode = $map['invitation_code'];
        }
        if (isset($map['invitee_id'])) {
            $model->inviteeId = $map['invitee_id'];
        }
        if (isset($map['invitee_name'])) {
            $model->inviteeName = $map['invitee_name'];
        }
        if (isset($map['invitee_phone_number'])) {
            $model->inviteePhoneNumber = $map['invitee_phone_number'];
        }
        if (isset($map['invitee_id_number'])) {
            $model->inviteeIdNumber = $map['invitee_id_number'];
        }

        return $model;
    }
}
