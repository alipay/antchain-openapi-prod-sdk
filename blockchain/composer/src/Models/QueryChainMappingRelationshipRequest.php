<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryChainMappingRelationshipRequest extends Model
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

    // 链id
    /**
     * @var string
     */
    public $antChainId;

    // 联盟id
    /**
     * @var string
     */
    public $consortiumId;

    // ""
    /**
     * @var string
     */
    public $serviceId;

    // 映射方法类型
    /**
     * @var string
     */
    public $mappingType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'antChainId'        => 'ant_chain_id',
        'consortiumId'      => 'consortium_id',
        'serviceId'         => 'service_id',
        'mappingType'       => 'mapping_type',
    ];

    public function validate()
    {
        Model::validateRequired('antChainId', $this->antChainId, true);
        Model::validateRequired('consortiumId', $this->consortiumId, true);
        Model::validateRequired('serviceId', $this->serviceId, true);
        Model::validateRequired('mappingType', $this->mappingType, true);
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
        if (null !== $this->antChainId) {
            $res['ant_chain_id'] = $this->antChainId;
        }
        if (null !== $this->consortiumId) {
            $res['consortium_id'] = $this->consortiumId;
        }
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->mappingType) {
            $res['mapping_type'] = $this->mappingType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryChainMappingRelationshipRequest
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
        if (isset($map['ant_chain_id'])) {
            $model->antChainId = $map['ant_chain_id'];
        }
        if (isset($map['consortium_id'])) {
            $model->consortiumId = $map['consortium_id'];
        }
        if (isset($map['service_id'])) {
            $model->serviceId = $map['service_id'];
        }
        if (isset($map['mapping_type'])) {
            $model->mappingType = $map['mapping_type'];
        }

        return $model;
    }
}
