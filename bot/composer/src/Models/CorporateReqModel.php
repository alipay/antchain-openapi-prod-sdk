<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CorporateReqModel extends Model
{
    // 组织地址
    /**
     * @example xxxxx
     *
     * @var string
     */
    public $address;

    // 运营地址
    /**
     * @example ""
     *
     * @var string
     */
    public $businessAddress;

    // 经营类目
    /**
     * @example ""
     *
     * @var string
     */
    public $businessScope;

    // 注册时间，字符串类型
    /**
     * @example "注册时间"
     *
     * @var string
     */
    public $certifyDate;

    // 营业执照有效期，字符串
    /**
     * @example ""
     *
     * @var string
     */
    public $licenceExpireDate;

    // 国家
    /**
     * @example CN
     *
     * @var string
     */
    public $nation;

    // 组织类型
    /**
     * @example LimitedCompany
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'address'           => 'address',
        'businessAddress'   => 'business_address',
        'businessScope'     => 'business_scope',
        'certifyDate'       => 'certify_date',
        'licenceExpireDate' => 'licence_expire_date',
        'nation'            => 'nation',
        'type'              => 'type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->businessAddress) {
            $res['business_address'] = $this->businessAddress;
        }
        if (null !== $this->businessScope) {
            $res['business_scope'] = $this->businessScope;
        }
        if (null !== $this->certifyDate) {
            $res['certify_date'] = $this->certifyDate;
        }
        if (null !== $this->licenceExpireDate) {
            $res['licence_expire_date'] = $this->licenceExpireDate;
        }
        if (null !== $this->nation) {
            $res['nation'] = $this->nation;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CorporateReqModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['business_address'])) {
            $model->businessAddress = $map['business_address'];
        }
        if (isset($map['business_scope'])) {
            $model->businessScope = $map['business_scope'];
        }
        if (isset($map['certify_date'])) {
            $model->certifyDate = $map['certify_date'];
        }
        if (isset($map['licence_expire_date'])) {
            $model->licenceExpireDate = $map['licence_expire_date'];
        }
        if (isset($map['nation'])) {
            $model->nation = $map['nation'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
