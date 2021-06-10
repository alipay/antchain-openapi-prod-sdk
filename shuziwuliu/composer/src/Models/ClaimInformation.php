<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ClaimInformation extends Model
{
    // 索赔资料地址url
    /**
     * @example https://www.xxx.com
     *
     * @var string
     */
    public $fileUrl;

    // 文件名
    /**
     * @example 客服判责资料
     *
     * @var string
     */
    public $fileName;
    protected $_name = [
        'fileUrl'  => 'file_url',
        'fileName' => 'file_name',
    ];

    public function validate()
    {
        Model::validateRequired('fileUrl', $this->fileUrl, true);
        Model::validateRequired('fileName', $this->fileName, true);
        Model::validateMaxLength('fileUrl', $this->fileUrl, 500);
        Model::validateMaxLength('fileName', $this->fileName, 200);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ClaimInformation
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['file_url'])) {
            $model->fileUrl = $map['file_url'];
        }
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }

        return $model;
    }
}
