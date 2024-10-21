<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class AssetProject extends Model
{
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

    // 供应量比例(supply/capacity * 100，保留2位小数)
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
     * @var int
     */
    public $gmtCreated;

    // 项目修改时间戳
    /**
     * @example 1726024364000
     *
     * @var int
     */
    public $gmtModified;
    protected $_name = [
        'projectId'             => 'project_id',
        'name'                  => 'name',
        'tokenName'             => 'token_name',
        'info'                  => 'info',
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
     * @return AssetProject
     */
    public static function fromMap($map = [])
    {
        $model = new self();
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
