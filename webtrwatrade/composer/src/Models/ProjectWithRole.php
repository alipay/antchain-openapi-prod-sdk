<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class ProjectWithRole extends Model
{
    // 项目id
    /**
     * @example 1
     *
     * @var string
     */
    public $projectId;

    // 项目名称
    /**
     * @example 1
     *
     * @var string
     */
    public $projcetName;

    // 描述
    /**
     * @example 1
     *
     * @var string
     */
    public $description;

    // token名称
    /**
     * @example 1
     *
     * @var string
     */
    public $tokenName;

    // 最大供应量
    /**
     * @example 1
     *
     * @var string
     */
    public $capacity;

    // 净值
    /**
     * @example 1
     *
     * @var string
     */
    public $netValue;

    // 价格类型
    /**
     * @example 1
     *
     * @var string
     */
    public $priceType;

    // 项目净值
    /**
     * @example 1
     *
     * @var string
     */
    public $projectNetValue;

    // 最大限额
    /**
     * @example 1
     *
     * @var string
     */
    public $maxSubscriptionAmount;

    // 部署类型 DIRECT_PUBLIC_CHAIN 直发公链，NORMAL 普通模式
    /**
     * @example 1
     *
     * @var string
     */
    public $deploymentType;

    // 项目所在链
    /**
     * @example 1
     *
     * @var string
     */
    public $chainType;

    // 操作角色列表
    /**
     * @example 1
     *
     * @var UserOperatorInfoBO[]
     */
    public $userOperatorList;

    // 代销者机构集合
    /**
     * @example 1
     *
     * @var ParticipantInfo[]
     */
    public $participantInfos;
    protected $_name = [
        'projectId'             => 'project_id',
        'projcetName'           => 'projcet_name',
        'description'           => 'description',
        'tokenName'             => 'token_name',
        'capacity'              => 'capacity',
        'netValue'              => 'net_value',
        'priceType'             => 'price_type',
        'projectNetValue'       => 'project_net_value',
        'maxSubscriptionAmount' => 'max_subscription_amount',
        'deploymentType'        => 'deployment_type',
        'chainType'             => 'chain_type',
        'userOperatorList'      => 'user_operator_list',
        'participantInfos'      => 'participant_infos',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->projcetName) {
            $res['projcet_name'] = $this->projcetName;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->tokenName) {
            $res['token_name'] = $this->tokenName;
        }
        if (null !== $this->capacity) {
            $res['capacity'] = $this->capacity;
        }
        if (null !== $this->netValue) {
            $res['net_value'] = $this->netValue;
        }
        if (null !== $this->priceType) {
            $res['price_type'] = $this->priceType;
        }
        if (null !== $this->projectNetValue) {
            $res['project_net_value'] = $this->projectNetValue;
        }
        if (null !== $this->maxSubscriptionAmount) {
            $res['max_subscription_amount'] = $this->maxSubscriptionAmount;
        }
        if (null !== $this->deploymentType) {
            $res['deployment_type'] = $this->deploymentType;
        }
        if (null !== $this->chainType) {
            $res['chain_type'] = $this->chainType;
        }
        if (null !== $this->userOperatorList) {
            $res['user_operator_list'] = [];
            if (null !== $this->userOperatorList && \is_array($this->userOperatorList)) {
                $n = 0;
                foreach ($this->userOperatorList as $item) {
                    $res['user_operator_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->participantInfos) {
            $res['participant_infos'] = [];
            if (null !== $this->participantInfos && \is_array($this->participantInfos)) {
                $n = 0;
                foreach ($this->participantInfos as $item) {
                    $res['participant_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProjectWithRole
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['projcet_name'])) {
            $model->projcetName = $map['projcet_name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['token_name'])) {
            $model->tokenName = $map['token_name'];
        }
        if (isset($map['capacity'])) {
            $model->capacity = $map['capacity'];
        }
        if (isset($map['net_value'])) {
            $model->netValue = $map['net_value'];
        }
        if (isset($map['price_type'])) {
            $model->priceType = $map['price_type'];
        }
        if (isset($map['project_net_value'])) {
            $model->projectNetValue = $map['project_net_value'];
        }
        if (isset($map['max_subscription_amount'])) {
            $model->maxSubscriptionAmount = $map['max_subscription_amount'];
        }
        if (isset($map['deployment_type'])) {
            $model->deploymentType = $map['deployment_type'];
        }
        if (isset($map['chain_type'])) {
            $model->chainType = $map['chain_type'];
        }
        if (isset($map['user_operator_list'])) {
            if (!empty($map['user_operator_list'])) {
                $model->userOperatorList = [];
                $n                       = 0;
                foreach ($map['user_operator_list'] as $item) {
                    $model->userOperatorList[$n++] = null !== $item ? UserOperatorInfoBO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['participant_infos'])) {
            if (!empty($map['participant_infos'])) {
                $model->participantInfos = [];
                $n                       = 0;
                foreach ($map['participant_infos'] as $item) {
                    $model->participantInfos[$n++] = null !== $item ? ParticipantInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
