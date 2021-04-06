<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Acm\Models;

use AlibabaCloud\Tea\Model;

class Tag extends Model
{
    // 标签类型
    /**
     * @example CHANNEL_SCENE
     *
     * @var string
     */
    public $tagType;

    // 标签值
    /**
     * @example BAASDT_IPAE
     *
     * @var string
     */
    public $tagValue;
    protected $_name = [
        'tagType'  => 'tag_type',
        'tagValue' => 'tag_value',
    ];

    public function validate()
    {
        Model::validateRequired('tagType', $this->tagType, true);
        Model::validateRequired('tagValue', $this->tagValue, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tagType) {
            $res['tag_type'] = $this->tagType;
        }
        if (null !== $this->tagValue) {
            $res['tag_value'] = $this->tagValue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Tag
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tag_type'])) {
            $model->tagType = $map['tag_type'];
        }
        if (isset($map['tag_value'])) {
            $model->tagValue = $map['tag_value'];
        }

        return $model;
    }
}
