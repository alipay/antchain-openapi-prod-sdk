<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateLeaseFinancecertifyRequest extends Model
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

    // 融资租赁合约id
    /**
     * @var string
     */
    public $applicationId;

    // 直付通代扣协议号
    /**
     * @var string
     */
    public $agreementNo;

    // 还款类型
    /**
     * @var string
     */
    public $rentalReturnType;

    // 认证类型
    /**
     * @var string
     */
    public $certifyWay;

    // 承租人姓名
    /**
     * @var string
     */
    public $userName;

    // 承租人身份证
    /**
     * @var string
     */
    public $userId;

    // 人脸识别认证id
    /**
     * @var string
     */
    public $certifyId;

    // 承租人支付宝uid
    /**
     * @var string
     */
    public $alipayUid;

    // 提前还款信息
    /**
     * @var FinanceCertifyRentalInfo[]
     */
    public $rentalInfos;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId'           => 'order_id',
        'applicationId'     => 'application_id',
        'agreementNo'       => 'agreement_no',
        'rentalReturnType'  => 'rental_return_type',
        'certifyWay'        => 'certify_way',
        'userName'          => 'user_name',
        'userId'            => 'user_id',
        'certifyId'         => 'certify_id',
        'alipayUid'         => 'alipay_uid',
        'rentalInfos'       => 'rental_infos',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('applicationId', $this->applicationId, true);
        Model::validateRequired('agreementNo', $this->agreementNo, true);
        Model::validateRequired('rentalReturnType', $this->rentalReturnType, true);
        Model::validateRequired('certifyWay', $this->certifyWay, true);
        Model::validateRequired('userName', $this->userName, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('certifyId', $this->certifyId, true);
        Model::validateRequired('alipayUid', $this->alipayUid, true);
        Model::validateRequired('rentalInfos', $this->rentalInfos, true);
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
        if (null !== $this->rentalReturnType) {
            $res['rental_return_type'] = $this->rentalReturnType;
        }
        if (null !== $this->certifyWay) {
            $res['certify_way'] = $this->certifyWay;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->certifyId) {
            $res['certify_id'] = $this->certifyId;
        }
        if (null !== $this->alipayUid) {
            $res['alipay_uid'] = $this->alipayUid;
        }
        if (null !== $this->rentalInfos) {
            $res['rental_infos'] = [];
            if (null !== $this->rentalInfos && \is_array($this->rentalInfos)) {
                $n = 0;
                foreach ($this->rentalInfos as $item) {
                    $res['rental_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateLeaseFinancecertifyRequest
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
        if (isset($map['rental_return_type'])) {
            $model->rentalReturnType = $map['rental_return_type'];
        }
        if (isset($map['certify_way'])) {
            $model->certifyWay = $map['certify_way'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['certify_id'])) {
            $model->certifyId = $map['certify_id'];
        }
        if (isset($map['alipay_uid'])) {
            $model->alipayUid = $map['alipay_uid'];
        }
        if (isset($map['rental_infos'])) {
            if (!empty($map['rental_infos'])) {
                $model->rentalInfos = [];
                $n                  = 0;
                foreach ($map['rental_infos'] as $item) {
                    $model->rentalInfos[$n++] = null !== $item ? FinanceCertifyRentalInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
