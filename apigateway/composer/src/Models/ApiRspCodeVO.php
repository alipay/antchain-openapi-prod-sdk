<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class ApiRspCodeVO extends Model
{
    // error_code
    /**
     * @example error_code
     *
     * @var string
     */
    public $errorCode;

    // error_msg
    /**
     * @example error_msg
     *
     * @var string
     */
    public $errorMsg;

    // error_desc
    /**
     * @example error_desc
     *
     * @var string
     */
    public $errorDesc;
    protected $_name = [
        'errorCode' => 'error_code',
        'errorMsg'  => 'error_msg',
        'errorDesc' => 'error_desc',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->errorMsg) {
            $res['error_msg'] = $this->errorMsg;
        }
        if (null !== $this->errorDesc) {
            $res['error_desc'] = $this->errorDesc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiRspCodeVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }
        if (isset($map['error_msg'])) {
            $model->errorMsg = $map['error_msg'];
        }
        if (isset($map['error_desc'])) {
            $model->errorDesc = $map['error_desc'];
        }

        return $model;
    }
}
