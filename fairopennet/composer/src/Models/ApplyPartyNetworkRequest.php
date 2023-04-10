<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\FAIROPENNET\Models;

use AlibabaCloud\Tea\Model;

class ApplyPartyNetworkRequest extends Model
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

    /**
     * @var string
     */
    public $networkId;

    /**
     * @var string
     */
    public $partyId;

    /**
     * @var string
     */
    public $accountName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'networkId'         => 'network_id',
        'partyId'           => 'party_id',
        'accountName'       => 'account_name',
    ];

    public function validate()
    {
        Model::validateRequired('networkId', $this->networkId, true);
        Model::validateRequired('partyId', $this->partyId, true);
        Model::validateRequired('accountName', $this->accountName, true);
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
        if (null !== $this->networkId) {
            $res['network_id'] = $this->networkId;
        }
        if (null !== $this->partyId) {
            $res['party_id'] = $this->partyId;
        }
        if (null !== $this->accountName) {
            $res['account_name'] = $this->accountName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyPartyNetworkRequest
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
        if (isset($map['network_id'])) {
            $model->networkId = $map['network_id'];
        }
        if (isset($map['party_id'])) {
            $model->partyId = $map['party_id'];
        }
        if (isset($map['account_name'])) {
            $model->accountName = $map['account_name'];
        }

        return $model;
    }
}
