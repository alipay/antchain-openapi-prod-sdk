<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RtopTagImage extends Model
{
    // 标签图片表主键
    /**
     * @example
     *
     * @var int
     */
    public $id;

    // 图片
    /**
     * @example 1
     *
     * @var string
     */
    public $image;
    protected $_name = [
        'id'    => 'id',
        'image' => 'image',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->image) {
            $res['image'] = $this->image;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RtopTagImage
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['image'])) {
            $model->image = $map['image'];
        }

        return $model;
    }
}
