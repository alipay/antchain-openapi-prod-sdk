<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CheckOcpTaskRequest extends Model
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

    // 事件类型：开通（AF_OPEN）、变更（AF_MODIFY）、释放（AF_RELEASE）、创建（AF_PROVISION）、停止（AF_STOP）、恢复（AF_RESUME）等。
    /**
     * @var string
     */
    public $event;

    // 实例id
    /**
     * @var string
     */
    public $instanceId;

    // 请求平台来源
    /**
     * @var string
     */
    public $platform;

    // 产品码
    /**
     * @var string
     */
    public $productCode;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 商品码
    /**
     * @var string
     */
    public $accessCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'event'             => 'event',
        'instanceId'        => 'instance_id',
        'platform'          => 'platform',
        'productCode'       => 'product_code',
        'tenantId'          => 'tenant_id',
        'accessCode'        => 'access_code',
    ];

    public function validate()
    {
        Model::validateRequired('event', $this->event, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('platform', $this->platform, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('accessCode', $this->accessCode, true);
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
        if (null !== $this->event) {
            $res['event'] = $this->event;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->platform) {
            $res['platform'] = $this->platform;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->accessCode) {
            $res['access_code'] = $this->accessCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckOcpTaskRequest
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
        if (isset($map['event'])) {
            $model->event = $map['event'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['platform'])) {
            $model->platform = $map['platform'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['access_code'])) {
            $model->accessCode = $map['access_code'];
        }

        return $model;
    }
}
