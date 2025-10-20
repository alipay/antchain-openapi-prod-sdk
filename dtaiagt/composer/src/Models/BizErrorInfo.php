<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class BizErrorInfo extends Model
{
    // code
    /**
     * @example code
     *
     * @var string
     */
    public $code;

    // 异常信息
    /**
     * @example error_msg
     *
     * @var string
     */
    public $errorMsg;

    // params
    /**
     * @example params
     *
     * @var string
     */
    public $params;
    protected $_name = [
        'code'     => 'code',
        'errorMsg' => 'error_msg',
        'params'   => 'params',
    ];

    public function validate()
    {
        Model::validateRequired('code', $this->code, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->errorMsg) {
            $res['error_msg'] = $this->errorMsg;
        }
        if (null !== $this->params) {
            $res['params'] = $this->params;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BizErrorInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['error_msg'])) {
            $model->errorMsg = $map['error_msg'];
        }
        if (isset($map['params'])) {
            $model->params = $map['params'];
        }

        return $model;
    }
}
