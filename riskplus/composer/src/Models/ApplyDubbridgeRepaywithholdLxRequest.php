<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ApplyDubbridgeRepaywithholdLxRequest extends Model
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

    // 代扣请求流水号
    /**
     * @var string
     */
    public $withholdSerialNo;

    // 合作方代码
    /**
     * @var string
     */
    public $partnerCode;

    // 用户绑卡信息 ，包含用户四要素：手机号、卡号、用户名、身份证等
    /**
     * @var string
     */
    public $bindCardInfo;

    // 通联需要的银行编码
    /**
     * @var string
     */
    public $bankId;

    // 代扣总金额=用户代扣金额+补差金额（单位：分）
    /**
     * @var int
     */
    public $withholdAmt;

    // 签约协议号，客户在支付机构的签约协议号(通联以身份证号唯一，宝付以四要素唯一)
    /**
     * @var string
     */
    public $signNum;

    // 支付模式，
    // 0:银行卡支付（默认）
    // 1:余额支付
    // 2:份额支付
    /**
     * @var int
     */
    public $payMode;

    // 在支付机构的商户号
    /**
     * @var string
     */
    public $subMerchantId;

    // 出账信息
    /**
     * @var string
     */
    public $sepOutInfo;

    // 分账信息，分账信息条数大于等于一条，当担保费为0时，担保费分账信息不会透传给资方，产品需提示资方做好适配
    //
    /**
     * @var string
     */
    public $sepInInfo;

    // 加密报文，流量方对出入账信息加密报文，需资方透传给支付机构，与资方申请一致方可扣款成功
    /**
     * @var string
     */
    public $encrpytContent;

    // 代扣明细
    /**
     * @var WithholdDetailItem[]
     */
    public $withholdDetail;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'withholdSerialNo'  => 'withhold_serial_no',
        'partnerCode'       => 'partner_code',
        'bindCardInfo'      => 'bind_card_info',
        'bankId'            => 'bank_id',
        'withholdAmt'       => 'withhold_amt',
        'signNum'           => 'sign_num',
        'payMode'           => 'pay_mode',
        'subMerchantId'     => 'sub_merchant_id',
        'sepOutInfo'        => 'sep_out_info',
        'sepInInfo'         => 'sep_in_info',
        'encrpytContent'    => 'encrpyt_content',
        'withholdDetail'    => 'withhold_detail',
    ];

    public function validate()
    {
        Model::validateRequired('withholdSerialNo', $this->withholdSerialNo, true);
        Model::validateRequired('bindCardInfo', $this->bindCardInfo, true);
        Model::validateRequired('withholdAmt', $this->withholdAmt, true);
        Model::validateRequired('signNum', $this->signNum, true);
        Model::validateRequired('payMode', $this->payMode, true);
        Model::validateRequired('subMerchantId', $this->subMerchantId, true);
        Model::validateRequired('sepOutInfo', $this->sepOutInfo, true);
        Model::validateRequired('sepInInfo', $this->sepInInfo, true);
        Model::validateRequired('withholdDetail', $this->withholdDetail, true);
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
        if (null !== $this->withholdSerialNo) {
            $res['withhold_serial_no'] = $this->withholdSerialNo;
        }
        if (null !== $this->partnerCode) {
            $res['partner_code'] = $this->partnerCode;
        }
        if (null !== $this->bindCardInfo) {
            $res['bind_card_info'] = $this->bindCardInfo;
        }
        if (null !== $this->bankId) {
            $res['bank_id'] = $this->bankId;
        }
        if (null !== $this->withholdAmt) {
            $res['withhold_amt'] = $this->withholdAmt;
        }
        if (null !== $this->signNum) {
            $res['sign_num'] = $this->signNum;
        }
        if (null !== $this->payMode) {
            $res['pay_mode'] = $this->payMode;
        }
        if (null !== $this->subMerchantId) {
            $res['sub_merchant_id'] = $this->subMerchantId;
        }
        if (null !== $this->sepOutInfo) {
            $res['sep_out_info'] = $this->sepOutInfo;
        }
        if (null !== $this->sepInInfo) {
            $res['sep_in_info'] = $this->sepInInfo;
        }
        if (null !== $this->encrpytContent) {
            $res['encrpyt_content'] = $this->encrpytContent;
        }
        if (null !== $this->withholdDetail) {
            $res['withhold_detail'] = [];
            if (null !== $this->withholdDetail && \is_array($this->withholdDetail)) {
                $n = 0;
                foreach ($this->withholdDetail as $item) {
                    $res['withhold_detail'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyDubbridgeRepaywithholdLxRequest
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
        if (isset($map['withhold_serial_no'])) {
            $model->withholdSerialNo = $map['withhold_serial_no'];
        }
        if (isset($map['partner_code'])) {
            $model->partnerCode = $map['partner_code'];
        }
        if (isset($map['bind_card_info'])) {
            $model->bindCardInfo = $map['bind_card_info'];
        }
        if (isset($map['bank_id'])) {
            $model->bankId = $map['bank_id'];
        }
        if (isset($map['withhold_amt'])) {
            $model->withholdAmt = $map['withhold_amt'];
        }
        if (isset($map['sign_num'])) {
            $model->signNum = $map['sign_num'];
        }
        if (isset($map['pay_mode'])) {
            $model->payMode = $map['pay_mode'];
        }
        if (isset($map['sub_merchant_id'])) {
            $model->subMerchantId = $map['sub_merchant_id'];
        }
        if (isset($map['sep_out_info'])) {
            $model->sepOutInfo = $map['sep_out_info'];
        }
        if (isset($map['sep_in_info'])) {
            $model->sepInInfo = $map['sep_in_info'];
        }
        if (isset($map['encrpyt_content'])) {
            $model->encrpytContent = $map['encrpyt_content'];
        }
        if (isset($map['withhold_detail'])) {
            if (!empty($map['withhold_detail'])) {
                $model->withholdDetail = [];
                $n                     = 0;
                foreach ($map['withhold_detail'] as $item) {
                    $model->withholdDetail[$n++] = null !== $item ? WithholdDetailItem::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
