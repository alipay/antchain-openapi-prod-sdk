<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class Btn extends Model
{
    // 标题
    /**
     * @example 标题
     *
     * @var string
     */
    public $title;

    // 动作地址
    /**
     * @example 动作地址
     *
     * @var string
     */
    public $actionUrl;
    protected $_name = [
        'title'     => 'title',
        'actionUrl' => 'action_url',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->actionUrl) {
            $res['action_url'] = $this->actionUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Btn
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['action_url'])) {
            $model->actionUrl = $map['action_url'];
        }

        return $model;
    }
}
