<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYCHARITY\Models;

use AlibabaCloud\Tea\Model;

class CreateActivitychainrecordRequest extends Model
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

    // 外部活动ID
    /**
     * @var string
     */
    public $activityId;

    // 支付宝用户UID：,固定16位长度
    /**
     * @var string
     */
    public $alipayUserId;

    // 支付宝用户昵称(脱敏)
    /**
     * @var string
     */
    public $alipayUserNickName;

    // 捐赠记录ID：(同一租户下需要做幂等)
    /**
     * @var string
     */
    public $activityRecordId;

    // 捐赠类型：固定为【point/money】,point为积分兑换捐赠类型，money为购买商品捐钱类型
    /**
     * @var string
     */
    public $donateType;

    // 捐赠数量：积分个数、金额数量，若为金额(单位为分)
    /**
     * @var int
     */
    public $amount;

    // 捐赠流水号
    /**
     * @var string
     */
    public $proofData;

    // 捐赠描述（积分,钱等等）
    /**
     * @var string
     */
    public $donateGoodsName;

    // 商品名称，如：维他奶
    /**
     * @var string
     */
    public $goodsName;

    // 单位：个、CNY
    /**
     * @var string
     */
    public $unit;

    // 支付方式：【wechat/alipay/bank/exchangePoint】
    /**
     * @var string
     */
    public $payType;

    // 固定13位数字
    /**
     * @var int
     */
    public $donateTime;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'activityId'         => 'activity_id',
        'alipayUserId'       => 'alipay_user_id',
        'alipayUserNickName' => 'alipay_user_nick_name',
        'activityRecordId'   => 'activity_record_id',
        'donateType'         => 'donate_type',
        'amount'             => 'amount',
        'proofData'          => 'proof_data',
        'donateGoodsName'    => 'donate_goods_name',
        'goodsName'          => 'goods_name',
        'unit'               => 'unit',
        'payType'            => 'pay_type',
        'donateTime'         => 'donate_time',
    ];

    public function validate()
    {
        Model::validateRequired('activityId', $this->activityId, true);
        Model::validateRequired('alipayUserId', $this->alipayUserId, true);
        Model::validateRequired('activityRecordId', $this->activityRecordId, true);
        Model::validateRequired('donateType', $this->donateType, true);
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('donateGoodsName', $this->donateGoodsName, true);
        Model::validateRequired('payType', $this->payType, true);
        Model::validateRequired('donateTime', $this->donateTime, true);
        Model::validateMaxLength('activityId', $this->activityId, 50);
        Model::validateMaxLength('alipayUserId', $this->alipayUserId, 16);
        Model::validateMaxLength('alipayUserNickName', $this->alipayUserNickName, 50);
        Model::validateMaxLength('activityRecordId', $this->activityRecordId, 50);
        Model::validateMaxLength('proofData', $this->proofData, 50);
        Model::validateMaxLength('donateGoodsName', $this->donateGoodsName, 200);
        Model::validateMaxLength('goodsName', $this->goodsName, 100);
        Model::validateMaxLength('unit', $this->unit, 50);
        Model::validateMinLength('alipayUserId', $this->alipayUserId, 16);
        Model::validateMaximum('amount', $this->amount, 999999999);
        Model::validateMinimum('amount', $this->amount, 1);
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
        if (null !== $this->activityId) {
            $res['activity_id'] = $this->activityId;
        }
        if (null !== $this->alipayUserId) {
            $res['alipay_user_id'] = $this->alipayUserId;
        }
        if (null !== $this->alipayUserNickName) {
            $res['alipay_user_nick_name'] = $this->alipayUserNickName;
        }
        if (null !== $this->activityRecordId) {
            $res['activity_record_id'] = $this->activityRecordId;
        }
        if (null !== $this->donateType) {
            $res['donate_type'] = $this->donateType;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->proofData) {
            $res['proof_data'] = $this->proofData;
        }
        if (null !== $this->donateGoodsName) {
            $res['donate_goods_name'] = $this->donateGoodsName;
        }
        if (null !== $this->goodsName) {
            $res['goods_name'] = $this->goodsName;
        }
        if (null !== $this->unit) {
            $res['unit'] = $this->unit;
        }
        if (null !== $this->payType) {
            $res['pay_type'] = $this->payType;
        }
        if (null !== $this->donateTime) {
            $res['donate_time'] = $this->donateTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateActivitychainrecordRequest
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
        if (isset($map['activity_id'])) {
            $model->activityId = $map['activity_id'];
        }
        if (isset($map['alipay_user_id'])) {
            $model->alipayUserId = $map['alipay_user_id'];
        }
        if (isset($map['alipay_user_nick_name'])) {
            $model->alipayUserNickName = $map['alipay_user_nick_name'];
        }
        if (isset($map['activity_record_id'])) {
            $model->activityRecordId = $map['activity_record_id'];
        }
        if (isset($map['donate_type'])) {
            $model->donateType = $map['donate_type'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['proof_data'])) {
            $model->proofData = $map['proof_data'];
        }
        if (isset($map['donate_goods_name'])) {
            $model->donateGoodsName = $map['donate_goods_name'];
        }
        if (isset($map['goods_name'])) {
            $model->goodsName = $map['goods_name'];
        }
        if (isset($map['unit'])) {
            $model->unit = $map['unit'];
        }
        if (isset($map['pay_type'])) {
            $model->payType = $map['pay_type'];
        }
        if (isset($map['donate_time'])) {
            $model->donateTime = $map['donate_time'];
        }

        return $model;
    }
}
