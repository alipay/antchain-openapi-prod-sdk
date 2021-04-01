<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryCreditTransferBalanceRequest extends Model
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

    // 货主分布式数字身份
    /**
     * @var string
     */
    public $consignorDid;

    // 需发行信用流转的运费，运费最多精确到小数点后2位
    /**
     * @var string
     */
    public $freight;

    // 业务发起方分布式数字身
    /**
     * @var string
     */
    public $platformDid;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'consignorDid'      => 'consignor_did',
        'freight'           => 'freight',
        'platformDid'       => 'platform_did',
    ];

    public function validate()
    {
        Model::validateRequired('consignorDid', $this->consignorDid, true);
        Model::validateRequired('freight', $this->freight, true);
        Model::validateRequired('platformDid', $this->platformDid, true);
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
        if (null !== $this->consignorDid) {
            $res['consignor_did'] = $this->consignorDid;
        }
        if (null !== $this->freight) {
            $res['freight'] = $this->freight;
        }
        if (null !== $this->platformDid) {
            $res['platform_did'] = $this->platformDid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCreditTransferBalanceRequest
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
        if (isset($map['consignor_did'])) {
            $model->consignorDid = $map['consignor_did'];
        }
        if (isset($map['freight'])) {
            $model->freight = $map['freight'];
        }
        if (isset($map['platform_did'])) {
            $model->platformDid = $map['platform_did'];
        }

        return $model;
    }
}
