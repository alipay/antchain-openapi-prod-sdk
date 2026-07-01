<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class AntSignFileResult extends Model
{
    // fileName	文件名称
    /**
     * @example 111.pdf
     *
     * @var string
     */
    public $fileName;

    // 文件osskey
    /**
     * @example key
     *
     * @var string
     */
    public $fileKey;

    // 文件id
    /**
     * @example 12313124112
     *
     * @var string
     */
    public $fileId;

    // 文件http链接
    /**
     * @example http://aaaa
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
     * @return AntSignFileResult
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
