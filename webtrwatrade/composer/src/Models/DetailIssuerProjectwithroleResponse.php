<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class DetailIssuerProjectwithroleResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 项目id
    /**
     * @var string
     */
    public $projectId;

    // 项目名称
    /**
     * @var string
     */
    public $projcetName;

    // 描述
    /**
     * @var string
     */
    public $description;

    // token名称
    /**
     * @var string
     */
    public $tokenName;

    // 最大供应量
    /**
     * @var string
     */
    public $capacity;

    // 净值
    /**
     * @var string
     */
    public $netValue;

    // 价格类型
    /**
     * @var string
     */
    public $priceType;

    // 项目净值
    /**
     * @var string
     */
    public $projectNetValue;

    // 购买最大限额
    /**
     * @var string
     */
    public $maxSubscriptionAmount;

    // 部署类型  DIRECT_PUBLIC_CHAIN 直发公链，NORMAL 普通模式
    /**
     * @var string
     */
    public $deploymentType;

    // 项目所在链
    /**
     * @var string
     */
    public $chainType;

    // 操作员list
    /**
     * @var UserOperatorInfoBO
     */
    public $userOperatorList;

    // 代销者机构代销者机构
    /**
     * @var ParticipantInfo
     */
    public $participantInfos;
    protected $_name = [
        'reqMsgId'              => 'req_msg_id',
        'resultCode'            => 'result_code',
        'resultMsg'             => 'result_msg',
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
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
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
            $res['user_operator_list'] = null !== $this->userOperatorList ? $this->userOperatorList->toMap() : null;
        }
        if (null !== $this->participantInfos) {
            $res['participant_infos'] = null !== $this->participantInfos ? $this->participantInfos->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailIssuerProjectwithroleResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
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
            $model->userOperatorList = UserOperatorInfoBO::fromMap($map['user_operator_list']);
        }
        if (isset($map['participant_infos'])) {
            $model->participantInfos = ParticipantInfo::fromMap($map['participant_infos']);
        }

        return $model;
    }
}
