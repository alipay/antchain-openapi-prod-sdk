<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class GetEmbedoemautoinsuranceUrlRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 调用方生成的唯一编码，参考格式： yyyyMMdd_xxxxx，已接口请求的当前日期开头；
    /**
     * @var string
     */
    public $requestNo;

    // 产品编码
    /**
     * @var string
     */
    public $productCode;

    // 业务参数，json格式
    /**
     * @var string
     */
    public $bizInfo;
    protected $_name = [
        'authToken'   => 'auth_token',
        'requestNo'   => 'request_no',
        'productCode' => 'product_code',
        'bizInfo'     => 'biz_info',
    ];

    public function validate()
    {
        Model::validateRequired('requestNo', $this->requestNo, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('bizInfo', $this->bizInfo, true);
        Model::validateMaxLength('requestNo', $this->requestNo, 128);
        Model::validateMaxLength('productCode', $this->productCode, 64);
        Model::validateMaxLength('bizInfo', $this->bizInfo, 1000);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->requestNo) {
            $res['request_no'] = $this->requestNo;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->bizInfo) {
            $res['biz_info'] = $this->bizInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetEmbedoemautoinsuranceUrlRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['request_no'])) {
            $model->requestNo = $map['request_no'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['biz_info'])) {
            $model->bizInfo = $map['biz_info'];
        }

        return $model;
    }
}
