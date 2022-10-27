<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class GoodsDigitalFingerprintUserInfo extends Model
{
    // 平台注册用户id
    /**
     * @example 12207
     *
     * @var string
     */
    public $userId;

    // 用户角色
    /**
     * @example 渠道商/平台
     *
     * @var string
     */
    public $userRole;

    // 用户登录id来源
    /**
     * @example 用户登录id来源
     *
     * @var string
     */
    public $channel;

    // 作为平台使用方，提供对应的渠道用户id列表
    /**
     * @example ["1001","1002"]
     *
     * @var string[]
     */
    public $relationUserIdList;
    protected $_name = [
        'userId'             => 'user_id',
        'userRole'           => 'user_role',
        'channel'            => 'channel',
        'relationUserIdList' => 'relation_user_id_list',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('userRole', $this->userRole, true);
        Model::validateRequired('channel', $this->channel, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userRole) {
            $res['user_role'] = $this->userRole;
        }
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }
        if (null !== $this->relationUserIdList) {
            $res['relation_user_id_list'] = $this->relationUserIdList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GoodsDigitalFingerprintUserInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['user_role'])) {
            $model->userRole = $map['user_role'];
        }
        if (isset($map['channel'])) {
            $model->channel = $map['channel'];
        }
        if (isset($map['relation_user_id_list'])) {
            if (!empty($map['relation_user_id_list'])) {
                $model->relationUserIdList = $map['relation_user_id_list'];
            }
        }

        return $model;
    }
}
