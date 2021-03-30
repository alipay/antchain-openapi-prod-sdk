<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ThirdPartyUser extends Model
{
    // 用户id
    /**
     * @example userId
     *
     * @var string
     */
    public $userId;

    // 用户名
    /**
     * @example userName
     *
     * @var string
     */
    public $userName;

    // 联盟id
    /**
     * @example leagueUid
     *
     * @var string
     */
    public $leagueUid;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $createTime;
    protected $_name = [
        'userId'     => 'user_id',
        'userName'   => 'user_name',
        'leagueUid'  => 'league_uid',
        'createTime' => 'create_time',
    ];

    public function validate()
    {
        Model::validatePattern('createTime', $this->createTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->leagueUid) {
            $res['league_uid'] = $this->leagueUid;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ThirdPartyUser
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['league_uid'])) {
            $model->leagueUid = $map['league_uid'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }

        return $model;
    }
}
