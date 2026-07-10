<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class PlayListEntity extends Model
{
    // 播放列表名称，可包含多个视频
    /**
     * @example 播放列表1
     *
     * @var string
     */
    public $playListName;

    // 表示授权类型，仅支持EXCLUSIVE，表示独家
    // 默认EXCLUSIVE
    /**
     * @example EXCLUSIVE
     *
     * @var string
     */
    public $authorizeType;

    // 授权类型范围，仅支持OVERSEA，表示全海外
    // 默认OVERSEA
    /**
     * @example OVERSEA
     *
     * @var string
     */
    public $authorizeScopeType;

    // 维权类型，仅支持CONTAIN_PROTECT，表示包含维权
    // 默认CONTAIN_PROTECT
    /**
     * @example CONTAIN_PROTECT
     *
     * @var string
     */
    public $protectRightsType;

    // 维权类型范围，仅支持OVERSEA，表示全海外
    // 默认OVERSEA
    /**
     * @example OVERSEA
     *
     * @var string
     */
    public $protectRightsScopeType;

    // 内容授权开始日期yyyy-MM-dd
    /**
     * @example 2022-09-01
     *
     * @var string
     */
    public $authorizationStartDate;

    // 内容授权时长,单位：年，目前支持1~3年，
    // 注意结束时间即开始时间 + 授权时长 不能早于当前时间
    /**
     * @example 1
     *
     * @var int
     */
    public $authorizationTimeLength;

    // 内容授权平台列表：
    // 默认授权平台都会进行运营，当前仅支持YOUTUBE
    /**
     * @example YOUTUBE
     *
     * @var string[]
     */
    public $authPlatform;
    protected $_name = [
        'playListName'            => 'play_list_name',
        'authorizeType'           => 'authorize_type',
        'authorizeScopeType'      => 'authorize_scope_type',
        'protectRightsType'       => 'protect_rights_type',
        'protectRightsScopeType'  => 'protect_rights_scope_type',
        'authorizationStartDate'  => 'authorization_start_date',
        'authorizationTimeLength' => 'authorization_time_length',
        'authPlatform'            => 'auth_platform',
    ];

    public function validate()
    {
        Model::validateRequired('playListName', $this->playListName, true);
        Model::validateRequired('authorizationStartDate', $this->authorizationStartDate, true);
        Model::validateRequired('authorizationTimeLength', $this->authorizationTimeLength, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->playListName) {
            $res['play_list_name'] = $this->playListName;
        }
        if (null !== $this->authorizeType) {
            $res['authorize_type'] = $this->authorizeType;
        }
        if (null !== $this->authorizeScopeType) {
            $res['authorize_scope_type'] = $this->authorizeScopeType;
        }
        if (null !== $this->protectRightsType) {
            $res['protect_rights_type'] = $this->protectRightsType;
        }
        if (null !== $this->protectRightsScopeType) {
            $res['protect_rights_scope_type'] = $this->protectRightsScopeType;
        }
        if (null !== $this->authorizationStartDate) {
            $res['authorization_start_date'] = $this->authorizationStartDate;
        }
        if (null !== $this->authorizationTimeLength) {
            $res['authorization_time_length'] = $this->authorizationTimeLength;
        }
        if (null !== $this->authPlatform) {
            $res['auth_platform'] = $this->authPlatform;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PlayListEntity
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['play_list_name'])) {
            $model->playListName = $map['play_list_name'];
        }
        if (isset($map['authorize_type'])) {
            $model->authorizeType = $map['authorize_type'];
        }
        if (isset($map['authorize_scope_type'])) {
            $model->authorizeScopeType = $map['authorize_scope_type'];
        }
        if (isset($map['protect_rights_type'])) {
            $model->protectRightsType = $map['protect_rights_type'];
        }
        if (isset($map['protect_rights_scope_type'])) {
            $model->protectRightsScopeType = $map['protect_rights_scope_type'];
        }
        if (isset($map['authorization_start_date'])) {
            $model->authorizationStartDate = $map['authorization_start_date'];
        }
        if (isset($map['authorization_time_length'])) {
            $model->authorizationTimeLength = $map['authorization_time_length'];
        }
        if (isset($map['auth_platform'])) {
            if (!empty($map['auth_platform'])) {
                $model->authPlatform = $map['auth_platform'];
            }
        }

        return $model;
    }
}
