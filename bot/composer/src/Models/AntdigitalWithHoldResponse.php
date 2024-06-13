<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class AntdigitalWithHoldResponse extends Model
{
    // 网关返回码
    /**
     * @example 10000
     *
     * @var string
     */
    public $code;

    // 网关返回码描述
    /**
     * @example Business Failed
     *
     * @var string
     */
    public $msg;

    // 务返回码
    /**
     * @example ACQ.TRADE_HAS_SUCCESS
     *
     * @var string
     */
    public $subCode;

    // 业务返回码描述
    /**
     * @example 交易已被支付
     *
     * @var string
     */
    public $subMsg;

    // 结果返回内容
    /**
     * @example {__}
     *
     * @var string
     */
    public $data;

    // 响应签名
    /**
     * @example DZXh8eeTuAHoYE3w1J+POiPhfDxOYBfUNn1lkeT/V7P4zJdyojWEa6IZs6Hz0yDW5Cp/viufUb5I0/V5WENS3OYR8zRedqo6D+fUTdLHdc+EFyCkiQhBxIzgngPdPdfp1PIS7BdhhzrsZHbRqb7o4k3Dxc+AAnFauu4V6Zdwczo=
     *
     * @var string
     */
    public $signature;
    protected $_name = [
        'code'      => 'code',
        'msg'       => 'msg',
        'subCode'   => 'sub_code',
        'subMsg'    => 'sub_msg',
        'data'      => 'data',
        'signature' => 'signature',
    ];

    public function validate()
    {
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('msg', $this->msg, true);
        Model::validateRequired('subCode', $this->subCode, true);
        Model::validateRequired('subMsg', $this->subMsg, true);
        Model::validateRequired('signature', $this->signature, true);
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
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AntdigitalWithHoldResponse
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
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }

        return $model;
    }
}
