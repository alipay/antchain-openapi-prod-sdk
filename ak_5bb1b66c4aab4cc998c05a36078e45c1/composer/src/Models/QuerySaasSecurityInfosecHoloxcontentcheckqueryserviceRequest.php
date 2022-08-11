<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_5bb1b66c4aab4cc998c05a36078e45c1\Models;

use AlibabaCloud\Tea\Model;

class QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceRequest extends Model
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

    // 123
    /**
     * @var InfoSecContentQuery
     */
    public $infosecContentQuery;

    // 123
    /**
     * @var string
     */
    public $serviceVersion;

    // 返回回调结果
    /**
     * @var InfoSecContentQueryResult
     */
    public $data;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'infosecContentQuery' => 'infosec_content_query',
        'serviceVersion'      => 'service_version',
        'data'                => 'data',
    ];

    public function validate()
    {
        Model::validateRequired('infosecContentQuery', $this->infosecContentQuery, true);
        Model::validateRequired('serviceVersion', $this->serviceVersion, true);
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
        if (null !== $this->infosecContentQuery) {
            $res['infosec_content_query'] = null !== $this->infosecContentQuery ? $this->infosecContentQuery->toMap() : null;
        }
        if (null !== $this->serviceVersion) {
            $res['service_version'] = $this->serviceVersion;
        }
        if (null !== $this->data) {
            $res['data'] = null !== $this->data ? $this->data->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceRequest
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
        if (isset($map['infosec_content_query'])) {
            $model->infosecContentQuery = InfoSecContentQuery::fromMap($map['infosec_content_query']);
        }
        if (isset($map['service_version'])) {
            $model->serviceVersion = $map['service_version'];
        }
        if (isset($map['data'])) {
            $model->data = InfoSecContentQueryResult::fromMap($map['data']);
        }

        return $model;
    }
}
