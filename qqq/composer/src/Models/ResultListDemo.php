<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMOSDK\Models;

use AlibabaCloud\Tea\Model;

class ResultListDemo extends Model
{
    // 返回结果码
    /**
     * @example {"name":"value"}
     *
     * @var AbcDemoStruct
     */
    public $code;

    // 返回结果
    /**
     * @example {"name":{"key":"value"}}
     *
     * @var AbcDemoStruct
     */
    public $data;

    // 返回信息
    /**
     * @example {"message":"success"}
     *
     * @var AbcDemoStruct
     */
    public $message;
    protected $_name = [
        'code'    => 'code',
        'data'    => 'data',
        'message' => 'message',
    ];

    public function validate()
    {
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('data', $this->data, true);
        Model::validateRequired('message', $this->message, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = null !== $this->code ? $this->code->toMap() : null;
        }
        if (null !== $this->data) {
            $res['data'] = null !== $this->data ? $this->data->toMap() : null;
        }
        if (null !== $this->message) {
            $res['message'] = null !== $this->message ? $this->message->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ResultListDemo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['code'])) {
            $model->code = AbcDemoStruct::fromMap($map['code']);
        }
        if (isset($map['data'])) {
            $model->data = AbcDemoStruct::fromMap($map['data']);
        }
        if (isset($map['message'])) {
            $model->message = AbcDemoStruct::fromMap($map['message']);
        }

        return $model;
    }
}
