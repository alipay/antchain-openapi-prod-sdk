<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateLeaseZftagreementsignRequest extends Model
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

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 合约id
    /**
     * @var string
     */
    public $applicationId;

    // 网商直付通代扣协议号
    /**
     * @var string
     */
    public $agreementNo;

    // 实际签署协议的用户支付宝uid
    /**
     * @var string
     */
    public $alipayUserId;

    // 签署时间
    /**
     * @var string
     */
    public $signTime;

    // 协议生效时间
    /**
     * @var string
     */
    public $validTime;

    // 协议失效时间
    /**
     * @var string
     */
    public $invalidTime;

    // 租赁方金融科技租户id
    /**
     * @var string
     */
    public $leaseId;

    // 核验结果，1表示通过，-1表示不通过
    /**
     * @var int
     */
    public $agreementStatus;

    // 租赁机构支付宝uid
    /**
     * @var string
     */
    public $leaseCorpAlipayUid;

    // 直付通代扣协议核验结果说明
    /**
     * @var string
     */
    public $failMessage;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'orderId'            => 'order_id',
        'applicationId'      => 'application_id',
        'agreementNo'        => 'agreement_no',
        'alipayUserId'       => 'alipay_user_id',
        'signTime'           => 'sign_time',
        'validTime'          => 'valid_time',
        'invalidTime'        => 'invalid_time',
        'leaseId'            => 'lease_id',
        'agreementStatus'    => 'agreement_status',
        'leaseCorpAlipayUid' => 'lease_corp_alipay_uid',
        'failMessage'        => 'fail_message',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('applicationId', $this->applicationId, true);
        Model::validateRequired('agreementNo', $this->agreementNo, true);
        Model::validateRequired('leaseId', $this->leaseId, true);
        Model::validateRequired('agreementStatus', $this->agreementStatus, true);
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
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->applicationId) {
            $res['application_id'] = $this->applicationId;
        }
        if (null !== $this->agreementNo) {
            $res['agreement_no'] = $this->agreementNo;
        }
        if (null !== $this->alipayUserId) {
            $res['alipay_user_id'] = $this->alipayUserId;
        }
        if (null !== $this->signTime) {
            $res['sign_time'] = $this->signTime;
        }
        if (null !== $this->validTime) {
            $res['valid_time'] = $this->validTime;
        }
        if (null !== $this->invalidTime) {
            $res['invalid_time'] = $this->invalidTime;
        }
        if (null !== $this->leaseId) {
            $res['lease_id'] = $this->leaseId;
        }
        if (null !== $this->agreementStatus) {
            $res['agreement_status'] = $this->agreementStatus;
        }
        if (null !== $this->leaseCorpAlipayUid) {
            $res['lease_corp_alipay_uid'] = $this->leaseCorpAlipayUid;
        }
        if (null !== $this->failMessage) {
            $res['fail_message'] = $this->failMessage;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateLeaseZftagreementsignRequest
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
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['application_id'])) {
            $model->applicationId = $map['application_id'];
        }
        if (isset($map['agreement_no'])) {
            $model->agreementNo = $map['agreement_no'];
        }
        if (isset($map['alipay_user_id'])) {
            $model->alipayUserId = $map['alipay_user_id'];
        }
        if (isset($map['sign_time'])) {
            $model->signTime = $map['sign_time'];
        }
        if (isset($map['valid_time'])) {
            $model->validTime = $map['valid_time'];
        }
        if (isset($map['invalid_time'])) {
            $model->invalidTime = $map['invalid_time'];
        }
        if (isset($map['lease_id'])) {
            $model->leaseId = $map['lease_id'];
        }
        if (isset($map['agreement_status'])) {
            $model->agreementStatus = $map['agreement_status'];
        }
        if (isset($map['lease_corp_alipay_uid'])) {
            $model->leaseCorpAlipayUid = $map['lease_corp_alipay_uid'];
        }
        if (isset($map['fail_message'])) {
            $model->failMessage = $map['fail_message'];
        }

        return $model;
    }
}
