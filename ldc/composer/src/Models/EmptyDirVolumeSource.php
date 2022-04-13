<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class EmptyDirVolumeSource extends Model
{
    // 存储介质。
    /**
     * @example memory
     *
     * @var string
     */
    public $medium;

    // volume name。
    /**
     * @example vol
     *
     * @var string
     */
    public $name;

    // 存储大小。
    /**
     * @example 100g
     *
     * @var string
     */
    public $sizeLimit;
    protected $_name = [
        'medium'    => 'medium',
        'name'      => 'name',
        'sizeLimit' => 'size_limit',
    ];

    public function validate()
    {
        Model::validateRequired('medium', $this->medium, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('sizeLimit', $this->sizeLimit, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->medium) {
            $res['medium'] = $this->medium;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->sizeLimit) {
            $res['size_limit'] = $this->sizeLimit;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EmptyDirVolumeSource
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['medium'])) {
            $model->medium = $map['medium'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['size_limit'])) {
            $model->sizeLimit = $map['size_limit'];
        }

        return $model;
    }
}
