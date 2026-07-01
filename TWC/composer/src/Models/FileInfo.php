<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class FileInfo extends Model
{
    // 文件key
    /**
     * @example 4293ed08-3576-4f35-a65d-0d63ae8c0e8b.jpg
     *
     * @var string
     */
    public $fileKey;

    // 文件名称
    /**
     * @example userInfo.jpg
     *
     * @var string
     */
    public $fileName;

    // 文件类型(枚举)
    // CASE_NOTICE: 立案通知书
    // CASE_VERDICT: 仲裁裁决书
    // CASE_EFFECT_PROVE: 裁决书司法生效证明
    // CASE_SERVED_NOTICE: 电子送达通知
    // PAYMETN_INFO: 缴费相关文件
    /**
     * @example CASE_NOTICE
     *
     * @var string
     */
    public $fileType;
    protected $_name = [
        'fileKey'  => 'file_key',
        'fileName' => 'file_name',
        'fileType' => 'file_type',
    ];

    public function validate()
    {
        Model::validateRequired('fileKey', $this->fileKey, true);
        Model::validateRequired('fileName', $this->fileName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fileKey) {
            $res['file_key'] = $this->fileKey;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FileInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['file_key'])) {
            $model->fileKey = $map['file_key'];
        }
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['file_type'])) {
            $model->fileType = $map['file_type'];
        }

        return $model;
    }
}
