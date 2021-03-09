<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class IaasRequest extends Model
{
    // requestMethod
    /**
     * @example requestMethod
     *
     * @var string
     */
    public $requestMethod;

    // requestUrl
    /**
     * @example requestUrl
     *
     * @var string
     */
    public $requestUrl;

    // requestBody
    /**
     * @example requestBody
     *
     * @var string
     */
    public $requestBody;

    // request_headers
    /**
     * @example
     *
     * @var MapStringToStringEntity[]
     */
    public $requestHeaders;
    protected $_name = [
        'requestMethod'  => 'request_method',
        'requestUrl'     => 'request_url',
        'requestBody'    => 'request_body',
        'requestHeaders' => 'request_headers',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->requestMethod) {
            $res['request_method'] = $this->requestMethod;
        }
        if (null !== $this->requestUrl) {
            $res['request_url'] = $this->requestUrl;
        }
        if (null !== $this->requestBody) {
            $res['request_body'] = $this->requestBody;
        }
        if (null !== $this->requestHeaders) {
            $res['request_headers'] = [];
            if (null !== $this->requestHeaders && \is_array($this->requestHeaders)) {
                $n = 0;
                foreach ($this->requestHeaders as $item) {
                    $res['request_headers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IaasRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['request_method'])) {
            $model->requestMethod = $map['request_method'];
        }
        if (isset($map['request_url'])) {
            $model->requestUrl = $map['request_url'];
        }
        if (isset($map['request_body'])) {
            $model->requestBody = $map['request_body'];
        }
        if (isset($map['request_headers'])) {
            if (!empty($map['request_headers'])) {
                $model->requestHeaders = [];
                $n                     = 0;
                foreach ($map['request_headers'] as $item) {
                    $model->requestHeaders[$n++] = null !== $item ? MapStringToStringEntity::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
