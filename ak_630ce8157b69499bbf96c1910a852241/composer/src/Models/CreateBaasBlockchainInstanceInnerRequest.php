<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models;

use AlibabaCloud\Tea\Model;

class CreateBaasBlockchainInstanceInnerRequest extends Model
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

    // 区块链名称
    /**
     * @var string
     */
    public $blockchainName;

    // 链打标内容
    /**
     * @var string
     */
    public $blockchainTag;

    // Tee链/企业版/企业版  enterprise
    /**
     * @var string
     */
    public $blockchainType;

    // 待创建联盟的信息
    /**
     * @var BaasUnionInfo
     */
    public $createUnionInfo;

    // 节点数
    /**
     * @var int
     */
    public $nodeNumber;

    // 联盟id
    /**
     * @var int
     */
    public $unionId;

    // 业务线code
    /**
     * @var string
     */
    public $groupCode;

    // 业务线子码
    /**
     * @var string
     */
    public $groupSubCode;

    // 是否需要创建测试链
    /**
     * @var bool
     */
    public $testChain;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'blockchainName'    => 'blockchain_name',
        'blockchainTag'     => 'blockchain_tag',
        'blockchainType'    => 'blockchain_type',
        'createUnionInfo'   => 'create_union_info',
        'nodeNumber'        => 'node_number',
        'unionId'           => 'union_id',
        'groupCode'         => 'group_code',
        'groupSubCode'      => 'group_sub_code',
        'testChain'         => 'test_chain',
    ];

    public function validate()
    {
        Model::validateRequired('blockchainName', $this->blockchainName, true);
        Model::validateRequired('blockchainType', $this->blockchainType, true);
        Model::validateRequired('nodeNumber', $this->nodeNumber, true);
        Model::validateRequired('groupCode', $this->groupCode, true);
        Model::validateRequired('groupSubCode', $this->groupSubCode, true);
        Model::validateRequired('testChain', $this->testChain, true);
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
        if (null !== $this->blockchainName) {
            $res['blockchain_name'] = $this->blockchainName;
        }
        if (null !== $this->blockchainTag) {
            $res['blockchain_tag'] = $this->blockchainTag;
        }
        if (null !== $this->blockchainType) {
            $res['blockchain_type'] = $this->blockchainType;
        }
        if (null !== $this->createUnionInfo) {
            $res['create_union_info'] = null !== $this->createUnionInfo ? $this->createUnionInfo->toMap() : null;
        }
        if (null !== $this->nodeNumber) {
            $res['node_number'] = $this->nodeNumber;
        }
        if (null !== $this->unionId) {
            $res['union_id'] = $this->unionId;
        }
        if (null !== $this->groupCode) {
            $res['group_code'] = $this->groupCode;
        }
        if (null !== $this->groupSubCode) {
            $res['group_sub_code'] = $this->groupSubCode;
        }
        if (null !== $this->testChain) {
            $res['test_chain'] = $this->testChain;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateBaasBlockchainInstanceInnerRequest
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
        if (isset($map['blockchain_name'])) {
            $model->blockchainName = $map['blockchain_name'];
        }
        if (isset($map['blockchain_tag'])) {
            $model->blockchainTag = $map['blockchain_tag'];
        }
        if (isset($map['blockchain_type'])) {
            $model->blockchainType = $map['blockchain_type'];
        }
        if (isset($map['create_union_info'])) {
            $model->createUnionInfo = BaasUnionInfo::fromMap($map['create_union_info']);
        }
        if (isset($map['node_number'])) {
            $model->nodeNumber = $map['node_number'];
        }
        if (isset($map['union_id'])) {
            $model->unionId = $map['union_id'];
        }
        if (isset($map['group_code'])) {
            $model->groupCode = $map['group_code'];
        }
        if (isset($map['group_sub_code'])) {
            $model->groupSubCode = $map['group_sub_code'];
        }
        if (isset($map['test_chain'])) {
            $model->testChain = $map['test_chain'];
        }

        return $model;
    }
}
