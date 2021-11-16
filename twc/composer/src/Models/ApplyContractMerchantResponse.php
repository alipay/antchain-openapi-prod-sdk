<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ApplyContractMerchantResponse extends Model
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

    // 是否进件成功
    /**
     * @var bool
     */
    public $success;

    // 进件子结果码，0 成功，1 代理商户已进件，2 商户已进件，请走挂接接口进行代理商挂接，3 商户进件中
    /**
     * @var int
     */
    public $subCode;

    // 进件失败原因
    /**
     * @var string
     */
    public $subMsg;

    // 已进件商户信息（当cert_no对应的商户已经进件过，会返回完整的已进件的商户信息）
    /**
     * @var string
     */
    public $merchantInfo;

    // 已进件成功的商户ID（当cert_no表示的商户已经进件过，会返回进件生成的商户ID）
    /**
     * @var string
     */
    public $smid;

    // 订单ID
    /**
     * @var string
     */
    public $orderId;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'success'      => 'success',
        'subCode'      => 'sub_code',
        'subMsg'       => 'sub_msg',
        'merchantInfo' => 'merchant_info',
        'smid'         => 'smid',
        'orderId'      => 'order_id',
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
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->subCode) {
            $res['sub_code'] = $this->subCode;
        }
        if (null !== $this->subMsg) {
            $res['sub_msg'] = $this->subMsg;
        }
        if (null !== $this->merchantInfo) {
            $res['merchant_info'] = $this->merchantInfo;
        }
        if (null !== $this->smid) {
            $res['smid'] = $this->smid;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyContractMerchantResponse
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
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['sub_code'])) {
            $model->subCode = $map['sub_code'];
        }
        if (isset($map['sub_msg'])) {
            $model->subMsg = $map['sub_msg'];
        }
        if (isset($map['merchant_info'])) {
            $model->merchantInfo = $map['merchant_info'];
        }
        if (isset($map['smid'])) {
            $model->smid = $map['smid'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }

        return $model;
    }
}
