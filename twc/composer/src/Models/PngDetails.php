<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class PngDetails extends Model
{
    // 明细唯一id
    /**
     * @example 1
     *
     * @var string
     */
    public $id;

    // 图片 osskey
    /**
     * @example ESIGN/ato/ca_png/ORG/111.png
     *
     * @var string
     */
    public $fileKey;
    protected $_name = [
        'id'      => 'id',
        'fileKey' => 'file_key',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('fileKey', $this->fileKey, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->fileKey) {
            $res['file_key'] = $this->fileKey;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PngDetails
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['file_key'])) {
            $model->fileKey = $map['file_key'];
        }

        return $model;
    }
}
