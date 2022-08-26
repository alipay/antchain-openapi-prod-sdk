<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models;

use AlibabaCloud\Tea\Model;

class CreateBaasUnionUnionRequest extends Model
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

    // 联盟描述
    /**
     * @var string
     */
    public $consortiumDescription;

    // 联盟名称
    /**
     * @var string
     */
    public $consortiumName;

    // 区域信息
    /**
     * @var string
     */
    public $regionId;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'consortiumDescription' => 'consortium_description',
        'consortiumName'        => 'consortium_name',
        'regionId'              => 'region_id',
    ];

    public function validate()
    {
        Model::validateRequired('consortiumName', $this->consortiumName, true);
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
        if (null !== $this->consortiumDescription) {
            $res['consortium_description'] = $this->consortiumDescription;
        }
        if (null !== $this->consortiumName) {
            $res['consortium_name'] = $this->consortiumName;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateBaasUnionUnionRequest
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
        if (isset($map['consortium_description'])) {
            $model->consortiumDescription = $map['consortium_description'];
        }
        if (isset($map['consortium_name'])) {
            $model->consortiumName = $map['consortium_name'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }

        return $model;
    }
}
