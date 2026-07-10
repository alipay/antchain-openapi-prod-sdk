<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class MonitorType extends Model
{
    // 文件类型
    /**
     * @example jpg
     *
     * @var string
     */
    public $fileType;

    // 提交类型
    /**
     * @example FILE
     *
     * @var string
     */
    public $submitType;
    protected $_name = [
        'fileType'   => 'file_type',
        'submitType' => 'submit_type',
    ];

    public function validate()
    {
        Model::validateRequired('fileType', $this->fileType, true);
        Model::validateRequired('submitType', $this->submitType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }
        if (null !== $this->submitType) {
            $res['submit_type'] = $this->submitType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MonitorType
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['file_type'])) {
            $model->fileType = $map['file_type'];
        }
        if (isset($map['submit_type'])) {
            $model->submitType = $map['submit_type'];
        }

        return $model;
    }
}
