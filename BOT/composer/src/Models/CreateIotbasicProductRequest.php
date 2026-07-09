<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CreateIotbasicProductRequest extends Model
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

    // 产品名称
    /**
     * @var string
     */
    public $productName;

    // 品类类型
    // 标准品类：standard
    // 自定义品类：custom
    /**
     * @var string
     */
    public $categoryType;

    // 品类编码
    /**
     * @var string
     */
    public $categoryCode;

    // 连网方式
    // WIFI： Wi-Fi
    // CELLULAR：蜂窝网ETHERNET：以太网OTHER：其他
    /**
     * @var string
     */
    public $netType;

    // 设备种类
    // 0：直连网络设备
    // 1：网关设备
    /**
     * @var int
     */
    public $nodeType;

    // 安全SDK接入模式
    // NO_SEC：不进行安全认证
    // PRODUCTION_PRESET：产线预置
    // AIR_DISTRIBUTION：空中发行
    /**
     * @var string
     */
    public $authType;

    // 产品描述
    // 长度不超过100个字符
    /**
     * @var string
     */
    public $description;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'productName'       => 'product_name',
        'categoryType'      => 'category_type',
        'categoryCode'      => 'category_code',
        'netType'           => 'net_type',
        'nodeType'          => 'node_type',
        'authType'          => 'auth_type',
        'description'       => 'description',
    ];

    public function validate()
    {
        Model::validateRequired('productName', $this->productName, true);
        Model::validateRequired('categoryType', $this->categoryType, true);
        Model::validateRequired('categoryCode', $this->categoryCode, true);
        Model::validateRequired('netType', $this->netType, true);
        Model::validateRequired('nodeType', $this->nodeType, true);
        Model::validateRequired('authType', $this->authType, true);
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
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->categoryType) {
            $res['category_type'] = $this->categoryType;
        }
        if (null !== $this->categoryCode) {
            $res['category_code'] = $this->categoryCode;
        }
        if (null !== $this->netType) {
            $res['net_type'] = $this->netType;
        }
        if (null !== $this->nodeType) {
            $res['node_type'] = $this->nodeType;
        }
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateIotbasicProductRequest
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
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['category_type'])) {
            $model->categoryType = $map['category_type'];
        }
        if (isset($map['category_code'])) {
            $model->categoryCode = $map['category_code'];
        }
        if (isset($map['net_type'])) {
            $model->netType = $map['net_type'];
        }
        if (isset($map['node_type'])) {
            $model->nodeType = $map['node_type'];
        }
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }

        return $model;
    }
}
