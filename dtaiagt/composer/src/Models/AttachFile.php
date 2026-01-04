<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class AttachFile extends Model
{
    // 文件Id
    //
    /**
     * @example 123
     *
     * @var string
     */
    public $fileId;

    // 文件名称
    //
    /**
     * @example 文件名称
     *
     * @var string
     */
    public $fileName;

    // 文件类型
    //
    /**
     * @example txt
     *
     * @var string
     */
    public $fileType;

    // 文件来源
    //
    /**
     * @example 1
     *
     * @var string
     */
    public $fileSource;

    // 文件链接
    //
    /**
     * @example "http://..."
     *
     * @var string
     */
    public $fileUrl;

    // 文件总结
    //
    /**
     * @example "文件摘要"
     *
     * @var string
     */
    public $fileSummary;

    // 上传时间
    //
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $operateTime;

    // Map<String, String>	扩展信息
    //
    /**
     * @example {}
     *
     * @var string
     */
    public $extInfo;

    // 文件大小
    //
    /**
     * @example 1111
     *
     * @var string
     */
    public $fileSize;

    // 内容库 dbId, 用于检索
    //
    /**
     * @example 123
     *
     * @var string
     */
    public $contentId;
    protected $_name = [
        'fileId'      => 'file_id',
        'fileName'    => 'file_name',
        'fileType'    => 'file_type',
        'fileSource'  => 'file_source',
        'fileUrl'     => 'file_url',
        'fileSummary' => 'file_summary',
        'operateTime' => 'operate_time',
        'extInfo'     => 'ext_info',
        'fileSize'    => 'file_size',
        'contentId'   => 'content_id',
    ];

    public function validate()
    {
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('fileName', $this->fileName, true);
        Model::validateRequired('fileType', $this->fileType, true);
        Model::validateRequired('fileSource', $this->fileSource, true);
        Model::validateRequired('fileUrl', $this->fileUrl, true);
        Model::validateRequired('fileSummary', $this->fileSummary, true);
        Model::validateRequired('operateTime', $this->operateTime, true);
        Model::validateRequired('extInfo', $this->extInfo, true);
        Model::validateRequired('fileSize', $this->fileSize, true);
        Model::validateRequired('contentId', $this->contentId, true);
        Model::validatePattern('operateTime', $this->operateTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }
        if (null !== $this->fileSource) {
            $res['file_source'] = $this->fileSource;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }
        if (null !== $this->fileSummary) {
            $res['file_summary'] = $this->fileSummary;
        }
        if (null !== $this->operateTime) {
            $res['operate_time'] = $this->operateTime;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        if (null !== $this->fileSize) {
            $res['file_size'] = $this->fileSize;
        }
        if (null !== $this->contentId) {
            $res['content_id'] = $this->contentId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AttachFile
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['file_type'])) {
            $model->fileType = $map['file_type'];
        }
        if (isset($map['file_source'])) {
            $model->fileSource = $map['file_source'];
        }
        if (isset($map['file_url'])) {
            $model->fileUrl = $map['file_url'];
        }
        if (isset($map['file_summary'])) {
            $model->fileSummary = $map['file_summary'];
        }
        if (isset($map['operate_time'])) {
            $model->operateTime = $map['operate_time'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }
        if (isset($map['file_size'])) {
            $model->fileSize = $map['file_size'];
        }
        if (isset($map['content_id'])) {
            $model->contentId = $map['content_id'];
        }

        return $model;
    }
}
