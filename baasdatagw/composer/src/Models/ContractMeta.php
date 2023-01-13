<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class ContractMeta extends Model
{
    // MetaID
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 合约Meta创建时间
    /**
     * @example 1635822971000
     *
     * @var int
     */
    public $createTime;

    // 合约Meta更新时间
    /**
     * @example 1635822971000
     *
     * @var int
     */
    public $updateTime;

    // 合约名称
    /**
     * @example myContract
     *
     * @var string
     */
    public $contractName;

    // 合约名称对应的Hex编码合约地址
    /**
     * @example 6958d7e93f116f4ca34c932671733ebe18839f0a674b3d6d7dac69e53eb6c607
     *
     * @var string
     */
    public $contractAddr;

    // 合约版本号，用于助记
    /**
     * @example 1.0
     *
     * @var string
     */
    public $contractVersion;

    // 合约Meta的类型，枚举类型；
    /**
     * @example WASM_ABI, SOLIDITY_ABI
     *
     * @var string
     */
    public $metaType;

    // 合约Meta生效块高，留空表示从上一个已定义的区间结束开始生效； 否则表示具体的起始生效块高
    /**
     * @example 0
     *
     * @var int
     */
    public $startBlock;

    // 合约Meta生效的截止块高，留空表示自动探测到下一个已定于的区间为止， 0 表示持续生效
    /**
     * @example 0
     *
     * @var int
     */
    public $endBlock;

    // 合约是否对外该链其它租户开放； 0 表示否， 1表示开放
    /**
     * @example 0
     *
     * @var int
     */
    public $publicFlag;

    // 合约Meta对应类型的数据
    /**
     * @example ABI文件内容
     *
     * @var string
     */
    public $metaContent;
    protected $_name = [
        'id'              => 'id',
        'createTime'      => 'create_time',
        'updateTime'      => 'update_time',
        'contractName'    => 'contract_name',
        'contractAddr'    => 'contract_addr',
        'contractVersion' => 'contract_version',
        'metaType'        => 'meta_type',
        'startBlock'      => 'start_block',
        'endBlock'        => 'end_block',
        'publicFlag'      => 'public_flag',
        'metaContent'     => 'meta_content',
    ];

    public function validate()
    {
        Model::validateRequired('contractName', $this->contractName, true);
        Model::validateRequired('contractAddr', $this->contractAddr, true);
        Model::validateRequired('contractVersion', $this->contractVersion, true);
        Model::validateRequired('metaType', $this->metaType, true);
        Model::validateRequired('metaContent', $this->metaContent, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }
        if (null !== $this->contractName) {
            $res['contract_name'] = $this->contractName;
        }
        if (null !== $this->contractAddr) {
            $res['contract_addr'] = $this->contractAddr;
        }
        if (null !== $this->contractVersion) {
            $res['contract_version'] = $this->contractVersion;
        }
        if (null !== $this->metaType) {
            $res['meta_type'] = $this->metaType;
        }
        if (null !== $this->startBlock) {
            $res['start_block'] = $this->startBlock;
        }
        if (null !== $this->endBlock) {
            $res['end_block'] = $this->endBlock;
        }
        if (null !== $this->publicFlag) {
            $res['public_flag'] = $this->publicFlag;
        }
        if (null !== $this->metaContent) {
            $res['meta_content'] = $this->metaContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractMeta
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }
        if (isset($map['contract_name'])) {
            $model->contractName = $map['contract_name'];
        }
        if (isset($map['contract_addr'])) {
            $model->contractAddr = $map['contract_addr'];
        }
        if (isset($map['contract_version'])) {
            $model->contractVersion = $map['contract_version'];
        }
        if (isset($map['meta_type'])) {
            $model->metaType = $map['meta_type'];
        }
        if (isset($map['start_block'])) {
            $model->startBlock = $map['start_block'];
        }
        if (isset($map['end_block'])) {
            $model->endBlock = $map['end_block'];
        }
        if (isset($map['public_flag'])) {
            $model->publicFlag = $map['public_flag'];
        }
        if (isset($map['meta_content'])) {
            $model->metaContent = $map['meta_content'];
        }

        return $model;
    }
}
