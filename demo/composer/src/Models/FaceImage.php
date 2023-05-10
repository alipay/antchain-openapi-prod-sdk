<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class FaceImage extends Model
{
    // 123
    /**
     * @example 123
     *
     * @var string
     */
    public $content;

    // 213
    /**
     * @example 13
     *
     * @var string
     */
    public $rect;
    protected $_name = [
        'content' => 'content',
        'rect'    => 'rect',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->rect) {
            $res['rect'] = $this->rect;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FaceImage
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['rect'])) {
            $model->rect = $map['rect'];
        }

        return $model;
    }
}
