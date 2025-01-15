<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MARKETING\Models;

use AlibabaCloud\Tea\Model;

class CreateLeadClueRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 补登线索,客户信息
    /**
     * @var ClueInformationReq
     */
    public $request;

    // 线索来源
    /**
     * @var string
     */
    public $source;

    // 企业名称
    /**
     * @var string
     */
    public $customerName;

    // 多租户模型。线索服务化的租户模型。请联系线索服务管理员提供。固定值。
    // tenant+source+customerName唯一确定一条线索。
    /**
     * @var string
     */
    public $tenantName;
    protected $_name = [
        'authToken'    => 'auth_token',
        'request'      => 'request',
        'source'       => 'source',
        'customerName' => 'customer_name',
        'tenantName'   => 'tenant_name',
    ];

    public function validate()
    {
        Model::validateRequired('request', $this->request, true);
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('customerName', $this->customerName, true);
        Model::validateRequired('tenantName', $this->tenantName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->request) {
            $res['request'] = null !== $this->request ? $this->request->toMap() : null;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->customerName) {
            $res['customer_name'] = $this->customerName;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateLeadClueRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['request'])) {
            $model->request = ClueInformationReq::fromMap($map['request']);
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['customer_name'])) {
            $model->customerName = $map['customer_name'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }

        return $model;
    }
}
