<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models;

use AlibabaCloud\Tea\Model;

class RetryBlockchainBccrDciRegistrationRequest extends Model
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

    // 待补正数登申请id
    /**
     * @var string
     */
    public $digitalRegisterId;

    // 替换dci申领id
    /**
     * @var string
     */
    public $dciContentId;

    // 数登申请声明
    /**
     * @var DciExplanationInfo
     */
    public $explanationInfo;

    // 补充文件信息
    /**
     * @var AdditionalFileInfo
     */
    public $additionalFileInfo;

    // 幂等字段
    /**
     * @var string
     */
    public $clientToken;

    // 权利描述
    /**
     * @var string
     */
    public $rightScopeDesc;

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
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'digitalRegisterId'   => 'digital_register_id',
        'dciContentId'        => 'dci_content_id',
        'explanationInfo'     => 'explanation_info',
        'additionalFileInfo'  => 'additional_file_info',
        'clientToken'         => 'client_token',
        'rightScopeDesc'      => 'right_scope_desc',
        'applyerContactInfo'  => 'applyer_contact_info',
        'platformContactInfo' => 'platform_contact_info',
    ];

    public function validate()
    {
        Model::validateRequired('digitalRegisterId', $this->digitalRegisterId, true);
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
        if (null !== $this->digitalRegisterId) {
            $res['digital_register_id'] = $this->digitalRegisterId;
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
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }
        if (null !== $this->rightScopeDesc) {
            $res['right_scope_desc'] = $this->rightScopeDesc;
        }
        if (null !== $this->applyerContactInfo) {
            $res['applyer_contact_info'] = null !== $this->applyerContactInfo ? $this->applyerContactInfo->toMap() : null;
        }
        if (null !== $this->platformContactInfo) {
            $res['platform_contact_info'] = null !== $this->platformContactInfo ? $this->platformContactInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RetryBlockchainBccrDciRegistrationRequest
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
        if (isset($map['digital_register_id'])) {
            $model->digitalRegisterId = $map['digital_register_id'];
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
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }
        if (isset($map['right_scope_desc'])) {
            $model->rightScopeDesc = $map['right_scope_desc'];
        }
        if (isset($map['applyer_contact_info'])) {
            $model->applyerContactInfo = ContactInfo::fromMap($map['applyer_contact_info']);
        }
        if (isset($map['platform_contact_info'])) {
            $model->platformContactInfo = ContactInfo::fromMap($map['platform_contact_info']);
        }

        return $model;
    }
}
