<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAM\Models;

use AlibabaCloud\Tea\Model;

class UploadRequestArray extends Model
{
    // 文件数据
    /**
     * @example [uploadResult,uploadResult]
     *
     * @var UploadRequest
     */
    public $uploadArray;
    protected $_name = [
        'uploadArray' => 'upload_array',
    ];

    public function validate()
    {
        Model::validateRequired('uploadArray', $this->uploadArray, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->uploadArray) {
            $res['upload_array'] = null !== $this->uploadArray ? $this->uploadArray->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadRequestArray
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['upload_array'])) {
            $model->uploadArray = UploadRequest::fromMap($map['upload_array']);
        }

        return $model;
    }
}
