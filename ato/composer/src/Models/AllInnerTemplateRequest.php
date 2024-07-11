<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class AllInnerTemplateRequest extends Model
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

    // 分页查询结构体
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

    // 魔法库模板文件名称
    /**
     * @var string
     */
    public $templateName;

    // 线上模板ID
    /**
     * @var string
     */
    public $templateCodeProd;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'pageInfo'          => 'page_info',
        'tenantId'          => 'tenant_id',
        'templateCode'      => 'template_code',
        'templateName'      => 'template_name',
        'templateCodeProd'  => 'template_code_prod',
    ];

    public function validate()
    {
        Model::validateRequired('pageInfo', $this->pageInfo, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
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
        if (null !== $this->templateName) {
            $res['template_name'] = $this->templateName;
        }
        if (null !== $this->templateCodeProd) {
            $res['template_code_prod'] = $this->templateCodeProd;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AllInnerTemplateRequest
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
        if (isset($map['template_name'])) {
            $model->templateName = $map['template_name'];
        }
        if (isset($map['template_code_prod'])) {
            $model->templateCodeProd = $map['template_code_prod'];
        }

        return $model;
    }
}
