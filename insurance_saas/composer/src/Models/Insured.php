<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class Insured extends Model
{
    // 被保人名称
    /**
     * @example 李四
     *
     * @var string
     */
    public $insuredName;

    // 被保人证件类型
    /**
     * @example 01--居民身份证、03--营业执照
     *
     * @var string
     */
    public $insuredCardType;

    // 被保人证件号码
    /**
     * @example 123456789
     *
     * @var string
     */
    public $insuredCardCode;

    // 被保人联系方式
    /**
     * @example 123456789
     *
     * @var string
     */
    public $insuredContactInfo;
    protected $_name = [
        'insuredName'        => 'insured_name',
        'insuredCardType'    => 'insured_card_type',
        'insuredCardCode'    => 'insured_card_code',
        'insuredContactInfo' => 'insured_contact_info',
    ];

    public function validate()
    {
        Model::validateRequired('insuredName', $this->insuredName, true);
        Model::validateRequired('insuredCardType', $this->insuredCardType, true);
        Model::validateRequired('insuredCardCode', $this->insuredCardCode, true);
        Model::validateMaxLength('insuredName', $this->insuredName, 32);
        Model::validateMaxLength('insuredCardType', $this->insuredCardType, 32);
        Model::validateMaxLength('insuredCardCode', $this->insuredCardCode, 32);
        Model::validateMaxLength('insuredContactInfo', $this->insuredContactInfo, 128);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->insuredName) {
            $res['insured_name'] = $this->insuredName;
        }
        if (null !== $this->insuredCardType) {
            $res['insured_card_type'] = $this->insuredCardType;
        }
        if (null !== $this->insuredCardCode) {
            $res['insured_card_code'] = $this->insuredCardCode;
        }
        if (null !== $this->insuredContactInfo) {
            $res['insured_contact_info'] = $this->insuredContactInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Insured
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['insured_name'])) {
            $model->insuredName = $map['insured_name'];
        }
        if (isset($map['insured_card_type'])) {
            $model->insuredCardType = $map['insured_card_type'];
        }
        if (isset($map['insured_card_code'])) {
            $model->insuredCardCode = $map['insured_card_code'];
        }
        if (isset($map['insured_contact_info'])) {
            $model->insuredContactInfo = $map['insured_contact_info'];
        }

        return $model;
    }
}
