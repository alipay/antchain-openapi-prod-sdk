<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class AgreementFile extends Model
{
    // 授权文件名称
    /**
     * @example 1.pdf
     *
     * @var string
     */
    public $fileName;

    // 授权文件内容
    /**
     * @example JVBERi0xLjUKJYCBgoMKMSAwIG9iago8PC9GaWx0ZXIvRmxhdGVEZWNvZGUvRmlyc3QgMTQxL04gMjAvTGVuZ3==
     *
     * @var string
     */
    public $fileContentBase64String;
    protected $_name = [
        'fileName'                => 'file_name',
        'fileContentBase64String' => 'file_content_base64_string',
    ];

    public function validate()
    {
        Model::validateRequired('fileName', $this->fileName, true);
        Model::validateRequired('fileContentBase64String', $this->fileContentBase64String, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->fileContentBase64String) {
            $res['file_content_base64_string'] = $this->fileContentBase64String;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AgreementFile
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['file_content_base64_string'])) {
            $model->fileContentBase64String = $map['file_content_base64_string'];
        }

        return $model;
    }
}
