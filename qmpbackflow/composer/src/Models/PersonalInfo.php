<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class PersonalInfo extends Model
{
    // 客户姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $customName;

    // 身份证号码(18位)
    /**
     * @example 1234555
     *
     * @var string
     */
    public $cardNo;

    // 1-身份证
    /**
     * @example 1
     *
     * @var string
     */
    public $idType;

    // 证件开始日期(格式：YYYY-MM-DD)
    //
    /**
     * @example YYYY-MM-DD
     *
     * @var string
     */
    public $certSignDate;

    // 格式：YYYY-MM-DD，身份证有效期为长期的送: 9999-12-31
    /**
     * @example YYYY-MM-DD
     *
     * @var string
     */
    public $certValidate;

    // 证件地址
    /**
     * @example 浙江
     *
     * @var string
     */
    public $certAdr;

    // 手机号
    /**
     * @example 12344
     *
     * @var string
     */
    public $mobile;

    // 学历
    /**
     * @example 本科
     *
     * @var string
     */
    public $education;

    // 所在省份 汉字
    /**
     * @example 浙江
     *
     * @var string
     */
    public $province;

    // 所在城市 汉字
    /**
     * @example 杭州
     *
     * @var string
     */
    public $city;

    // 地区名称 汉字
    /**
     * @example xxx
     *
     * @var string
     */
    public $area;

    // 详细地址
    /**
     * @example xxx
     *
     * @var string
     */
    public $address;

    // 性别M-男
    // F-女
    /**
     * @example M
     *
     * @var string
     */
    public $sex;

    // 民族
    /**
     * @example 汉
     *
     * @var string
     */
    public $nation;

    // 婚姻状态：00-未婚，01-已婚，02-离婚，03-丧偶，99-未知
    /**
     * @example 00
     *
     * @var string
     */
    public $maritalStatus;
    protected $_name = [
        'customName'    => 'custom_name',
        'cardNo'        => 'card_no',
        'idType'        => 'id_type',
        'certSignDate'  => 'cert_sign_date',
        'certValidate'  => 'cert_validate',
        'certAdr'       => 'cert_adr',
        'mobile'        => 'mobile',
        'education'     => 'education',
        'province'      => 'province',
        'city'          => 'city',
        'area'          => 'area',
        'address'       => 'address',
        'sex'           => 'sex',
        'nation'        => 'nation',
        'maritalStatus' => 'marital_status',
    ];

    public function validate()
    {
        Model::validateRequired('customName', $this->customName, true);
        Model::validateRequired('cardNo', $this->cardNo, true);
        Model::validateRequired('idType', $this->idType, true);
        Model::validateRequired('certSignDate', $this->certSignDate, true);
        Model::validateRequired('certValidate', $this->certValidate, true);
        Model::validateRequired('certAdr', $this->certAdr, true);
        Model::validateRequired('mobile', $this->mobile, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->customName) {
            $res['custom_name'] = $this->customName;
        }
        if (null !== $this->cardNo) {
            $res['card_no'] = $this->cardNo;
        }
        if (null !== $this->idType) {
            $res['id_type'] = $this->idType;
        }
        if (null !== $this->certSignDate) {
            $res['cert_sign_date'] = $this->certSignDate;
        }
        if (null !== $this->certValidate) {
            $res['cert_validate'] = $this->certValidate;
        }
        if (null !== $this->certAdr) {
            $res['cert_adr'] = $this->certAdr;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->education) {
            $res['education'] = $this->education;
        }
        if (null !== $this->province) {
            $res['province'] = $this->province;
        }
        if (null !== $this->city) {
            $res['city'] = $this->city;
        }
        if (null !== $this->area) {
            $res['area'] = $this->area;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->sex) {
            $res['sex'] = $this->sex;
        }
        if (null !== $this->nation) {
            $res['nation'] = $this->nation;
        }
        if (null !== $this->maritalStatus) {
            $res['marital_status'] = $this->maritalStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PersonalInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['custom_name'])) {
            $model->customName = $map['custom_name'];
        }
        if (isset($map['card_no'])) {
            $model->cardNo = $map['card_no'];
        }
        if (isset($map['id_type'])) {
            $model->idType = $map['id_type'];
        }
        if (isset($map['cert_sign_date'])) {
            $model->certSignDate = $map['cert_sign_date'];
        }
        if (isset($map['cert_validate'])) {
            $model->certValidate = $map['cert_validate'];
        }
        if (isset($map['cert_adr'])) {
            $model->certAdr = $map['cert_adr'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['education'])) {
            $model->education = $map['education'];
        }
        if (isset($map['province'])) {
            $model->province = $map['province'];
        }
        if (isset($map['city'])) {
            $model->city = $map['city'];
        }
        if (isset($map['area'])) {
            $model->area = $map['area'];
        }
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['sex'])) {
            $model->sex = $map['sex'];
        }
        if (isset($map['nation'])) {
            $model->nation = $map['nation'];
        }
        if (isset($map['marital_status'])) {
            $model->maritalStatus = $map['marital_status'];
        }

        return $model;
    }
}
