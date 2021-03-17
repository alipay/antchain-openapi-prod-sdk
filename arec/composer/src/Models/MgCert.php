<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class MgCert extends Model
{
    // 房产编号
    /**
     * @example 20200810001220150000000000000001
     *
     * @var string
     */
    public $houseNo;

    // 坐落
    /**
     * @example xx市xx区xx路xx号
     *
     * @var string
     */
    public $location;

    // 抵押登记回执编号
    /**
     * @example 20200810001220140000000000000001
     *
     * @var string
     */
    public $mgCertNo;

    // 新他项权证号
    /**
     * @example 232311212323
     *
     * @var string
     */
    public $newOtherRightCertNo;

    // 新他项权证电子证照地址
    /**
     * @example rtc-zhuhai/13232323343/2334.pdf
     *
     * @var string
     */
    public $newOtherRightCertPath;

    // 新他项权证类型，比如：MORTGAGE_REG_CERT=不动产登记证明(抵押权登记)
    /**
     * @example MORTGAGE_REG_CERT
     *
     * @var string
     */
    public $newOtherRightCertType;

    // 权利人
    /**
     * @example [{"name","a"},{"name","b"}]
     *
     * @var string
     */
    public $mortgageeJson;

    // 抵押义务人
    /**
     * @example TODO未知结构
     *
     * @var string
     */
    public $mortgagorJson;

    // 证明权力或事项
    /**
     * @example TODO未知结构
     *
     * @var string
     */
    public $proof;

    // 不动产返回其他信息
    /**
     * @example TODO未知结构
     *
     * @var string
     */
    public $other;

    // 不动产返回附记信息
    /**
     * @example TODO未知结构
     *
     * @var string
     */
    public $supplement;

    // 发证工本号
    /**
     * @example TODO未知结构
     *
     * @var string
     */
    public $licenseNumber;

    // 缮证人
    /**
     * @example 张三
     *
     * @var string
     */
    public $printer;

    // 缮证时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $printTime;

    // 发证人
    /**
     * @example 李四
     *
     * @var string
     */
    public $issuer;

    // 发证时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $issuanceTime;

    // 区县代码
    /**
     * @example TODO未知结构
     *
     * @var string
     */
    public $districtCode;

    // 省编号
    /**
     * @example TODO未知结构
     *
     * @var string
     */
    public $provinceCode;

    // 不动产单元号
    /**
     * @example 233439828392823
     *
     * @var string
     */
    public $houseUnitCode;

    // 是否在房产链已解抵
    /**
     * @example N
     *
     * @var string
     */
    public $released;

    // 房产链内部解抵押单号
    /**
     * @example 20200810001220100000000000000001
     *
     * @var string
     */
    public $mgReleaseOrderNo;

    // 登记证明种类,MORTGAGE=抵押权证明
    /**
     * @example MORTGAGE
     *
     * @var string
     */
    public $regCertType;

    // 发证机关
    /**
     * @example 宁波不动产中心xx网点
     *
     * @var string
     */
    public $issuingAuthority;

    // 债权金额
    /**
     * @example 1500000.00
     *
     * @var string
     */
    public $debtAmt;

    // 抵押权开始时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $mgRightStartDate;

    // 抵押权结束日期
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $mgRightEndDate;

    // 抵押方式，MAX_AMOUNT_MORT=最高额抵押
    /**
     * @example MAX_AMOUNT_MORT
     *
     * @var string
     */
    public $mortgageType;
    protected $_name = [
        'houseNo'               => 'house_no',
        'location'              => 'location',
        'mgCertNo'              => 'mg_cert_no',
        'newOtherRightCertNo'   => 'new_other_right_cert_no',
        'newOtherRightCertPath' => 'new_other_right_cert_path',
        'newOtherRightCertType' => 'new_other_right_cert_type',
        'mortgageeJson'         => 'mortgagee_json',
        'mortgagorJson'         => 'mortgagor_json',
        'proof'                 => 'proof',
        'other'                 => 'other',
        'supplement'            => 'supplement',
        'licenseNumber'         => 'license_number',
        'printer'               => 'printer',
        'printTime'             => 'print_time',
        'issuer'                => 'issuer',
        'issuanceTime'          => 'issuance_time',
        'districtCode'          => 'district_code',
        'provinceCode'          => 'province_code',
        'houseUnitCode'         => 'house_unit_code',
        'released'              => 'released',
        'mgReleaseOrderNo'      => 'mg_release_order_no',
        'regCertType'           => 'reg_cert_type',
        'issuingAuthority'      => 'issuing_authority',
        'debtAmt'               => 'debt_amt',
        'mgRightStartDate'      => 'mg_right_start_date',
        'mgRightEndDate'        => 'mg_right_end_date',
        'mortgageType'          => 'mortgage_type',
    ];

    public function validate()
    {
        Model::validatePattern('printTime', $this->printTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('issuanceTime', $this->issuanceTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('mgRightStartDate', $this->mgRightStartDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('mgRightEndDate', $this->mgRightEndDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->houseNo) {
            $res['house_no'] = $this->houseNo;
        }
        if (null !== $this->location) {
            $res['location'] = $this->location;
        }
        if (null !== $this->mgCertNo) {
            $res['mg_cert_no'] = $this->mgCertNo;
        }
        if (null !== $this->newOtherRightCertNo) {
            $res['new_other_right_cert_no'] = $this->newOtherRightCertNo;
        }
        if (null !== $this->newOtherRightCertPath) {
            $res['new_other_right_cert_path'] = $this->newOtherRightCertPath;
        }
        if (null !== $this->newOtherRightCertType) {
            $res['new_other_right_cert_type'] = $this->newOtherRightCertType;
        }
        if (null !== $this->mortgageeJson) {
            $res['mortgagee_json'] = $this->mortgageeJson;
        }
        if (null !== $this->mortgagorJson) {
            $res['mortgagor_json'] = $this->mortgagorJson;
        }
        if (null !== $this->proof) {
            $res['proof'] = $this->proof;
        }
        if (null !== $this->other) {
            $res['other'] = $this->other;
        }
        if (null !== $this->supplement) {
            $res['supplement'] = $this->supplement;
        }
        if (null !== $this->licenseNumber) {
            $res['license_number'] = $this->licenseNumber;
        }
        if (null !== $this->printer) {
            $res['printer'] = $this->printer;
        }
        if (null !== $this->printTime) {
            $res['print_time'] = $this->printTime;
        }
        if (null !== $this->issuer) {
            $res['issuer'] = $this->issuer;
        }
        if (null !== $this->issuanceTime) {
            $res['issuance_time'] = $this->issuanceTime;
        }
        if (null !== $this->districtCode) {
            $res['district_code'] = $this->districtCode;
        }
        if (null !== $this->provinceCode) {
            $res['province_code'] = $this->provinceCode;
        }
        if (null !== $this->houseUnitCode) {
            $res['house_unit_code'] = $this->houseUnitCode;
        }
        if (null !== $this->released) {
            $res['released'] = $this->released;
        }
        if (null !== $this->mgReleaseOrderNo) {
            $res['mg_release_order_no'] = $this->mgReleaseOrderNo;
        }
        if (null !== $this->regCertType) {
            $res['reg_cert_type'] = $this->regCertType;
        }
        if (null !== $this->issuingAuthority) {
            $res['issuing_authority'] = $this->issuingAuthority;
        }
        if (null !== $this->debtAmt) {
            $res['debt_amt'] = $this->debtAmt;
        }
        if (null !== $this->mgRightStartDate) {
            $res['mg_right_start_date'] = $this->mgRightStartDate;
        }
        if (null !== $this->mgRightEndDate) {
            $res['mg_right_end_date'] = $this->mgRightEndDate;
        }
        if (null !== $this->mortgageType) {
            $res['mortgage_type'] = $this->mortgageType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MgCert
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['house_no'])) {
            $model->houseNo = $map['house_no'];
        }
        if (isset($map['location'])) {
            $model->location = $map['location'];
        }
        if (isset($map['mg_cert_no'])) {
            $model->mgCertNo = $map['mg_cert_no'];
        }
        if (isset($map['new_other_right_cert_no'])) {
            $model->newOtherRightCertNo = $map['new_other_right_cert_no'];
        }
        if (isset($map['new_other_right_cert_path'])) {
            $model->newOtherRightCertPath = $map['new_other_right_cert_path'];
        }
        if (isset($map['new_other_right_cert_type'])) {
            $model->newOtherRightCertType = $map['new_other_right_cert_type'];
        }
        if (isset($map['mortgagee_json'])) {
            $model->mortgageeJson = $map['mortgagee_json'];
        }
        if (isset($map['mortgagor_json'])) {
            $model->mortgagorJson = $map['mortgagor_json'];
        }
        if (isset($map['proof'])) {
            $model->proof = $map['proof'];
        }
        if (isset($map['other'])) {
            $model->other = $map['other'];
        }
        if (isset($map['supplement'])) {
            $model->supplement = $map['supplement'];
        }
        if (isset($map['license_number'])) {
            $model->licenseNumber = $map['license_number'];
        }
        if (isset($map['printer'])) {
            $model->printer = $map['printer'];
        }
        if (isset($map['print_time'])) {
            $model->printTime = $map['print_time'];
        }
        if (isset($map['issuer'])) {
            $model->issuer = $map['issuer'];
        }
        if (isset($map['issuance_time'])) {
            $model->issuanceTime = $map['issuance_time'];
        }
        if (isset($map['district_code'])) {
            $model->districtCode = $map['district_code'];
        }
        if (isset($map['province_code'])) {
            $model->provinceCode = $map['province_code'];
        }
        if (isset($map['house_unit_code'])) {
            $model->houseUnitCode = $map['house_unit_code'];
        }
        if (isset($map['released'])) {
            $model->released = $map['released'];
        }
        if (isset($map['mg_release_order_no'])) {
            $model->mgReleaseOrderNo = $map['mg_release_order_no'];
        }
        if (isset($map['reg_cert_type'])) {
            $model->regCertType = $map['reg_cert_type'];
        }
        if (isset($map['issuing_authority'])) {
            $model->issuingAuthority = $map['issuing_authority'];
        }
        if (isset($map['debt_amt'])) {
            $model->debtAmt = $map['debt_amt'];
        }
        if (isset($map['mg_right_start_date'])) {
            $model->mgRightStartDate = $map['mg_right_start_date'];
        }
        if (isset($map['mg_right_end_date'])) {
            $model->mgRightEndDate = $map['mg_right_end_date'];
        }
        if (isset($map['mortgage_type'])) {
            $model->mortgageType = $map['mortgage_type'];
        }

        return $model;
    }
}
