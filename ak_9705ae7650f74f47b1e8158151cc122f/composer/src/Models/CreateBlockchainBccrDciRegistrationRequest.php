<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models;

use AlibabaCloud\Tea\Model;

class CreateBlockchainBccrDciRegistrationRequest extends Model
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

    // DC123456
    /**
     * @var string
     */
    public $dciContentId;

    // 数登申请声明
    /**
     * @var DciExplanationInfo
     */
    public $explanationInfo;

    // 补充文件相关信息
    /**
     * @var AdditionalFileInfo
     */
    public $additionalFileInfo;

    // 发票信息--当前支持普票
    /**
     * @var InvoiceInfo
     */
    public $invoiceInfo;

    // 幂等字段
    /**
     * @var string
     */
    public $clientToken;

    // 废弃待删除
    /**
     * @var string
     */
    public $creationStatement;

    // 废弃待删除
    /**
     * @var string[]
     */
    public $ancillaryEvidencePathList;

    // 申领人联系信息
    /**
     * @var ContactInfo
     */
    public $applyerContactInfo;

    // 代理人联系信息
    /**
     * @var ContactInfo
     */
    public $platformContactInfo;

    // 权利描述
    /**
     * @var string
     */
    public $rightScopeDesc;
    protected $_name = [
        'authToken'                 => 'auth_token',
        'productInstanceId'         => 'product_instance_id',
        'dciContentId'              => 'dci_content_id',
        'explanationInfo'           => 'explanation_info',
        'additionalFileInfo'        => 'additional_file_info',
        'invoiceInfo'               => 'invoice_info',
        'clientToken'               => 'client_token',
        'creationStatement'         => 'creation_statement',
        'ancillaryEvidencePathList' => 'ancillary_evidence_path_list',
        'applyerContactInfo'        => 'applyer_contact_info',
        'platformContactInfo'       => 'platform_contact_info',
        'rightScopeDesc'            => 'right_scope_desc',
    ];

    public function validate()
    {
        Model::validateRequired('dciContentId', $this->dciContentId, true);
        Model::validateRequired('explanationInfo', $this->explanationInfo, true);
        Model::validateRequired('clientToken', $this->clientToken, true);
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
        if (null !== $this->dciContentId) {
            $res['dci_content_id'] = $this->dciContentId;
        }
        if (null !== $this->explanationInfo) {
            $res['explanation_info'] = null !== $this->explanationInfo ? $this->explanationInfo->toMap() : null;
        }
        if (null !== $this->additionalFileInfo) {
            $res['additional_file_info'] = null !== $this->additionalFileInfo ? $this->additionalFileInfo->toMap() : null;
        }
        if (null !== $this->invoiceInfo) {
            $res['invoice_info'] = null !== $this->invoiceInfo ? $this->invoiceInfo->toMap() : null;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }
        if (null !== $this->creationStatement) {
            $res['creation_statement'] = $this->creationStatement;
        }
        if (null !== $this->ancillaryEvidencePathList) {
            $res['ancillary_evidence_path_list'] = $this->ancillaryEvidencePathList;
        }
        if (null !== $this->applyerContactInfo) {
            $res['applyer_contact_info'] = null !== $this->applyerContactInfo ? $this->applyerContactInfo->toMap() : null;
        }
        if (null !== $this->platformContactInfo) {
            $res['platform_contact_info'] = null !== $this->platformContactInfo ? $this->platformContactInfo->toMap() : null;
        }
        if (null !== $this->rightScopeDesc) {
            $res['right_scope_desc'] = $this->rightScopeDesc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateBlockchainBccrDciRegistrationRequest
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
        if (isset($map['dci_content_id'])) {
            $model->dciContentId = $map['dci_content_id'];
        }
        if (isset($map['explanation_info'])) {
            $model->explanationInfo = DciExplanationInfo::fromMap($map['explanation_info']);
        }
        if (isset($map['additional_file_info'])) {
            $model->additionalFileInfo = AdditionalFileInfo::fromMap($map['additional_file_info']);
        }
        if (isset($map['invoice_info'])) {
            $model->invoiceInfo = InvoiceInfo::fromMap($map['invoice_info']);
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }
        if (isset($map['creation_statement'])) {
            $model->creationStatement = $map['creation_statement'];
        }
        if (isset($map['ancillary_evidence_path_list'])) {
            if (!empty($map['ancillary_evidence_path_list'])) {
                $model->ancillaryEvidencePathList = $map['ancillary_evidence_path_list'];
            }
        }
        if (isset($map['applyer_contact_info'])) {
            $model->applyerContactInfo = ContactInfo::fromMap($map['applyer_contact_info']);
        }
        if (isset($map['platform_contact_info'])) {
            $model->platformContactInfo = ContactInfo::fromMap($map['platform_contact_info']);
        }
        if (isset($map['right_scope_desc'])) {
            $model->rightScopeDesc = $map['right_scope_desc'];
        }

        return $model;
    }
}
