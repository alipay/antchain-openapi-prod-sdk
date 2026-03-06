<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class AccInfo extends Model
{
    // 身份证号
    /**
     * @example 111222190002309999
     *
     * @var string
     */
    public $certNo;

    // 持卡人姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $certName;

    // 银行卡号
    /**
     * @example 7881620854713
     *
     * @var string
     */
    public $bankCard;

    // 手机号
    /**
     * @example 13900001234
     *
     * @var string
     */
    public $mobile;

    // 银行卡类型，
    // 0：借记卡
    // 1：信用卡
    /**
     * @example 0
     *
     * @var string
     */
    public $cardType;
    protected $_name = [
        'certNo'   => 'cert_no',
        'certName' => 'cert_name',
        'bankCard' => 'bank_card',
        'mobile'   => 'mobile',
        'cardType' => 'card_type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->bankCard) {
            $res['bank_card'] = $this->bankCard;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->cardType) {
            $res['card_type'] = $this->cardType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AccInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }
        if (isset($map['bank_card'])) {
            $model->bankCard = $map['bank_card'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['card_type'])) {
            $model->cardType = $map['card_type'];
        }

        return $model;
    }
}
