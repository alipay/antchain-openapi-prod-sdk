<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class NoticeInfo extends Model
{
    // 通知id
    /**
     * @example 12345678
     *
     * @var int
     */
    public $noticeId;

    // 通知标题
    /**
     * @example 7月官网更新
     *
     * @var string
     */
    public $title;

    // 通知创建时间
    /**
     * @example 2024-10-17 18:41:59.000
     *
     * @var string
     */
    public $noticeCreateTime;

    // 是否未读
    /**
     * @example true, false
     *
     * @var bool
     */
    public $unread;
    protected $_name = [
        'noticeId'         => 'notice_id',
        'title'            => 'title',
        'noticeCreateTime' => 'notice_create_time',
        'unread'           => 'unread',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->noticeId) {
            $res['notice_id'] = $this->noticeId;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->noticeCreateTime) {
            $res['notice_create_time'] = $this->noticeCreateTime;
        }
        if (null !== $this->unread) {
            $res['unread'] = $this->unread;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NoticeInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['notice_id'])) {
            $model->noticeId = $map['notice_id'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['notice_create_time'])) {
            $model->noticeCreateTime = $map['notice_create_time'];
        }
        if (isset($map['unread'])) {
            $model->unread = $map['unread'];
        }

        return $model;
    }
}
