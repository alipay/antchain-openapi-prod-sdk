<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class ListAntchainAtoInnerTemplateRequest extends Model
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

    // 分页查询
    /**
     * @var PageQuery
     */
    public $pageInfo;

    // 商户对应租户ID
    /**
     * @var string
     */
    public $tenantId;

    // 魔法库模板code
    /**
     * @var string
     */
    public $templateCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'pageInfo'          => 'page_info',
        'tenantId'          => 'tenant_id',
        'templateCode'      => 'template_code',
    ];

    public function validate()
    {
        Model::validateRequired('pageInfo', $this->pageInfo, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('templateCode', $this->templateCode, true);
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
        if (null !== $this->pageInfo) {
            $res['page_info'] = null !== $this->pageInfo ? $this->pageInfo->toMap() : null;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->templateCode) {
            $res['template_code'] = $this->templateCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListAntchainAtoInnerTemplateRequest
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
        if (isset($map['page_info'])) {
            $model->pageInfo = PageQuery::fromMap($map['page_info']);
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['template_code'])) {
            $model->templateCode = $map['template_code'];
        }

        return $model;
    }
}
