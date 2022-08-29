<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class JudicialOrgInfo extends Model
{
    // 企业名称
    /**
     * @example 某知名有限公司
     *
     * @var string
     */
    public $orgName;

    // 企业或机构社会统一信用代码
    /**
     * @example 92XXX
     *
     * @var string
     */
    public $orgCertNum;

    // 企业联系电话
    /**
     * @example 15000000000
     *
     * @var string
     */
    public $orgPhone;

    // 企业联系邮箱
    /**
     * @example email@org.com
     *
     * @var string
     */
    public $orgEmail;

    // 企业通讯地址
    /**
     * @example 上海市黄浦区外马路618号
     *
     * @var string
     */
    public $orgAddress;

    // 企业或机构营业执照信息
    /**
     * @example
     *
     * @var JudicialFileInfo
     */
    public $orgBizLicenseInfo;

    // 企业法人信息
    /**
     * @example
     *
     * @var JudicialPersonInfo
     */
    public $orgLegalPersonInfo;

    // 企业或机构签章管理员信息
    /**
     * @example
     *
     * @var JudicialPersonInfo
     */
    public $orgSignatureManagerPersonInfo;

    // 企业或机构收款银行账户信息
    /**
     * @example
     *
     * @var JudicialBankInfo
     */
    public $orgBankInfo;
    protected $_name = [
        'orgName'                       => 'org_name',
        'orgCertNum'                    => 'org_cert_num',
        'orgPhone'                      => 'org_phone',
        'orgEmail'                      => 'org_email',
        'orgAddress'                    => 'org_address',
        'orgBizLicenseInfo'             => 'org_biz_license_info',
        'orgLegalPersonInfo'            => 'org_legal_person_info',
        'orgSignatureManagerPersonInfo' => 'org_signature_manager_person_info',
        'orgBankInfo'                   => 'org_bank_info',
    ];

    public function validate()
    {
        Model::validateRequired('orgName', $this->orgName, true);
        Model::validateRequired('orgCertNum', $this->orgCertNum, true);
        Model::validateRequired('orgPhone', $this->orgPhone, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orgName) {
            $res['org_name'] = $this->orgName;
        }
        if (null !== $this->orgCertNum) {
            $res['org_cert_num'] = $this->orgCertNum;
        }
        if (null !== $this->orgPhone) {
            $res['org_phone'] = $this->orgPhone;
        }
        if (null !== $this->orgEmail) {
            $res['org_email'] = $this->orgEmail;
        }
        if (null !== $this->orgAddress) {
            $res['org_address'] = $this->orgAddress;
        }
        if (null !== $this->orgBizLicenseInfo) {
            $res['org_biz_license_info'] = null !== $this->orgBizLicenseInfo ? $this->orgBizLicenseInfo->toMap() : null;
        }
        if (null !== $this->orgLegalPersonInfo) {
            $res['org_legal_person_info'] = null !== $this->orgLegalPersonInfo ? $this->orgLegalPersonInfo->toMap() : null;
        }
        if (null !== $this->orgSignatureManagerPersonInfo) {
            $res['org_signature_manager_person_info'] = null !== $this->orgSignatureManagerPersonInfo ? $this->orgSignatureManagerPersonInfo->toMap() : null;
        }
        if (null !== $this->orgBankInfo) {
            $res['org_bank_info'] = null !== $this->orgBankInfo ? $this->orgBankInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return JudicialOrgInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['org_name'])) {
            $model->orgName = $map['org_name'];
        }
        if (isset($map['org_cert_num'])) {
            $model->orgCertNum = $map['org_cert_num'];
        }
        if (isset($map['org_phone'])) {
            $model->orgPhone = $map['org_phone'];
        }
        if (isset($map['org_email'])) {
            $model->orgEmail = $map['org_email'];
        }
        if (isset($map['org_address'])) {
            $model->orgAddress = $map['org_address'];
        }
        if (isset($map['org_biz_license_info'])) {
            $model->orgBizLicenseInfo = JudicialFileInfo::fromMap($map['org_biz_license_info']);
        }
        if (isset($map['org_legal_person_info'])) {
            $model->orgLegalPersonInfo = JudicialPersonInfo::fromMap($map['org_legal_person_info']);
        }
        if (isset($map['org_signature_manager_person_info'])) {
            $model->orgSignatureManagerPersonInfo = JudicialPersonInfo::fromMap($map['org_signature_manager_person_info']);
        }
        if (isset($map['org_bank_info'])) {
            $model->orgBankInfo = JudicialBankInfo::fromMap($map['org_bank_info']);
        }

        return $model;
    }
}
