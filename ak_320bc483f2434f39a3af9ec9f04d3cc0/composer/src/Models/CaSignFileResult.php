<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models;

use AlibabaCloud\Tea\Model;

class CaSignFileResult extends Model
{
    // 文件名称
    /**
     * @example 测试文件.pdf
     *
     * @var string
     */
    public $fileName;

    // 文件osskey
    /**
     * @example ESIGN/file.pdf
     *
     * @var string
     */
    public $fileKey;

    // 文件id
    /**
     * @example 文件id
     *
     * @var string
     */
    public $fileId;

    // 文件http链接
    /**
     * @example https://esignoss.esign.cn/1111563786/df698ebc-7857-4aa8-9d50-ace33050fe93
     *
     * @var string
     */
    public $httpFileUrl;
    protected $_name = [
        'fileName'    => 'file_name',
        'fileKey'     => 'file_key',
        'fileId'      => 'file_id',
        'httpFileUrl' => 'http_file_url',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->fileKey) {
            $res['file_key'] = $this->fileKey;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->httpFileUrl) {
            $res['http_file_url'] = $this->httpFileUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CaSignFileResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['file_key'])) {
            $model->fileKey = $map['file_key'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['http_file_url'])) {
            $model->httpFileUrl = $map['http_file_url'];
        }

        return $model;
    }
}
