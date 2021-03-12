<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class UpdateChainContractContentRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // content
    /**
     * @var string
     */
    public $content;

    // content_id
    /**
     * @var string
     */
    public $contentId;

    // content_name
    /**
     * @var string
     */
    public $contentName;

    // parent_content_id
    /**
     * @var string
     */
    public $parentContentId;

    // region_id
    /**
     * @var string
     */
    public $regionId;

    // consortium_id
    /**
     * @var string
     */
    public $consortiumId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'content'           => 'content',
        'contentId'         => 'content_id',
        'contentName'       => 'content_name',
        'parentContentId'   => 'parent_content_id',
        'regionId'          => 'region_id',
        'consortiumId'      => 'consortium_id',
    ];

    public function validate()
    {
        Model::validateRequired('contentId', $this->contentId, true);
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
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->contentId) {
            $res['content_id'] = $this->contentId;
        }
        if (null !== $this->contentName) {
            $res['content_name'] = $this->contentName;
        }
        if (null !== $this->parentContentId) {
            $res['parent_content_id'] = $this->parentContentId;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->consortiumId) {
            $res['consortium_id'] = $this->consortiumId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateChainContractContentRequest
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
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['content_id'])) {
            $model->contentId = $map['content_id'];
        }
        if (isset($map['content_name'])) {
            $model->contentName = $map['content_name'];
        }
        if (isset($map['parent_content_id'])) {
            $model->parentContentId = $map['parent_content_id'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['consortium_id'])) {
            $model->consortiumId = $map['consortium_id'];
        }

        return $model;
    }
}
