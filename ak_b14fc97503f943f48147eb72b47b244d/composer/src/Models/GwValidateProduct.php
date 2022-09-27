<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_b14fc97503f943f48147eb72b47b244d\Models;

use AlibabaCloud\Tea\Model;

class GwValidateProduct extends Model
{
    // 核审产品码，支持多种核身产品。
    // ZK_FACE_VERIFY：人脸识别
    /**
     * @example ZK_FACE_VERIFY
     *
     * @var string
     */
    public $productCode;

    // 产品渲染方式：H5、NATIVE 或 PC
    /**
     * @example H5、NATIVE 或 PC
     *
     * @var string
     */
    public $group;

    // 核身产品参数，因网关限制，暂只支持Map<String,String>
    /**
     * @example
     *
     * @var NameValuePair[]
     */
    public $productParams;
    protected $_name = [
        'productCode'   => 'product_code',
        'group'         => 'group',
        'productParams' => 'product_params',
    ];

    public function validate()
    {
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('group', $this->group, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->group) {
            $res['group'] = $this->group;
        }
        if (null !== $this->productParams) {
            $res['product_params'] = [];
            if (null !== $this->productParams && \is_array($this->productParams)) {
                $n = 0;
                foreach ($this->productParams as $item) {
                    $res['product_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GwValidateProduct
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['group'])) {
            $model->group = $map['group'];
        }
        if (isset($map['product_params'])) {
            if (!empty($map['product_params'])) {
                $model->productParams = [];
                $n                    = 0;
                foreach ($map['product_params'] as $item) {
                    $model->productParams[$n++] = null !== $item ? NameValuePair::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
