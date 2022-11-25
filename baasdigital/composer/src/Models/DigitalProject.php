<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDIGITAL\Models;

use AlibabaCloud\Tea\Model;

class DigitalProject extends Model
{
    // 数字权证项目id
    /**
     * @example 3bb5caa2-n8n7aubhu3h9
     *
     * @var string
     */
    public $projectId;

    // 模版类型
    // 1为共享型，2为独享型，3为高性能共享型，4为高性能独享型
    /**
     * @example 1,2,3,4
     *
     * @var int
     */
    public $bizType;

    // 数字权证项目名称
    /**
     * @example digitalproject1
     *
     * @var string
     */
    public $name;

    // 合约symbol
    /**
     * @example eta
     *
     * @var string
     */
    public $symbol;

    // 数字权证项目描述
    /**
     * @example this project is .....
     *
     * @var string
     */
    public $description;

    // 项目状态：
    // deploy：已部署(可更新)
    // issue：已发布(不可更新)
    /**
     * @example deploy
     *
     * @var string
     */
    public $projectStatus;

    // 项目发行权证的总数，高性能版本显示为0
    /**
     * @example 100
     *
     * @var int
     */
    public $amount;

    // 权证的uri信息（共享tokenuri模式有该字段）
    /**
     * @example https://digitalproject.com
     *
     * @var string
     */
    public $assetUri;

    // 项目发行后权证数量是否可增发，高性能版本显示为支持
    //
    /**
     * @example true
     *
     * @var bool
     */
    public $limitedAmount;

    // 项目权证是否可核销
    /**
     * @example true
     *
     * @var bool
     */
    public $writeOffable;

    // 项目权证是否可销毁
    /**
     * @example true
     *
     * @var bool
     */
    public $burnable;

    // 项目管理员账户地址
    /**
     * @example 46HHKALsdww3
     *
     * @var string
     */
    public $ownerAccount;

    // 项目核销员账户地址列表
    /**
     * @example ["a","b","c"]
     *
     * @var string[]
     */
    public $issuerList;

    // 项目核销员账户地址列表
    /**
     * @example ["a","b","c"]
     *
     * @var string[]
     */
    public $writeoffList;

    // 合约创建时间
    /**
     * @example 21-12-29
     *
     * @var int
     */
    public $createTime;
    protected $_name = [
        'projectId'     => 'project_id',
        'bizType'       => 'biz_type',
        'name'          => 'name',
        'symbol'        => 'symbol',
        'description'   => 'description',
        'projectStatus' => 'project_status',
        'amount'        => 'amount',
        'assetUri'      => 'asset_uri',
        'limitedAmount' => 'limited_amount',
        'writeOffable'  => 'write_offable',
        'burnable'      => 'burnable',
        'ownerAccount'  => 'owner_account',
        'issuerList'    => 'issuer_list',
        'writeoffList'  => 'writeoff_list',
        'createTime'    => 'create_time',
    ];

    public function validate()
    {
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('symbol', $this->symbol, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('projectStatus', $this->projectStatus, true);
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('limitedAmount', $this->limitedAmount, true);
        Model::validateRequired('writeOffable', $this->writeOffable, true);
        Model::validateRequired('burnable', $this->burnable, true);
        Model::validateRequired('ownerAccount', $this->ownerAccount, true);
        Model::validateRequired('createTime', $this->createTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
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
        if (null !== $this->projectStatus) {
            $res['project_status'] = $this->projectStatus;
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
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DigitalProject
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
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
        if (isset($map['project_status'])) {
            $model->projectStatus = $map['project_status'];
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
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }

        return $model;
    }
}
