<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ZOLOZFACEVERIFY\Models;

use AlibabaCloud\Tea\Model;

class QueryFaceauthMeteringRequest extends Model
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

    // 业务流水号
    /**
     * @var string
     */
    public $bizId;

    // 截止时间（整小时）
    /**
     * @var string
     */
    public $endTime;

    // 初始化接口传入的二级商户id
    /**
     * @var string
     */
    public $merchantId;

    // 需要查询的计量类型
    // 实名新用户:realNameNewUser
    // 实名老用户:realNameOldUser
    // 匿名注册:anonymousEnroll
    // 匿名比对:anonymousAuth
    //
    /**
     * @var string
     */
    public $meteringType;

    // 起始时间（整小时）
    /**
     * @var string
     */
    public $startTime;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'endTime'           => 'end_time',
        'merchantId'        => 'merchant_id',
        'meteringType'      => 'metering_type',
        'startTime'         => 'start_time',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('endTime', $this->endTime, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validatePattern('endTime', $this->endTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->meteringType) {
            $res['metering_type'] = $this->meteringType;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryFaceauthMeteringRequest
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
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['metering_type'])) {
            $model->meteringType = $map['metering_type'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }

        return $model;
    }
}
