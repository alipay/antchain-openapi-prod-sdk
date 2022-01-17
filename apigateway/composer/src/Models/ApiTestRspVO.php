<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class ApiTestRspVO extends Model
{
    // code
    /**
     * @example code1
     *
     * @var string
     */
    public $code;

    // cost
    /**
     * @example 1000
     *
     * @var int
     */
    public $cost;

    // size
    /**
     * @example 1000
     *
     * @var int
     */
    public $size;

    // payload
    /**
     * @example payload1
     *
     * @var string
     */
    public $payload;

    // headers
    /**
     * @example
     *
     * @var ApiTestParamVO[]
     */
    public $headers;
    protected $_name = [
        'code'    => 'code',
        'cost'    => 'cost',
        'size'    => 'size',
        'payload' => 'payload',
        'headers' => 'headers',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->cost) {
            $res['cost'] = $this->cost;
        }
        if (null !== $this->size) {
            $res['size'] = $this->size;
        }
        if (null !== $this->payload) {
            $res['payload'] = $this->payload;
        }
        if (null !== $this->headers) {
            $res['headers'] = [];
            if (null !== $this->headers && \is_array($this->headers)) {
                $n = 0;
                foreach ($this->headers as $item) {
                    $res['headers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiTestRspVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['cost'])) {
            $model->cost = $map['cost'];
        }
        if (isset($map['size'])) {
            $model->size = $map['size'];
        }
        if (isset($map['payload'])) {
            $model->payload = $map['payload'];
        }
        if (isset($map['headers'])) {
            if (!empty($map['headers'])) {
                $model->headers = [];
                $n              = 0;
                foreach ($map['headers'] as $item) {
                    $model->headers[$n++] = null !== $item ? ApiTestParamVO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
