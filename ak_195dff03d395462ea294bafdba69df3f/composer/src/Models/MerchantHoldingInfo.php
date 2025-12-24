<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class MerchantHoldingInfo extends Model
{
    // 控股类型名称
    // 企业股东:ENTERPRISE_SHAREHOLDER
    // 个人股东:PERSONAL_SHAREHOLDER
    /**
     * @example ENTERPRISE_SHAREHOLDER
     *
     * @var string
     */
    public $holdingTypeName;

    // 控股公司名称
    /**
     * @example xxx公司
     *
     * @var string
     */
    public $holdingCompany;

    // 证件号码
    /**
     * @example 91301010101010101A
     *
     * @var string
     */
    public $certificateNumber;

    // 证件是否长期有效
    // 长期true，
    // 否则false
    /**
     * @example true, false
     *
     * @var bool
     */
    public $longDate;

    // 失效时间
    // 商户控股信息longdate为true 时，可为空 ，格式YYYY-MM-DD
    /**
     * @example 2022-10-10
     *
     * @var string
     */
    public $expireDate;
    protected $_name = [
        'holdingTypeName'   => 'holding_type_name',
        'holdingCompany'    => 'holding_company',
        'certificateNumber' => 'certificate_number',
        'longDate'          => 'long_date',
        'expireDate'        => 'expire_date',
    ];

    public function validate()
    {
        Model::validateRequired('holdingTypeName', $this->holdingTypeName, true);
        Model::validateRequired('holdingCompany', $this->holdingCompany, true);
        Model::validateRequired('certificateNumber', $this->certificateNumber, true);
        Model::validateRequired('longDate', $this->longDate, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->holdingTypeName) {
            $res['holding_type_name'] = $this->holdingTypeName;
        }
        if (null !== $this->holdingCompany) {
            $res['holding_company'] = $this->holdingCompany;
        }
        if (null !== $this->certificateNumber) {
            $res['certificate_number'] = $this->certificateNumber;
        }
        if (null !== $this->longDate) {
            $res['long_date'] = $this->longDate;
        }
        if (null !== $this->expireDate) {
            $res['expire_date'] = $this->expireDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MerchantHoldingInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['holding_type_name'])) {
            $model->holdingTypeName = $map['holding_type_name'];
        }
        if (isset($map['holding_company'])) {
            $model->holdingCompany = $map['holding_company'];
        }
        if (isset($map['certificate_number'])) {
            $model->certificateNumber = $map['certificate_number'];
        }
        if (isset($map['long_date'])) {
            $model->longDate = $map['long_date'];
        }
        if (isset($map['expire_date'])) {
            $model->expireDate = $map['expire_date'];
        }

        return $model;
    }
}
