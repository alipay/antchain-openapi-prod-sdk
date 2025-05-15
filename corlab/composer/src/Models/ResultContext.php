<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CORLAB\Models;

use AlibabaCloud\Tea\Model;

class ResultContext extends Model
{
    // 产品码
    /**
     * @example aft_v4
     *
     * @var string
     */
    public $productCode;

    // 结果文件名
    /**
     * @example 结果文件名
     *
     * @var string
     */
    public $fileName;

    // 结果文件下载地址
    /**
     * @example oss://xxxxx/xxxx
     *
     * @var string
     */
    public $fileUrl;
    protected $_name = [
        'productCode' => 'product_code',
        'fileName'    => 'file_name',
        'fileUrl'     => 'file_url',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ResultContext
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['file_url'])) {
            $model->fileUrl = $map['file_url'];
        }

        return $model;
    }
}
