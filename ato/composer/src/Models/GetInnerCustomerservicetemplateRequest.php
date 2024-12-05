<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class GetInnerCustomerservicetemplateRequest extends Model
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

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 进件类型
    // DIRECT("DIRECT", "直连进件模式")
    // AGENT("AGENT", "代理商进件模式")
    /**
     * @var string
     */
    public $expandMode;

    // 处理类型:
    // MERCHANT_PROCESS("MERCHANT_PROCESS", "商家处理"),
    // PROXY_PROCESS("PROXY_PROCESS", "服务商代处理"),
    /**
     * @var string
     */
    public $processType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'expandMode'        => 'expand_mode',
        'processType'       => 'process_type',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('expandMode', $this->expandMode, true);
        Model::validateRequired('processType', $this->processType, true);
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->expandMode) {
            $res['expand_mode'] = $this->expandMode;
        }
        if (null !== $this->processType) {
            $res['process_type'] = $this->processType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetInnerCustomerservicetemplateRequest
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
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['expand_mode'])) {
            $model->expandMode = $map['expand_mode'];
        }
        if (isset($map['process_type'])) {
            $model->processType = $map['process_type'];
        }

        return $model;
    }
}
