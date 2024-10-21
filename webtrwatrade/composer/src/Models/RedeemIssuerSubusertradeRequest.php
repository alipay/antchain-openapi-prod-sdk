<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class RedeemIssuerSubusertradeRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 二级用户地址
    /**
     * @var string
     */
    public $subUserAddress;

    // 二级用户账户ID
    /**
     * @var string
     */
    public $subUserAccountId;

    // 赎回数量
    /**
     * @var string
     */
    public $redeemAmount;

    // 资产项目ID
    /**
     * @var string
     */
    public $assetProjectId;

    // 资产项目链上合约地址
    /**
     * @var string
     */
    public $assetProjectAddress;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'subUserAddress'      => 'sub_user_address',
        'subUserAccountId'    => 'sub_user_account_id',
        'redeemAmount'        => 'redeem_amount',
        'assetProjectId'      => 'asset_project_id',
        'assetProjectAddress' => 'asset_project_address',
    ];

    public function validate()
    {
        Model::validateRequired('subUserAddress', $this->subUserAddress, true);
        Model::validateRequired('subUserAccountId', $this->subUserAccountId, true);
        Model::validateRequired('redeemAmount', $this->redeemAmount, true);
        Model::validateRequired('assetProjectId', $this->assetProjectId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->subUserAddress) {
            $res['sub_user_address'] = $this->subUserAddress;
        }
        if (null !== $this->subUserAccountId) {
            $res['sub_user_account_id'] = $this->subUserAccountId;
        }
        if (null !== $this->redeemAmount) {
            $res['redeem_amount'] = $this->redeemAmount;
        }
        if (null !== $this->assetProjectId) {
            $res['asset_project_id'] = $this->assetProjectId;
        }
        if (null !== $this->assetProjectAddress) {
            $res['asset_project_address'] = $this->assetProjectAddress;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RedeemIssuerSubusertradeRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['sub_user_address'])) {
            $model->subUserAddress = $map['sub_user_address'];
        }
        if (isset($map['sub_user_account_id'])) {
            $model->subUserAccountId = $map['sub_user_account_id'];
        }
        if (isset($map['redeem_amount'])) {
            $model->redeemAmount = $map['redeem_amount'];
        }
        if (isset($map['asset_project_id'])) {
            $model->assetProjectId = $map['asset_project_id'];
        }
        if (isset($map['asset_project_address'])) {
            $model->assetProjectAddress = $map['asset_project_address'];
        }

        return $model;
    }
}
