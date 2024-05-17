<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class JudgeApiDataprocessRequest extends Model
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

    // 产品编码
    /**
     * @var string
     */
    public $productCode;

    // 租户code
    /**
     * @var string
     */
    public $instCode;

    // 业务参数
    /**
     * @var string
     */
    public $param;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'productCode'       => 'product_code',
        'instCode'          => 'inst_code',
        'param'             => 'param',
    ];

    public function validate()
    {
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('instCode', $this->instCode, true);
        Model::validateRequired('param', $this->param, true);
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
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->instCode) {
            $res['inst_code'] = $this->instCode;
        }
        if (null !== $this->param) {
            $res['param'] = $this->param;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return JudgeApiDataprocessRequest
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
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['inst_code'])) {
            $model->instCode = $map['inst_code'];
        }
        if (isset($map['param'])) {
            $model->param = $map['param'];
        }

        return $model;
    }
}
