<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models;

use AlibabaCloud\Tea\Model;

class RequestHead extends Model
{
    // 请求唯一标识
    /**
     * @example 91440300892305861T
     *
     * @var string
     */
    public $requestId;

    // 客户身份标识ID
    /**
     * @example 91440300892305861T
     *
     * @var string
     */
    public $secretId;

    // 客户签约产品code
    /**
     * @example RDDB04201PR
     *
     * @var string
     */
    public $productCode;

    // response输出类型，默认json
    /**
     * @example "tlv"
     *
     * @var string
     */
    public $formatType;

    // false
    /**
     * @example true, false
     *
     * @var bool
     */
    public $onlineFlag;
    protected $_name = [
        'requestId'   => 'request_id',
        'secretId'    => 'secret_id',
        'productCode' => 'product_code',
        'formatType'  => 'format_type',
        'onlineFlag'  => 'online_flag',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('secretId', $this->secretId, true);
        Model::validateRequired('productCode', $this->productCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->secretId) {
            $res['secret_id'] = $this->secretId;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->formatType) {
            $res['format_type'] = $this->formatType;
        }
        if (null !== $this->onlineFlag) {
            $res['online_flag'] = $this->onlineFlag;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RequestHead
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['secret_id'])) {
            $model->secretId = $map['secret_id'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['format_type'])) {
            $model->formatType = $map['format_type'];
        }
        if (isset($map['online_flag'])) {
            $model->onlineFlag = $map['online_flag'];
        }

        return $model;
    }
}
