<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class Link extends Model
{
    // 文字
    /**
     * @example 文字
     *
     * @var string
     */
    public $text;

    // 标题
    /**
     * @example 标题
     *
     * @var string
     */
    public $title;

    // 图片地址
    /**
     * @example 图片地址
     *
     * @var string
     */
    public $picUrl;

    // 链接
    /**
     * @example 链接
     *
     * @var string
     */
    public $messageUrl;
    protected $_name = [
        'text'       => 'text',
        'title'      => 'title',
        'picUrl'     => 'pic_url',
        'messageUrl' => 'message_url',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->text) {
            $res['text'] = $this->text;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->picUrl) {
            $res['pic_url'] = $this->picUrl;
        }
        if (null !== $this->messageUrl) {
            $res['message_url'] = $this->messageUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Link
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['text'])) {
            $model->text = $map['text'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['pic_url'])) {
            $model->picUrl = $map['pic_url'];
        }
        if (isset($map['message_url'])) {
            $model->messageUrl = $map['message_url'];
        }

        return $model;
    }
}
