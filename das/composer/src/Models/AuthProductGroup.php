<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class AuthProductGroup extends Model
{
    // 产品code列表
    /**
     * @example -
     *
     * @var string[]
     */
    public $productCodeList;

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
        'productCodeList' => 'product_code_list',
        'productParam'    => 'product_param',
        'authContentCode' => 'auth_content_code',
    ];

    public function validate()
    {
        Model::validateRequired('productCodeList', $this->productCodeList, true);
        Model::validateRequired('productParam', $this->productParam, true);
        Model::validateRequired('authContentCode', $this->authContentCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->productCodeList) {
            $res['product_code_list'] = $this->productCodeList;
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
     * @return AuthProductGroup
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['product_code_list'])) {
            if (!empty($map['product_code_list'])) {
                $model->productCodeList = $map['product_code_list'];
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
