<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateOcpProductRequest extends Model
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

    // 联盟Id
    /**
     * @var string
     */
    public $baasAlliance;

    // 意义：链扩容字段，表示在默认空间大小基础上，新增空间大小，单位为G，默认值为0。
    // 仅链版本为企业版（enterpriseVer）时，才发挥作用。
    /**
     * @var string
     */
    public $baasCapacity;

    // 区块链的名称
    /**
     * @var string
     */
    public $baasName;

    // 意义：链新增节点数，表示在默认4个节点基础上，新增节点数，单位为个，默认值为0。
    // 仅链版本为企业版（enterpriseVer）时，才发挥作用。
    /**
     * @var string
     */
    public $baasNode;

    // 意义：Tee链标志，表示创建Tee区块链，默认值为false。
    // 注意：仅链版本为企业版（enterpriseVer）时，才发挥作用。
    /**
     * @var bool
     */
    public $baasTee;

    // 基础版（basicVer）、企业版（enterpriseVer）
    /**
     * @var string
     */
    public $baasVer;

    // 业务组详细码
    /**
     * @var string
     */
    public $bizCode;

    // 业务组详细类型
    /**
     * @var string
     */
    public $bizType;

    // 业务组码
    /**
     * @var string
     */
    public $groupCode;

    // 产品码 全局唯一
    /**
     * @var string
     */
    public $productCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baasAlliance'      => 'baas_alliance',
        'baasCapacity'      => 'baas_capacity',
        'baasName'          => 'baas_name',
        'baasNode'          => 'baas_node',
        'baasTee'           => 'baas_tee',
        'baasVer'           => 'baas_ver',
        'bizCode'           => 'biz_code',
        'bizType'           => 'biz_type',
        'groupCode'         => 'group_code',
        'productCode'       => 'product_code',
    ];

    public function validate()
    {
        Model::validateRequired('baasAlliance', $this->baasAlliance, true);
        Model::validateRequired('baasName', $this->baasName, true);
        Model::validateRequired('baasVer', $this->baasVer, true);
        Model::validateRequired('bizCode', $this->bizCode, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('groupCode', $this->groupCode, true);
        Model::validateRequired('productCode', $this->productCode, true);
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
        if (null !== $this->baasAlliance) {
            $res['baas_alliance'] = $this->baasAlliance;
        }
        if (null !== $this->baasCapacity) {
            $res['baas_capacity'] = $this->baasCapacity;
        }
        if (null !== $this->baasName) {
            $res['baas_name'] = $this->baasName;
        }
        if (null !== $this->baasNode) {
            $res['baas_node'] = $this->baasNode;
        }
        if (null !== $this->baasTee) {
            $res['baas_tee'] = $this->baasTee;
        }
        if (null !== $this->baasVer) {
            $res['baas_ver'] = $this->baasVer;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->groupCode) {
            $res['group_code'] = $this->groupCode;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateOcpProductRequest
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
        if (isset($map['baas_alliance'])) {
            $model->baasAlliance = $map['baas_alliance'];
        }
        if (isset($map['baas_capacity'])) {
            $model->baasCapacity = $map['baas_capacity'];
        }
        if (isset($map['baas_name'])) {
            $model->baasName = $map['baas_name'];
        }
        if (isset($map['baas_node'])) {
            $model->baasNode = $map['baas_node'];
        }
        if (isset($map['baas_tee'])) {
            $model->baasTee = $map['baas_tee'];
        }
        if (isset($map['baas_ver'])) {
            $model->baasVer = $map['baas_ver'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['group_code'])) {
            $model->groupCode = $map['group_code'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }

        return $model;
    }
}
