<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class Equity extends Model {
    protected $_name = [
        'adminId' => 'admin_id',
        'authType' => 'auth_type',
        'currency' => 'currency',
        'defaultPrice' => 'default_price',
        'description' => 'description',
        'descImages' => 'desc_images',
        'equityExtInfo' => 'equity_ext_info',
        'equityId' => 'equity_id',
        'equityName' => 'equity_name',
        'equityType' => 'equity_type',
        'images' => 'images',
        'isPublic' => 'is_public',
        'limitPerMerchantAndDay' => 'limit_per_merchant_and_day',
        'limitPerMerchantAndMonth' => 'limit_per_merchant_and_month',
        'limitPerUserAndDay' => 'limit_per_user_and_day',
        'limitPerUserAndMonth' => 'limit_per_user_and_month',
        'memo' => 'memo',
        'status' => 'status',
        'tenantId' => 'tenant_id',
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
        if (null !== $this->equityExtInfo) {
            $res['equity_ext_info'] = null !== $this->equityExtInfo ? $this->equityExtInfo->toMap() : null;
        }
        if (null !== $this->equityId) {
            $res['equity_id'] = $this->equityId;
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
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
     * @return Equity
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
        if(isset($map['equity_ext_info'])){
            $model->equityExtInfo = EquityExtInfo::fromMap($map['equity_ext_info']);
        }
        if(isset($map['equity_id'])){
            $model->equityId = $map['equity_id'];
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
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
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
     * @example ed7b3acb718eef475454e973b8bac06c5feb1b7ea62f91bc8fab6a5e7cc3c061
     * @description 权益管理员ID
     * @var string
     */
    public $adminId;

    /**
     * @example 0
     * @description 权益授权类型
     * @var integer
     */
    public $authType;

    /**
     * @example CNY
     * @description 权益锚定币种
     * @var string
     */
    public $currency;

    /**
     * @example 10.0000
     * @description 权益默认价格
     * @var string
     */
    public $defaultPrice;

    /**
     * @example FDCard
     * @description 权益描述
     * @var string
     */
    public $description;

    /**
     * @example oss1;oss2
     * @description 权益描述图片OSS地址 分号分隔
     * @var string
     */
    public $descImages;

    /**
     * @example 
     * @description 权益附属信息
     * @var EquityExtInfo
     */
    public $equityExtInfo;

    /**
     * @example 146bfee42fbc8d05f6c26eebf12f8306ea0df1e48d61bc29ba9b523ed0a6e628
     * @description 权益ID
     * @var string
     */
    public $equityId;

    /**
     * @example FDCardtest
     * @description 权益名称
     * @var string
     */
    public $equityName;

    /**
     * @example 1
     * @description 权益类型; 0积分,1卡券, 2实物
     * @var string
     */
    public $equityType;

    /**
     * @example oss://myexchange/1259371fc8f77d37aab22d949ea51f4982fea55dfb6d130facf32dd6d4257fa0.jpeg
     * @description 权益主图片OSS地址 分号;分隔
     * @var string
     */
    public $images;

    /**
     * @example true, false
     * @description 是否为公开权益
     * @var bool
     */
    public $isPublic;

    /**
     * @example 100
     * @description 商户每日兑换上限
     * @var integer
     */
    public $limitPerMerchantAndDay;

    /**
     * @example 1000
     * @description 商户每月兑换上限
     * @var integer
     */
    public $limitPerMerchantAndMonth;

    /**
     * @example 10
     * @description 用户每日兑换上限
     * @var integer
     */
    public $limitPerUserAndDay;

    /**
     * @example 100
     * @description 用户每月兑换上限
     * @var integer
     */
    public $limitPerUserAndMonth;

    /**
     * @example memo
     * @description 附言
     * @var string
     */
    public $memo;

    /**
     * @example 0
     * @description 权益状态
     * @var integer
     */
    public $status;

    /**
     * @example ZEJEZKUA
     * @description 租户ID
     * @var string
     */
    public $tenantId;

    /**
     * @example 1000000
     * @description 权益库存
     * @var string
     */
    public $totalCount;

    /**
     * @example 1612926693000
     * @description 权益使用有效期右闭区间
     * @var integer
     */
    public $useValidNotAfter;

    /**
     * @example 1581304293000
     * @description 权益使用有效期左闭区间
     * @var integer
     */
    public $useValidNotBefore;

    /**
     * @example 1612926693000
     * @description 权益兑换有效期右闭区间
     * @var integer
     */
    public $validNotAfter;

    /**
     * @example 1581304293000
     * @description 权益兑换有效期左闭区间
     * @var integer
     */
    public $validNotBefore;

    /**
     * @example 10.0000
     * @description 权益面值
     * @var string
     */
    public $value;

}
