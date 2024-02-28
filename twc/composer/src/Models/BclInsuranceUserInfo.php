<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class BclInsuranceUserInfo extends Model
{
    // 用户名称
    /**
     * @example 蚂蚁区块链科技（上海）有限公司
     *
     * @var string
     */
    public $userName;

    // 保险用户类型：
    // HOLDER_ORG: 投保人（机构）
    // INSURED_ORG: 被保人（机构）
    // INSURANCE_ORG: 保司（机构）
    /**
     * @example HOLDER_ORG
     *
     * @var string
     */
    public $userType;

    // 证件号名称:
    // USCC，社会统一信用代码，目前仅支持
    /**
     * @example USCC
     *
     * @var string
     */
    public $idType;

    // 证件号码
    /**
     * @example 91310101MA1FPCXA3G
     *
     * @var string
     */
    public $idNumber;

    // 联系地址
    /**
     * @example 上海市黄浦区外马路618号8层803室
     *
     * @var string
     */
    public $address;

    // 联系方式
    /**
     * @example 021-61686888
     *
     * @var string
     */
    public $mobile;

    // 邮件地址
    /**
     * @example xxx@aa.com
     *
     * @var string
     */
    public $mail;
    protected $_name = [
        'userName' => 'user_name',
        'userType' => 'user_type',
        'idType'   => 'id_type',
        'idNumber' => 'id_number',
        'address'  => 'address',
        'mobile'   => 'mobile',
        'mail'     => 'mail',
    ];

    public function validate()
    {
        Model::validateRequired('userName', $this->userName, true);
        Model::validateRequired('userType', $this->userType, true);
        Model::validateRequired('idType', $this->idType, true);
        Model::validateRequired('idNumber', $this->idNumber, true);
        Model::validateRequired('address', $this->address, true);
        Model::validateRequired('mobile', $this->mobile, true);
        Model::validateRequired('mail', $this->mail, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
        }
        if (null !== $this->idType) {
            $res['id_type'] = $this->idType;
        }
        if (null !== $this->idNumber) {
            $res['id_number'] = $this->idNumber;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->mail) {
            $res['mail'] = $this->mail;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BclInsuranceUserInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['user_type'])) {
            $model->userType = $map['user_type'];
        }
        if (isset($map['id_type'])) {
            $model->idType = $map['id_type'];
        }
        if (isset($map['id_number'])) {
            $model->idNumber = $map['id_number'];
        }
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['mail'])) {
            $model->mail = $map['mail'];
        }

        return $model;
    }
}
