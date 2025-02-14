<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE_INNER\Models;

use AlibabaCloud\Tea\Model;

class QueryPlatformInvestmentreportRequest extends Model
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

    // 可信产业资产项目批次id
    /**
     * @var string
     */
    public $projectExternalId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'projectExternalId' => 'project_external_id',
    ];

    public function validate()
    {
        Model::validateRequired('projectExternalId', $this->projectExternalId, true);
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
        if (null !== $this->projectExternalId) {
            $res['project_external_id'] = $this->projectExternalId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryPlatformInvestmentreportRequest
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
        if (isset($map['project_external_id'])) {
            $model->projectExternalId = $map['project_external_id'];
        }

        return $model;
    }
}
