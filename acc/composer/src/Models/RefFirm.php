<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class RefFirm extends Model
{
    // 企业Id
    //
    //
    /**
     * @example 企业Id
     *
     * @var int
     */
    public $firmUserId;

    // did
    /**
     * @example did_24c93459216945468fdf1d899c521910
     *
     * @var string
     */
    public $did;

    //
    // 企业所在地
    /**
     * @example   企业所在地
     *
     * @var string
     */
    public $firmAddress;

    // 企业认证状态
    /**
     * @example 企业认证状态
     *
     * @var string
     */
    public $firmCertStatus;

    // 行业类型
    /**
     * @example 行业类型
     *
     * @var string
     */
    public $industryType;

    // 企业营业执照注册号
    //
    //
    /**
     * @example 企业营业执照注册号
     *
     * @var string
     */
    public $certRegNo;

    // 营业执照文件osskey
    //
    //
    /**
     * @example 营业执照文件osskey
     *
     * @var string
     */
    public $certRegFileId;

    // 营业文件类型(JPEG,JPG)
    //
    //
    /**
     * @example 营业文件类型(JPEG,JPG)
     *
     * @var string
     */
    public $certRegFileType;

    // 法定代表人证件类型
    /**
     * @example 法定代表人证件类型
     *
     * @var string
     */
    public $lpCertType;

    // 法人证件号码
    //
    /**
     * @example 法人证件号码
     *
     * @var string
     */
    public $lpCertNo;

    // 法人姓名
    //
    //
    /**
     * @example 法人姓名
     *
     * @var string
     */
    public $lpName;

    // 法人身份证正面图片字节信息，osskeyId
    //
    //
    /**
     * @example 法人身份证正面图片字节信息，osskeyId
     *
     * @var string
     */
    public $lpCertFileFrontId;

    // 法人身份证正面图片文件类型
    //
    //
    /**
     * @example 法人身份证正面图片文件类型
     *
     * @var string
     */
    public $lpCertFileFrontType;

    // 企业法人证件反面图片，osskeyId
    //
    //
    /**
     * @example 企业法人证件反面图片，osskeyId
     *
     * @var string
     */
    public $lpCertFileReverseId;

    // 法人身份证反面图片文件类型
    //
    //
    /**
     * @example 法人身份证反面图片文件类型
     *
     * @var string
     */
    public $lpCertFileReverseType;

    // 施工资质
    //
    //
    /**
     * @example 施工资质
     *
     * @var Construction[]
     */
    public $constructions;

    // 企业名称
    //
    //
    /**
     * @example 企业名称
     *
     * @var string
     */
    public $firmName;

    // 关联关系 （参见附录三）
    //
    //
    /**
     * @example 关联关系 （参见附录三）
     *
     * @var string
     */
    public $referType;

    // 资信-财报
    //
    //
    /**
     * @example
     *
     * @var AccountResult[]
     */
    public $accountResults;

    // 资信-担保
    //
    //
    /**
     * @example 资信-担保
     *
     * @var Assure[]
     */
    public $assures;

    // 奖项
    //
    //
    /**
     * @example
     *
     * @var Award[]
     */
    public $awards;

    // 银行授信
    //
    //
    /**
     * @example 银行授信
     *
     * @var BankCert
     */
    public $bankCert;

    // 类型
    /**
     * @example 类型
     *
     * @var string
     */
    public $firmType;

    // 银行授信状态
    /**
     * @example true, false
     *
     * @var bool
     */
    public $bankCertStatus;

    // 资质证书状态
    /**
     * @example true, false
     *
     * @var bool
     */
    public $constructionStatus;

    // 资信-财报状态
    /**
     * @example 资信-财报状态
     *
     * @var bool
     */
    public $accountResultStatus;

    // 奖项状态
    /**
     * @example 奖项状态
     *
     * @var bool
     */
    public $awardStatus;
    protected $_name = [
        'firmUserId'            => 'firm_user_id',
        'did'                   => 'did',
        'firmAddress'           => 'firm_address',
        'firmCertStatus'        => 'firm_cert_status',
        'industryType'          => 'industry_type',
        'certRegNo'             => 'cert_reg_no',
        'certRegFileId'         => 'cert_reg_file_id',
        'certRegFileType'       => 'cert_reg_file_type',
        'lpCertType'            => 'lp_cert_type',
        'lpCertNo'              => 'lp_cert_no',
        'lpName'                => 'lp_name',
        'lpCertFileFrontId'     => 'lp_cert_file_front_id',
        'lpCertFileFrontType'   => 'lp_cert_file_front_type',
        'lpCertFileReverseId'   => 'lp_cert_file_reverse_id',
        'lpCertFileReverseType' => 'lp_cert_file_reverse_type',
        'constructions'         => 'constructions',
        'firmName'              => 'firm_name',
        'referType'             => 'refer_type',
        'accountResults'        => 'account_results',
        'assures'               => 'assures',
        'awards'                => 'awards',
        'bankCert'              => 'bank_cert',
        'firmType'              => 'firm_type',
        'bankCertStatus'        => 'bank_cert_status',
        'constructionStatus'    => 'construction_status',
        'accountResultStatus'   => 'account_result_status',
        'awardStatus'           => 'award_status',
    ];

    public function validate()
    {
        Model::validateRequired('firmUserId', $this->firmUserId, true);
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('firmAddress', $this->firmAddress, true);
        Model::validateRequired('firmCertStatus', $this->firmCertStatus, true);
        Model::validateRequired('industryType', $this->industryType, true);
        Model::validateRequired('certRegNo', $this->certRegNo, true);
        Model::validateRequired('certRegFileId', $this->certRegFileId, true);
        Model::validateRequired('certRegFileType', $this->certRegFileType, true);
        Model::validateRequired('lpCertType', $this->lpCertType, true);
        Model::validateRequired('lpCertNo', $this->lpCertNo, true);
        Model::validateRequired('lpName', $this->lpName, true);
        Model::validateRequired('lpCertFileFrontId', $this->lpCertFileFrontId, true);
        Model::validateRequired('lpCertFileFrontType', $this->lpCertFileFrontType, true);
        Model::validateRequired('lpCertFileReverseId', $this->lpCertFileReverseId, true);
        Model::validateRequired('lpCertFileReverseType', $this->lpCertFileReverseType, true);
        Model::validateRequired('constructions', $this->constructions, true);
        Model::validateRequired('firmName', $this->firmName, true);
        Model::validateRequired('referType', $this->referType, true);
        Model::validateRequired('accountResults', $this->accountResults, true);
        Model::validateRequired('assures', $this->assures, true);
        Model::validateRequired('awards', $this->awards, true);
        Model::validateRequired('bankCert', $this->bankCert, true);
        Model::validateRequired('firmType', $this->firmType, true);
        Model::validateRequired('accountResultStatus', $this->accountResultStatus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->firmUserId) {
            $res['firm_user_id'] = $this->firmUserId;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->firmAddress) {
            $res['firm_address'] = $this->firmAddress;
        }
        if (null !== $this->firmCertStatus) {
            $res['firm_cert_status'] = $this->firmCertStatus;
        }
        if (null !== $this->industryType) {
            $res['industry_type'] = $this->industryType;
        }
        if (null !== $this->certRegNo) {
            $res['cert_reg_no'] = $this->certRegNo;
        }
        if (null !== $this->certRegFileId) {
            $res['cert_reg_file_id'] = $this->certRegFileId;
        }
        if (null !== $this->certRegFileType) {
            $res['cert_reg_file_type'] = $this->certRegFileType;
        }
        if (null !== $this->lpCertType) {
            $res['lp_cert_type'] = $this->lpCertType;
        }
        if (null !== $this->lpCertNo) {
            $res['lp_cert_no'] = $this->lpCertNo;
        }
        if (null !== $this->lpName) {
            $res['lp_name'] = $this->lpName;
        }
        if (null !== $this->lpCertFileFrontId) {
            $res['lp_cert_file_front_id'] = $this->lpCertFileFrontId;
        }
        if (null !== $this->lpCertFileFrontType) {
            $res['lp_cert_file_front_type'] = $this->lpCertFileFrontType;
        }
        if (null !== $this->lpCertFileReverseId) {
            $res['lp_cert_file_reverse_id'] = $this->lpCertFileReverseId;
        }
        if (null !== $this->lpCertFileReverseType) {
            $res['lp_cert_file_reverse_type'] = $this->lpCertFileReverseType;
        }
        if (null !== $this->constructions) {
            $res['constructions'] = [];
            if (null !== $this->constructions && \is_array($this->constructions)) {
                $n = 0;
                foreach ($this->constructions as $item) {
                    $res['constructions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->firmName) {
            $res['firm_name'] = $this->firmName;
        }
        if (null !== $this->referType) {
            $res['refer_type'] = $this->referType;
        }
        if (null !== $this->accountResults) {
            $res['account_results'] = [];
            if (null !== $this->accountResults && \is_array($this->accountResults)) {
                $n = 0;
                foreach ($this->accountResults as $item) {
                    $res['account_results'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->assures) {
            $res['assures'] = [];
            if (null !== $this->assures && \is_array($this->assures)) {
                $n = 0;
                foreach ($this->assures as $item) {
                    $res['assures'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->awards) {
            $res['awards'] = [];
            if (null !== $this->awards && \is_array($this->awards)) {
                $n = 0;
                foreach ($this->awards as $item) {
                    $res['awards'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->bankCert) {
            $res['bank_cert'] = null !== $this->bankCert ? $this->bankCert->toMap() : null;
        }
        if (null !== $this->firmType) {
            $res['firm_type'] = $this->firmType;
        }
        if (null !== $this->bankCertStatus) {
            $res['bank_cert_status'] = $this->bankCertStatus;
        }
        if (null !== $this->constructionStatus) {
            $res['construction_status'] = $this->constructionStatus;
        }
        if (null !== $this->accountResultStatus) {
            $res['account_result_status'] = $this->accountResultStatus;
        }
        if (null !== $this->awardStatus) {
            $res['award_status'] = $this->awardStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RefFirm
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['firm_user_id'])) {
            $model->firmUserId = $map['firm_user_id'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['firm_address'])) {
            $model->firmAddress = $map['firm_address'];
        }
        if (isset($map['firm_cert_status'])) {
            $model->firmCertStatus = $map['firm_cert_status'];
        }
        if (isset($map['industry_type'])) {
            $model->industryType = $map['industry_type'];
        }
        if (isset($map['cert_reg_no'])) {
            $model->certRegNo = $map['cert_reg_no'];
        }
        if (isset($map['cert_reg_file_id'])) {
            $model->certRegFileId = $map['cert_reg_file_id'];
        }
        if (isset($map['cert_reg_file_type'])) {
            $model->certRegFileType = $map['cert_reg_file_type'];
        }
        if (isset($map['lp_cert_type'])) {
            $model->lpCertType = $map['lp_cert_type'];
        }
        if (isset($map['lp_cert_no'])) {
            $model->lpCertNo = $map['lp_cert_no'];
        }
        if (isset($map['lp_name'])) {
            $model->lpName = $map['lp_name'];
        }
        if (isset($map['lp_cert_file_front_id'])) {
            $model->lpCertFileFrontId = $map['lp_cert_file_front_id'];
        }
        if (isset($map['lp_cert_file_front_type'])) {
            $model->lpCertFileFrontType = $map['lp_cert_file_front_type'];
        }
        if (isset($map['lp_cert_file_reverse_id'])) {
            $model->lpCertFileReverseId = $map['lp_cert_file_reverse_id'];
        }
        if (isset($map['lp_cert_file_reverse_type'])) {
            $model->lpCertFileReverseType = $map['lp_cert_file_reverse_type'];
        }
        if (isset($map['constructions'])) {
            if (!empty($map['constructions'])) {
                $model->constructions = [];
                $n                    = 0;
                foreach ($map['constructions'] as $item) {
                    $model->constructions[$n++] = null !== $item ? Construction::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['firm_name'])) {
            $model->firmName = $map['firm_name'];
        }
        if (isset($map['refer_type'])) {
            $model->referType = $map['refer_type'];
        }
        if (isset($map['account_results'])) {
            if (!empty($map['account_results'])) {
                $model->accountResults = [];
                $n                     = 0;
                foreach ($map['account_results'] as $item) {
                    $model->accountResults[$n++] = null !== $item ? AccountResult::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['assures'])) {
            if (!empty($map['assures'])) {
                $model->assures = [];
                $n              = 0;
                foreach ($map['assures'] as $item) {
                    $model->assures[$n++] = null !== $item ? Assure::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['awards'])) {
            if (!empty($map['awards'])) {
                $model->awards = [];
                $n             = 0;
                foreach ($map['awards'] as $item) {
                    $model->awards[$n++] = null !== $item ? Award::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['bank_cert'])) {
            $model->bankCert = BankCert::fromMap($map['bank_cert']);
        }
        if (isset($map['firm_type'])) {
            $model->firmType = $map['firm_type'];
        }
        if (isset($map['bank_cert_status'])) {
            $model->bankCertStatus = $map['bank_cert_status'];
        }
        if (isset($map['construction_status'])) {
            $model->constructionStatus = $map['construction_status'];
        }
        if (isset($map['account_result_status'])) {
            $model->accountResultStatus = $map['account_result_status'];
        }
        if (isset($map['award_status'])) {
            $model->awardStatus = $map['award_status'];
        }

        return $model;
    }
}
