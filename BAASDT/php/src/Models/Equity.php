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
    // 权益管理员ID
    /**
     * @example ed7b3acb718eef475454e973b8bac06c5feb1b7ea62f91bc8fab6a5e7cc3c061
     * @var string
     */
    public $adminId;

    // 权益授权类型
    /**
     * @example 0
     * @var integer
     */
    public $authType;

    // 权益锚定币种
    /**
     * @example CNY
     * @var string
     */
    public $currency;

    // 权益默认价格
    /**
     * @example 10.0000
     * @var string
     */
    public $defaultPrice;

    // 权益描述
    /**
     * @example FDCard
     * @var string
     */
    public $description;

    // 权益描述图片OSS地址 分号分隔
    /**
     * @example oss1;oss2
     * @var string
     */
    public $descImages;

    // 权益附属信息
    /**
     * @example 
     * @var EquityExtInfo
     */
    public $equityExtInfo;

    // 权益ID
    /**
     * @example 146bfee42fbc8d05f6c26eebf12f8306ea0df1e48d61bc29ba9b523ed0a6e628
     * @var string
     */
    public $equityId;

    // 权益名称
    /**
     * @example FDCardtest
     * @var string
     */
    public $equityName;

    // 商品类型，详见数字商品公约https://tech.antfin.com/docs/2/163896
    /**
     * @example 0100020001
     * @var string
     */
    public $equityType;

    // 权益主图片OSS地址 分号;分隔
    /**
     * @example oss://myexchange/1259371fc8f77d37...5dfb6d130facf32dd6d4257fa0.jpeg
     * @var string
     */
    public $images;

    // 是否为公开权益
    /**
     * @example true, false
     * @var bool
     */
    public $isPublic;

    // 商户每日兑换上限
    /**
     * @example 100
     * @var integer
     */
    public $limitPerMerchantAndDay;

    // 商户每月兑换上限
    /**
     * @example 1000
     * @var integer
     */
    public $limitPerMerchantAndMonth;

    // 用户每日兑换上限
    /**
     * @example 10
     * @var integer
     */
    public $limitPerUserAndDay;

    // 用户每月兑换上限
    /**
     * @example 100
     * @var integer
     */
    public $limitPerUserAndMonth;

    // 附言
    /**
     * @example memo
     * @var string
     */
    public $memo;

    // 权益状态
    /**
     * @example 0
     * @var integer
     */
    public $status;

    // 租户ID
    /**
     * @example ZEJEZKUA
     * @var string
     */
    public $tenantId;

    // 权益库存
    /**
     * @example 1000000
     * @var string
     */
    public $totalCount;

    // 权益使用有效期右闭区间
    /**
     * @example 1612926693000
     * @var integer
     */
    public $useValidNotAfter;

    // 权益使用有效期左闭区间
    /**
     * @example 1581304293000
     * @var integer
     */
    public $useValidNotBefore;

    // 权益兑换有效期右闭区间
    /**
     * @example 1612926693000
     * @var integer
     */
    public $validNotAfter;

    // 权益兑换有效期左闭区间
    /**
     * @example 1581304293000
     * @var integer
     */
    public $validNotBefore;

    // 权益面值
    /**
     * @example 10.0000
     * @var string
     */
    public $value;

}
