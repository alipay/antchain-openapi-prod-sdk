<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class FeedCard extends Model
{
    // 卡片流
    /**
     * @example 卡片流
     *
     * @var Link[]
     */
    public $links;
    protected $_name = [
        'links' => 'links',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->links) {
            $res['links'] = [];
            if (null !== $this->links && \is_array($this->links)) {
                $n = 0;
                foreach ($this->links as $item) {
                    $res['links'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FeedCard
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['links'])) {
            if (!empty($map['links'])) {
                $model->links = [];
                $n            = 0;
                foreach ($map['links'] as $item) {
                    $model->links[$n++] = null !== $item ? Link::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
