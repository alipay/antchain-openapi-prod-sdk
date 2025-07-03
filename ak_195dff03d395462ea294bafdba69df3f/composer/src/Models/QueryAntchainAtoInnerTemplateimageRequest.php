<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class QueryAntchainAtoInnerTemplateimageRequest extends Model
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

    // 商户对应租户ID
    /**
     * @var string
     */
    public $tenantId;

    // 分页查询结构体
    /**
     * @var PageQuery
     */
    public $pageInfo;

    // 魔法库模板code
    /**
     * @var string
     */
    public $templateCode;

    // 魔法库模板版本
    /**
     * @var string
     */
    public $templateVersion;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'pageInfo'          => 'page_info',
        'templateCode'      => 'template_code',
        'templateVersion'   => 'template_version',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('pageInfo', $this->pageInfo, true);
        Model::validateRequired('templateCode', $this->templateCode, true);
        Model::validateRequired('templateVersion', $this->templateVersion, true);
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
        if (null !== $this->pageInfo) {
            $res['page_info'] = null !== $this->pageInfo ? $this->pageInfo->toMap() : null;
        }
        if (null !== $this->templateCode) {
            $res['template_code'] = $this->templateCode;
        }
        if (null !== $this->templateVersion) {
            $res['template_version'] = $this->templateVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntchainAtoInnerTemplateimageRequest
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
        if (isset($map['page_info'])) {
            $model->pageInfo = PageQuery::fromMap($map['page_info']);
        }
        if (isset($map['template_code'])) {
            $model->templateCode = $map['template_code'];
        }
        if (isset($map['template_version'])) {
            $model->templateVersion = $map['template_version'];
        }

        return $model;
    }
}
