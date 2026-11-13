<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVE\Models;

use AlibabaCloud\Tea\Model;

class Error extends Model {
    protected $_name = [
        'code' => 'code',
        'message' => 'message',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Error
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['code'])){
            $model->code = $map['code'];
        }
        if(isset($map['message'])){
            $model->message = $map['message'];
        }
        return $model;
    }
    // 错误码
    /**
     * @example INVALID_PARAMETER
     * @var string
     */
    public $code;

    // 错误信息
    /**
     * @example 参数无效
     * @var string
     */
    public $message;

}
