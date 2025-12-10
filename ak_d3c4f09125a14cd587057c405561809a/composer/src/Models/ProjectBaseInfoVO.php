<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models;

use AlibabaCloud\Tea\Model;

class ProjectBaseInfoVO extends Model
{
    // 项目id
    /**
     * @example 0628455d41d044ed97783db554149d4b
     *
     * @var string
     */
    public $projectId;

    // 资产项目合约地址
    // （Launch Network/Shares token ）
    /**
     * @example 0xf7d48f098440a166e9785ced7073baa6964acc80
     *
     * @var string
     */
    public $assetProjectAddress;

    // 项目名称
    /**
     * @example 测试项目
     *
     * @var string
     */
    public $projectName;

    // 描述
    /**
     * @example 测试
     *
     * @var string
     */
    public $description;

    // 项目状态
    /**
     * @example Active
     *
     * @var string
     */
    public $projectStatus;

    // 项目所在链（Launch Network）
    /**
     * @example ANTCHAIN
     *
     * @var string
     */
    public $chainType;

    // 代币名称
    /**
     * @example OKB
     *
     * @var string
     */
    public $tokenName;

    // 项目代币符号
    /**
     * @example Token-S
     *
     * @var string
     */
    public $tokenSymbol;

    // 总发行量
    /**
     * @example 100
     *
     * @var string
     */
    public $capacity;

    // 单钱包最大可持有份额
    /**
     * @example 100
     *
     * @var string
     */
    public $maxSubscriptionAmount;

    // 创建时间戳（毫秒）
    /**
     * @example 1755754919690
     *
     * @var int
     */
    public $gmtCreated;
    protected $_name = [
        'projectId'             => 'project_id',
        'assetProjectAddress'   => 'asset_project_address',
        'projectName'           => 'project_name',
        'description'           => 'description',
        'projectStatus'         => 'project_status',
        'chainType'             => 'chain_type',
        'tokenName'             => 'token_name',
        'tokenSymbol'           => 'token_symbol',
        'capacity'              => 'capacity',
        'maxSubscriptionAmount' => 'max_subscription_amount',
        'gmtCreated'            => 'gmt_created',
    ];

    public function validate()
    {
        Model::validateRequired('projectId', $this->projectId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->assetProjectAddress) {
            $res['asset_project_address'] = $this->assetProjectAddress;
        }
        if (null !== $this->projectName) {
            $res['project_name'] = $this->projectName;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->projectStatus) {
            $res['project_status'] = $this->projectStatus;
        }
        if (null !== $this->chainType) {
            $res['chain_type'] = $this->chainType;
        }
        if (null !== $this->tokenName) {
            $res['token_name'] = $this->tokenName;
        }
        if (null !== $this->tokenSymbol) {
            $res['token_symbol'] = $this->tokenSymbol;
        }
        if (null !== $this->capacity) {
            $res['capacity'] = $this->capacity;
        }
        if (null !== $this->maxSubscriptionAmount) {
            $res['max_subscription_amount'] = $this->maxSubscriptionAmount;
        }
        if (null !== $this->gmtCreated) {
            $res['gmt_created'] = $this->gmtCreated;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProjectBaseInfoVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['asset_project_address'])) {
            $model->assetProjectAddress = $map['asset_project_address'];
        }
        if (isset($map['project_name'])) {
            $model->projectName = $map['project_name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['project_status'])) {
            $model->projectStatus = $map['project_status'];
        }
        if (isset($map['chain_type'])) {
            $model->chainType = $map['chain_type'];
        }
        if (isset($map['token_name'])) {
            $model->tokenName = $map['token_name'];
        }
        if (isset($map['token_symbol'])) {
            $model->tokenSymbol = $map['token_symbol'];
        }
        if (isset($map['capacity'])) {
            $model->capacity = $map['capacity'];
        }
        if (isset($map['max_subscription_amount'])) {
            $model->maxSubscriptionAmount = $map['max_subscription_amount'];
        }
        if (isset($map['gmt_created'])) {
            $model->gmtCreated = $map['gmt_created'];
        }

        return $model;
    }
}
