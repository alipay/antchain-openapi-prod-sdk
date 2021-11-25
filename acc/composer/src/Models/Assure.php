<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class Assure extends Model
{
    // 担保ID
    //
    //
    /**
     * @example 担保ID
     *
     * @var string
     */
    public $assureId;

    // 文件信息，支持上传多个文件
    //
    //
    /**
     * @example 文件信息，支持上传多个文件
     *
     * @var FileDefine[]
     */
    public $fileDefines;
    protected $_name = [
        'assureId'    => 'assure_id',
        'fileDefines' => 'file_defines',
    ];

    public function validate()
    {
        Model::validateRequired('assureId', $this->assureId, true);
        Model::validateRequired('fileDefines', $this->fileDefines, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->assureId) {
            $res['assure_id'] = $this->assureId;
        }
        if (null !== $this->fileDefines) {
            $res['file_defines'] = [];
            if (null !== $this->fileDefines && \is_array($this->fileDefines)) {
                $n = 0;
                foreach ($this->fileDefines as $item) {
                    $res['file_defines'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Assure
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['assure_id'])) {
            $model->assureId = $map['assure_id'];
        }
        if (isset($map['file_defines'])) {
            if (!empty($map['file_defines'])) {
                $model->fileDefines = [];
                $n                  = 0;
                foreach ($map['file_defines'] as $item) {
                    $model->fileDefines[$n++] = null !== $item ? FileDefine::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
