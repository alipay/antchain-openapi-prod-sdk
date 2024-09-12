<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\UNITYCS\Models;

use AlibabaCloud\Tea\Model;

class CreateDepositRequest extends Model
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

    // 元数据编码
    /**
     * @var string
     */
    public $metadataCode;

    // 基础信息json
    /**
     * @var string
     */
    public $baseInfoJson;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'metadataCode'      => 'metadata_code',
        'baseInfoJson'      => 'base_info_json',
    ];

    public function validate()
    {
        Model::validateRequired('metadataCode', $this->metadataCode, true);
        Model::validateRequired('baseInfoJson', $this->baseInfoJson, true);
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
        if (null !== $this->metadataCode) {
            $res['metadata_code'] = $this->metadataCode;
        }
        if (null !== $this->baseInfoJson) {
            $res['base_info_json'] = $this->baseInfoJson;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDepositRequest
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
        if (isset($map['metadata_code'])) {
            $model->metadataCode = $map['metadata_code'];
        }
        if (isset($map['base_info_json'])) {
            $model->baseInfoJson = $map['base_info_json'];
        }

        return $model;
    }
}
