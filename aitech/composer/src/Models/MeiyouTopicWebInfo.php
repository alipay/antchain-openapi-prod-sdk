<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class MeiyouTopicWebInfo extends Model
{
    // 内容文本
    /**
     * @example 内容文本
     *
     * @var string
     */
    public $content;

    // 当前楼层
    /**
     * @example 1
     *
     * @var int
     */
    public $currentFloor;

    // 回复楼层
    /**
     * @example 1
     *
     * @var int
     */
    public $callBackFloor;

    // 发布时间戳(毫秒)
    //
    /**
     * @example
     *
     * @var int
     */
    public $publishTime;

    // 图片URL数组(JSON字符串)
    /**
     * @example {}
     *
     * @var string
     */
    public $images;

    // 用户昵称
    /**
     * @example a
     *
     * @var string
     */
    public $userNickname;

    // 用户ID
    /**
     * @example 1
     *
     * @var string
     */
    public $userId;

    // 用户类型
    //
    /**
     * @example q
     *
     * @var string
     */
    public $userType;

    // 用户头像URL
    /**
     * @example http://test
     *
     * @var string
     */
    public $userAvatar;
    protected $_name = [
        'content'       => 'content',
        'currentFloor'  => 'current_floor',
        'callBackFloor' => 'call_back_floor',
        'publishTime'   => 'publish_time',
        'images'        => 'images',
        'userNickname'  => 'user_nickname',
        'userId'        => 'user_id',
        'userType'      => 'user_type',
        'userAvatar'    => 'user_avatar',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->currentFloor) {
            $res['current_floor'] = $this->currentFloor;
        }
        if (null !== $this->callBackFloor) {
            $res['call_back_floor'] = $this->callBackFloor;
        }
        if (null !== $this->publishTime) {
            $res['publish_time'] = $this->publishTime;
        }
        if (null !== $this->images) {
            $res['images'] = $this->images;
        }
        if (null !== $this->userNickname) {
            $res['user_nickname'] = $this->userNickname;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
        }
        if (null !== $this->userAvatar) {
            $res['user_avatar'] = $this->userAvatar;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MeiyouTopicWebInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['current_floor'])) {
            $model->currentFloor = $map['current_floor'];
        }
        if (isset($map['call_back_floor'])) {
            $model->callBackFloor = $map['call_back_floor'];
        }
        if (isset($map['publish_time'])) {
            $model->publishTime = $map['publish_time'];
        }
        if (isset($map['images'])) {
            $model->images = $map['images'];
        }
        if (isset($map['user_nickname'])) {
            $model->userNickname = $map['user_nickname'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['user_type'])) {
            $model->userType = $map['user_type'];
        }
        if (isset($map['user_avatar'])) {
            $model->userAvatar = $map['user_avatar'];
        }

        return $model;
    }
}
