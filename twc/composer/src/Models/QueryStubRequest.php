<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryStubRequest extends Model
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

    // 流程id，通过twc.notary.stub.create接口获取
    /**
     * @var string
     */
    public $flowId;

    // 是否需要legal标，默认为false，如果需要则填true
    /**
     * @var bool
     */
    public $needLegalLogo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'flowId'            => 'flow_id',
        'needLegalLogo'     => 'need_legal_logo',
    ];

    public function validate()
    {
        Model::validateRequired('flowId', $this->flowId, true);
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
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->needLegalLogo) {
            $res['need_legal_logo'] = $this->needLegalLogo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryStubRequest
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
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['need_legal_logo'])) {
            $model->needLegalLogo = $map['need_legal_logo'];
        }

        return $model;
    }
}
