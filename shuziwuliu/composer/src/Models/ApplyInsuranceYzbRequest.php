<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ApplyInsuranceYzbRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 调用方生成的唯一编码，格式为 yyyyMMdd_身份标识_其他编码，系统会根据该流水号做防重、幂等判断逻辑。
    // yyyyMMdd请传递当前时间。
    // 身份标识可自定义。
    // 其他编码建议为随机值。
    // 当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；
    /**
     * @var string
     */
    public $tradeNo;

    // 保司编码，PAIC---平安广分、CPIC---太保深分，CPIC_SUZHOU-太保苏分
    /**
     * @var string
     */
    public $externalChannelCode;

    // 险种编码，05-驿站宝
    /**
     * @var string
     */
    public $externalProductCode;

    // 投保人姓名，保险协议中的投保人全称
    /**
     * @var string
     */
    public $tbrName;

    // 投保人证件类型，01-居民身份证,03--统一社会信用代码
    /**
     * @var string
     */
    public $tbrIdType;

    // 投保人证件号码
    /**
     * @var string
     */
    public $tbrIdNo;

    // 被保人姓名，实际的保险被保人名称
    /**
     * @var string
     */
    public $bbrName;

    // 被保人证件类型，01--居民身份证、03--统一社会信用代码
    /**
     * @var string
     */
    public $bbrIdType;

    // 被保人证件号码
    /**
     * @var string
     */
    public $bbrIdNo;

    // 被保人联系方式
    /**
     * @var string
     */
    public $bbrContact;

    // 受益人名称，实际的保险受益人名称
    /**
     * @var string
     */
    public $beneficiaryName;

    // 受益人证件类型，01--居民身份证、03--统一社会信用代码
    /**
     * @var string
     */
    public $beneficiaryIdType;

    // 受益人证件号码
    /**
     * @var string
     */
    public $beneficiaryNo;

    // 保险起期，格式：yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $insureStart;

    // 套餐编码，
    // 平安（PK00053022、PK00053025、PK00053026、PK00125463、PK00125467）
    // 太保（xjbdbnd01、pssmyd02、xnfayd03、xnfayd04、xnfayd05）
    /**
     * @var string
     */
    public $productPackageType;

    // 站点ID，站点的唯一标识
    /**
     * @var string
     */
    public $siteId;

    // 站点名称
    /**
     * @var string
     */
    public $siteName;

    // 总资产，单位（元），最多2位小数，超过拒绝请求
    /**
     * @var string
     */
    public $totalAssets;

    // 雇员人数，站点的雇佣人员数
    /**
     * @var string
     */
    public $employeeNum;

    // 省编码，站点位于的省份编码
    /**
     * @var string
     */
    public $provinceCode;

    // 市编码，站点位于的市区编码
    /**
     * @var string
     */
    public $cityCode;

    // 区编码,站点位于的区县编码
    /**
     * @var string
     */
    public $districtCode;

    // 完整地址，站点的详细地址
    /**
     * @var string
     */
    public $wholeAddress;

    // 方案名称，菜鸟驿站宝、菜鸟校园驿站宝、溪鸟公共服务站保障，上门人员综合险-30万保额，上门人员综合险-50万保额
    /**
     * @var string
     */
    public $schemeName;

    // 意健险被保人姓名
    /**
     * @var string
     */
    public $acplBbrName;

    // 意健险被保人身份证号
    /**
     * @var string
     */
    public $acplBbrIdNo;

    // 产品市场编码，平安---保司端险种编码、太保--与套餐编码保持一致
    /**
     * @var string
     */
    public $pdtMktCode;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'tradeNo'             => 'trade_no',
        'externalChannelCode' => 'external_channel_code',
        'externalProductCode' => 'external_product_code',
        'tbrName'             => 'tbr_name',
        'tbrIdType'           => 'tbr_id_type',
        'tbrIdNo'             => 'tbr_id_no',
        'bbrName'             => 'bbr_name',
        'bbrIdType'           => 'bbr_id_type',
        'bbrIdNo'             => 'bbr_id_no',
        'bbrContact'          => 'bbr_contact',
        'beneficiaryName'     => 'beneficiary_name',
        'beneficiaryIdType'   => 'beneficiary_id_type',
        'beneficiaryNo'       => 'beneficiary_no',
        'insureStart'         => 'insure_start',
        'productPackageType'  => 'product_package_type',
        'siteId'              => 'site_id',
        'siteName'            => 'site_name',
        'totalAssets'         => 'total_assets',
        'employeeNum'         => 'employee_num',
        'provinceCode'        => 'province_code',
        'cityCode'            => 'city_code',
        'districtCode'        => 'district_code',
        'wholeAddress'        => 'whole_address',
        'schemeName'          => 'scheme_name',
        'acplBbrName'         => 'acpl_bbr_name',
        'acplBbrIdNo'         => 'acpl_bbr_id_no',
        'pdtMktCode'          => 'pdt_mkt_code',
    ];

    public function validate()
    {
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateRequired('externalChannelCode', $this->externalChannelCode, true);
        Model::validateRequired('externalProductCode', $this->externalProductCode, true);
        Model::validateRequired('tbrName', $this->tbrName, true);
        Model::validateRequired('tbrIdType', $this->tbrIdType, true);
        Model::validateRequired('tbrIdNo', $this->tbrIdNo, true);
        Model::validateRequired('bbrName', $this->bbrName, true);
        Model::validateRequired('bbrIdType', $this->bbrIdType, true);
        Model::validateRequired('bbrIdNo', $this->bbrIdNo, true);
        Model::validateRequired('bbrContact', $this->bbrContact, true);
        Model::validateRequired('beneficiaryName', $this->beneficiaryName, true);
        Model::validateRequired('beneficiaryIdType', $this->beneficiaryIdType, true);
        Model::validateRequired('beneficiaryNo', $this->beneficiaryNo, true);
        Model::validateRequired('insureStart', $this->insureStart, true);
        Model::validateRequired('productPackageType', $this->productPackageType, true);
        Model::validateRequired('siteId', $this->siteId, true);
        Model::validateRequired('siteName', $this->siteName, true);
        Model::validateRequired('totalAssets', $this->totalAssets, true);
        Model::validateRequired('employeeNum', $this->employeeNum, true);
        Model::validateRequired('provinceCode', $this->provinceCode, true);
        Model::validateRequired('cityCode', $this->cityCode, true);
        Model::validateRequired('districtCode', $this->districtCode, true);
        Model::validateRequired('wholeAddress', $this->wholeAddress, true);
        Model::validateRequired('schemeName', $this->schemeName, true);
        Model::validateRequired('acplBbrName', $this->acplBbrName, true);
        Model::validateRequired('acplBbrIdNo', $this->acplBbrIdNo, true);
        Model::validateMaxLength('tradeNo', $this->tradeNo, 64);
        Model::validateMaxLength('externalChannelCode', $this->externalChannelCode, 32);
        Model::validateMaxLength('externalProductCode', $this->externalProductCode, 2);
        Model::validateMaxLength('tbrName', $this->tbrName, 100);
        Model::validateMaxLength('tbrIdType', $this->tbrIdType, 2);
        Model::validateMaxLength('tbrIdNo', $this->tbrIdNo, 30);
        Model::validateMaxLength('bbrName', $this->bbrName, 100);
        Model::validateMaxLength('bbrIdType', $this->bbrIdType, 2);
        Model::validateMaxLength('bbrIdNo', $this->bbrIdNo, 30);
        Model::validateMaxLength('bbrContact', $this->bbrContact, 30);
        Model::validateMaxLength('beneficiaryName', $this->beneficiaryName, 100);
        Model::validateMaxLength('beneficiaryIdType', $this->beneficiaryIdType, 2);
        Model::validateMaxLength('beneficiaryNo', $this->beneficiaryNo, 30);
        Model::validateMaxLength('productPackageType', $this->productPackageType, 20);
        Model::validateMaxLength('siteId', $this->siteId, 30);
        Model::validateMaxLength('siteName', $this->siteName, 100);
        Model::validateMaxLength('provinceCode', $this->provinceCode, 10);
        Model::validateMaxLength('cityCode', $this->cityCode, 10);
        Model::validateMaxLength('districtCode', $this->districtCode, 10);
        Model::validateMaxLength('wholeAddress', $this->wholeAddress, 300);
        Model::validateMaxLength('schemeName', $this->schemeName, 100);
        Model::validateMaxLength('acplBbrName', $this->acplBbrName, 100);
        Model::validateMaxLength('acplBbrIdNo', $this->acplBbrIdNo, 30);
        Model::validateMaxLength('pdtMktCode', $this->pdtMktCode, 16);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->externalChannelCode) {
            $res['external_channel_code'] = $this->externalChannelCode;
        }
        if (null !== $this->externalProductCode) {
            $res['external_product_code'] = $this->externalProductCode;
        }
        if (null !== $this->tbrName) {
            $res['tbr_name'] = $this->tbrName;
        }
        if (null !== $this->tbrIdType) {
            $res['tbr_id_type'] = $this->tbrIdType;
        }
        if (null !== $this->tbrIdNo) {
            $res['tbr_id_no'] = $this->tbrIdNo;
        }
        if (null !== $this->bbrName) {
            $res['bbr_name'] = $this->bbrName;
        }
        if (null !== $this->bbrIdType) {
            $res['bbr_id_type'] = $this->bbrIdType;
        }
        if (null !== $this->bbrIdNo) {
            $res['bbr_id_no'] = $this->bbrIdNo;
        }
        if (null !== $this->bbrContact) {
            $res['bbr_contact'] = $this->bbrContact;
        }
        if (null !== $this->beneficiaryName) {
            $res['beneficiary_name'] = $this->beneficiaryName;
        }
        if (null !== $this->beneficiaryIdType) {
            $res['beneficiary_id_type'] = $this->beneficiaryIdType;
        }
        if (null !== $this->beneficiaryNo) {
            $res['beneficiary_no'] = $this->beneficiaryNo;
        }
        if (null !== $this->insureStart) {
            $res['insure_start'] = $this->insureStart;
        }
        if (null !== $this->productPackageType) {
            $res['product_package_type'] = $this->productPackageType;
        }
        if (null !== $this->siteId) {
            $res['site_id'] = $this->siteId;
        }
        if (null !== $this->siteName) {
            $res['site_name'] = $this->siteName;
        }
        if (null !== $this->totalAssets) {
            $res['total_assets'] = $this->totalAssets;
        }
        if (null !== $this->employeeNum) {
            $res['employee_num'] = $this->employeeNum;
        }
        if (null !== $this->provinceCode) {
            $res['province_code'] = $this->provinceCode;
        }
        if (null !== $this->cityCode) {
            $res['city_code'] = $this->cityCode;
        }
        if (null !== $this->districtCode) {
            $res['district_code'] = $this->districtCode;
        }
        if (null !== $this->wholeAddress) {
            $res['whole_address'] = $this->wholeAddress;
        }
        if (null !== $this->schemeName) {
            $res['scheme_name'] = $this->schemeName;
        }
        if (null !== $this->acplBbrName) {
            $res['acpl_bbr_name'] = $this->acplBbrName;
        }
        if (null !== $this->acplBbrIdNo) {
            $res['acpl_bbr_id_no'] = $this->acplBbrIdNo;
        }
        if (null !== $this->pdtMktCode) {
            $res['pdt_mkt_code'] = $this->pdtMktCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyInsuranceYzbRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
        }
        if (isset($map['external_channel_code'])) {
            $model->externalChannelCode = $map['external_channel_code'];
        }
        if (isset($map['external_product_code'])) {
            $model->externalProductCode = $map['external_product_code'];
        }
        if (isset($map['tbr_name'])) {
            $model->tbrName = $map['tbr_name'];
        }
        if (isset($map['tbr_id_type'])) {
            $model->tbrIdType = $map['tbr_id_type'];
        }
        if (isset($map['tbr_id_no'])) {
            $model->tbrIdNo = $map['tbr_id_no'];
        }
        if (isset($map['bbr_name'])) {
            $model->bbrName = $map['bbr_name'];
        }
        if (isset($map['bbr_id_type'])) {
            $model->bbrIdType = $map['bbr_id_type'];
        }
        if (isset($map['bbr_id_no'])) {
            $model->bbrIdNo = $map['bbr_id_no'];
        }
        if (isset($map['bbr_contact'])) {
            $model->bbrContact = $map['bbr_contact'];
        }
        if (isset($map['beneficiary_name'])) {
            $model->beneficiaryName = $map['beneficiary_name'];
        }
        if (isset($map['beneficiary_id_type'])) {
            $model->beneficiaryIdType = $map['beneficiary_id_type'];
        }
        if (isset($map['beneficiary_no'])) {
            $model->beneficiaryNo = $map['beneficiary_no'];
        }
        if (isset($map['insure_start'])) {
            $model->insureStart = $map['insure_start'];
        }
        if (isset($map['product_package_type'])) {
            $model->productPackageType = $map['product_package_type'];
        }
        if (isset($map['site_id'])) {
            $model->siteId = $map['site_id'];
        }
        if (isset($map['site_name'])) {
            $model->siteName = $map['site_name'];
        }
        if (isset($map['total_assets'])) {
            $model->totalAssets = $map['total_assets'];
        }
        if (isset($map['employee_num'])) {
            $model->employeeNum = $map['employee_num'];
        }
        if (isset($map['province_code'])) {
            $model->provinceCode = $map['province_code'];
        }
        if (isset($map['city_code'])) {
            $model->cityCode = $map['city_code'];
        }
        if (isset($map['district_code'])) {
            $model->districtCode = $map['district_code'];
        }
        if (isset($map['whole_address'])) {
            $model->wholeAddress = $map['whole_address'];
        }
        if (isset($map['scheme_name'])) {
            $model->schemeName = $map['scheme_name'];
        }
        if (isset($map['acpl_bbr_name'])) {
            $model->acplBbrName = $map['acpl_bbr_name'];
        }
        if (isset($map['acpl_bbr_id_no'])) {
            $model->acplBbrIdNo = $map['acpl_bbr_id_no'];
        }
        if (isset($map['pdt_mkt_code'])) {
            $model->pdtMktCode = $map['pdt_mkt_code'];
        }

        return $model;
    }
}
