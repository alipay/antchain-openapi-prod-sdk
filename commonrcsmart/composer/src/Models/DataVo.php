<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMONRCSMART\Models;

use AlibabaCloud\Tea\Model;

class DataVo extends Model
{
    // 文件审核地址
    /**
     * @example https://xxxxxxx
     *
     * @var string
     */
    public $url;

    // 文件类型
    /**
     * @example doc/jpg
     *
     * @var string
     */
    public $fileType;
    protected $_name = [
        'url'      => 'url',
        'fileType' => 'file_type',
    ];

    public function validate()
    {
        Model::validateRequired('url', $this->url, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DataVo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }
        if (isset($map['file_type'])) {
            $model->fileType = $map['file_type'];
        }

        return $model;
    }
}
