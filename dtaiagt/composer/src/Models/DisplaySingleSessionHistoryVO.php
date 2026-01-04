<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class DisplaySingleSessionHistoryVO extends Model
{
    // 展示内容列表，入参和出参放在一起，方便前端展示
    /**
     * @example []
     *
     * @var DisplayResponseContent[]
     */
    public $contentList;
    protected $_name = [
        'contentList' => 'content_list',
    ];

    public function validate()
    {
        Model::validateRequired('contentList', $this->contentList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->contentList) {
            $res['content_list'] = [];
            if (null !== $this->contentList && \is_array($this->contentList)) {
                $n = 0;
                foreach ($this->contentList as $item) {
                    $res['content_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DisplaySingleSessionHistoryVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['content_list'])) {
            if (!empty($map['content_list'])) {
                $model->contentList = [];
                $n                  = 0;
                foreach ($map['content_list'] as $item) {
                    $model->contentList[$n++] = null !== $item ? DisplayResponseContent::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
