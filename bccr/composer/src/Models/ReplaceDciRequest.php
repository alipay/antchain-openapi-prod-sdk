<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class ReplaceDciRequest extends Model
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

    // id
    /**
     * @var string
     */
    public $dciContentId;

    // 作品名称
    /**
     * @var string
     */
    public $workName;

    // 作品类别
    /**
     * @var string
     */
    public $workCategory;

    // 创作信息
    /**
     * @var DciCreationInfo
     */
    public $creationInfo;

    // 发表信息
    /**
     * @var DciPublicationInfo
     */
    public $publicationInfo;

    // 申领人id
    /**
     * @var string
     */
    public $dciUserId;

    // 著作权人
    /**
     * @var string[]
     */
    public $copyrightOwnerIds;

    // 作者姓名
    /**
     * @var string
     */
    public $authorName;

    // 作者署名
    /**
     * @var string
     */
    public $authorSignature;

    // 权利信息
    /**
     * @var DciRightInfo
     */
    public $rightInfo;

    // 幂等字段
    /**
     * @var string
     */
    public $clientToken;

    // 代理信息
    /**
     * @var ProxyData
     */
    public $proxyData;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'dciContentId'      => 'dci_content_id',
        'workName'          => 'work_name',
        'workCategory'      => 'work_category',
        'creationInfo'      => 'creation_info',
        'publicationInfo'   => 'publication_info',
        'dciUserId'         => 'dci_user_id',
        'copyrightOwnerIds' => 'copyright_owner_ids',
        'authorName'        => 'author_name',
        'authorSignature'   => 'author_signature',
        'rightInfo'         => 'right_info',
        'clientToken'       => 'client_token',
        'proxyData'         => 'proxy_data',
    ];

    public function validate()
    {
        Model::validateRequired('dciContentId', $this->dciContentId, true);
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
        if (null !== $this->workName) {
            $res['work_name'] = $this->workName;
        }
        if (null !== $this->workCategory) {
            $res['work_category'] = $this->workCategory;
        }
        if (null !== $this->creationInfo) {
            $res['creation_info'] = null !== $this->creationInfo ? $this->creationInfo->toMap() : null;
        }
        if (null !== $this->publicationInfo) {
            $res['publication_info'] = null !== $this->publicationInfo ? $this->publicationInfo->toMap() : null;
        }
        if (null !== $this->dciUserId) {
            $res['dci_user_id'] = $this->dciUserId;
        }
        if (null !== $this->copyrightOwnerIds) {
            $res['copyright_owner_ids'] = $this->copyrightOwnerIds;
        }
        if (null !== $this->authorName) {
            $res['author_name'] = $this->authorName;
        }
        if (null !== $this->authorSignature) {
            $res['author_signature'] = $this->authorSignature;
        }
        if (null !== $this->rightInfo) {
            $res['right_info'] = null !== $this->rightInfo ? $this->rightInfo->toMap() : null;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }
        if (null !== $this->proxyData) {
            $res['proxy_data'] = null !== $this->proxyData ? $this->proxyData->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReplaceDciRequest
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
        if (isset($map['work_name'])) {
            $model->workName = $map['work_name'];
        }
        if (isset($map['work_category'])) {
            $model->workCategory = $map['work_category'];
        }
        if (isset($map['creation_info'])) {
            $model->creationInfo = DciCreationInfo::fromMap($map['creation_info']);
        }
        if (isset($map['publication_info'])) {
            $model->publicationInfo = DciPublicationInfo::fromMap($map['publication_info']);
        }
        if (isset($map['dci_user_id'])) {
            $model->dciUserId = $map['dci_user_id'];
        }
        if (isset($map['copyright_owner_ids'])) {
            if (!empty($map['copyright_owner_ids'])) {
                $model->copyrightOwnerIds = $map['copyright_owner_ids'];
            }
        }
        if (isset($map['author_name'])) {
            $model->authorName = $map['author_name'];
        }
        if (isset($map['author_signature'])) {
            $model->authorSignature = $map['author_signature'];
        }
        if (isset($map['right_info'])) {
            $model->rightInfo = DciRightInfo::fromMap($map['right_info']);
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }
        if (isset($map['proxy_data'])) {
            $model->proxyData = ProxyData::fromMap($map['proxy_data']);
        }

        return $model;
    }
}
