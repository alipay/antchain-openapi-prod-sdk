<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MEDIA_SMS\Models;

use AlibabaCloud\Tea\Model;

class ContentReply extends Model
{
    // 手机号
    /**
     * @example 132XXXXXXXX
     *
     * @var string
     */
    public $phone;

    // 用户是否已经退订过
    /**
     * @example true, false
     *
     * @var bool
     */
    public $reject;

    // 用户最新回复内容
    /**
     * @example R
     *
     * @var string
     */
    public $content;

    // 用户回复时间
    /**
     * @example 2024-08-23 00:00:00
     *
     * @var string
     */
    public $replyTime;

    // 拓展字段
    /**
     * @example 暂无
     *
     * @var string
     */
    public $extInfo;
    protected $_name = [
        'phone'     => 'phone',
        'reject'    => 'reject',
        'content'   => 'content',
        'replyTime' => 'reply_time',
        'extInfo'   => 'ext_info',
    ];

    public function validate()
    {
        Model::validateRequired('phone', $this->phone, true);
        Model::validateRequired('reject', $this->reject, true);
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('replyTime', $this->replyTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->phone) {
            $res['phone'] = $this->phone;
        }
        if (null !== $this->reject) {
            $res['reject'] = $this->reject;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->replyTime) {
            $res['reply_time'] = $this->replyTime;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContentReply
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['phone'])) {
            $model->phone = $map['phone'];
        }
        if (isset($map['reject'])) {
            $model->reject = $map['reject'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['reply_time'])) {
            $model->replyTime = $map['reply_time'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }

        return $model;
    }
}
