<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class DubheFileInfo extends Model
{
    // 文件访问路径
    /**
     * @example https://aa.bb.png?expiredtime=xx
     *
     * @var string
     */
    public $filePath;
    protected $_name = [
        'filePath' => 'file_path',
    ];

    public function validate()
    {
        Model::validateRequired('filePath', $this->filePath, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->filePath) {
            $res['file_path'] = $this->filePath;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DubheFileInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['file_path'])) {
            $model->filePath = $map['file_path'];
        }

        return $model;
    }
}
