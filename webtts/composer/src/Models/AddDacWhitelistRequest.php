<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTTS\Models;

use AlibabaCloud\Tea\Model;

class AddDacWhitelistRequest extends Model
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

    // 外部客户id
    /**
     * @var string
     */
    public $externalCustId;

    // 外部客户名称
    /**
     * @var string
     */
    public $externalCustName;

    // 白名单地址
    /**
     * @var string
     */
    public $address;

    // 区块链网络列表
    /**
     * @var string[]
     */
    public $blockchainList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'externalCustId'    => 'external_cust_id',
        'externalCustName'  => 'external_cust_name',
        'address'           => 'address',
        'blockchainList'    => 'blockchain_list',
    ];

    public function validate()
    {
        Model::validateRequired('externalCustId', $this->externalCustId, true);
        Model::validateRequired('externalCustName', $this->externalCustName, true);
        Model::validateRequired('address', $this->address, true);
        Model::validateRequired('blockchainList', $this->blockchainList, true);
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
        if (null !== $this->externalCustId) {
            $res['external_cust_id'] = $this->externalCustId;
        }
        if (null !== $this->externalCustName) {
            $res['external_cust_name'] = $this->externalCustName;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->blockchainList) {
            $res['blockchain_list'] = $this->blockchainList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddDacWhitelistRequest
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
        if (isset($map['external_cust_id'])) {
            $model->externalCustId = $map['external_cust_id'];
        }
        if (isset($map['external_cust_name'])) {
            $model->externalCustName = $map['external_cust_name'];
        }
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['blockchain_list'])) {
            if (!empty($map['blockchain_list'])) {
                $model->blockchainList = $map['blockchain_list'];
            }
        }

        return $model;
    }
}
