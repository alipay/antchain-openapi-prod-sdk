<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTC\Models;

use AlibabaCloud\Tea\Model;

class PublishMerchantDiyskuRequest extends Model
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

    // 业务请求id，用来做业务上的幂等。后面查询状态也是此字段
    /**
     * @var string
     */
    public $bizNo;

    // 调用渠道
    // PET 宠物
    // MEMBER 会员
    /**
     * @var string
     */
    public $channel;

    // 领取数字藏品的用户ID，支持2088/手机号/1322
    /**
     * @var string
     */
    public $userId;

    // 支付宝2088账号：ALIPAY_UID
    // 手机号：PHONE_NO
    // 鲸探1322账号：FANS_UID
    /**
     * @var string
     */
    public $userType;

    // 需要发放的SKUID编码
    /**
     * @var string
     */
    public $skuId;

    // 一期仅支持图片：IMAGE
    /**
     * @var string
     */
    public $skuType;

    // 数字藏品的缩略图地址，可与原图相同也可不同，需要校验长宽比为1:1
    /**
     * @var string
     */
    public $thumbnailUrl;

    // 数字藏品的原图地址，需要校验长宽比为1:1
    /**
     * @var string
     */
    public $originalUrl;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizNo'             => 'biz_no',
        'channel'           => 'channel',
        'userId'            => 'user_id',
        'userType'          => 'user_type',
        'skuId'             => 'sku_id',
        'skuType'           => 'sku_type',
        'thumbnailUrl'      => 'thumbnail_url',
        'originalUrl'       => 'original_url',
    ];

    public function validate()
    {
        Model::validateRequired('bizNo', $this->bizNo, true);
        Model::validateRequired('channel', $this->channel, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('userType', $this->userType, true);
        Model::validateRequired('skuId', $this->skuId, true);
        Model::validateRequired('skuType', $this->skuType, true);
        Model::validateRequired('thumbnailUrl', $this->thumbnailUrl, true);
        Model::validateRequired('originalUrl', $this->originalUrl, true);
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
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
        }
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
        }
        if (null !== $this->skuId) {
            $res['sku_id'] = $this->skuId;
        }
        if (null !== $this->skuType) {
            $res['sku_type'] = $this->skuType;
        }
        if (null !== $this->thumbnailUrl) {
            $res['thumbnail_url'] = $this->thumbnailUrl;
        }
        if (null !== $this->originalUrl) {
            $res['original_url'] = $this->originalUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PublishMerchantDiyskuRequest
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
        if (isset($map['biz_no'])) {
            $model->bizNo = $map['biz_no'];
        }
        if (isset($map['channel'])) {
            $model->channel = $map['channel'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['user_type'])) {
            $model->userType = $map['user_type'];
        }
        if (isset($map['sku_id'])) {
            $model->skuId = $map['sku_id'];
        }
        if (isset($map['sku_type'])) {
            $model->skuType = $map['sku_type'];
        }
        if (isset($map['thumbnail_url'])) {
            $model->thumbnailUrl = $map['thumbnail_url'];
        }
        if (isset($map['original_url'])) {
            $model->originalUrl = $map['original_url'];
        }

        return $model;
    }
}
