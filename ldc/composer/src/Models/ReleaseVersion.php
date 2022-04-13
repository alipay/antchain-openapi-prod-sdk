<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ReleaseVersion extends Model
{
    // 镜像
    /**
     * @example image1
     *
     * @var string
     */
    public $image;
    protected $_name = [
        'image' => 'image',
    ];

    public function validate()
    {
        Model::validateRequired('image', $this->image, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->image) {
            $res['image'] = $this->image;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReleaseVersion
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['image'])) {
            $model->image = $map['image'];
        }

        return $model;
    }
}
