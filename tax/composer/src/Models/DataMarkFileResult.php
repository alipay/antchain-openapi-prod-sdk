<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class DataMarkFileResult extends Model
{
    // 返回数据再oss上的地址
    /**
     * @example http://invoice
     *
     * @var string
     */
    public $fileUrl;

    // 秘钥
    /**
     * @example 秘钥
     *
     * @var string
     */
    public $secret;
    protected $_name = [
        'fileUrl' => 'file_url',
        'secret'  => 'secret',
    ];

    public function validate()
    {
        Model::validateRequired('fileUrl', $this->fileUrl, true);
        Model::validateRequired('secret', $this->secret, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }
        if (null !== $this->secret) {
            $res['secret'] = $this->secret;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DataMarkFileResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['file_url'])) {
            $model->fileUrl = $map['file_url'];
        }
        if (isset($map['secret'])) {
            $model->secret = $map['secret'];
        }

        return $model;
    }
}
