<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class CreateDciPreregistrationRequest extends Model
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

    // 作品名称
    /**
     * @var string
     */
    public $workName;

    // 作品类型
    /**
     * @var string
     */
    public $workCategory;

    // 推荐作品分类
    /**
     * @var string
     */
    public $recommendWorkCategory;

    // 作品oss文件Id
    /**
     * @var string
     */
    public $workFileId;

    // 文件类型
    /**
     * @var string
     */
    public $fileType;

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

    // 原创声明
    /**
     * @var string
     */
    public $originalStatement;

    // 权利信息
    /**
     * @var DciRightInfo
     */
    public $rightInfo;

    // 真实意愿表达信息
    /**
     * @var string
     */
    public $preRegistrationTrueWill;

    // dci用户id
    /**
     * @var string
     */
    public $dciUserId;

    // 代理信息
    /**
     * @var ProxyData
     */
    public $proxyData;

    // 幂等字段
    /**
     * @var string
     */
    public $clientToken;

    // 作品类型相似度
    /**
     * @var string
     */
    public $categorySimilarRatio;

    // 作品类型风险等级
    /**
     * @var string
     */
    public $categoryRiskRank;

    // 著作权人用户id List
    /**
     * @var string[]
     */
    public $copyrightOwnerIds;

    // DCI类型
    /**
     * @var string
     */
    public $applyType;

    // 渠道标签
    /**
     * @var string
     */
    public $channelTerminal;

    // 推荐分类明细信息
    /**
     * @var RecommendCategoryDetail[]
     */
    public $recommendCategoryList;

    // 证书样式ID
    /**
     * @var string
     */
    public $customizeCertId;
    protected $_name = [
        'authToken'               => 'auth_token',
        'productInstanceId'       => 'product_instance_id',
        'workName'                => 'work_name',
        'workCategory'            => 'work_category',
        'recommendWorkCategory'   => 'recommend_work_category',
        'workFileId'              => 'work_file_id',
        'fileType'                => 'file_type',
        'creationInfo'            => 'creation_info',
        'publicationInfo'         => 'publication_info',
        'authorName'              => 'author_name',
        'authorSignature'         => 'author_signature',
        'originalStatement'       => 'original_statement',
        'rightInfo'               => 'right_info',
        'preRegistrationTrueWill' => 'pre_registration_true_will',
        'dciUserId'               => 'dci_user_id',
        'proxyData'               => 'proxy_data',
        'clientToken'             => 'client_token',
        'categorySimilarRatio'    => 'category_similar_ratio',
        'categoryRiskRank'        => 'category_risk_rank',
        'copyrightOwnerIds'       => 'copyright_owner_ids',
        'applyType'               => 'apply_type',
        'channelTerminal'         => 'channel_terminal',
        'recommendCategoryList'   => 'recommend_category_list',
        'customizeCertId'         => 'customize_cert_id',
    ];

    public function validate()
    {
        Model::validateRequired('workName', $this->workName, true);
        Model::validateRequired('workCategory', $this->workCategory, true);
        Model::validateRequired('workFileId', $this->workFileId, true);
        Model::validateRequired('fileType', $this->fileType, true);
        Model::validateRequired('creationInfo', $this->creationInfo, true);
        Model::validateRequired('publicationInfo', $this->publicationInfo, true);
        Model::validateRequired('authorName', $this->authorName, true);
        Model::validateRequired('rightInfo', $this->rightInfo, true);
        Model::validateRequired('preRegistrationTrueWill', $this->preRegistrationTrueWill, true);
        Model::validateRequired('dciUserId', $this->dciUserId, true);
        Model::validateRequired('clientToken', $this->clientToken, true);
        Model::validateRequired('copyrightOwnerIds', $this->copyrightOwnerIds, true);
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
        if (null !== $this->workName) {
            $res['work_name'] = $this->workName;
        }
        if (null !== $this->workCategory) {
            $res['work_category'] = $this->workCategory;
        }
        if (null !== $this->recommendWorkCategory) {
            $res['recommend_work_category'] = $this->recommendWorkCategory;
        }
        if (null !== $this->workFileId) {
            $res['work_file_id'] = $this->workFileId;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }
        if (null !== $this->creationInfo) {
            $res['creation_info'] = null !== $this->creationInfo ? $this->creationInfo->toMap() : null;
        }
        if (null !== $this->publicationInfo) {
            $res['publication_info'] = null !== $this->publicationInfo ? $this->publicationInfo->toMap() : null;
        }
        if (null !== $this->authorName) {
            $res['author_name'] = $this->authorName;
        }
        if (null !== $this->authorSignature) {
            $res['author_signature'] = $this->authorSignature;
        }
        if (null !== $this->originalStatement) {
            $res['original_statement'] = $this->originalStatement;
        }
        if (null !== $this->rightInfo) {
            $res['right_info'] = null !== $this->rightInfo ? $this->rightInfo->toMap() : null;
        }
        if (null !== $this->preRegistrationTrueWill) {
            $res['pre_registration_true_will'] = $this->preRegistrationTrueWill;
        }
        if (null !== $this->dciUserId) {
            $res['dci_user_id'] = $this->dciUserId;
        }
        if (null !== $this->proxyData) {
            $res['proxy_data'] = null !== $this->proxyData ? $this->proxyData->toMap() : null;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }
        if (null !== $this->categorySimilarRatio) {
            $res['category_similar_ratio'] = $this->categorySimilarRatio;
        }
        if (null !== $this->categoryRiskRank) {
            $res['category_risk_rank'] = $this->categoryRiskRank;
        }
        if (null !== $this->copyrightOwnerIds) {
            $res['copyright_owner_ids'] = $this->copyrightOwnerIds;
        }
        if (null !== $this->applyType) {
            $res['apply_type'] = $this->applyType;
        }
        if (null !== $this->channelTerminal) {
            $res['channel_terminal'] = $this->channelTerminal;
        }
        if (null !== $this->recommendCategoryList) {
            $res['recommend_category_list'] = [];
            if (null !== $this->recommendCategoryList && \is_array($this->recommendCategoryList)) {
                $n = 0;
                foreach ($this->recommendCategoryList as $item) {
                    $res['recommend_category_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->customizeCertId) {
            $res['customize_cert_id'] = $this->customizeCertId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDciPreregistrationRequest
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
        if (isset($map['work_name'])) {
            $model->workName = $map['work_name'];
        }
        if (isset($map['work_category'])) {
            $model->workCategory = $map['work_category'];
        }
        if (isset($map['recommend_work_category'])) {
            $model->recommendWorkCategory = $map['recommend_work_category'];
        }
        if (isset($map['work_file_id'])) {
            $model->workFileId = $map['work_file_id'];
        }
        if (isset($map['file_type'])) {
            $model->fileType = $map['file_type'];
        }
        if (isset($map['creation_info'])) {
            $model->creationInfo = DciCreationInfo::fromMap($map['creation_info']);
        }
        if (isset($map['publication_info'])) {
            $model->publicationInfo = DciPublicationInfo::fromMap($map['publication_info']);
        }
        if (isset($map['author_name'])) {
            $model->authorName = $map['author_name'];
        }
        if (isset($map['author_signature'])) {
            $model->authorSignature = $map['author_signature'];
        }
        if (isset($map['original_statement'])) {
            $model->originalStatement = $map['original_statement'];
        }
        if (isset($map['right_info'])) {
            $model->rightInfo = DciRightInfo::fromMap($map['right_info']);
        }
        if (isset($map['pre_registration_true_will'])) {
            $model->preRegistrationTrueWill = $map['pre_registration_true_will'];
        }
        if (isset($map['dci_user_id'])) {
            $model->dciUserId = $map['dci_user_id'];
        }
        if (isset($map['proxy_data'])) {
            $model->proxyData = ProxyData::fromMap($map['proxy_data']);
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }
        if (isset($map['category_similar_ratio'])) {
            $model->categorySimilarRatio = $map['category_similar_ratio'];
        }
        if (isset($map['category_risk_rank'])) {
            $model->categoryRiskRank = $map['category_risk_rank'];
        }
        if (isset($map['copyright_owner_ids'])) {
            if (!empty($map['copyright_owner_ids'])) {
                $model->copyrightOwnerIds = $map['copyright_owner_ids'];
            }
        }
        if (isset($map['apply_type'])) {
            $model->applyType = $map['apply_type'];
        }
        if (isset($map['channel_terminal'])) {
            $model->channelTerminal = $map['channel_terminal'];
        }
        if (isset($map['recommend_category_list'])) {
            if (!empty($map['recommend_category_list'])) {
                $model->recommendCategoryList = [];
                $n                            = 0;
                foreach ($map['recommend_category_list'] as $item) {
                    $model->recommendCategoryList[$n++] = null !== $item ? RecommendCategoryDetail::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['customize_cert_id'])) {
            $model->customizeCertId = $map['customize_cert_id'];
        }

        return $model;
    }
}
