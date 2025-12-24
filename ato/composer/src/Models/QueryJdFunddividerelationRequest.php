<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryJdFunddividerelationRequest extends Model
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

    // 被分账方商户公司社会统一信用代码
    /**
     * @var string
     */
    public $subjectMerchantId;

    // 分账关系id
    /**
     * @var string
     */
    public $relationId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'subjectMerchantId' => 'subject_merchant_id',
        'relationId'        => 'relation_id',
    ];

    public function validate()
    {
        Model::validateRequired('subjectMerchantId', $this->subjectMerchantId, true);
        Model::validateRequired('relationId', $this->relationId, true);
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
        if (null !== $this->subjectMerchantId) {
            $res['subject_merchant_id'] = $this->subjectMerchantId;
        }
        if (null !== $this->relationId) {
            $res['relation_id'] = $this->relationId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryJdFunddividerelationRequest
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
        if (isset($map['subject_merchant_id'])) {
            $model->subjectMerchantId = $map['subject_merchant_id'];
        }
        if (isset($map['relation_id'])) {
            $model->relationId = $map['relation_id'];
        }

        return $model;
    }
}
