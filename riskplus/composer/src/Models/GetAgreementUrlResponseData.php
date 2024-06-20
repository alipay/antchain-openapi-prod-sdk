<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class GetAgreementUrlResponseData extends Model
{
    // 协议标题
    /**
     * @example 授信协议
     *
     * @var string
     */
    public $title;

    // 协议地址
    /**
     * @example http:xxxxxxxx
     *
     * @var string
     */
    public $agreementUrl;

    // 协议文件Base64
    /**
     * @example 111
     *
     * @var string
     */
    public $fileBase64;

    // 协议图片文件base64集合
    /**
     * @example 111111
     *
     * @var string[]
     */
    public $picFileBase64List;

    // 图片文件oss集合
    /**
     * @example
     *
     * @var string[]
     */
    public $picOssPathList;

    // 机构名称
    /**
     * @example 杭银
     *
     * @var string
     */
    public $organizationName;

    // 协议类型-code
    /**
     * @example APPLY
     *
     * @var string
     */
    public $fileType;

    // 协议类型-名称
    /**
     * @example 授信协议
     *
     * @var string
     */
    public $fileTypeName;
    protected $_name = [
        'title'             => 'title',
        'agreementUrl'      => 'agreement_url',
        'fileBase64'        => 'file_base64',
        'picFileBase64List' => 'pic_file_base64_list',
        'picOssPathList'    => 'pic_oss_path_list',
        'organizationName'  => 'organization_name',
        'fileType'          => 'file_type',
        'fileTypeName'      => 'file_type_name',
    ];

    public function validate()
    {
        Model::validateRequired('title', $this->title, true);
        Model::validateRequired('organizationName', $this->organizationName, true);
        Model::validateRequired('fileType', $this->fileType, true);
        Model::validateRequired('fileTypeName', $this->fileTypeName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->agreementUrl) {
            $res['agreement_url'] = $this->agreementUrl;
        }
        if (null !== $this->fileBase64) {
            $res['file_base64'] = $this->fileBase64;
        }
        if (null !== $this->picFileBase64List) {
            $res['pic_file_base64_list'] = $this->picFileBase64List;
        }
        if (null !== $this->picOssPathList) {
            $res['pic_oss_path_list'] = $this->picOssPathList;
        }
        if (null !== $this->organizationName) {
            $res['organization_name'] = $this->organizationName;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }
        if (null !== $this->fileTypeName) {
            $res['file_type_name'] = $this->fileTypeName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAgreementUrlResponseData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['agreement_url'])) {
            $model->agreementUrl = $map['agreement_url'];
        }
        if (isset($map['file_base64'])) {
            $model->fileBase64 = $map['file_base64'];
        }
        if (isset($map['pic_file_base64_list'])) {
            if (!empty($map['pic_file_base64_list'])) {
                $model->picFileBase64List = $map['pic_file_base64_list'];
            }
        }
        if (isset($map['pic_oss_path_list'])) {
            if (!empty($map['pic_oss_path_list'])) {
                $model->picOssPathList = $map['pic_oss_path_list'];
            }
        }
        if (isset($map['organization_name'])) {
            $model->organizationName = $map['organization_name'];
        }
        if (isset($map['file_type'])) {
            $model->fileType = $map['file_type'];
        }
        if (isset($map['file_type_name'])) {
            $model->fileTypeName = $map['file_type_name'];
        }

        return $model;
    }
}
