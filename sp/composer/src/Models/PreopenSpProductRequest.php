<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SP\Models;

use AlibabaCloud\Tea\Model;

class PreopenSpProductRequest extends Model
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

    /**
     * @var string
     */
    public $productAccessCode;

    // 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
    /**
     * @var string
     */
    public $orderNo;

    // 产品码 全局唯一
    /**
     * @var string
     */
    public $productCode;

    //
    // 产品实例Id
    /**
     * @var string[]
     */
    public $instanceIds;

    //
    // 具体规格配置信息（JSON格式）会按照key进行排序
    /**
     * @var string
     */
    public $specification;

    // 部分产品创建时需要非生产规格的数据（JSON格式） 比如：ECS生产需要账号、密码等 会按照key进行排序
    /**
     * @var string
     */
    public $customData;

    // 实例需要创建到租户的环境信息
    /**
     * @var string
     */
    public $workspace;

    //
    // 实例需要创建到租户的地域
    /**
     * @var string
     */
    public $region;

    //
    // 实例需要创建到租户的机房，可以有多个（冗灾场景）
    /**
     * @var string[]
     */
    public $zones;

    //
    // 购买产品的租户ID，格式为2088XXXXXXXXXXXX
    /**
     * @var string
     */
    public $tenantId;

    // 服务接入码，商品对接开通时关联的接入码，由产品方研发定义，并对应一个回调地址
    /**
     * @var string
     */
    public $accessCode;

    // 商业业务信息，如签约的项目ID、合同ID、合作伙伴ID等信息
    /**
     * @var string
     */
    public $businessData;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'productAccessCode' => 'product_access_code',
        'orderNo'           => 'order_no',
        'productCode'       => 'product_code',
        'instanceIds'       => 'instance_ids',
        'specification'     => 'specification',
        'customData'        => 'custom_data',
        'workspace'         => 'workspace',
        'region'            => 'region',
        'zones'             => 'zones',
        'tenantId'          => 'tenant_id',
        'accessCode'        => 'access_code',
        'businessData'      => 'business_data',
    ];

    public function validate()
    {
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('instanceIds', $this->instanceIds, true);
        Model::validateRequired('specification', $this->specification, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('accessCode', $this->accessCode, true);
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
        if (null !== $this->productAccessCode) {
            $res['product_access_code'] = $this->productAccessCode;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->instanceIds) {
            $res['instance_ids'] = $this->instanceIds;
        }
        if (null !== $this->specification) {
            $res['specification'] = $this->specification;
        }
        if (null !== $this->customData) {
            $res['custom_data'] = $this->customData;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->zones) {
            $res['zones'] = $this->zones;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->accessCode) {
            $res['access_code'] = $this->accessCode;
        }
        if (null !== $this->businessData) {
            $res['business_data'] = $this->businessData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PreopenSpProductRequest
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
        if (isset($map['product_access_code'])) {
            $model->productAccessCode = $map['product_access_code'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['instance_ids'])) {
            if (!empty($map['instance_ids'])) {
                $model->instanceIds = $map['instance_ids'];
            }
        }
        if (isset($map['specification'])) {
            $model->specification = $map['specification'];
        }
        if (isset($map['custom_data'])) {
            $model->customData = $map['custom_data'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }
        if (isset($map['region'])) {
            $model->region = $map['region'];
        }
        if (isset($map['zones'])) {
            if (!empty($map['zones'])) {
                $model->zones = $map['zones'];
            }
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['access_code'])) {
            $model->accessCode = $map['access_code'];
        }
        if (isset($map['business_data'])) {
            $model->businessData = $map['business_data'];
        }

        return $model;
    }
}
