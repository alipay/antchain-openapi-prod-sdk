<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class ArchiveInfo extends Model
{
    // 附件存储OSS路径
    /**
     * @example rtc-ningbo/323234545454/43242323232.jpg
     *
     * @var string
     */
    public $ossKey;

    // 附件材料类型，比如：AT_SUOYOUQUANZHENG=房屋所有权证
    /**
     * @example AT_SUOYOUQUANZHENG
     *
     * @var string
     */
    public $type;

    // 附件内容摘要
    /**
     * @example 5111c579a5c05e8b4eb7b3d4e70e676df959d77f6bbaf56ce72adb113083252b
     *
     * @var string
     */
    public $hash;
    protected $_name = [
        'ossKey' => 'oss_key',
        'type'   => 'type',
        'hash'   => 'hash',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ossKey) {
            $res['oss_key'] = $this->ossKey;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->hash) {
            $res['hash'] = $this->hash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ArchiveInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['oss_key'])) {
            $model->ossKey = $map['oss_key'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['hash'])) {
            $model->hash = $map['hash'];
        }

        return $model;
    }
}
