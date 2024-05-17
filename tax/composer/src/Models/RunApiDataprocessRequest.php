<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class RunApiDataprocessRequest extends Model
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

    // 请求参数json
    /**
     * @var string
     */
    public $bizParam;

    // 产品code
    /**
     * @var string
     */
    public $productCode;

    // 调用的方法
    /**
     * @var string
     */
    public $methodCode;

    // 租户编码
    /**
     * @var string
     */
    public $instCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizParam'          => 'biz_param',
        'productCode'       => 'product_code',
        'methodCode'        => 'method_code',
        'instCode'          => 'inst_code',
    ];

    public function validate()
    {
        Model::validateRequired('bizParam', $this->bizParam, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('methodCode', $this->methodCode, true);
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
        if (null !== $this->bizParam) {
            $res['biz_param'] = $this->bizParam;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->methodCode) {
            $res['method_code'] = $this->methodCode;
        }
        if (null !== $this->instCode) {
            $res['inst_code'] = $this->instCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RunApiDataprocessRequest
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
        if (isset($map['biz_param'])) {
            $model->bizParam = $map['biz_param'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['method_code'])) {
            $model->methodCode = $map['method_code'];
        }
        if (isset($map['inst_code'])) {
            $model->instCode = $map['inst_code'];
        }

        return $model;
    }
}
