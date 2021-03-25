<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class OpenedEquity extends Model
{
    // 商户管理员ID
    /**
     * @example 288ca9e665e93dc47fb424412eb4614695ab139b8866f32b45242363a1a16fb4
     *
     * @var string
     */
    public $adminId;

    // 授权类型
    /**
     * @example 0
     *
     * @var string
     */
    public $authType;

    // 币种
    /**
     * @example RMB
     *
     * @var string
     */
    public $currency;

    // 默认价格
    /**
     * @example 21.21
     *
     * @var string
     */
    public $defaultPrice;

    // 权益详情
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // 权益详情图片
    /**
     * @example oss3;oss4
     *
     * @var string
     */
    public $descImages;

    // 权益ID
    /**
     * @example 000c7312bf8ba777ccbbfb0df8e965cd5fa67a72bb6f142136b96dc0b2364f19
     *
     * @var string
     */
    public $equityD;

    // 权益名称
    /**
     * @example 卡券158375105
     *
     * @var string
     */
    public $equityName;

    // 权益类型
    /**
     * @example 1234
     *
     * @var int
     */
    public $equityType;

    // 权益主图片
    /**
     * @example oss1;0ss2;0ss3
     *
     * @var string
     */
    public $images;

    // 是否是公开权益
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isPublic;

    // 每日商户对换限制
    /**
     * @example 999999999
     *
     * @var int
     */
    public $limitPerMerchantAndDay;

    // 每月商户对换限制
    /**
     * @example 9999999999999
     *
     * @var int
     */
    public $limitPerMerchantAndMonth;

    // 每日用户对换限制
    /**
     * @example 999999999
     *
     * @var int
     */
    public $limitPerUserAndDay;

    // 每月用户对换限制
    /**
     * @example 99999
     *
     * @var int
     */
    public $limitPerUserAndMonth;

    // 权益附言
    /**
     * @example 新的权益
     *
     * @var string
     */
    public $memo;

    // 被授权的租户ID
    /**
     * @example tenant
     *
     * @var string
     */
    public $openToTenantId;

    // 权益状态
    /**
     * @example 0
     *
     * @var int
     */
    public $status;

    // 租户ID
    /**
     * @example BRS
     *
     * @var string
     */
    public $tenantId;

    // 授权价格
    /**
     * @example 21.21
     *
     * @var string
     */
    public $tenantPrice;

    // 库存
    /**
     * @example 9999
     *
     * @var string
     */
    public $totalCount;

    // 可用右区间
    /**
     * @example 1612926693000
     *
     * @var int
     */
    public $useValidNotAfter;

    // 可用左区间
    /**
     * @example 1581304293000
     *
     * @var int
     */
    public $useValidNotBefore;

    // 有效右区间
    /**
     * @example 1612926693000
     *
     * @var int
     */
    public $validNotAfter;

    // 有效左时间
    /**
     * @example 1581304293000
     *
     * @var int
     */
    public $validNotBefore;

    // 价值
    /**
     * @example 21.21
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'adminId'                  => 'admin_id',
        'authType'                 => 'auth_type',
        'currency'                 => 'currency',
        'defaultPrice'             => 'default_price',
        'description'              => 'description',
        'descImages'               => 'desc_images',
        'equityD'                  => 'equity_d',
        'equityName'               => 'equity_name',
        'equityType'               => 'equity_type',
        'images'                   => 'images',
        'isPublic'                 => 'is_public',
        'limitPerMerchantAndDay'   => 'limit_per_merchant_and_day',
        'limitPerMerchantAndMonth' => 'limit_per_merchant_and_month',
        'limitPerUserAndDay'       => 'limit_per_user_and_day',
        'limitPerUserAndMonth'     => 'limit_per_user_and_month',
        'memo'                     => 'memo',
        'openToTenantId'           => 'open_to_tenant_id',
        'status'                   => 'status',
        'tenantId'                 => 'tenant_id',
        'tenantPrice'              => 'tenant_price',
        'totalCount'               => 'total_count',
        'useValidNotAfter'         => 'use_valid_not_after',
        'useValidNotBefore'        => 'use_valid_not_before',
        'validNotAfter'            => 'valid_not_after',
        'validNotBefore'           => 'valid_not_before',
        'value'                    => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('adminId', $this->adminId, true);
        Model::validateRequired('authType', $this->authType, true);
        Model::validateRequired('currency', $this->currency, true);
        Model::validateRequired('defaultPrice', $this->defaultPrice, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('descImages', $this->descImages, true);
        Model::validateRequired('equityD', $this->equityD, true);
        Model::validateRequired('equityName', $this->equityName, true);
        Model::validateRequired('equityType', $this->equityType, true);
        Model::validateRequired('images', $this->images, true);
        Model::validateRequired('isPublic', $this->isPublic, true);
        Model::validateRequired('limitPerMerchantAndDay', $this->limitPerMerchantAndDay, true);
        Model::validateRequired('limitPerMerchantAndMonth', $this->limitPerMerchantAndMonth, true);
        Model::validateRequired('limitPerUserAndDay', $this->limitPerUserAndDay, true);
        Model::validateRequired('limitPerUserAndMonth', $this->limitPerUserAndMonth, true);
        Model::validateRequired('memo', $this->memo, true);
        Model::validateRequired('openToTenantId', $this->openToTenantId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('tenantPrice', $this->tenantPrice, true);
        Model::validateRequired('totalCount', $this->totalCount, true);
        Model::validateRequired('useValidNotAfter', $this->useValidNotAfter, true);
        Model::validateRequired('useValidNotBefore', $this->useValidNotBefore, true);
        Model::validateRequired('validNotAfter', $this->validNotAfter, true);
        Model::validateRequired('validNotBefore', $this->validNotBefore, true);
        Model::validateRequired('value', $this->value, true);
    }

    public function toMap()
    {
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
     *
     * @return OpenedEquity
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['admin_id'])) {
            $model->adminId = $map['admin_id'];
        }
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['default_price'])) {
            $model->defaultPrice = $map['default_price'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['desc_images'])) {
            $model->descImages = $map['desc_images'];
        }
        if (isset($map['equity_d'])) {
            $model->equityD = $map['equity_d'];
        }
        if (isset($map['equity_name'])) {
            $model->equityName = $map['equity_name'];
        }
        if (isset($map['equity_type'])) {
            $model->equityType = $map['equity_type'];
        }
        if (isset($map['images'])) {
            $model->images = $map['images'];
        }
        if (isset($map['is_public'])) {
            $model->isPublic = $map['is_public'];
        }
        if (isset($map['limit_per_merchant_and_day'])) {
            $model->limitPerMerchantAndDay = $map['limit_per_merchant_and_day'];
        }
        if (isset($map['limit_per_merchant_and_month'])) {
            $model->limitPerMerchantAndMonth = $map['limit_per_merchant_and_month'];
        }
        if (isset($map['limit_per_user_and_day'])) {
            $model->limitPerUserAndDay = $map['limit_per_user_and_day'];
        }
        if (isset($map['limit_per_user_and_month'])) {
            $model->limitPerUserAndMonth = $map['limit_per_user_and_month'];
        }
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }
        if (isset($map['open_to_tenant_id'])) {
            $model->openToTenantId = $map['open_to_tenant_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['tenant_price'])) {
            $model->tenantPrice = $map['tenant_price'];
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['use_valid_not_after'])) {
            $model->useValidNotAfter = $map['use_valid_not_after'];
        }
        if (isset($map['use_valid_not_before'])) {
            $model->useValidNotBefore = $map['use_valid_not_before'];
        }
        if (isset($map['valid_not_after'])) {
            $model->validNotAfter = $map['valid_not_after'];
        }
        if (isset($map['valid_not_before'])) {
            $model->validNotBefore = $map['valid_not_before'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
