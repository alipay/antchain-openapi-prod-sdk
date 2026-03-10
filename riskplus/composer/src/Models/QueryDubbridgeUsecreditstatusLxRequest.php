<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeUsecreditstatusLxRequest extends Model
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

    // 支用申请编号
    /**
     * @var string
     */
    public $applyId;

    // 合作方代码
    /**
     * @var string
     */
    public $partnerCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'applyId'           => 'apply_id',
        'partnerCode'       => 'partner_code',
    ];

    public function validate()
    {
        Model::validateRequired('applyId', $this->applyId, true);
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
        if (null !== $this->applyId) {
            $res['apply_id'] = $this->applyId;
        }
        if (null !== $this->partnerCode) {
            $res['partner_code'] = $this->partnerCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeUsecreditstatusLxRequest
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
        if (isset($map['apply_id'])) {
            $model->applyId = $map['apply_id'];
        }
        if (isset($map['partner_code'])) {
            $model->partnerCode = $map['partner_code'];
        }

        return $model;
    }
}
