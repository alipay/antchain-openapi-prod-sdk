<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class TaskErrorDto extends Model {
    protected $_name = [
        'code' => 'code',
        'message' => 'message',
    ];
    public function validate() {
        Model::validateRequired('code', $this->code, true);
    }
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
     * @return TaskErrorDto
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
     * @example 402
     * @var string
     */
    public $code;

    // 错误提示信息
    /**
     * @example 未知异常
     * @var string
     */
    public $message;

}
