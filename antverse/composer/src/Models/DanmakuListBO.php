<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ANTVERSE\Models;

use AlibabaCloud\Tea\Model;

class DanmakuListBO extends Model
{
    // 弹幕内容
    /**
     * @example 你好呀
     *
     * @var string
     */
    public $content;

    // 用户昵称
    /**
     * @example 小明
     *
     * @var string
     */
    public $nickName;

    // 发送时间戳(ms)
    /**
     * @example 1700000000000
     *
     * @var int
     */
    public $sendTime;

    // 直播平台code
    /**
     * @example TIK_TOK
     *
     * @var string
     */
    public $roomType;
    protected $_name = [
        'content'  => 'content',
        'nickName' => 'nick_name',
        'sendTime' => 'send_time',
        'roomType' => 'room_type',
    ];

    public function validate()
    {
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('sendTime', $this->sendTime, true);
        Model::validateRequired('roomType', $this->roomType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->nickName) {
            $res['nick_name'] = $this->nickName;
        }
        if (null !== $this->sendTime) {
            $res['send_time'] = $this->sendTime;
        }
        if (null !== $this->roomType) {
            $res['room_type'] = $this->roomType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DanmakuListBO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['nick_name'])) {
            $model->nickName = $map['nick_name'];
        }
        if (isset($map['send_time'])) {
            $model->sendTime = $map['send_time'];
        }
        if (isset($map['room_type'])) {
            $model->roomType = $map['room_type'];
        }

        return $model;
    }
}
