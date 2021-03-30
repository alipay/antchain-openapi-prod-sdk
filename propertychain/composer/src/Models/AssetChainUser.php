<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class AssetChainUser extends Model
{
    // 申请Id
    /**
     * @example applyId
     *
     * @var string
     */
    public $applyId;

    // 联盟申请类型【NONE,JOIN,CREATE,ALL】
    /**
     * @example JOIN
     *
     * @var string
     */
    public $applyType;

    // 当前联盟信息
    /**
     * @example currentLeagueInfo
     *
     * @var LeagueInfo
     */
    public $currentLeagueInfo;

    // 企业名称
    /**
     * @example firmName
     *
     * @var string
     */
    public $firmName;

    // 申请流程状态【NONE,WAITING,AGREED,REJECTED,CANCELED,ALL】
    /**
     * @example AGREED
     *
     * @var string
     */
    public $leagueApplyStatus;

    // 是否是盟主
    /**
     * @example leagueLeader
     *
     * @var bool
     */
    public $leagueLeader;

    // 登录名
    /**
     * @example loginName
     *
     * @var string
     */
    public $loginName;

    // 蚂蚁金融科技租户ID
    /**
     * @example openTenant
     *
     * @var string
     */
    public $openTenant;

    // 角色类型【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
    /**
     * @example MEMBER
     *
     * @var string
     */
    public $roleType;
    protected $_name = [
        'applyId'           => 'apply_id',
        'applyType'         => 'apply_type',
        'currentLeagueInfo' => 'current_league_info',
        'firmName'          => 'firm_name',
        'leagueApplyStatus' => 'league_apply_status',
        'leagueLeader'      => 'league_leader',
        'loginName'         => 'login_name',
        'openTenant'        => 'open_tenant',
        'roleType'          => 'role_type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->applyId) {
            $res['apply_id'] = $this->applyId;
        }
        if (null !== $this->applyType) {
            $res['apply_type'] = $this->applyType;
        }
        if (null !== $this->currentLeagueInfo) {
            $res['current_league_info'] = null !== $this->currentLeagueInfo ? $this->currentLeagueInfo->toMap() : null;
        }
        if (null !== $this->firmName) {
            $res['firm_name'] = $this->firmName;
        }
        if (null !== $this->leagueApplyStatus) {
            $res['league_apply_status'] = $this->leagueApplyStatus;
        }
        if (null !== $this->leagueLeader) {
            $res['league_leader'] = $this->leagueLeader;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }
        if (null !== $this->openTenant) {
            $res['open_tenant'] = $this->openTenant;
        }
        if (null !== $this->roleType) {
            $res['role_type'] = $this->roleType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AssetChainUser
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['apply_id'])) {
            $model->applyId = $map['apply_id'];
        }
        if (isset($map['apply_type'])) {
            $model->applyType = $map['apply_type'];
        }
        if (isset($map['current_league_info'])) {
            $model->currentLeagueInfo = LeagueInfo::fromMap($map['current_league_info']);
        }
        if (isset($map['firm_name'])) {
            $model->firmName = $map['firm_name'];
        }
        if (isset($map['league_apply_status'])) {
            $model->leagueApplyStatus = $map['league_apply_status'];
        }
        if (isset($map['league_leader'])) {
            $model->leagueLeader = $map['league_leader'];
        }
        if (isset($map['login_name'])) {
            $model->loginName = $map['login_name'];
        }
        if (isset($map['open_tenant'])) {
            $model->openTenant = $map['open_tenant'];
        }
        if (isset($map['role_type'])) {
            $model->roleType = $map['role_type'];
        }

        return $model;
    }
}
