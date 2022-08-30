<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_2fdfc04b2afb4da9ac403531af8942a9\Models;

use AlibabaCloud\Tea\Model;

class ResultModel extends Model
{
    // 返回结果
    /**
     * @example 1
     *
     * @var int
     */
    public $code;

    // 返回错误信息
    /**
     * @example 123
     *
     * @var string
     */
    public $errMsg;

    // 返回具体结果
    /**
     * @example 123
     *
     * @var string
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
            $res['model'] = $this->model;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ResultModel
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
            $model->model = $map['model'];
        }

        return $model;
    }
}
