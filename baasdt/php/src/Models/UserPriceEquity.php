<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class UserPriceEquity extends Model {
    protected $_name = [
        'adminId' => 'admin_id',
        'authType' => 'auth_type',
        'currency' => 'currency',
        'defaultPrice' => 'default_price',
        'description' => 'description',
        'descImages' => 'desc_images',
        'equityD' => 'equity_d',
        'equityName' => 'equity_name',
        'equityType' => 'equity_type',
        'images' => 'images',
        'isPublic' => 'is_public',
        'limitPerMerchantAndDay' => 'limit_per_merchant_and_day',
        'limitPerMerchantAndMonth' => 'limit_per_merchant_and_month',
        'limitPerUserAndDay' => 'limit_per_user_and_day',
        'limitPerUserAndMonth' => 'limit_per_user_and_month',
        'memo' => 'memo',
        'openToTenantId' => 'open_to_tenant_id',
        'price' => 'price',
        'ratio' => 'ratio',
        'snapshotTenantPrice' => 'snapshot_tenant_price',
        'status' => 'status',
        'tenantId' => 'tenant_id',
        'totalCount' => 'total_count',
        'userPriceType' => 'user_price_type',
        'useValidNotAfter' => 'use_valid_not_after',
        'useValidNotBefore' => 'use_valid_not_before',
        'validNotAfter' => 'valid_not_after',
        'validNotBefore' => 'valid_not_before',
        'value' => 'value',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->adminId) {
            $res['admin_id'] = $this->adminId;
        }
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->defaultPrice) {
            $res['default_price'] = $this->defaultPrice;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->descImages) {
            $res['desc_images'] = $this->descImages;
        }
        if (null !== $this->equityD) {
            $res['equity_d'] = $this->equityD;
        }
        if (null !== $this->equityName) {
            $res['equity_name'] = $this->equityName;
        }
        if (null !== $this->equityType) {
            $res['equity_type'] = $this->equityType;
        }
        if (null !== $this->images) {
            $res['images'] = $this->images;
        }
        if (null !== $this->isPublic) {
            $res['is_public'] = $this->isPublic;
        }
        if (null !== $this->limitPerMerchantAndDay) {
            $res['limit_per_merchant_and_day'] = $this->limitPerMerchantAndDay;
        }
        if (null !== $this->limitPerMerchantAndMonth) {
            $res['limit_per_merchant_and_month'] = $this->limitPerMerchantAndMonth;
        }
        if (null !== $this->limitPerUserAndDay) {
            $res['limit_per_user_and_day'] = $this->limitPerUserAndDay;
        }
        if (null !== $this->limitPerUserAndMonth) {
            $res['limit_per_user_and_month'] = $this->limitPerUserAndMonth;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        if (null !== $this->openToTenantId) {
            $res['open_to_tenant_id'] = $this->openToTenantId;
        }
        if (null !== $this->price) {
            $res['price'] = $this->price;
        }
        if (null !== $this->ratio) {
            $res['ratio'] = $this->ratio;
        }
        if (null !== $this->snapshotTenantPrice) {
            $res['snapshot_tenant_price'] = $this->snapshotTenantPrice;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->userPriceType) {
            $res['user_price_type'] = $this->userPriceType;
        }
        if (null !== $this->useValidNotAfter) {
            $res['use_valid_not_after'] = $this->useValidNotAfter;
        }
        if (null !== $this->useValidNotBefore) {
            $res['use_valid_not_before'] = $this->useValidNotBefore;
        }
        if (null !== $this->validNotAfter) {
            $res['valid_not_after'] = $this->validNotAfter;
        }
        if (null !== $this->validNotBefore) {
            $res['valid_not_before'] = $this->validNotBefore;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UserPriceEquity
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['admin_id'])){
            $model->adminId = $map['admin_id'];
        }
        if(isset($map['auth_type'])){
            $model->authType = $map['auth_type'];
        }
        if(isset($map['currency'])){
            $model->currency = $map['currency'];
        }
        if(isset($map['default_price'])){
            $model->defaultPrice = $map['default_price'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['desc_images'])){
            $model->descImages = $map['desc_images'];
        }
        if(isset($map['equity_d'])){
            $model->equityD = $map['equity_d'];
        }
        if(isset($map['equity_name'])){
            $model->equityName = $map['equity_name'];
        }
        if(isset($map['equity_type'])){
            $model->equityType = $map['equity_type'];
        }
        if(isset($map['images'])){
            $model->images = $map['images'];
        }
        if(isset($map['is_public'])){
            $model->isPublic = $map['is_public'];
        }
        if(isset($map['limit_per_merchant_and_day'])){
            $model->limitPerMerchantAndDay = $map['limit_per_merchant_and_day'];
        }
        if(isset($map['limit_per_merchant_and_month'])){
            $model->limitPerMerchantAndMonth = $map['limit_per_merchant_and_month'];
        }
        if(isset($map['limit_per_user_and_day'])){
            $model->limitPerUserAndDay = $map['limit_per_user_and_day'];
        }
        if(isset($map['limit_per_user_and_month'])){
            $model->limitPerUserAndMonth = $map['limit_per_user_and_month'];
        }
        if(isset($map['memo'])){
            $model->memo = $map['memo'];
        }
        if(isset($map['open_to_tenant_id'])){
            $model->openToTenantId = $map['open_to_tenant_id'];
        }
        if(isset($map['price'])){
            $model->price = $map['price'];
        }
        if(isset($map['ratio'])){
            $model->ratio = $map['ratio'];
        }
        if(isset($map['snapshot_tenant_price'])){
            $model->snapshotTenantPrice = $map['snapshot_tenant_price'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['total_count'])){
            $model->totalCount = $map['total_count'];
        }
        if(isset($map['user_price_type'])){
            $model->userPriceType = $map['user_price_type'];
        }
        if(isset($map['use_valid_not_after'])){
            $model->useValidNotAfter = $map['use_valid_not_after'];
        }
        if(isset($map['use_valid_not_before'])){
            $model->useValidNotBefore = $map['use_valid_not_before'];
        }
        if(isset($map['valid_not_after'])){
            $model->validNotAfter = $map['valid_not_after'];
        }
        if(isset($map['valid_not_before'])){
            $model->validNotBefore = $map['valid_not_before'];
        }
        if(isset($map['value'])){
            $model->value = $map['value'];
        }
        return $model;
    }
    // 权益提供商商户ID
    /**
     * @example 288ca9e665e93dc47fb424412eb4614695ab139b8866f32b45242363a1a16fb4
     * @var string
     */
    public $adminId;

    // 授权类型
    /**
     * @example 0
     * @var integer
     */
    public $authType;

    // 币种
    /**
     * @example USD
     * @var string
     */
    public $currency;

    // 默认价格
    /**
     * @example 1.21
     * @var string
     */
    public $defaultPrice;

    // 权益描述
    /**
     * @example description
     * @var string
     */
    public $description;

    // 权益描述图片
    /**
     * @example oss004;oss005;oss006
     * @var string
     */
    public $descImages;

    // 权益ID
    /**
     * @example 000c7312bf8ba777ccbbfb0df8e965cd5fa67a72bb6f142136b96dc0b2364f19
     * @var string
     */
    public $equityD;

    // 权益名称
    /**
     * @example 卡券15837
     * @var string
     */
    public $equityName;

    // 权益类型
    /**
     * @example 1
     * @var integer
     */
    public $equityType;

    // 权益主图片
    /**
     * @example oss001;oss002;oss003
     * @var string
     */
    public $images;

    // 是否公开权益
    /**
     * @example true, false
     * @var bool
     */
    public $isPublic;

    // 商户每日兑换上线
    /**
     * @example 999999999999
     * @var integer
     */
    public $limitPerMerchantAndDay;

    // 商户每月兑换上线
    /**
     * @example 9999999999999999
     * @var integer
     */
    public $limitPerMerchantAndMonth;

    // 用户每日兑换上线
    /**
     * @example 999999999
     * @var integer
     */
    public $limitPerUserAndDay;

    // 用户每月兑换上限
    /**
     * @example 999999999
     * @var integer
     */
    public $limitPerUserAndMonth;

    // 权益附言信息
    /**
     * @example 这是权益
     * @var string
     */
    public $memo;

    // 授权的租户ID
    /**
     * @example tenantid
     * @var string
     */
    public $openToTenantId;

    // 用户价格
    /**
     * @example 1.21
     * @var string
     */
    public $price;

    // 用户价格比例
    /**
     * @example 1.1
     * @var string
     */
    public $ratio;

    // 快照租户价格
    /**
     * @example 1.11
     * @var string
     */
    public $snapshotTenantPrice;

    // 权益状态
    /**
     * @example 0
     * @var integer
     */
    public $status;

    // 权益提供商租户ID
    /**
     * @example ABC
     * @var string
     */
    public $tenantId;

    // 权益库存
    /**
     * @example 9999999999
     * @var string
     */
    public $totalCount;

    // 用户价格类型
    /**
     * @example 0
     * @var integer
     */
    public $userPriceType;

    // 可用右区间
    /**
     * @example 1612926693000
     * @var integer
     */
    public $useValidNotAfter;

    // 可用左区间
    /**
     * @example 1581304293000
     * @var integer
     */
    public $useValidNotBefore;

    // 有效右区间
    /**
     * @example 1612926693000
     * @var integer
     */
    public $validNotAfter;

    // 有效左区间
    /**
     * @example 1581304293000
     * @var integer
     */
    public $validNotBefore;

    // 价值
    /**
     * @example 1.21
     * @var string
     */
    public $value;

}
