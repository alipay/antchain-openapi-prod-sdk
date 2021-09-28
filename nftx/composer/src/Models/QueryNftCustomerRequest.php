<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTX\Models;

use AlibabaCloud\Tea\Model;

class QueryNftCustomerRequest extends Model
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

    // 用户支付宝2088账号编码，16位
    /**
     * @var string
     */
    public $idNo;

    // 用户的账户类型
    /**
     * @var string
     */
    public $idType;

    // NFT资产唯一编码
    /**
     * @var string
     */
    public $nftId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'idNo'              => 'id_no',
        'idType'            => 'id_type',
        'nftId'             => 'nft_id',
    ];

    public function validate()
    {
        Model::validateRequired('idNo', $this->idNo, true);
        Model::validateRequired('idType', $this->idType, true);
        Model::validateRequired('nftId', $this->nftId, true);
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
        if (null !== $this->idNo) {
            $res['id_no'] = $this->idNo;
        }
        if (null !== $this->idType) {
            $res['id_type'] = $this->idType;
        }
        if (null !== $this->nftId) {
            $res['nft_id'] = $this->nftId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryNftCustomerRequest
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
        if (isset($map['id_no'])) {
            $model->idNo = $map['id_no'];
        }
        if (isset($map['id_type'])) {
            $model->idType = $map['id_type'];
        }
        if (isset($map['nft_id'])) {
            $model->nftId = $map['nft_id'];
        }

        return $model;
    }
}
