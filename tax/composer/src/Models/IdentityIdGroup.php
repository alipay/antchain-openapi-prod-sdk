<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class IdentityIdGroup extends Model
{
    // 数据源
    /**
     * @example SHANDONG
     *
     * @var string
     */
    public $channel;

    // 上传的文件
    /**
     * @example jklsdjfl
     *
     * @var string
     */
    public $fileUrl;
    protected $_name = [
        'channel' => 'channel',
        'fileUrl' => 'file_url',
    ];

    public function validate()
    {
        Model::validateRequired('channel', $this->channel, true);
        Model::validateRequired('fileUrl', $this->fileUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IdentityIdGroup
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['channel'])) {
            $model->channel = $map['channel'];
        }
        if (isset($map['file_url'])) {
            $model->fileUrl = $map['file_url'];
        }

        return $model;
    }
}
