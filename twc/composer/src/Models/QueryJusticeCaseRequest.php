<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryJusticeCaseRequest extends Model
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

    // 案件Id,创建案件返回的id
    /**
     * @var int
     */
    public $caseId;

    // 维权记录ID, 维权成功后,返回的对应的维权记录ID
    /**
     * @var int
     */
    public $recordId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'caseId'            => 'case_id',
        'recordId'          => 'record_id',
    ];

    public function validate()
    {
        Model::validateRequired('caseId', $this->caseId, true);
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
        if (null !== $this->caseId) {
            $res['case_id'] = $this->caseId;
        }
        if (null !== $this->recordId) {
            $res['record_id'] = $this->recordId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryJusticeCaseRequest
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
        if (isset($map['case_id'])) {
            $model->caseId = $map['case_id'];
        }
        if (isset($map['record_id'])) {
            $model->recordId = $map['record_id'];
        }

        return $model;
    }
}
