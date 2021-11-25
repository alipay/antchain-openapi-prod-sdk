<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class AccountResult extends Model
{
    // 财报ID
    //
    //
    /**
     * @example 财报ID
     *
     * @var string
     */
    public $accResultId;

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
        'accResultId' => 'acc_result_id',
        'fileDefines' => 'file_defines',
    ];

    public function validate()
    {
        Model::validateRequired('accResultId', $this->accResultId, true);
        Model::validateRequired('fileDefines', $this->fileDefines, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accResultId) {
            $res['acc_result_id'] = $this->accResultId;
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
     * @return AccountResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['acc_result_id'])) {
            $model->accResultId = $map['acc_result_id'];
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
