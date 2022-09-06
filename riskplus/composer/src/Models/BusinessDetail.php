<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class BusinessDetail extends Model
{
    // 经营地址
    /**
     * @example xxx
     *
     * @var string
     */
    public $operatingAddrJson;

    // 社会统一信用代码
    /**
     * @example xxx
     *
     * @var string
     */
    public $ucCode;

    // 注册日期
    /**
     * @example 2001-06-01
     *
     * @var string
     */
    public $registerDate;

    // 详细地址
    /**
     * @example xxx
     *
     * @var string
     */
    public $addressDetail;
    protected $_name = [
        'operatingAddrJson' => 'operating_addr_json',
        'ucCode'            => 'uc_code',
        'registerDate'      => 'register_date',
        'addressDetail'     => 'address_detail',
    ];

    public function validate()
    {
        Model::validateRequired('operatingAddrJson', $this->operatingAddrJson, true);
        Model::validateRequired('ucCode', $this->ucCode, true);
        Model::validateRequired('registerDate', $this->registerDate, true);
        Model::validateRequired('addressDetail', $this->addressDetail, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->operatingAddrJson) {
            $res['operating_addr_json'] = $this->operatingAddrJson;
        }
        if (null !== $this->ucCode) {
            $res['uc_code'] = $this->ucCode;
        }
        if (null !== $this->registerDate) {
            $res['register_date'] = $this->registerDate;
        }
        if (null !== $this->addressDetail) {
            $res['address_detail'] = $this->addressDetail;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BusinessDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['operating_addr_json'])) {
            $model->operatingAddrJson = $map['operating_addr_json'];
        }
        if (isset($map['uc_code'])) {
            $model->ucCode = $map['uc_code'];
        }
        if (isset($map['register_date'])) {
            $model->registerDate = $map['register_date'];
        }
        if (isset($map['address_detail'])) {
            $model->addressDetail = $map['address_detail'];
        }

        return $model;
    }
}
