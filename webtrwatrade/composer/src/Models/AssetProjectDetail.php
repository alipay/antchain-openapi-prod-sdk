<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class AssetProjectDetail extends Model
{
    // 项目参与的代销机构列表
    /**
     * @example
     *
     * @var ParticipantInfo[]
     */
    public $participantInfos;

    // 发行密钥列表
    /**
     * @example
     *
     * @var KeyInfo[]
     */
    public $mintKeys;

    // 赎回密钥列表
    /**
     * @example
     *
     * @var KeyInfo[]
     */
    public $burnKeys;

    // 转账密钥列表
    /**
     * @example
     *
     * @var KeyInfo[]
     */
    public $transferKeys;

    // 管理密钥列表
    /**
     * @example
     *
     * @var KeyInfo[]
     */
    public $managerKeys;

    // 历史净值列表
    /**
     * @example
     *
     * @var NetValueInfo[]
     */
    public $historyNetValueList;

    // 项目报告列表
    /**
     * @example
     *
     * @var ReportInfo[]
     */
    public $reportList;

    // 项目ID
    /**
     * @example f9146ccccf684db792a8fa10d876e22c
     *
     * @var string
     */
    public $projectId;

    // 项目名称
    /**
     * @example 充电桩
     *
     * @var string
     */
    public $name;

    // 项目代币名称
    /**
     * @example ETH
     *
     * @var string
     */
    public $tokenName;

    // 项目介绍
    /**
     * @example 新能源充电桩项目
     *
     * @var string
     */
    public $info;

    // 项目描述(markdown格式)
    /**
     * @example # 新能源
     *
     * @var string
     */
    public $description;

    // 当前供应量
    /**
     * @example 5000
     *
     * @var string
     */
    public $supply;

    // 最大供应量
    /**
     * @example 10000
     *
     * @var string
     */
    public $capacity;

    // 供应量比例(supply/capacity * 100，保留2位小数）
    /**
     * @example 50.00
     *
     * @var int
     */
    public $radio;

    // 持有人数量
    /**
     * @example 10
     *
     * @var int
     */
    public $userNumber;

    // 资产token合约地址
    /**
     * @example 0xef10b8f625964d868cbb08b1ce687c04982d8964
     *
     * @var string
     */
    public $assetTokenAddress;

    // 资产规则引擎合约地址
    /**
     * @example 0xbd2d20d6a8a189ec83f42c476e30e49305d45c69
     *
     * @var string
     */
    public $ruleEngineAddress;

    // 资产白名单合约地址
    /**
     * @example 0xd8cd3a0cdf071abfe0cb09f73224de268c10a4e7
     *
     * @var string
     */
    public $memberListRuleAddress;

    // 项目状态(ACTIVE：激活；PAUSED：暂停)
    /**
     * @example ACTIVE
     *
     * @var string
     */
    public $status;

    // 项目净值
    /**
     * @example 3.14
     *
     * @var string
     */
    public $netValue;

    // 项目币种(目前支持USD、HKD)
    /**
     * @example HKD
     *
     * @var string
     */
    public $currency;

    // 项目创建时间戳
    /**
     * @example 1726024364000
     *
     * @var string
     */
    public $gmtCreated;

    // 项目修改时间戳
    /**
     * @example 1726024364000
     *
     * @var string
     */
    public $gmtModified;
    protected $_name = [
        'participantInfos'      => 'participant_infos',
        'mintKeys'              => 'mint_keys',
        'burnKeys'              => 'burn_keys',
        'transferKeys'          => 'transfer_keys',
        'managerKeys'           => 'manager_keys',
        'historyNetValueList'   => 'history_net_value_list',
        'reportList'            => 'report_list',
        'projectId'             => 'project_id',
        'name'                  => 'name',
        'tokenName'             => 'token_name',
        'info'                  => 'info',
        'description'           => 'description',
        'supply'                => 'supply',
        'capacity'              => 'capacity',
        'radio'                 => 'radio',
        'userNumber'            => 'user_number',
        'assetTokenAddress'     => 'asset_token_address',
        'ruleEngineAddress'     => 'rule_engine_address',
        'memberListRuleAddress' => 'member_list_rule_address',
        'status'                => 'status',
        'netValue'              => 'net_value',
        'currency'              => 'currency',
        'gmtCreated'            => 'gmt_created',
        'gmtModified'           => 'gmt_modified',
    ];

    public function validate()
    {
        Model::validateRequired('participantInfos', $this->participantInfos, true);
        Model::validateRequired('mintKeys', $this->mintKeys, true);
        Model::validateRequired('burnKeys', $this->burnKeys, true);
        Model::validateRequired('transferKeys', $this->transferKeys, true);
        Model::validateRequired('managerKeys', $this->managerKeys, true);
        Model::validateRequired('historyNetValueList', $this->historyNetValueList, true);
        Model::validateRequired('reportList', $this->reportList, true);
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('tokenName', $this->tokenName, true);
        Model::validateRequired('info', $this->info, true);
        Model::validateRequired('supply', $this->supply, true);
        Model::validateRequired('capacity', $this->capacity, true);
        Model::validateRequired('radio', $this->radio, true);
        Model::validateRequired('userNumber', $this->userNumber, true);
        Model::validateRequired('assetTokenAddress', $this->assetTokenAddress, true);
        Model::validateRequired('ruleEngineAddress', $this->ruleEngineAddress, true);
        Model::validateRequired('memberListRuleAddress', $this->memberListRuleAddress, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('netValue', $this->netValue, true);
        Model::validateRequired('currency', $this->currency, true);
        Model::validateRequired('gmtCreated', $this->gmtCreated, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->participantInfos) {
            $res['participant_infos'] = [];
            if (null !== $this->participantInfos && \is_array($this->participantInfos)) {
                $n = 0;
                foreach ($this->participantInfos as $item) {
                    $res['participant_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->mintKeys) {
            $res['mint_keys'] = [];
            if (null !== $this->mintKeys && \is_array($this->mintKeys)) {
                $n = 0;
                foreach ($this->mintKeys as $item) {
                    $res['mint_keys'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->burnKeys) {
            $res['burn_keys'] = [];
            if (null !== $this->burnKeys && \is_array($this->burnKeys)) {
                $n = 0;
                foreach ($this->burnKeys as $item) {
                    $res['burn_keys'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->transferKeys) {
            $res['transfer_keys'] = [];
            if (null !== $this->transferKeys && \is_array($this->transferKeys)) {
                $n = 0;
                foreach ($this->transferKeys as $item) {
                    $res['transfer_keys'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->managerKeys) {
            $res['manager_keys'] = [];
            if (null !== $this->managerKeys && \is_array($this->managerKeys)) {
                $n = 0;
                foreach ($this->managerKeys as $item) {
                    $res['manager_keys'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->historyNetValueList) {
            $res['history_net_value_list'] = [];
            if (null !== $this->historyNetValueList && \is_array($this->historyNetValueList)) {
                $n = 0;
                foreach ($this->historyNetValueList as $item) {
                    $res['history_net_value_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->reportList) {
            $res['report_list'] = [];
            if (null !== $this->reportList && \is_array($this->reportList)) {
                $n = 0;
                foreach ($this->reportList as $item) {
                    $res['report_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->tokenName) {
            $res['token_name'] = $this->tokenName;
        }
        if (null !== $this->info) {
            $res['info'] = $this->info;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->supply) {
            $res['supply'] = $this->supply;
        }
        if (null !== $this->capacity) {
            $res['capacity'] = $this->capacity;
        }
        if (null !== $this->radio) {
            $res['radio'] = $this->radio;
        }
        if (null !== $this->userNumber) {
            $res['user_number'] = $this->userNumber;
        }
        if (null !== $this->assetTokenAddress) {
            $res['asset_token_address'] = $this->assetTokenAddress;
        }
        if (null !== $this->ruleEngineAddress) {
            $res['rule_engine_address'] = $this->ruleEngineAddress;
        }
        if (null !== $this->memberListRuleAddress) {
            $res['member_list_rule_address'] = $this->memberListRuleAddress;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->netValue) {
            $res['net_value'] = $this->netValue;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->gmtCreated) {
            $res['gmt_created'] = $this->gmtCreated;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AssetProjectDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['participant_infos'])) {
            if (!empty($map['participant_infos'])) {
                $model->participantInfos = [];
                $n                       = 0;
                foreach ($map['participant_infos'] as $item) {
                    $model->participantInfos[$n++] = null !== $item ? ParticipantInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['mint_keys'])) {
            if (!empty($map['mint_keys'])) {
                $model->mintKeys = [];
                $n               = 0;
                foreach ($map['mint_keys'] as $item) {
                    $model->mintKeys[$n++] = null !== $item ? KeyInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['burn_keys'])) {
            if (!empty($map['burn_keys'])) {
                $model->burnKeys = [];
                $n               = 0;
                foreach ($map['burn_keys'] as $item) {
                    $model->burnKeys[$n++] = null !== $item ? KeyInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['transfer_keys'])) {
            if (!empty($map['transfer_keys'])) {
                $model->transferKeys = [];
                $n                   = 0;
                foreach ($map['transfer_keys'] as $item) {
                    $model->transferKeys[$n++] = null !== $item ? KeyInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['manager_keys'])) {
            if (!empty($map['manager_keys'])) {
                $model->managerKeys = [];
                $n                  = 0;
                foreach ($map['manager_keys'] as $item) {
                    $model->managerKeys[$n++] = null !== $item ? KeyInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['history_net_value_list'])) {
            if (!empty($map['history_net_value_list'])) {
                $model->historyNetValueList = [];
                $n                          = 0;
                foreach ($map['history_net_value_list'] as $item) {
                    $model->historyNetValueList[$n++] = null !== $item ? NetValueInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['report_list'])) {
            if (!empty($map['report_list'])) {
                $model->reportList = [];
                $n                 = 0;
                foreach ($map['report_list'] as $item) {
                    $model->reportList[$n++] = null !== $item ? ReportInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['token_name'])) {
            $model->tokenName = $map['token_name'];
        }
        if (isset($map['info'])) {
            $model->info = $map['info'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['supply'])) {
            $model->supply = $map['supply'];
        }
        if (isset($map['capacity'])) {
            $model->capacity = $map['capacity'];
        }
        if (isset($map['radio'])) {
            $model->radio = $map['radio'];
        }
        if (isset($map['user_number'])) {
            $model->userNumber = $map['user_number'];
        }
        if (isset($map['asset_token_address'])) {
            $model->assetTokenAddress = $map['asset_token_address'];
        }
        if (isset($map['rule_engine_address'])) {
            $model->ruleEngineAddress = $map['rule_engine_address'];
        }
        if (isset($map['member_list_rule_address'])) {
            $model->memberListRuleAddress = $map['member_list_rule_address'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['net_value'])) {
            $model->netValue = $map['net_value'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['gmt_created'])) {
            $model->gmtCreated = $map['gmt_created'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }

        return $model;
    }
}
