<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryBaicorpInternalsearchlibraryRequest extends Model
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

    // 账户ID，账户粒度ID。
    /**
     * @var string
     */
    public $accountId;

    // 产品ID
    /**
     * @var string
     */
    public $bizId;

    // 商户ID，即平台用户ID。
    /**
     * @var string
     */
    public $companyId;

    // 内容ID
    /**
     * @var string
     */
    public $contentId;

    // 基于安全考虑，填充NonceId
    /**
     * @var string
     */
    public $customId;

    // 待检测内容的raw data，这期暂不使用
    /**
     * @var string
     */
    public $entityData;

    // 待检测字段的描述信息，包括标题、描述或关键词，json格式字符串
    /**
     * @var string
     */
    public $entityDesc;

    // 待检测内容类型，[TEXT, PICTURE, VIDEO, HTML]
    /**
     * @var string
     */
    public $entityType;

    // 1、待检测内容oss url（后续可以扩展为非oss的文件url）
    // 2、假如使用AK访问，此处填写fileid。
    /**
     * @var string
     */
    public $entityUrl;

    // 时间戳
    /**
     * @var string
     */
    public $timestamp;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'accountId'         => 'account_id',
        'bizId'             => 'biz_id',
        'companyId'         => 'company_id',
        'contentId'         => 'content_id',
        'customId'          => 'custom_id',
        'entityData'        => 'entity_data',
        'entityDesc'        => 'entity_desc',
        'entityType'        => 'entity_type',
        'entityUrl'         => 'entity_url',
        'timestamp'         => 'timestamp',
    ];

    public function validate()
    {
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('companyId', $this->companyId, true);
        Model::validateRequired('contentId', $this->contentId, true);
        Model::validateRequired('customId', $this->customId, true);
        Model::validateRequired('entityType', $this->entityType, true);
        Model::validateRequired('entityUrl', $this->entityUrl, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
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
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->companyId) {
            $res['company_id'] = $this->companyId;
        }
        if (null !== $this->contentId) {
            $res['content_id'] = $this->contentId;
        }
        if (null !== $this->customId) {
            $res['custom_id'] = $this->customId;
        }
        if (null !== $this->entityData) {
            $res['entity_data'] = $this->entityData;
        }
        if (null !== $this->entityDesc) {
            $res['entity_desc'] = $this->entityDesc;
        }
        if (null !== $this->entityType) {
            $res['entity_type'] = $this->entityType;
        }
        if (null !== $this->entityUrl) {
            $res['entity_url'] = $this->entityUrl;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBaicorpInternalsearchlibraryRequest
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
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['company_id'])) {
            $model->companyId = $map['company_id'];
        }
        if (isset($map['content_id'])) {
            $model->contentId = $map['content_id'];
        }
        if (isset($map['custom_id'])) {
            $model->customId = $map['custom_id'];
        }
        if (isset($map['entity_data'])) {
            $model->entityData = $map['entity_data'];
        }
        if (isset($map['entity_desc'])) {
            $model->entityDesc = $map['entity_desc'];
        }
        if (isset($map['entity_type'])) {
            $model->entityType = $map['entity_type'];
        }
        if (isset($map['entity_url'])) {
            $model->entityUrl = $map['entity_url'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }

        return $model;
    }
}
