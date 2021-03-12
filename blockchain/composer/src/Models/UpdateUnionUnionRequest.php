<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class UpdateUnionUnionRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 联盟id
    /**
     * @var string
     */
    public $consortiumId;

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

    // 联盟描述
    /**
     * @var string
     */
    public $consortiumDescription;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'consortiumId'          => 'consortium_id',
        'consortiumName'        => 'consortium_name',
        'regionId'              => 'region_id',
        'consortiumDescription' => 'consortium_description',
    ];

    public function validate()
    {
        Model::validateRequired('consortiumId', $this->consortiumId, true);
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
        if (null !== $this->consortiumId) {
            $res['consortium_id'] = $this->consortiumId;
        }
        if (null !== $this->consortiumName) {
            $res['consortium_name'] = $this->consortiumName;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->consortiumDescription) {
            $res['consortium_description'] = $this->consortiumDescription;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateUnionUnionRequest
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
        if (isset($map['consortium_id'])) {
            $model->consortiumId = $map['consortium_id'];
        }
        if (isset($map['consortium_name'])) {
            $model->consortiumName = $map['consortium_name'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['consortium_description'])) {
            $model->consortiumDescription = $map['consortium_description'];
        }

        return $model;
    }
}
