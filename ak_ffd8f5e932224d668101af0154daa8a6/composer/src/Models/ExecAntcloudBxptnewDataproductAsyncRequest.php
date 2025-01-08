<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ffd8f5e932224d668101af0154daa8a6\Models;

use AlibabaCloud\Tea\Model;

class ExecAntcloudBxptnewDataproductAsyncRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 数据产品编码
    /**
     * @var string
     */
    public $productCode;

    // 产品类型
    //
    /**
     * @var string
     */
    public $productType;

    // 请求ID，调用方需要确保唯一
    //
    /**
     * @var string
     */
    public $requestId;

    // 业务入参的json字符串
    //
    /**
     * @var string
     */
    public $bizContent;
    protected $_name = [
        'authToken'   => 'auth_token',
        'productCode' => 'product_code',
        'productType' => 'product_type',
        'requestId'   => 'request_id',
        'bizContent'  => 'biz_content',
    ];

    public function validate()
    {
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('productType', $this->productType, true);
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('bizContent', $this->bizContent, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->productType) {
            $res['product_type'] = $this->productType;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->bizContent) {
            $res['biz_content'] = $this->bizContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecAntcloudBxptnewDataproductAsyncRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['product_type'])) {
            $model->productType = $map['product_type'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['biz_content'])) {
            $model->bizContent = $map['biz_content'];
        }

        return $model;
    }
}
