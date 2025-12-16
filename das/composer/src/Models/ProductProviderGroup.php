<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class ProductProviderGroup extends Model
{
    // 产品供应商信息
    /**
     * @example -
     *
     * @var ProductProviderInfo[]
     */
    public $productProviderList;

    // 数据产品入参,JSON数组
    /**
     * @example -
     *
     * @var string
     */
    public $productParam;

    // C端展示授权内容code
    /**
     * @example -
     *
     * @var string
     */
    public $authContentCode;
    protected $_name = [
        'productProviderList' => 'product_provider_list',
        'productParam'        => 'product_param',
        'authContentCode'     => 'auth_content_code',
    ];

    public function validate()
    {
        Model::validateRequired('productProviderList', $this->productProviderList, true);
        Model::validateRequired('productParam', $this->productParam, true);
        Model::validateRequired('authContentCode', $this->authContentCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->productProviderList) {
            $res['product_provider_list'] = [];
            if (null !== $this->productProviderList && \is_array($this->productProviderList)) {
                $n = 0;
                foreach ($this->productProviderList as $item) {
                    $res['product_provider_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->productParam) {
            $res['product_param'] = $this->productParam;
        }
        if (null !== $this->authContentCode) {
            $res['auth_content_code'] = $this->authContentCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProductProviderGroup
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['product_provider_list'])) {
            if (!empty($map['product_provider_list'])) {
                $model->productProviderList = [];
                $n                          = 0;
                foreach ($map['product_provider_list'] as $item) {
                    $model->productProviderList[$n++] = null !== $item ? ProductProviderInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['product_param'])) {
            $model->productParam = $map['product_param'];
        }
        if (isset($map['auth_content_code'])) {
            $model->authContentCode = $map['auth_content_code'];
        }

        return $model;
    }
}
