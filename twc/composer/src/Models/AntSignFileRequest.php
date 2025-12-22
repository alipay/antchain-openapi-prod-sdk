<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class AntSignFileRequest extends Model
{
    // 文件名称
    /**
     * @example 测试文字.pdf
     *
     * @var string
     */
    public $fileName;

    // 文件httpUrl
    /**
     * @example http://aaaaa
     *
     * @var string
     */
    public $fileHttpUrl;

    // 单次请求文件唯一id，与CaSystemSignFileRequest中的fileId对应
    /**
     * @example 79ffa96040044b49b0fde8c3feb4898
     *
     * @var string
     */
    public $fileId;

    // 文件类型（只支持pdf）
    /**
     * @example pdf
     *
     * @var string
     */
    public $fileType;
    protected $_name = [
        'fileName'    => 'file_name',
        'fileHttpUrl' => 'file_http_url',
        'fileId'      => 'file_id',
        'fileType'    => 'file_type',
    ];

    public function validate()
    {
        Model::validateRequired('fileName', $this->fileName, true);
        Model::validateRequired('fileHttpUrl', $this->fileHttpUrl, true);
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('fileType', $this->fileType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->fileHttpUrl) {
            $res['file_http_url'] = $this->fileHttpUrl;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AntSignFileRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['file_http_url'])) {
            $model->fileHttpUrl = $map['file_http_url'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['file_type'])) {
            $model->fileType = $map['file_type'];
        }

        return $model;
    }
}
