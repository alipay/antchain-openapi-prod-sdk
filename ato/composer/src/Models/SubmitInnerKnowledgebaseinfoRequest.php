<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SubmitInnerKnowledgebaseinfoRequest extends Model
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

    // 品牌名称
    //
    /**
     * @var string
     */
    public $brandNameSnapshot;

    // 商家电话
    //
    /**
     * @var string
     */
    public $merchantPhoneSnapshot;

    // 商家app链接
    //
    /**
     * @var string
     */
    public $merchantAppLinkSnapshot;

    // 是否存在logo
    //
    /**
     * @var bool
     */
    public $hasLogo;

    // 商家logo
    /**
     * @var FileInfo
     */
    public $fileInfo;
    protected $_name = [
        'authToken'               => 'auth_token',
        'productInstanceId'       => 'product_instance_id',
        'tenantId'                => 'tenant_id',
        'brandNameSnapshot'       => 'brand_name_snapshot',
        'merchantPhoneSnapshot'   => 'merchant_phone_snapshot',
        'merchantAppLinkSnapshot' => 'merchant_app_link_snapshot',
        'hasLogo'                 => 'has_logo',
        'fileInfo'                => 'file_info',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('brandNameSnapshot', $this->brandNameSnapshot, true);
        Model::validateRequired('merchantPhoneSnapshot', $this->merchantPhoneSnapshot, true);
        Model::validateRequired('hasLogo', $this->hasLogo, true);
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
        if (null !== $this->brandNameSnapshot) {
            $res['brand_name_snapshot'] = $this->brandNameSnapshot;
        }
        if (null !== $this->merchantPhoneSnapshot) {
            $res['merchant_phone_snapshot'] = $this->merchantPhoneSnapshot;
        }
        if (null !== $this->merchantAppLinkSnapshot) {
            $res['merchant_app_link_snapshot'] = $this->merchantAppLinkSnapshot;
        }
        if (null !== $this->hasLogo) {
            $res['has_logo'] = $this->hasLogo;
        }
        if (null !== $this->fileInfo) {
            $res['file_info'] = null !== $this->fileInfo ? $this->fileInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitInnerKnowledgebaseinfoRequest
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
        if (isset($map['brand_name_snapshot'])) {
            $model->brandNameSnapshot = $map['brand_name_snapshot'];
        }
        if (isset($map['merchant_phone_snapshot'])) {
            $model->merchantPhoneSnapshot = $map['merchant_phone_snapshot'];
        }
        if (isset($map['merchant_app_link_snapshot'])) {
            $model->merchantAppLinkSnapshot = $map['merchant_app_link_snapshot'];
        }
        if (isset($map['has_logo'])) {
            $model->hasLogo = $map['has_logo'];
        }
        if (isset($map['file_info'])) {
            $model->fileInfo = FileInfo::fromMap($map['file_info']);
        }

        return $model;
    }
}
