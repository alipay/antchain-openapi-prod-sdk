<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class LegalInfo extends Model
{
    // 法人名称
    /**
     * @example 法人名称
     *
     * @var string
     */
    public $legalName;

    // 法人证件号
    /**
     * @example 法人证件号
     *
     * @var string
     */
    public $legalCertNo;

    // 法人证件正面（人像面）
    /**
     * @example
     *
     * @var FileInfo
     */
    public $legalCertFrontFile;

    // 法人证件反面
    /**
     * @example
     *
     * @var FileInfo
     */
    public $legalCertBackFile;

    // 法人证件是否长期有效（payChannel =JDPAY必填）
    // true：长期，false：非长期
    //
    /**
     * @example true, false
     *
     * @var bool
     */
    public $legalCertExpireFlag;

    // 法人手机号（payChannel =JDPAY必填）
    /**
     * @example 15679375832
     *
     * @var string
     */
    public $legalMobile;

    // 证件有效期开始日期（payChannel =JDPAY必填）
    // legalCertExpireFlag=false/true时都必填，时间格式:yyyy-MM-dd
    /**
     * @example 2025-10-31
     *
     * @var string
     */
    public $legalEffectDate;

    // 证件有效期结束（payChannel =JDPAY选填）
    // legalCertExpireFlag=false时必填，时间格式:yyyy-MM-dd
    /**
     * @example 2025-10-31
     *
     * @var string
     */
    public $legalExpireDate;
    protected $_name = [
        'legalName'           => 'legal_name',
        'legalCertNo'         => 'legal_cert_no',
        'legalCertFrontFile'  => 'legal_cert_front_file',
        'legalCertBackFile'   => 'legal_cert_back_file',
        'legalCertExpireFlag' => 'legal_cert_expire_flag',
        'legalMobile'         => 'legal_mobile',
        'legalEffectDate'     => 'legal_effect_date',
        'legalExpireDate'     => 'legal_expire_date',
    ];

    public function validate()
    {
        Model::validateRequired('legalName', $this->legalName, true);
        Model::validateRequired('legalCertNo', $this->legalCertNo, true);
        Model::validateRequired('legalCertFrontFile', $this->legalCertFrontFile, true);
        Model::validateRequired('legalCertBackFile', $this->legalCertBackFile, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->legalName) {
            $res['legal_name'] = $this->legalName;
        }
        if (null !== $this->legalCertNo) {
            $res['legal_cert_no'] = $this->legalCertNo;
        }
        if (null !== $this->legalCertFrontFile) {
            $res['legal_cert_front_file'] = null !== $this->legalCertFrontFile ? $this->legalCertFrontFile->toMap() : null;
        }
        if (null !== $this->legalCertBackFile) {
            $res['legal_cert_back_file'] = null !== $this->legalCertBackFile ? $this->legalCertBackFile->toMap() : null;
        }
        if (null !== $this->legalCertExpireFlag) {
            $res['legal_cert_expire_flag'] = $this->legalCertExpireFlag;
        }
        if (null !== $this->legalMobile) {
            $res['legal_mobile'] = $this->legalMobile;
        }
        if (null !== $this->legalEffectDate) {
            $res['legal_effect_date'] = $this->legalEffectDate;
        }
        if (null !== $this->legalExpireDate) {
            $res['legal_expire_date'] = $this->legalExpireDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LegalInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['legal_name'])) {
            $model->legalName = $map['legal_name'];
        }
        if (isset($map['legal_cert_no'])) {
            $model->legalCertNo = $map['legal_cert_no'];
        }
        if (isset($map['legal_cert_front_file'])) {
            $model->legalCertFrontFile = FileInfo::fromMap($map['legal_cert_front_file']);
        }
        if (isset($map['legal_cert_back_file'])) {
            $model->legalCertBackFile = FileInfo::fromMap($map['legal_cert_back_file']);
        }
        if (isset($map['legal_cert_expire_flag'])) {
            $model->legalCertExpireFlag = $map['legal_cert_expire_flag'];
        }
        if (isset($map['legal_mobile'])) {
            $model->legalMobile = $map['legal_mobile'];
        }
        if (isset($map['legal_effect_date'])) {
            $model->legalEffectDate = $map['legal_effect_date'];
        }
        if (isset($map['legal_expire_date'])) {
            $model->legalExpireDate = $map['legal_expire_date'];
        }

        return $model;
    }
}
