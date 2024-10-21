<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class TransferIssuerSubusertradeRequest extends Model
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

    // from二级用户地址
    /**
     * @var string
     */
    public $fromSubUserAddress;

    // from二级用户账户ID
    /**
     * @var string
     */
    public $fromSubUserAccountId;

    // to二级用户地址
    /**
     * @var string
     */
    public $toSubUserAddress;

    // to二级用户账户ID
    /**
     * @var string
     */
    public $toSubUserAccountId;

    // 转移数量
    /**
     * @var string
     */
    public $transferAmount;

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
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'fromSubUserAddress'   => 'from_sub_user_address',
        'fromSubUserAccountId' => 'from_sub_user_account_id',
        'toSubUserAddress'     => 'to_sub_user_address',
        'toSubUserAccountId'   => 'to_sub_user_account_id',
        'transferAmount'       => 'transfer_amount',
        'assetProjectId'       => 'asset_project_id',
        'assetProjectAddress'  => 'asset_project_address',
    ];

    public function validate()
    {
        Model::validateRequired('fromSubUserAddress', $this->fromSubUserAddress, true);
        Model::validateRequired('fromSubUserAccountId', $this->fromSubUserAccountId, true);
        Model::validateRequired('toSubUserAddress', $this->toSubUserAddress, true);
        Model::validateRequired('transferAmount', $this->transferAmount, true);
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
        if (null !== $this->fromSubUserAddress) {
            $res['from_sub_user_address'] = $this->fromSubUserAddress;
        }
        if (null !== $this->fromSubUserAccountId) {
            $res['from_sub_user_account_id'] = $this->fromSubUserAccountId;
        }
        if (null !== $this->toSubUserAddress) {
            $res['to_sub_user_address'] = $this->toSubUserAddress;
        }
        if (null !== $this->toSubUserAccountId) {
            $res['to_sub_user_account_id'] = $this->toSubUserAccountId;
        }
        if (null !== $this->transferAmount) {
            $res['transfer_amount'] = $this->transferAmount;
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
     * @return TransferIssuerSubusertradeRequest
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
        if (isset($map['from_sub_user_address'])) {
            $model->fromSubUserAddress = $map['from_sub_user_address'];
        }
        if (isset($map['from_sub_user_account_id'])) {
            $model->fromSubUserAccountId = $map['from_sub_user_account_id'];
        }
        if (isset($map['to_sub_user_address'])) {
            $model->toSubUserAddress = $map['to_sub_user_address'];
        }
        if (isset($map['to_sub_user_account_id'])) {
            $model->toSubUserAccountId = $map['to_sub_user_account_id'];
        }
        if (isset($map['transfer_amount'])) {
            $model->transferAmount = $map['transfer_amount'];
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
