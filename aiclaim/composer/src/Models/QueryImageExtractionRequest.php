<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AICLAIM\Models;

use AlibabaCloud\Tea\Model;

class QueryImageExtractionRequest extends Model
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

    // 任务id
    /**
     * @var string
     */
    public $batchNo;

    // 理赔单id
    /**
     * @var string
     */
    public $claimNumber;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'batchNo'           => 'batch_no',
        'claimNumber'       => 'claim_number',
    ];

    public function validate()
    {
        Model::validateRequired('batchNo', $this->batchNo, true);
        Model::validateRequired('claimNumber', $this->claimNumber, true);
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
        if (null !== $this->batchNo) {
            $res['batch_no'] = $this->batchNo;
        }
        if (null !== $this->claimNumber) {
            $res['claim_number'] = $this->claimNumber;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryImageExtractionRequest
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
        if (isset($map['batch_no'])) {
            $model->batchNo = $map['batch_no'];
        }
        if (isset($map['claim_number'])) {
            $model->claimNumber = $map['claim_number'];
        }

        return $model;
    }
}
