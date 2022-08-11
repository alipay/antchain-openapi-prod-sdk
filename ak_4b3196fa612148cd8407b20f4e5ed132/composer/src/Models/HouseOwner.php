<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_4b3196fa612148cd8407b20f4e5ed132\Models;

use AlibabaCloud\Tea\Model;

class HouseOwner extends Model
{
    // 姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $name;

    // 证件类型
    /**
     * @example ID_CARD
     *
     * @var string
     */
    public $certType;

    // 证件号
    /**
     * @example 330108****1232
     *
     * @var string
     */
    public $certNo;

    // 手机号
    /**
     * @example 13512334454
     *
     * @var string
     */
    public $mobile;

    // 身份证正面照片存储路径
    /**
     * @example bk-ningbo/12334343434/a.pdf
     *
     * @var string
     */
    public $certFrontPicOssKey;

    // 身份证反面照片存储路径
    /**
     * @example bk-ningbo/12334343434/a.pdf
     *
     * @var string
     */
    public $certBackPicOssKey;

    // 权利人主体类型，PERSON=个人
    /**
     * @example PERSON
     *
     * @var string
     */
    public $obligeeType;

    // 权利人类型
    /**
     * @example USER_OWNER
     *
     * @var string
     */
    public $obligeeRole;

    // 共有情况
    /**
     * @example SHARE_COOWNER
     *
     * @var string
     */
    public $ownershipStatus;

    // 权证类型
    /**
     * @example HOUSE_OWNERSHIP_CERT
     *
     * @var string
     */
    public $houseCertType;

    // 权证号
    /**
     * @example 浙（2017）证宁波市不动产权第0023234号
     *
     * @var string
     */
    public $houseCertNo;

    // 权利比例
    /**
     * @example 20
     *
     * @var string
     */
    public $rightsRate;

    // 房产链内部客户编号
    /**
     * @example 20200810001220100000000000000001
     *
     * @var string
     */
    public $cmNo;

    // 房产链内部房产编号
    /**
     * @example 20200810001220100000000000000001
     *
     * @var string
     */
    public $houseNo;
    protected $_name = [
        'name'               => 'name',
        'certType'           => 'cert_type',
        'certNo'             => 'cert_no',
        'mobile'             => 'mobile',
        'certFrontPicOssKey' => 'cert_front_pic_oss_key',
        'certBackPicOssKey'  => 'cert_back_pic_oss_key',
        'obligeeType'        => 'obligee_type',
        'obligeeRole'        => 'obligee_role',
        'ownershipStatus'    => 'ownership_status',
        'houseCertType'      => 'house_cert_type',
        'houseCertNo'        => 'house_cert_no',
        'rightsRate'         => 'rights_rate',
        'cmNo'               => 'cm_no',
        'houseNo'            => 'house_no',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->certFrontPicOssKey) {
            $res['cert_front_pic_oss_key'] = $this->certFrontPicOssKey;
        }
        if (null !== $this->certBackPicOssKey) {
            $res['cert_back_pic_oss_key'] = $this->certBackPicOssKey;
        }
        if (null !== $this->obligeeType) {
            $res['obligee_type'] = $this->obligeeType;
        }
        if (null !== $this->obligeeRole) {
            $res['obligee_role'] = $this->obligeeRole;
        }
        if (null !== $this->ownershipStatus) {
            $res['ownership_status'] = $this->ownershipStatus;
        }
        if (null !== $this->houseCertType) {
            $res['house_cert_type'] = $this->houseCertType;
        }
        if (null !== $this->houseCertNo) {
            $res['house_cert_no'] = $this->houseCertNo;
        }
        if (null !== $this->rightsRate) {
            $res['rights_rate'] = $this->rightsRate;
        }
        if (null !== $this->cmNo) {
            $res['cm_no'] = $this->cmNo;
        }
        if (null !== $this->houseNo) {
            $res['house_no'] = $this->houseNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return HouseOwner
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['cert_front_pic_oss_key'])) {
            $model->certFrontPicOssKey = $map['cert_front_pic_oss_key'];
        }
        if (isset($map['cert_back_pic_oss_key'])) {
            $model->certBackPicOssKey = $map['cert_back_pic_oss_key'];
        }
        if (isset($map['obligee_type'])) {
            $model->obligeeType = $map['obligee_type'];
        }
        if (isset($map['obligee_role'])) {
            $model->obligeeRole = $map['obligee_role'];
        }
        if (isset($map['ownership_status'])) {
            $model->ownershipStatus = $map['ownership_status'];
        }
        if (isset($map['house_cert_type'])) {
            $model->houseCertType = $map['house_cert_type'];
        }
        if (isset($map['house_cert_no'])) {
            $model->houseCertNo = $map['house_cert_no'];
        }
        if (isset($map['rights_rate'])) {
            $model->rightsRate = $map['rights_rate'];
        }
        if (isset($map['cm_no'])) {
            $model->cmNo = $map['cm_no'];
        }
        if (isset($map['house_no'])) {
            $model->houseNo = $map['house_no'];
        }

        return $model;
    }
}
