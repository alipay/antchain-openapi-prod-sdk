<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class CommonResponse extends Model
{
    // 结果码
    /**
     * @example 100001
     *
     * @var string
     */
    public $code;

    // 返回码描述
    /**
     * @example 成功
     *
     * @var string
     */
    public $msg;

    // 业务处理结果码
    //
    /**
     * @example fail
     *
     * @var string
     */
    public $subCode;

    // 返回的提示信息
    /**
     * @example 失败
     *
     * @var string
     */
    public $subMsg;

    // 可否重试
    /**
     * @example true, false
     *
     * @var bool
     */
    public $retry;
    protected $_name = [
        'code'    => 'code',
        'msg'     => 'msg',
        'subCode' => 'sub_code',
        'subMsg'  => 'sub_msg',
        'retry'   => 'retry',
    ];

    public function validate()
    {
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('msg', $this->msg, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->msg) {
            $res['msg'] = $this->msg;
        }
        if (null !== $this->subCode) {
            $res['sub_code'] = $this->subCode;
        }
        if (null !== $this->subMsg) {
            $res['sub_msg'] = $this->subMsg;
        }
        if (null !== $this->retry) {
            $res['retry'] = $this->retry;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CommonResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['msg'])) {
            $model->msg = $map['msg'];
        }
        if (isset($map['sub_code'])) {
            $model->subCode = $map['sub_code'];
        }
        if (isset($map['sub_msg'])) {
            $model->subMsg = $map['sub_msg'];
        }
        if (isset($map['retry'])) {
            $model->retry = $map['retry'];
        }

        return $model;
    }
}
