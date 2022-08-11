<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_5bb1b66c4aab4cc998c05a36078e45c1\Models;

use AlibabaCloud\Tea\Model;

class ContentQueryResultModel extends Model
{
    // 返回结果码
    /**
     * @example
     *
     * @var int
     */
    public $code;

    // 返回错误码
    /**
     * @example 123
     *
     * @var string
     */
    public $errMsg;

    // 返回结果
    /**
     * @example 13
     *
     * @var SecurityRiskContentResultGetResponse
     */
    public $model;
    protected $_name = [
        'code'   => 'code',
        'errMsg' => 'err_msg',
        'model'  => 'model',
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
        if (null !== $this->errMsg) {
            $res['err_msg'] = $this->errMsg;
        }
        if (null !== $this->model) {
            $res['model'] = null !== $this->model ? $this->model->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContentQueryResultModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['err_msg'])) {
            $model->errMsg = $map['err_msg'];
        }
        if (isset($map['model'])) {
            $model->model = SecurityRiskContentResultGetResponse::fromMap($map['model']);
        }

        return $model;
    }
}
