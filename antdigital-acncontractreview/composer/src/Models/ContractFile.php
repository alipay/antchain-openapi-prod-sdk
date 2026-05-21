<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACNCONTRACTREVIEW\Models;

use AlibabaCloud\Tea\Model;

class ContractFile extends Model
{
    // 文件名称
    /**
     * @example XXX.docx
     *
     * @var string
     */
    public $fileName;

    // 文件下载地址
    /**
     * @example https://xxx
     *
     * @var string
     */
    public $fileUrl;

    // 文件类型，如 docx、pdf
    /**
     * @example docx
     *
     * @var string
     */
    public $fileType;
    protected $_name = [
        'fileName' => 'file_name',
        'fileUrl'  => 'file_url',
        'fileType' => 'file_type',
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
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractFile
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['file_url'])) {
            $model->fileUrl = $map['file_url'];
        }
        if (isset($map['file_type'])) {
            $model->fileType = $map['file_type'];
        }

        return $model;
    }
}
