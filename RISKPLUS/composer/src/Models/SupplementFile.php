<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class SupplementFile extends Model
{
    // 材料类型：
    // 301-行驶证正本
    // 302-行驶证副本
    // 303-车辆产证（摩托车二手车）
    //
    /**
     * @example xxx
     *
     * @var string
     */
    public $fileType;

    // 材料url
    /**
     * @example xxx
     *
     * @var string
     */
    public $fileUrl;

    // 材料名称/描述
    /**
     * @example xxx
     *
     * @var string
     */
    public $fileDesc;

    // 材料后缀，如png/jpg/jpeg
    /**
     * @example png
     *
     * @var string
     */
    public $fileSuffix;
    protected $_name = [
        'fileType'   => 'file_type',
        'fileUrl'    => 'file_url',
        'fileDesc'   => 'file_desc',
        'fileSuffix' => 'file_suffix',
    ];

    public function validate()
    {
        Model::validateRequired('fileType', $this->fileType, true);
        Model::validateRequired('fileUrl', $this->fileUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }
        if (null !== $this->fileDesc) {
            $res['file_desc'] = $this->fileDesc;
        }
        if (null !== $this->fileSuffix) {
            $res['file_suffix'] = $this->fileSuffix;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SupplementFile
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['file_type'])) {
            $model->fileType = $map['file_type'];
        }
        if (isset($map['file_url'])) {
            $model->fileUrl = $map['file_url'];
        }
        if (isset($map['file_desc'])) {
            $model->fileDesc = $map['file_desc'];
        }
        if (isset($map['file_suffix'])) {
            $model->fileSuffix = $map['file_suffix'];
        }

        return $model;
    }
}
