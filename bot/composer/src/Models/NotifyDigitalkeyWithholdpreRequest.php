<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class NotifyDigitalkeyWithholdpreRequest extends Model
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

    // 代扣协议中标示用户的唯一签约号(确保在商户系统中唯一)，传入签约时传入的签约号。
    /**
     * @var string
     */
    public $externalAgreementNo;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'outRequestNo'        => 'out_request_no',
        'totalAmount'         => 'total_amount',
        'externalAgreementNo' => 'external_agreement_no',
    ];

    public function validate()
    {
        Model::validateRequired('outRequestNo', $this->outRequestNo, true);
        Model::validateRequired('totalAmount', $this->totalAmount, true);
        Model::validateRequired('externalAgreementNo', $this->externalAgreementNo, true);
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
        if (null !== $this->externalAgreementNo) {
            $res['external_agreement_no'] = $this->externalAgreementNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotifyDigitalkeyWithholdpreRequest
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
        if (isset($map['external_agreement_no'])) {
            $model->externalAgreementNo = $map['external_agreement_no'];
        }

        return $model;
    }
}
