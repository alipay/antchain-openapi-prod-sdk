<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class IaasResponse extends Model
{
    // response_body
    /**
     * @example response_body
     *
     * @var string
     */
    public $responseBody;

    // response_headers
    /**
     * @example
     *
     * @var MapStringToStringEntity[]
     */
    public $responseHeaders;
    protected $_name = [
        'responseBody'    => 'response_body',
        'responseHeaders' => 'response_headers',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->responseBody) {
            $res['response_body'] = $this->responseBody;
        }
        if (null !== $this->responseHeaders) {
            $res['response_headers'] = [];
            if (null !== $this->responseHeaders && \is_array($this->responseHeaders)) {
                $n = 0;
                foreach ($this->responseHeaders as $item) {
                    $res['response_headers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IaasResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['response_body'])) {
            $model->responseBody = $map['response_body'];
        }
        if (isset($map['response_headers'])) {
            if (!empty($map['response_headers'])) {
                $model->responseHeaders = [];
                $n                      = 0;
                foreach ($map['response_headers'] as $item) {
                    $model->responseHeaders[$n++] = null !== $item ? MapStringToStringEntity::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
