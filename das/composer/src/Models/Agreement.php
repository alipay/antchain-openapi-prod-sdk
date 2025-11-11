<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class Agreement extends Model
{
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
    protected $_name = [
        'agreementName'             => 'agreement_name',
        'agreementType'             => 'agreement_type',
        'agreementUrl'              => 'agreement_url',
        'agreementFileOssKey'       => 'agreement_file_oss_key',
        'agreementFileOriginalName' => 'agreement_file_original_name',
    ];

    public function validate()
    {
        Model::validateRequired('agreementName', $this->agreementName, true);
        Model::validateRequired('agreementType', $this->agreementType, true);
        Model::validateRequired('agreementUrl', $this->agreementUrl, true);
        Model::validateRequired('agreementFileOssKey', $this->agreementFileOssKey, true);
        Model::validateRequired('agreementFileOriginalName', $this->agreementFileOriginalName, true);
    }

    public function toMap()
    {
        $res = [];
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

        return $model;
    }
}
