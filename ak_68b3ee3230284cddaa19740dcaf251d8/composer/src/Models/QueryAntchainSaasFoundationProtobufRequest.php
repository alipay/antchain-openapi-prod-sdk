<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_68b3ee3230284cddaa19740dcaf251d8\Models;

use AlibabaCloud\Tea\Model;

class QueryAntchainSaasFoundationProtobufRequest extends Model
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

    // 产品码
    /**
     * @var string
     */
    public $productCode;

    // api code列表信息
    /**
     * @var string[]
     */
    public $apiCodeList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'productCode'       => 'product_code',
        'apiCodeList'       => 'api_code_list',
    ];

    public function validate()
    {
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('apiCodeList', $this->apiCodeList, true);
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
        if (null !== $this->apiCodeList) {
            $res['api_code_list'] = $this->apiCodeList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntchainSaasFoundationProtobufRequest
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
        if (isset($map['api_code_list'])) {
            if (!empty($map['api_code_list'])) {
                $model->apiCodeList = $map['api_code_list'];
            }
        }

        return $model;
    }
}
