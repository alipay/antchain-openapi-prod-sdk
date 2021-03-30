<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class LeagueApplyInfo extends Model
{
    // 申请账号
    /**
     * @example applyAccount
     *
     * @var string
     */
    public $applyAccount;

    // 申请企业
    /**
     * @example applyCorp
     *
     * @var string
     */
    public $applyCorp;

    // 申请Id
    /**
     * @example applyId
     *
     * @var string
     */
    public $applyId;

    // 申请人手机
    /**
     * @example applyMobileNum
     *
     * @var string
     */
    public $applyMobileNum;

    // 申请时间
    /**
     * @example applyTime
     *
     * @var string
     */
    public $applyTime;

    // 申请类型【NONE,JOIN,CREATE,ALL】
    /**
     * @example JOIN
     *
     * @var string
     */
    public $applyType;

    // 当前流程状态【NONE,WAITING,AGREED,REJECTED,CANCELED,ALL】
    /**
     * @example WAITING
     *
     * @var string
     */
    public $currentStatus;

    // 流程历史
    /**
     * @example flowHistory
     *
     * @var FlowInfo[]
     */
    public $flowHistory;

    // 角色【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
    /**
     * @example MEMBER
     *
     * @var string
     */
    public $roleType;
    protected $_name = [
        'applyAccount'   => 'apply_account',
        'applyCorp'      => 'apply_corp',
        'applyId'        => 'apply_id',
        'applyMobileNum' => 'apply_mobile_num',
        'applyTime'      => 'apply_time',
        'applyType'      => 'apply_type',
        'currentStatus'  => 'current_status',
        'flowHistory'    => 'flow_history',
        'roleType'       => 'role_type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->applyAccount) {
            $res['apply_account'] = $this->applyAccount;
        }
        if (null !== $this->applyCorp) {
            $res['apply_corp'] = $this->applyCorp;
        }
        if (null !== $this->applyId) {
            $res['apply_id'] = $this->applyId;
        }
        if (null !== $this->applyMobileNum) {
            $res['apply_mobile_num'] = $this->applyMobileNum;
        }
        if (null !== $this->applyTime) {
            $res['apply_time'] = $this->applyTime;
        }
        if (null !== $this->applyType) {
            $res['apply_type'] = $this->applyType;
        }
        if (null !== $this->currentStatus) {
            $res['current_status'] = $this->currentStatus;
        }
        if (null !== $this->flowHistory) {
            $res['flow_history'] = [];
            if (null !== $this->flowHistory && \is_array($this->flowHistory)) {
                $n = 0;
                foreach ($this->flowHistory as $item) {
                    $res['flow_history'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->roleType) {
            $res['role_type'] = $this->roleType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LeagueApplyInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['apply_account'])) {
            $model->applyAccount = $map['apply_account'];
        }
        if (isset($map['apply_corp'])) {
            $model->applyCorp = $map['apply_corp'];
        }
        if (isset($map['apply_id'])) {
            $model->applyId = $map['apply_id'];
        }
        if (isset($map['apply_mobile_num'])) {
            $model->applyMobileNum = $map['apply_mobile_num'];
        }
        if (isset($map['apply_time'])) {
            $model->applyTime = $map['apply_time'];
        }
        if (isset($map['apply_type'])) {
            $model->applyType = $map['apply_type'];
        }
        if (isset($map['current_status'])) {
            $model->currentStatus = $map['current_status'];
        }
        if (isset($map['flow_history'])) {
            if (!empty($map['flow_history'])) {
                $model->flowHistory = [];
                $n                  = 0;
                foreach ($map['flow_history'] as $item) {
                    $model->flowHistory[$n++] = null !== $item ? FlowInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['role_type'])) {
            $model->roleType = $map['role_type'];
        }

        return $model;
    }
}
