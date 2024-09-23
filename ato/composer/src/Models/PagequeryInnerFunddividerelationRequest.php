<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class PagequeryInnerFunddividerelationRequest extends Model
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

    // 租户8位id
    /**
     * @var string
     */
    public $tenantId;

    // 分页查询对象
    /**
     * @var PageQuery
     */
    public $pageInfo;

    // 商户公司社会统一信用代码
    /**
     * @var string
     */
    public $subjectMerchantId;

    // 商户公司名称
    /**
     * @var string
     */
    public $subjectCompanyName;

    // 状态
    // NIT:待提交
    // AUDIT:审批中 AUDIT_PASSED:审批通过
    // AUDIT_NOT_PASSED:审批不通过
    /**
     * @var string
     */
    public $status;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'tenantId'           => 'tenant_id',
        'pageInfo'           => 'page_info',
        'subjectMerchantId'  => 'subject_merchant_id',
        'subjectCompanyName' => 'subject_company_name',
        'status'             => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('pageInfo', $this->pageInfo, true);
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
        if (null !== $this->subjectMerchantId) {
            $res['subject_merchant_id'] = $this->subjectMerchantId;
        }
        if (null !== $this->subjectCompanyName) {
            $res['subject_company_name'] = $this->subjectCompanyName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryInnerFunddividerelationRequest
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
        if (isset($map['subject_merchant_id'])) {
            $model->subjectMerchantId = $map['subject_merchant_id'];
        }
        if (isset($map['subject_company_name'])) {
            $model->subjectCompanyName = $map['subject_company_name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
