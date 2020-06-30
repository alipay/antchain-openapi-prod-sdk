<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class OpenedEquity extends Model {
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
        'status' => 'status',
        'tenantId' => 'tenant_id',
        'tenantPrice' => 'tenant_price',
        'totalCount' => 'total_count',
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->tenantPrice) {
            $res['tenant_price'] = $this->tenantPrice;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
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
     * @return OpenedEquity
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
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['tenant_price'])){
            $model->tenantPrice = $map['tenant_price'];
        }
        if(isset($map['total_count'])){
            $model->totalCount = $map['total_count'];
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
    /**
     * @example 288ca9e665e93dc47fb424412eb4614695ab139b8866f32b45242363a1a16fb4
     * @description 商户管理员ID
     * @var string
     */
    public $adminId;

    /**
     * @example 0
     * @description 授权类型
     * @var string
     */
    public $authType;

    /**
     * @example RMB
     * @description 币种
     * @var string
     */
    public $currency;

    /**
     * @example 21.21
     * @description 默认价格
     * @var string
     */
    public $defaultPrice;

    /**
     * @example description
     * @description 权益详情
     * @var string
     */
    public $description;

    /**
     * @example oss3;oss4
     * @description 权益详情图片
     * @var string
     */
    public $descImages;

    /**
     * @example 000c7312bf8ba777ccbbfb0df8e965cd5fa67a72bb6f142136b96dc0b2364f19
     * @description 权益ID
     * @var string
     */
    public $equityD;

    /**
     * @example 卡券158375105
     * @description 权益名称
     * @var string
     */
    public $equityName;

    /**
     * @example 1234
     * @description 权益类型
     * @var integer
     */
    public $equityType;

    /**
     * @example oss1;0ss2;0ss3
     * @description 权益主图片
     * @var string
     */
    public $images;

    /**
     * @example true, false
     * @description 是否是公开权益
     * @var bool
     */
    public $isPublic;

    /**
     * @example 999999999
     * @description 每日商户对换限制
     * @var integer
     */
    public $limitPerMerchantAndDay;

    /**
     * @example 9999999999999
     * @description 每月商户对换限制
     * @var integer
     */
    public $limitPerMerchantAndMonth;

    /**
     * @example 999999999
     * @description 每日用户对换限制
     * @var integer
     */
    public $limitPerUserAndDay;

    /**
     * @example 99999
     * @description 每月用户对换限制
     * @var integer
     */
    public $limitPerUserAndMonth;

    /**
     * @example 新的权益
     * @description 权益附言
     * @var string
     */
    public $memo;

    /**
     * @example tenant
     * @description 被授权的租户ID
     * @var string
     */
    public $openToTenantId;

    /**
     * @example 0
     * @description 权益状态
     * @var integer
     */
    public $status;

    /**
     * @example BRS
     * @description 租户ID
     * @var string
     */
    public $tenantId;

    /**
     * @example 21.21
     * @description 授权价格
     * @var string
     */
    public $tenantPrice;

    /**
     * @example 9999
     * @description 库存
     * @var string
     */
    public $totalCount;

    /**
     * @example 1612926693000
     * @description 可用右区间
     * @var integer
     */
    public $useValidNotAfter;

    /**
     * @example 1581304293000
     * @description 可用左区间
     * @var integer
     */
    public $useValidNotBefore;

    /**
     * @example 1612926693000
     * @description 有效右区间
     * @var integer
     */
    public $validNotAfter;

    /**
     * @example 1581304293000
     * @description 有效左时间
     * @var integer
     */
    public $validNotBefore;

    /**
     * @example 21.21
     * @description 价值
     * @var string
     */
    public $value;

}
