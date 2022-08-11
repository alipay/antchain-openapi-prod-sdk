<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_4b3196fa612148cd8407b20f4e5ed132\Models;

use AlibabaCloud\Tea\Model;

class Agreement extends Model
{
    // 电子合同pdf文件存储路径
    /**
     * @example bk-ningbo/rpc/20200810001220130000000000000001/2312121.pdf
     *
     * @var string
     */
    public $arArchiveOssPath;

    // 合同编号
    /**
     * @example 20200810001220120000000000000001
     *
     * @var string
     */
    public $arNo;

    // 合同模版
    /**
     * @example aa
     *
     * @var ArTemplate
     */
    public $arTemplate;

    // 合同类型，比如：房屋查询授权合同
    /**
     * @example CT_AUTH_HOUSE_QUERY
     *
     * @var string
     */
    public $arType;

    // 需要签署合同的角色列表，如：BANK,HOUSE_OWNER,BORROWER
    /**
     * @example
     *
     * @var string[]
     */
    public $arSignerRoles;

    // 合同模版需要的变量和值集合,Map<String,String>的json格式
    /**
     * @example {"k1":"v1","k2":"v2"}
     *
     * @var string
     */
    public $arVarValueJson;

    // 区块链智能合同合同文件号
    /**
     * @example 2232322344545
     *
     * @var string
     */
    public $mycFileNo;

    // 外部合同编号(银行生成)
    /**
     * @example 334345454131313131
     *
     * @var string
     */
    public $outArNo;

    // 合同签署流程编号
    /**
     * @example 20200810001220110000000000000001
     *
     * @var string
     */
    public $procNo;

    // 合同签署时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $signTime;

    // 签署状态，比如：SUCC=签署完成
    /**
     * @example SUCC
     *
     * @var string
     */
    public $status;

    // 待签署的合同文档oss存储路径，仅当不动产合同才有
    /**
     * @example rtc-zhuhai/13232323343/2334.pdf
     *
     * @var string
     */
    public $unSignArArchiveOssPath;

    // 合同生成方式，AR_TP=模版
    /**
     * @example AR_TP
     *
     * @var string
     */
    public $arGenerateType;

    // 智能合同部分的签署区设置
    /**
     * @example
     *
     * @var ArSignConfig[]
     */
    public $ctSignConfigs;

    // 机构自主签署部分的签署区设置
    /**
     * @example
     *
     * @var ArSignConfig[]
     */
    public $orgSignConfigs;

    // 机构签署状态，SUCC=签署完成
    /**
     * @example SUCC
     *
     * @var string
     */
    public $orgSignStatus;

    // 机构签署完成时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $orgSignTime;

    // 机构签署完成后的合同存储路径
    /**
     * @example bk-ningbo/12334343434/a.pdf
     *
     * @var string
     */
    public $orgArArchiveOssPath;

    // 最终签署完成的合同存储路径
    /**
     * @example bk_ningbo/20200810001221010000000000000001/23332323.pdf
     *
     * @var string
     */
    public $finalArArchiveOssPath;
    protected $_name = [
        'arArchiveOssPath'       => 'ar_archive_oss_path',
        'arNo'                   => 'ar_no',
        'arTemplate'             => 'ar_template',
        'arType'                 => 'ar_type',
        'arSignerRoles'          => 'ar_signer_roles',
        'arVarValueJson'         => 'ar_var_value_json',
        'mycFileNo'              => 'myc_file_no',
        'outArNo'                => 'out_ar_no',
        'procNo'                 => 'proc_no',
        'signTime'               => 'sign_time',
        'status'                 => 'status',
        'unSignArArchiveOssPath' => 'un_sign_ar_archive_oss_path',
        'arGenerateType'         => 'ar_generate_type',
        'ctSignConfigs'          => 'ct_sign_configs',
        'orgSignConfigs'         => 'org_sign_configs',
        'orgSignStatus'          => 'org_sign_status',
        'orgSignTime'            => 'org_sign_time',
        'orgArArchiveOssPath'    => 'org_ar_archive_oss_path',
        'finalArArchiveOssPath'  => 'final_ar_archive_oss_path',
    ];

    public function validate()
    {
        Model::validatePattern('signTime', $this->signTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('orgSignTime', $this->orgSignTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->arArchiveOssPath) {
            $res['ar_archive_oss_path'] = $this->arArchiveOssPath;
        }
        if (null !== $this->arNo) {
            $res['ar_no'] = $this->arNo;
        }
        if (null !== $this->arTemplate) {
            $res['ar_template'] = null !== $this->arTemplate ? $this->arTemplate->toMap() : null;
        }
        if (null !== $this->arType) {
            $res['ar_type'] = $this->arType;
        }
        if (null !== $this->arSignerRoles) {
            $res['ar_signer_roles'] = $this->arSignerRoles;
        }
        if (null !== $this->arVarValueJson) {
            $res['ar_var_value_json'] = $this->arVarValueJson;
        }
        if (null !== $this->mycFileNo) {
            $res['myc_file_no'] = $this->mycFileNo;
        }
        if (null !== $this->outArNo) {
            $res['out_ar_no'] = $this->outArNo;
        }
        if (null !== $this->procNo) {
            $res['proc_no'] = $this->procNo;
        }
        if (null !== $this->signTime) {
            $res['sign_time'] = $this->signTime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->unSignArArchiveOssPath) {
            $res['un_sign_ar_archive_oss_path'] = $this->unSignArArchiveOssPath;
        }
        if (null !== $this->arGenerateType) {
            $res['ar_generate_type'] = $this->arGenerateType;
        }
        if (null !== $this->ctSignConfigs) {
            $res['ct_sign_configs'] = [];
            if (null !== $this->ctSignConfigs && \is_array($this->ctSignConfigs)) {
                $n = 0;
                foreach ($this->ctSignConfigs as $item) {
                    $res['ct_sign_configs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->orgSignConfigs) {
            $res['org_sign_configs'] = [];
            if (null !== $this->orgSignConfigs && \is_array($this->orgSignConfigs)) {
                $n = 0;
                foreach ($this->orgSignConfigs as $item) {
                    $res['org_sign_configs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->orgSignStatus) {
            $res['org_sign_status'] = $this->orgSignStatus;
        }
        if (null !== $this->orgSignTime) {
            $res['org_sign_time'] = $this->orgSignTime;
        }
        if (null !== $this->orgArArchiveOssPath) {
            $res['org_ar_archive_oss_path'] = $this->orgArArchiveOssPath;
        }
        if (null !== $this->finalArArchiveOssPath) {
            $res['final_ar_archive_oss_path'] = $this->finalArArchiveOssPath;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Agreement
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ar_archive_oss_path'])) {
            $model->arArchiveOssPath = $map['ar_archive_oss_path'];
        }
        if (isset($map['ar_no'])) {
            $model->arNo = $map['ar_no'];
        }
        if (isset($map['ar_template'])) {
            $model->arTemplate = ArTemplate::fromMap($map['ar_template']);
        }
        if (isset($map['ar_type'])) {
            $model->arType = $map['ar_type'];
        }
        if (isset($map['ar_signer_roles'])) {
            if (!empty($map['ar_signer_roles'])) {
                $model->arSignerRoles = $map['ar_signer_roles'];
            }
        }
        if (isset($map['ar_var_value_json'])) {
            $model->arVarValueJson = $map['ar_var_value_json'];
        }
        if (isset($map['myc_file_no'])) {
            $model->mycFileNo = $map['myc_file_no'];
        }
        if (isset($map['out_ar_no'])) {
            $model->outArNo = $map['out_ar_no'];
        }
        if (isset($map['proc_no'])) {
            $model->procNo = $map['proc_no'];
        }
        if (isset($map['sign_time'])) {
            $model->signTime = $map['sign_time'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['un_sign_ar_archive_oss_path'])) {
            $model->unSignArArchiveOssPath = $map['un_sign_ar_archive_oss_path'];
        }
        if (isset($map['ar_generate_type'])) {
            $model->arGenerateType = $map['ar_generate_type'];
        }
        if (isset($map['ct_sign_configs'])) {
            if (!empty($map['ct_sign_configs'])) {
                $model->ctSignConfigs = [];
                $n                    = 0;
                foreach ($map['ct_sign_configs'] as $item) {
                    $model->ctSignConfigs[$n++] = null !== $item ? ArSignConfig::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['org_sign_configs'])) {
            if (!empty($map['org_sign_configs'])) {
                $model->orgSignConfigs = [];
                $n                     = 0;
                foreach ($map['org_sign_configs'] as $item) {
                    $model->orgSignConfigs[$n++] = null !== $item ? ArSignConfig::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['org_sign_status'])) {
            $model->orgSignStatus = $map['org_sign_status'];
        }
        if (isset($map['org_sign_time'])) {
            $model->orgSignTime = $map['org_sign_time'];
        }
        if (isset($map['org_ar_archive_oss_path'])) {
            $model->orgArArchiveOssPath = $map['org_ar_archive_oss_path'];
        }
        if (isset($map['final_ar_archive_oss_path'])) {
            $model->finalArArchiveOssPath = $map['final_ar_archive_oss_path'];
        }

        return $model;
    }
}
