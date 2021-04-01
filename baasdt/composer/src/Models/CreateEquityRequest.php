<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class CreateEquityRequest extends Model
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

    // 授权类型 0 Auto，1Contract
    /**
     * @var int
     */
    public $authType;

    // 链ID
    /**
     * @var string
     */
    public $chainId;

    // 结算币种
    /**
     * @var string
     */
    public $currency;

    // 权益价格（单位：元）
    /**
     * @var string
     */
    public $defaultPrice;

    // 代理操作专用，要代理操作的租户ID
    /**
     * @var string
     */
    public $delegatedTenantId;

    // 权益商品详情信息
    /**
     * @var string
     */
    public $description;

    // 权益商品详情图。上传仅接受链接，请使用OSS存储服务上传图片(;分隔)
    /**
     * @var string
     */
    public $descImages;

    // 权益商品名称
    /**
     * @var string
     */
    public $equityName;

    // 权益商品类型：类型为整型（不大于：2147483647），需要进行细分，类型由三部分组成；aabbbbcccc。aa 为大类分类，bbbb 为细项分类（无细项分类时为0000），cccc 为数据格式分类（其中0000表示无格式要求）。请根据实际商品类型填写，具体类型和兑换时数据结构查看文档【https://tech.antfin.com/docs/2/163896】 。不可修改，如需修改需重新发布商品
    /**
     * @var int
     */
    public $equityType;

    // 字段决定权益商品是否全量链上客户可见，当选择权益为false时，需要使用baas.antdao.equity.merchant.open接口增加权益商品可见客户
    /**
     * @var bool
     */
    public $ifPublic;

    // 权益商品主图。上传仅接受链接，请使用OSS存储服务上传图片(;分隔)
    /**
     * @var string
     */
    public $images;

    // 商户每日兑换上限
    /**
     * @var int
     */
    public $limitPerMerchantAndDay;

    // 商户每月兑换上限
    /**
     * @var int
     */
    public $limitPerMerchantAndMonth;

    // 用户每日兑换上限
    /**
     * @var int
     */
    public $limitPerUserAndDay;

    // 用户每月兑换上限
    /**
     * @var int
     */
    public $limitPerUserAndMonth;

    // 若需要兑换方提供的特殊信息，可增加在备注字段，并要求兑换方是否传入（按照需求方自定义内容信息）
    // - 如必须传入证件号，手机号信息，则权益需要通过运营平台审核，非必须采集信息将拒绝上架
    /**
     * @var string
     */
    public $memo;

    // 外部交易ID
    /**
     * @var string
     */
    public $outTxId;

    // 权益商品库存数量
    /**
     * @var string
     */
    public $totalCount;

    // 权益商品使用有效期结束时间（毫秒）
    /**
     * @var int
     */
    public $useValidNotAfter;

    // 权益商品使用有效期开始时间（毫秒）
    /**
     * @var int
     */
    public $useValidNotBefore;

    // 权益商品兑换有效期结束时间（毫秒）
    /**
     * @var int
     */
    public $validNotAfter;

    // 权益商品兑换有效期开始时间（毫秒）
    /**
     * @var int
     */
    public $validNotBefore;

    // 权益商品面值（单位：元）
    /**
     * @var string
     */
    public $value;
    protected $_name = [
        'authToken'                => 'auth_token',
        'productInstanceId'        => 'product_instance_id',
        'authType'                 => 'auth_type',
        'chainId'                  => 'chain_id',
        'currency'                 => 'currency',
        'defaultPrice'             => 'default_price',
        'delegatedTenantId'        => 'delegated_tenant_id',
        'description'              => 'description',
        'descImages'               => 'desc_images',
        'equityName'               => 'equity_name',
        'equityType'               => 'equity_type',
        'ifPublic'                 => 'if_public',
        'images'                   => 'images',
        'limitPerMerchantAndDay'   => 'limit_per_merchant_and_day',
        'limitPerMerchantAndMonth' => 'limit_per_merchant_and_month',
        'limitPerUserAndDay'       => 'limit_per_user_and_day',
        'limitPerUserAndMonth'     => 'limit_per_user_and_month',
        'memo'                     => 'memo',
        'outTxId'                  => 'out_tx_id',
        'totalCount'               => 'total_count',
        'useValidNotAfter'         => 'use_valid_not_after',
        'useValidNotBefore'        => 'use_valid_not_before',
        'validNotAfter'            => 'valid_not_after',
        'validNotBefore'           => 'valid_not_before',
        'value'                    => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('authType', $this->authType, true);
        Model::validateRequired('chainId', $this->chainId, true);
        Model::validateRequired('currency', $this->currency, true);
        Model::validateRequired('defaultPrice', $this->defaultPrice, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('descImages', $this->descImages, true);
        Model::validateRequired('equityName', $this->equityName, true);
        Model::validateRequired('equityType', $this->equityType, true);
        Model::validateRequired('ifPublic', $this->ifPublic, true);
        Model::validateRequired('images', $this->images, true);
        Model::validateRequired('limitPerMerchantAndDay', $this->limitPerMerchantAndDay, true);
        Model::validateRequired('limitPerMerchantAndMonth', $this->limitPerMerchantAndMonth, true);
        Model::validateRequired('limitPerUserAndDay', $this->limitPerUserAndDay, true);
        Model::validateRequired('limitPerUserAndMonth', $this->limitPerUserAndMonth, true);
        Model::validateRequired('outTxId', $this->outTxId, true);
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
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->defaultPrice) {
            $res['default_price'] = $this->defaultPrice;
        }
        if (null !== $this->delegatedTenantId) {
            $res['delegated_tenant_id'] = $this->delegatedTenantId;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->descImages) {
            $res['desc_images'] = $this->descImages;
        }
        if (null !== $this->equityName) {
            $res['equity_name'] = $this->equityName;
        }
        if (null !== $this->equityType) {
            $res['equity_type'] = $this->equityType;
        }
        if (null !== $this->ifPublic) {
            $res['if_public'] = $this->ifPublic;
        }
        if (null !== $this->images) {
            $res['images'] = $this->images;
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
        if (null !== $this->outTxId) {
            $res['out_tx_id'] = $this->outTxId;
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
     * @return CreateEquityRequest
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
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }
        if (isset($map['chain_id'])) {
            $model->chainId = $map['chain_id'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['default_price'])) {
            $model->defaultPrice = $map['default_price'];
        }
        if (isset($map['delegated_tenant_id'])) {
            $model->delegatedTenantId = $map['delegated_tenant_id'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['desc_images'])) {
            $model->descImages = $map['desc_images'];
        }
        if (isset($map['equity_name'])) {
            $model->equityName = $map['equity_name'];
        }
        if (isset($map['equity_type'])) {
            $model->equityType = $map['equity_type'];
        }
        if (isset($map['if_public'])) {
            $model->ifPublic = $map['if_public'];
        }
        if (isset($map['images'])) {
            $model->images = $map['images'];
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
        if (isset($map['out_tx_id'])) {
            $model->outTxId = $map['out_tx_id'];
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
