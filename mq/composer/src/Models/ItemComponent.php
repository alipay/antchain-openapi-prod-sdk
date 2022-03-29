<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ItemComponent extends Model
{
    // 内容
    /**
     * @example
     *
     * @var ComponentContent[]
     */
    public $contents;
    protected $_name = [
        'contents' => 'contents',
    ];

    public function validate()
    {
        Model::validateRequired('contents', $this->contents, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->contents) {
            $res['contents'] = [];
            if (null !== $this->contents && \is_array($this->contents)) {
                $n = 0;
                foreach ($this->contents as $item) {
                    $res['contents'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ItemComponent
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['contents'])) {
            if (!empty($map['contents'])) {
                $model->contents = [];
                $n               = 0;
                foreach ($map['contents'] as $item) {
                    $model->contents[$n++] = null !== $item ? ComponentContent::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
