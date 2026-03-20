<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeEccreditQuotaRequest extends Model
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

    // 交易流水号，自行设定规则生成
    /**
     * @var string
     */
    public $transactionNo;

    // 业务场景
    /**
     * @var string
     */
    public $businessScene;

    // 合同编号
    /**
     * @var string
     */
    public $contractNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'transactionNo'     => 'transaction_no',
        'businessScene'     => 'business_scene',
        'contractNo'        => 'contract_no',
    ];

    public function validate()
    {
        Model::validateRequired('transactionNo', $this->transactionNo, true);
        Model::validateRequired('businessScene', $this->businessScene, true);
        Model::validateRequired('contractNo', $this->contractNo, true);
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
        if (null !== $this->transactionNo) {
            $res['transaction_no'] = $this->transactionNo;
        }
        if (null !== $this->businessScene) {
            $res['business_scene'] = $this->businessScene;
        }
        if (null !== $this->contractNo) {
            $res['contract_no'] = $this->contractNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeEccreditQuotaRequest
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
        if (isset($map['transaction_no'])) {
            $model->transactionNo = $map['transaction_no'];
        }
        if (isset($map['business_scene'])) {
            $model->businessScene = $map['business_scene'];
        }
        if (isset($map['contract_no'])) {
            $model->contractNo = $map['contract_no'];
        }

        return $model;
    }
}
