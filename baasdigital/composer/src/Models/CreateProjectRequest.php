<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDIGITAL\Models;

use AlibabaCloud\Tea\Model;

class CreateProjectRequest extends Model
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

    // 链ID
    /**
     * @var string
     */
    public $bizid;

    // 项目名称
    /**
     * @var string
     */
    public $name;

    // 数字合约symbol
    /**
     * @var string
     */
    public $symbol;

    // 数字权证项目描述信息
    /**
     * @var string
     */
    public $description;

    // 模版类型
    /**
     * @var int
     */
    public $bizType;

    // 项目发行权证数量上限
    /**
     * @var int
     */
    public $amount;

    // 数字权证链接，共享时必须传入
    /**
     * @var string
     */
    public $assetUri;

    // 是否可增发
    /**
     * @var bool
     */
    public $limitedAmount;

    // 是否可核销
    /**
     * @var bool
     */
    public $writeOffable;

    // 是否可销毁
    /**
     * @var bool
     */
    public $burnable;

    // 项目管理者，必须是链上已存在的账户，只有管理者可以修改项目信息
    /**
     * @var string
     */
    public $ownerAccount;

    // 发行者列表，必须是链上已经存在的账户，只有发行者具备权证发行权限。
    /**
     * @var string[]
     */
    public $issuerList;

    // 核销者列表，必须是链上已经存在的账户，只有核销者才可以核销权证
    /**
     * @var string[]
     */
    public $writeoffList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizid'             => 'bizid',
        'name'              => 'name',
        'symbol'            => 'symbol',
        'description'       => 'description',
        'bizType'           => 'biz_type',
        'amount'            => 'amount',
        'assetUri'          => 'asset_uri',
        'limitedAmount'     => 'limited_amount',
        'writeOffable'      => 'write_offable',
        'burnable'          => 'burnable',
        'ownerAccount'      => 'owner_account',
        'issuerList'        => 'issuer_list',
        'writeoffList'      => 'writeoff_list',
    ];

    public function validate()
    {
        Model::validateRequired('bizid', $this->bizid, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('symbol', $this->symbol, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('limitedAmount', $this->limitedAmount, true);
        Model::validateRequired('writeOffable', $this->writeOffable, true);
        Model::validateRequired('burnable', $this->burnable, true);
        Model::validateRequired('ownerAccount', $this->ownerAccount, true);
        Model::validateRequired('issuerList', $this->issuerList, true);
        Model::validateMaxLength('name', $this->name, 100);
        Model::validateMinLength('name', $this->name, 1);
        Model::validateMinimum('amount', $this->amount, 1);
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
        if (null !== $this->bizid) {
            $res['bizid'] = $this->bizid;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->symbol) {
            $res['symbol'] = $this->symbol;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->assetUri) {
            $res['asset_uri'] = $this->assetUri;
        }
        if (null !== $this->limitedAmount) {
            $res['limited_amount'] = $this->limitedAmount;
        }
        if (null !== $this->writeOffable) {
            $res['write_offable'] = $this->writeOffable;
        }
        if (null !== $this->burnable) {
            $res['burnable'] = $this->burnable;
        }
        if (null !== $this->ownerAccount) {
            $res['owner_account'] = $this->ownerAccount;
        }
        if (null !== $this->issuerList) {
            $res['issuer_list'] = $this->issuerList;
        }
        if (null !== $this->writeoffList) {
            $res['writeoff_list'] = $this->writeoffList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateProjectRequest
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
        if (isset($map['bizid'])) {
            $model->bizid = $map['bizid'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['symbol'])) {
            $model->symbol = $map['symbol'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['asset_uri'])) {
            $model->assetUri = $map['asset_uri'];
        }
        if (isset($map['limited_amount'])) {
            $model->limitedAmount = $map['limited_amount'];
        }
        if (isset($map['write_offable'])) {
            $model->writeOffable = $map['write_offable'];
        }
        if (isset($map['burnable'])) {
            $model->burnable = $map['burnable'];
        }
        if (isset($map['owner_account'])) {
            $model->ownerAccount = $map['owner_account'];
        }
        if (isset($map['issuer_list'])) {
            if (!empty($map['issuer_list'])) {
                $model->issuerList = $map['issuer_list'];
            }
        }
        if (isset($map['writeoff_list'])) {
            if (!empty($map['writeoff_list'])) {
                $model->writeoffList = $map['writeoff_list'];
            }
        }

        return $model;
    }
}
