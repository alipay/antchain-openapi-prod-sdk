<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_3d5ac8b5948b43e7a7b8f62c44a6880f\Models;

use AlibabaCloud\Tea\Model;

class ArTemplate extends Model
{
    // 合同模版号
    /**
     * @example 20200810001220050000000000000001
     *
     * @var string
     */
    public $arTpNo;

    // 合同版本
    /**
     * @example 1
     *
     * @var int
     */
    public $arTpVersion;

    // 合同模版类型，比如：CT_AUTH_HOUSE_QUERY=房屋查询授权合同
    /**
     * @example CT_AUTH_HOUSE_QUERY
     *
     * @var string
     */
    public $arType;

    // 区块链智能合同的合同模版号
    /**
     * @example 523231212121212
     *
     * @var string
     */
    public $mycTpId;

    // 合同名称
    /**
     * @example 房屋查询授权合同
     *
     * @var string
     */
    public $name;

    // 合同模版归属机构编号
    /**
     * @example 20200810001220030000000000000001
     *
     * @var string
     */
    public $orgNo;

    // 合同模版归属机构类型，比如：BANK=银行
    /**
     * @example BANK
     *
     * @var string
     */
    public $orgType;

    // 合同模版OSS存储路径
    /**
     * @example rcp/artp/232323232323.pdf
     *
     * @var string
     */
    public $pdfOssKey;

    // 合同变量,Map<String,String>的json格式
    /**
     * @example {"mortgageAgreementNo":"{"required":true,"regEx":"^[a-zA-Z0-9]{10,64}$"}"}
     *
     * @var string
     */
    public $varJson;

    // 签署区设置
    /**
     * @example Map<String,String>的json格式
     *
     * @var string
     */
    public $signAreaJson;
    protected $_name = [
        'arTpNo'       => 'ar_tp_no',
        'arTpVersion'  => 'ar_tp_version',
        'arType'       => 'ar_type',
        'mycTpId'      => 'myc_tp_id',
        'name'         => 'name',
        'orgNo'        => 'org_no',
        'orgType'      => 'org_type',
        'pdfOssKey'    => 'pdf_oss_key',
        'varJson'      => 'var_json',
        'signAreaJson' => 'sign_area_json',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->arTpNo) {
            $res['ar_tp_no'] = $this->arTpNo;
        }
        if (null !== $this->arTpVersion) {
            $res['ar_tp_version'] = $this->arTpVersion;
        }
        if (null !== $this->arType) {
            $res['ar_type'] = $this->arType;
        }
        if (null !== $this->mycTpId) {
            $res['myc_tp_id'] = $this->mycTpId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->orgNo) {
            $res['org_no'] = $this->orgNo;
        }
        if (null !== $this->orgType) {
            $res['org_type'] = $this->orgType;
        }
        if (null !== $this->pdfOssKey) {
            $res['pdf_oss_key'] = $this->pdfOssKey;
        }
        if (null !== $this->varJson) {
            $res['var_json'] = $this->varJson;
        }
        if (null !== $this->signAreaJson) {
            $res['sign_area_json'] = $this->signAreaJson;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ArTemplate
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ar_tp_no'])) {
            $model->arTpNo = $map['ar_tp_no'];
        }
        if (isset($map['ar_tp_version'])) {
            $model->arTpVersion = $map['ar_tp_version'];
        }
        if (isset($map['ar_type'])) {
            $model->arType = $map['ar_type'];
        }
        if (isset($map['myc_tp_id'])) {
            $model->mycTpId = $map['myc_tp_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['org_no'])) {
            $model->orgNo = $map['org_no'];
        }
        if (isset($map['org_type'])) {
            $model->orgType = $map['org_type'];
        }
        if (isset($map['pdf_oss_key'])) {
            $model->pdfOssKey = $map['pdf_oss_key'];
        }
        if (isset($map['var_json'])) {
            $model->varJson = $map['var_json'];
        }
        if (isset($map['sign_area_json'])) {
            $model->signAreaJson = $map['sign_area_json'];
        }

        return $model;
    }
}
