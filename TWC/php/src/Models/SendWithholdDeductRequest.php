<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class SendWithholdDeductRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'amount' => 'amount',
        'businessParams' => 'business_params',
        'externalAgreementNo' => 'external_agreement_no',
        'orderTitle' => 'order_title',
        'outBizNo' => 'out_biz_no',
        'remark' => 'remark',
        'thirdPartyId' => 'third_party_id',
    ];
    public function validate() {
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('externalAgreementNo', $this->externalAgreementNo, true);
        Model::validateRequired('outBizNo', $this->outBizNo, true);
        Model::validateRequired('thirdPartyId', $this->thirdPartyId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->businessParams) {
            $res['business_params'] = $this->businessParams;
        }
        if (null !== $this->externalAgreementNo) {
            $res['external_agreement_no'] = $this->externalAgreementNo;
        }
        if (null !== $this->orderTitle) {
            $res['order_title'] = $this->orderTitle;
        }
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->thirdPartyId) {
            $res['third_party_id'] = $this->thirdPartyId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SendWithholdDeductRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['amount'])){
            $model->amount = $map['amount'];
        }
        if(isset($map['business_params'])){
            $model->businessParams = $map['business_params'];
        }
        if(isset($map['external_agreement_no'])){
            $model->externalAgreementNo = $map['external_agreement_no'];
        }
        if(isset($map['order_title'])){
            $model->orderTitle = $map['order_title'];
        }
        if(isset($map['out_biz_no'])){
            $model->outBizNo = $map['out_biz_no'];
        }
        if(isset($map['remark'])){
            $model->remark = $map['remark'];
        }
        if(isset($map['third_party_id'])){
            $model->thirdPartyId = $map['third_party_id'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 委托支付订单总金额，单位为元，精确到小数点后两位
    /**
     * @var string
     */
    public $amount;

    // JSON格式，传递业务扩展参数
    /**
     * @var string
     */
    public $businessParams;

    // 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）
    /**
     * @var string
     */
    public $externalAgreementNo;

    // 订单标题信息
    /**
     * @var string
     */
    public $orderTitle;

    // 外部订单号,请求方保证唯一性
    /**
     * @var string
     */
    public $outBizNo;

    // 备注
    /**
     * @var string
     */
    public $remark;

    // 第三方的用户id
    /**
     * @var string
     */
    public $thirdPartyId;

}
