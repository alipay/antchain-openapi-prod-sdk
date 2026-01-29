<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class MerchantPayChannelInfo extends Model
{
    // ALIPAY 支付宝
    // JDPAY京东支付
    /**
     * @example ALIPAY
     *
     * @var string
     */
    public $payChannel;

    // 绑定企业支付宝账号
    /**
     * @example 123123122134@163.com
     *
     * @var string
     */
    public $bindAlipayNo;

    // 结算企业支付宝账号
    /**
     * @example 123123122134@163.com
     *
     * @var string
     */
    public $settleAlipayNo;

    // 绑定支付宝uid
    /**
     * @example 2088123456789
     *
     * @var string
     */
    public $bindAlipayUid;

    // 结算银行卡账号
    /**
     * @example 123123122134
     *
     * @var string
     */
    public $bankNum;

    // 联行号
    /**
     * @example 12345678912
     *
     * @var string
     */
    public $bankCnap;

    // 结算账户类型
    // merchant_type=01企业时：ENTERPRISE
    // 03:民办非企业：ENTERPRISE
    // 07个体工商户时：PERSON或 ENTERPRISE
    /**
     * @example ENTERPRISE
     *
     * @var string
     */
    public $bankAccountType;

    // 二级商户id
    /**
     * @example 123123122134
     *
     * @var string
     */
    public $subMerchantId;

    // 进件流水号
    /**
     * @example ATO_123456789
     *
     * @var string
     */
    public $payExpandId;
    protected $_name = [
        'payChannel'      => 'pay_channel',
        'bindAlipayNo'    => 'bind_alipay_no',
        'settleAlipayNo'  => 'settle_alipay_no',
        'bindAlipayUid'   => 'bind_alipay_uid',
        'bankNum'         => 'bank_num',
        'bankCnap'        => 'bank_cnap',
        'bankAccountType' => 'bank_account_type',
        'subMerchantId'   => 'sub_merchant_id',
        'payExpandId'     => 'pay_expand_id',
    ];

    public function validate()
    {
        Model::validateRequired('payChannel', $this->payChannel, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->payChannel) {
            $res['pay_channel'] = $this->payChannel;
        }
        if (null !== $this->bindAlipayNo) {
            $res['bind_alipay_no'] = $this->bindAlipayNo;
        }
        if (null !== $this->settleAlipayNo) {
            $res['settle_alipay_no'] = $this->settleAlipayNo;
        }
        if (null !== $this->bindAlipayUid) {
            $res['bind_alipay_uid'] = $this->bindAlipayUid;
        }
        if (null !== $this->bankNum) {
            $res['bank_num'] = $this->bankNum;
        }
        if (null !== $this->bankCnap) {
            $res['bank_cnap'] = $this->bankCnap;
        }
        if (null !== $this->bankAccountType) {
            $res['bank_account_type'] = $this->bankAccountType;
        }
        if (null !== $this->subMerchantId) {
            $res['sub_merchant_id'] = $this->subMerchantId;
        }
        if (null !== $this->payExpandId) {
            $res['pay_expand_id'] = $this->payExpandId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MerchantPayChannelInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['pay_channel'])) {
            $model->payChannel = $map['pay_channel'];
        }
        if (isset($map['bind_alipay_no'])) {
            $model->bindAlipayNo = $map['bind_alipay_no'];
        }
        if (isset($map['settle_alipay_no'])) {
            $model->settleAlipayNo = $map['settle_alipay_no'];
        }
        if (isset($map['bind_alipay_uid'])) {
            $model->bindAlipayUid = $map['bind_alipay_uid'];
        }
        if (isset($map['bank_num'])) {
            $model->bankNum = $map['bank_num'];
        }
        if (isset($map['bank_cnap'])) {
            $model->bankCnap = $map['bank_cnap'];
        }
        if (isset($map['bank_account_type'])) {
            $model->bankAccountType = $map['bank_account_type'];
        }
        if (isset($map['sub_merchant_id'])) {
            $model->subMerchantId = $map['sub_merchant_id'];
        }
        if (isset($map['pay_expand_id'])) {
            $model->payExpandId = $map['pay_expand_id'];
        }

        return $model;
    }
}
