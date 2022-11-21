<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Osp\Models;

use AlibabaCloud\Tea\Model;

class PushLicenceMeterdataRequest extends Model
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

    // 产品Code
    /**
     * @var string
     */
    public $productCode;

    // 商品code
    /**
     * @var string
     */
    public $commodityCode;

    // 规格
    /**
     * @var string
     */
    public $specCode;

    // 实例ID, 如果是SOFA产品，则表示SOFA的实例ID。
    // 如果不传则认为是当前环境的总使用量；
    // 如果传了则认为是特定instanceId内的使用量
    /**
     * @var string
     */
    public $instanceId;

    // 用户id
    /**
     * @var string
     */
    public $userId;

    // 原始计量数据，KV结构。
    // 每一对KV 对应一个计量项及其值；Key 为计量项Code，value为其具体的值。比如，某产品有TPS 和节点数两个计量项。
    /**
     * @var string
     */
    public $data;

    // 用量发生的时间
    /**
     * @var string
     */
    public $gmtMeter;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'productCode'       => 'product_code',
        'commodityCode'     => 'commodity_code',
        'specCode'          => 'spec_code',
        'instanceId'        => 'instance_id',
        'userId'            => 'user_id',
        'data'              => 'data',
        'gmtMeter'          => 'gmt_meter',
    ];

    public function validate()
    {
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('commodityCode', $this->commodityCode, true);
        Model::validateRequired('data', $this->data, true);
        Model::validateRequired('gmtMeter', $this->gmtMeter, true);
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
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->commodityCode) {
            $res['commodity_code'] = $this->commodityCode;
        }
        if (null !== $this->specCode) {
            $res['spec_code'] = $this->specCode;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->gmtMeter) {
            $res['gmt_meter'] = $this->gmtMeter;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushLicenceMeterdataRequest
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
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['commodity_code'])) {
            $model->commodityCode = $map['commodity_code'];
        }
        if (isset($map['spec_code'])) {
            $model->specCode = $map['spec_code'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }
        if (isset($map['gmt_meter'])) {
            $model->gmtMeter = $map['gmt_meter'];
        }

        return $model;
    }
}
