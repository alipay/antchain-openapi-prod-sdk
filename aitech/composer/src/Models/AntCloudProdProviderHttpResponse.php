<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class AntCloudProdProviderHttpResponse extends Model
{
    // maya返回结果
    /**
     * @example
     *
     * @var MayaStreamResult
     */
    public $response;

    // 签名
    /**
     * @example 5Okl4F2SNc9L2zrWCF8xZ+QPUyA=
     *
     * @var string
     */
    public $sign;
    protected $_name = [
        'response' => 'response',
        'sign'     => 'sign',
    ];

    public function validate()
    {
        Model::validateRequired('response', $this->response, true);
        Model::validateRequired('sign', $this->sign, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->response) {
            $res['response'] = null !== $this->response ? $this->response->toMap() : null;
        }
        if (null !== $this->sign) {
            $res['sign'] = $this->sign;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AntCloudProdProviderHttpResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['response'])) {
            $model->response = MayaStreamResult::fromMap($map['response']);
        }
        if (isset($map['sign'])) {
            $model->sign = $map['sign'];
        }

        return $model;
    }
}
