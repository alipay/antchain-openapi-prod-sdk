<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class Agreement extends Model
{
    // 协议编码
    /**
     * @example -
     *
     * @var string
     */
    public $agreementCode;

    // 协议名称
    /**
     * @example -
     *
     * @var string
     */
    public $agreementName;

    // 协议类型
    /**
     * @example USER_SERVICE_AUTH
     *
     * @var string
     */
    public $agreementType;

    // 第三方原始协议链接
    /**
     * @example -
     *
     * @var string
     */
    public $agreementUrl;

    // 协议文件上传目录
    /**
     * @example -
     *
     * @var string
     */
    public $agreementFileOssKey;

    // 上传时的协议原始文件名
    /**
     * @example -
     *
     * @var string
     */
    public $agreementFileOriginalName;

    // 下载链接
    /**
     * @example -
     *
     * @var string
     */
    public $downloadUrl;
    protected $_name = [
        'agreementCode'             => 'agreement_code',
        'agreementName'             => 'agreement_name',
        'agreementType'             => 'agreement_type',
        'agreementUrl'              => 'agreement_url',
        'agreementFileOssKey'       => 'agreement_file_oss_key',
        'agreementFileOriginalName' => 'agreement_file_original_name',
        'downloadUrl'               => 'download_url',
    ];

    public function validate()
    {
        Model::validateRequired('agreementCode', $this->agreementCode, true);
        Model::validateRequired('agreementName', $this->agreementName, true);
        Model::validateRequired('agreementType', $this->agreementType, true);
        Model::validateRequired('agreementUrl', $this->agreementUrl, true);
        Model::validateRequired('agreementFileOssKey', $this->agreementFileOssKey, true);
        Model::validateRequired('agreementFileOriginalName', $this->agreementFileOriginalName, true);
        Model::validateRequired('downloadUrl', $this->downloadUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->agreementCode) {
            $res['agreement_code'] = $this->agreementCode;
        }
        if (null !== $this->agreementName) {
            $res['agreement_name'] = $this->agreementName;
        }
        if (null !== $this->agreementType) {
            $res['agreement_type'] = $this->agreementType;
        }
        if (null !== $this->agreementUrl) {
            $res['agreement_url'] = $this->agreementUrl;
        }
        if (null !== $this->agreementFileOssKey) {
            $res['agreement_file_oss_key'] = $this->agreementFileOssKey;
        }
        if (null !== $this->agreementFileOriginalName) {
            $res['agreement_file_original_name'] = $this->agreementFileOriginalName;
        }
        if (null !== $this->downloadUrl) {
            $res['download_url'] = $this->downloadUrl;
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
        if (isset($map['agreement_code'])) {
            $model->agreementCode = $map['agreement_code'];
        }
        if (isset($map['agreement_name'])) {
            $model->agreementName = $map['agreement_name'];
        }
        if (isset($map['agreement_type'])) {
            $model->agreementType = $map['agreement_type'];
        }
        if (isset($map['agreement_url'])) {
            $model->agreementUrl = $map['agreement_url'];
        }
        if (isset($map['agreement_file_oss_key'])) {
            $model->agreementFileOssKey = $map['agreement_file_oss_key'];
        }
        if (isset($map['agreement_file_original_name'])) {
            $model->agreementFileOriginalName = $map['agreement_file_original_name'];
        }
        if (isset($map['download_url'])) {
            $model->downloadUrl = $map['download_url'];
        }

        return $model;
    }
}
