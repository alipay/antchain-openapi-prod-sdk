<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ffd8f5e932224d668101af0154daa8a6\Models;

use AlibabaCloud\Tea\Model;

class ExecAntcloudBxptnewDataproductRequest extends Model
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

    // 请求ID，调用方需要确保唯一
    /**
     * @var string
     */
    public $requestId;

    // 业务入参的json字符串
    /**
     * @var string
     */
    public $bizContent;
    protected $_name = [
        'authToken'   => 'auth_token',
        'productCode' => 'product_code',
        'requestId'   => 'request_id',
        'bizContent'  => 'biz_content',
    ];

    public function validate()
    {
        Model::validateRequired('productCode', $this->productCode, true);
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
     * @return ExecAntcloudBxptnewDataproductRequest
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
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['biz_content'])) {
            $model->bizContent = $map['biz_content'];
        }

        return $model;
    }
}
