<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class QueryAnalysisQueryRequest extends Model
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

    // 分析任务ID
    /**
     * @var string
     */
    public $analysisId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'analysisId'        => 'analysis_id',
    ];

    public function validate()
    {
        Model::validateRequired('analysisId', $this->analysisId, true);
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
        if (null !== $this->analysisId) {
            $res['analysis_id'] = $this->analysisId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAnalysisQueryRequest
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
        if (isset($map['analysis_id'])) {
            $model->analysisId = $map['analysis_id'];
        }

        return $model;
    }
}
