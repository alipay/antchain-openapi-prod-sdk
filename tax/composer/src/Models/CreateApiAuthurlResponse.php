<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class CreateApiAuthurlResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 订单号
    /**
     * @var string
     */
    public $orderNo;

    // 短链接地址
    /**
     * @var string
     */
    public $loginUrl;

    // 授权原始链接
    /**
     * @var string
     */
    public $originLoginUrl;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'orderNo'        => 'order_no',
        'loginUrl'       => 'login_url',
        'originLoginUrl' => 'origin_login_url',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->loginUrl) {
            $res['login_url'] = $this->loginUrl;
        }
        if (null !== $this->originLoginUrl) {
            $res['origin_login_url'] = $this->originLoginUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateApiAuthurlResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['login_url'])) {
            $model->loginUrl = $map['login_url'];
        }
        if (isset($map['origin_login_url'])) {
            $model->originLoginUrl = $map['origin_login_url'];
        }

        return $model;
    }
}
