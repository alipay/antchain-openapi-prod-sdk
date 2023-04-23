<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class PartnerSignFile extends Model
{
    // 文件类型
    /**
     * @example 文件类型
     *
     * @var string
     */
    public $type;

    // 文件名称
    /**
     * @example 文件名称
     *
     * @var string
     */
    public $name;

    // 可预览地址
    /**
     * @example http://oss-xxxx
     *
     * @var string
     */
    public $ossUrl;
    protected $_name = [
        'type'   => 'type',
        'name'   => 'name',
        'ossUrl' => 'oss_url',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('ossUrl', $this->ossUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->ossUrl) {
            $res['oss_url'] = $this->ossUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PartnerSignFile
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['oss_url'])) {
            $model->ossUrl = $map['oss_url'];
        }

        return $model;
    }
}
