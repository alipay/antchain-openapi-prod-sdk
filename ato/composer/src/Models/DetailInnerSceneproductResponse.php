<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class DetailInnerSceneproductResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 商品id
    /**
     * @var string
     */
    public $platformProductId;

    // 一级分类
    /**
     * @var string
     */
    public $primaryCategory;

    // 二级分类
    /**
     * @var string
     */
    public $secondaryCategory;

    // 商品名称
    /**
     * @var string
     */
    public $productName;

    // 商品成色
    /**
     * @var string
     */
    public $productCondition;

    // 商品描述
    /**
     * @var string
     */
    public $productDescription;

    // 商品封面图
    /**
     * @var string[]
     */
    public $coverImageUrlList;

    // 商品封面图
    /**
     * @var string[]
     */
    public $largeCoverImageUrlList;

    // 商品详情图
    /**
     * @var string[]
     */
    public $detailImageUrlList;

    // 商品详情图
    /**
     * @var string[]
     */
    public $largeDetailImageUrlList;

    // 商品规格
    /**
     * @var ProductSpecConfig[]
     */
    public $specConfigList;

    // 报名商家租赁属性信息列表
    /**
     * @var SignMerchantLeaseConfig[]
     */
    public $signMerchantLeaseConfigList;

    // 适用商家列表
    /**
     * @var SignProductMerchant[]
     */
    public $applyProductMerchantList;

    // 适用商家租赁属性信息列表
    /**
     * @var SignMerchantLeaseConfig[]
     */
    public $applyMerchantLeaseConfigList;

    // 推广场景
    /**
     * @var string
     */
    public $sceneName;

    // 场景商品上架状态
    /**
     * @var string
     */
    public $displayStatus;

    // 推广模式
    /**
     * @var string
     */
    public $deliveryMode;

    // 添加标志
    /**
     * @var bool
     */
    public $addedFlag;
    protected $_name = [
        'reqMsgId'                     => 'req_msg_id',
        'resultCode'                   => 'result_code',
        'resultMsg'                    => 'result_msg',
        'platformProductId'            => 'platform_product_id',
        'primaryCategory'              => 'primary_category',
        'secondaryCategory'            => 'secondary_category',
        'productName'                  => 'product_name',
        'productCondition'             => 'product_condition',
        'productDescription'           => 'product_description',
        'coverImageUrlList'            => 'cover_image_url_list',
        'largeCoverImageUrlList'       => 'large_cover_image_url_list',
        'detailImageUrlList'           => 'detail_image_url_list',
        'largeDetailImageUrlList'      => 'large_detail_image_url_list',
        'specConfigList'               => 'spec_config_list',
        'signMerchantLeaseConfigList'  => 'sign_merchant_lease_config_list',
        'applyProductMerchantList'     => 'apply_product_merchant_list',
        'applyMerchantLeaseConfigList' => 'apply_merchant_lease_config_list',
        'sceneName'                    => 'scene_name',
        'displayStatus'                => 'display_status',
        'deliveryMode'                 => 'delivery_mode',
        'addedFlag'                    => 'added_flag',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->platformProductId) {
            $res['platform_product_id'] = $this->platformProductId;
        }
        if (null !== $this->primaryCategory) {
            $res['primary_category'] = $this->primaryCategory;
        }
        if (null !== $this->secondaryCategory) {
            $res['secondary_category'] = $this->secondaryCategory;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->productCondition) {
            $res['product_condition'] = $this->productCondition;
        }
        if (null !== $this->productDescription) {
            $res['product_description'] = $this->productDescription;
        }
        if (null !== $this->coverImageUrlList) {
            $res['cover_image_url_list'] = $this->coverImageUrlList;
        }
        if (null !== $this->largeCoverImageUrlList) {
            $res['large_cover_image_url_list'] = $this->largeCoverImageUrlList;
        }
        if (null !== $this->detailImageUrlList) {
            $res['detail_image_url_list'] = $this->detailImageUrlList;
        }
        if (null !== $this->largeDetailImageUrlList) {
            $res['large_detail_image_url_list'] = $this->largeDetailImageUrlList;
        }
        if (null !== $this->specConfigList) {
            $res['spec_config_list'] = [];
            if (null !== $this->specConfigList && \is_array($this->specConfigList)) {
                $n = 0;
                foreach ($this->specConfigList as $item) {
                    $res['spec_config_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->signMerchantLeaseConfigList) {
            $res['sign_merchant_lease_config_list'] = [];
            if (null !== $this->signMerchantLeaseConfigList && \is_array($this->signMerchantLeaseConfigList)) {
                $n = 0;
                foreach ($this->signMerchantLeaseConfigList as $item) {
                    $res['sign_merchant_lease_config_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->applyProductMerchantList) {
            $res['apply_product_merchant_list'] = [];
            if (null !== $this->applyProductMerchantList && \is_array($this->applyProductMerchantList)) {
                $n = 0;
                foreach ($this->applyProductMerchantList as $item) {
                    $res['apply_product_merchant_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->applyMerchantLeaseConfigList) {
            $res['apply_merchant_lease_config_list'] = [];
            if (null !== $this->applyMerchantLeaseConfigList && \is_array($this->applyMerchantLeaseConfigList)) {
                $n = 0;
                foreach ($this->applyMerchantLeaseConfigList as $item) {
                    $res['apply_merchant_lease_config_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->sceneName) {
            $res['scene_name'] = $this->sceneName;
        }
        if (null !== $this->displayStatus) {
            $res['display_status'] = $this->displayStatus;
        }
        if (null !== $this->deliveryMode) {
            $res['delivery_mode'] = $this->deliveryMode;
        }
        if (null !== $this->addedFlag) {
            $res['added_flag'] = $this->addedFlag;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailInnerSceneproductResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['platform_product_id'])) {
            $model->platformProductId = $map['platform_product_id'];
        }
        if (isset($map['primary_category'])) {
            $model->primaryCategory = $map['primary_category'];
        }
        if (isset($map['secondary_category'])) {
            $model->secondaryCategory = $map['secondary_category'];
        }
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['product_condition'])) {
            $model->productCondition = $map['product_condition'];
        }
        if (isset($map['product_description'])) {
            $model->productDescription = $map['product_description'];
        }
        if (isset($map['cover_image_url_list'])) {
            if (!empty($map['cover_image_url_list'])) {
                $model->coverImageUrlList = $map['cover_image_url_list'];
            }
        }
        if (isset($map['large_cover_image_url_list'])) {
            if (!empty($map['large_cover_image_url_list'])) {
                $model->largeCoverImageUrlList = $map['large_cover_image_url_list'];
            }
        }
        if (isset($map['detail_image_url_list'])) {
            if (!empty($map['detail_image_url_list'])) {
                $model->detailImageUrlList = $map['detail_image_url_list'];
            }
        }
        if (isset($map['large_detail_image_url_list'])) {
            if (!empty($map['large_detail_image_url_list'])) {
                $model->largeDetailImageUrlList = $map['large_detail_image_url_list'];
            }
        }
        if (isset($map['spec_config_list'])) {
            if (!empty($map['spec_config_list'])) {
                $model->specConfigList = [];
                $n                     = 0;
                foreach ($map['spec_config_list'] as $item) {
                    $model->specConfigList[$n++] = null !== $item ? ProductSpecConfig::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['sign_merchant_lease_config_list'])) {
            if (!empty($map['sign_merchant_lease_config_list'])) {
                $model->signMerchantLeaseConfigList = [];
                $n                                  = 0;
                foreach ($map['sign_merchant_lease_config_list'] as $item) {
                    $model->signMerchantLeaseConfigList[$n++] = null !== $item ? SignMerchantLeaseConfig::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['apply_product_merchant_list'])) {
            if (!empty($map['apply_product_merchant_list'])) {
                $model->applyProductMerchantList = [];
                $n                               = 0;
                foreach ($map['apply_product_merchant_list'] as $item) {
                    $model->applyProductMerchantList[$n++] = null !== $item ? SignProductMerchant::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['apply_merchant_lease_config_list'])) {
            if (!empty($map['apply_merchant_lease_config_list'])) {
                $model->applyMerchantLeaseConfigList = [];
                $n                                   = 0;
                foreach ($map['apply_merchant_lease_config_list'] as $item) {
                    $model->applyMerchantLeaseConfigList[$n++] = null !== $item ? SignMerchantLeaseConfig::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['scene_name'])) {
            $model->sceneName = $map['scene_name'];
        }
        if (isset($map['display_status'])) {
            $model->displayStatus = $map['display_status'];
        }
        if (isset($map['delivery_mode'])) {
            $model->deliveryMode = $map['delivery_mode'];
        }
        if (isset($map['added_flag'])) {
            $model->addedFlag = $map['added_flag'];
        }

        return $model;
    }
}
