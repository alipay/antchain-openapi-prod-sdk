<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MARKETING\Models;

use AlibabaCloud\Tea\Model;

class PageContext extends Model
{
    // 页面di
    /**
     * @example 12
     *
     * @var string
     */
    public $pageId;

    // 页面标题
    /**
     * @example 12
     *
     * @var string
     */
    public $pageTitle;
    protected $_name = [
        'pageId'    => 'page_id',
        'pageTitle' => 'page_title',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->pageId) {
            $res['page_id'] = $this->pageId;
        }
        if (null !== $this->pageTitle) {
            $res['page_title'] = $this->pageTitle;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PageContext
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['page_id'])) {
            $model->pageId = $map['page_id'];
        }
        if (isset($map['page_title'])) {
            $model->pageTitle = $map['page_title'];
        }

        return $model;
    }
}
