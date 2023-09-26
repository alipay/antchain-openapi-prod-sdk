<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class ListChaininsightAssetinterfacesrequiredRequest extends Model
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

    // ERC标准类型：ERC721 / ERC1155
    /**
     * @var string
     */
    public $ercType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'ercType'           => 'erc_type',
    ];

    public function validate()
    {
        Model::validateRequired('ercType', $this->ercType, true);
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
        if (null !== $this->ercType) {
            $res['erc_type'] = $this->ercType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListChaininsightAssetinterfacesrequiredRequest
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
        if (isset($map['erc_type'])) {
            $model->ercType = $map['erc_type'];
        }

        return $model;
    }
}
