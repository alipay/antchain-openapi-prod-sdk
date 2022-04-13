<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class SpannerSubClusterOverrides extends Model
{
    // 机房/可用区
    /**
     * @example cn-shanghai-a
     *
     * @var string
     */
    public $zone;

    // spanner镜像地址
    /**
     * @example xxx.com/soafstack/spanner:1.1.1
     *
     * @var string
     */
    public $image;
    protected $_name = [
        'zone'  => 'zone',
        'image' => 'image',
    ];

    public function validate()
    {
        Model::validateRequired('zone', $this->zone, true);
        Model::validateRequired('image', $this->image, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->zone) {
            $res['zone'] = $this->zone;
        }
        if (null !== $this->image) {
            $res['image'] = $this->image;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SpannerSubClusterOverrides
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['zone'])) {
            $model->zone = $map['zone'];
        }
        if (isset($map['image'])) {
            $model->image = $map['image'];
        }

        return $model;
    }
}
