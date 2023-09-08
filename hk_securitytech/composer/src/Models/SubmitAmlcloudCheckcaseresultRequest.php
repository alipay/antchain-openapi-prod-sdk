<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\HK_SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class SubmitAmlcloudCheckcaseresultRequest extends Model
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

    // 请求ID，业务的唯一标识，用于追踪业务。
    /**
     * @var string
     */
    public $requestId;

    // 客户的租户ID
    /**
     * @var string
     */
    public $tenantId;

    // 任务来源。取值如下：
    // ● REALTIME：来源于扫描信息接口。
    // ● BATCH：来源于数据仓库。
    // ● ALL：包含以上所有的任务来源
    /**
     * @var string
     */
    public $source;

    // 任务类型。取值如下：
    // ● PEP：政治高风险人物。
    // ● SANCTION：制裁名单。
    // ● NEGATIVE_NEWS：负面新闻。
    // ● INTERNAL_LIST：自定义名单。
    // ● EDD：加强尽职调查。
    // ● ALL：包含以上所有的任务类型。
    /**
     * @var string
     */
    public $type;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'requestId'         => 'request_id',
        'tenantId'          => 'tenant_id',
        'source'            => 'source',
        'type'              => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('type', $this->type, true);
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
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitAmlcloudCheckcaseresultRequest
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
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
