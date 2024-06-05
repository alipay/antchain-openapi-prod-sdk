<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models;

use AlibabaCloud\Tea\Model;

class NotifyBlockchainBotDigitalkeyWithholdRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 商户请求号。 由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复
    /**
     * @var string
     */
    public $outRequestNo;

    // 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
    /**
     * @var int
     */
    public $totalAmount;

    // 代扣协议号, 对应于签约时，支付宝返回的协议
    /**
     * @var string
     */
    public $agreementNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outRequestNo'      => 'out_request_no',
        'totalAmount'       => 'total_amount',
        'agreementNo'       => 'agreement_no',
    ];

    public function validate()
    {
        Model::validateRequired('outRequestNo', $this->outRequestNo, true);
        Model::validateRequired('totalAmount', $this->totalAmount, true);
        Model::validateRequired('agreementNo', $this->agreementNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->outRequestNo) {
            $res['out_request_no'] = $this->outRequestNo;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->agreementNo) {
            $res['agreement_no'] = $this->agreementNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotifyBlockchainBotDigitalkeyWithholdRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['out_request_no'])) {
            $model->outRequestNo = $map['out_request_no'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }
        if (isset($map['agreement_no'])) {
            $model->agreementNo = $map['agreement_no'];
        }

        return $model;
    }
}
