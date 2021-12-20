<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ZJLM\Models;

use AlibabaCloud\Tea\Model;

class FileInfoModelResponse extends Model
{
    // 文件名称
    /**
     * @example file_name
     *
     * @var string
     */
    public $fileName;

    // 文件别名
    /**
     * @example alias_name
     *
     * @var string
     */
    public $aliasName;

    // 文件类型
    /**
     * @example file_type
     *
     * @var string
     */
    public $fileType;

    // 文件访问url 地址
    /**
     * @example oss_url
     *
     * @var string
     */
    public $ossUrl;
    protected $_name = [
        'fileName'  => 'file_name',
        'aliasName' => 'alias_name',
        'fileType'  => 'file_type',
        'ossUrl'    => 'oss_url',
    ];

    public function validate()
    {
        Model::validateRequired('fileName', $this->fileName, true);
        Model::validateRequired('aliasName', $this->aliasName, true);
        Model::validateRequired('fileType', $this->fileType, true);
        Model::validateRequired('ossUrl', $this->ossUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->aliasName) {
            $res['alias_name'] = $this->aliasName;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }
        if (null !== $this->ossUrl) {
            $res['oss_url'] = $this->ossUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FileInfoModelResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['alias_name'])) {
            $model->aliasName = $map['alias_name'];
        }
        if (isset($map['file_type'])) {
            $model->fileType = $map['file_type'];
        }
        if (isset($map['oss_url'])) {
            $model->ossUrl = $map['oss_url'];
        }

        return $model;
    }
}
