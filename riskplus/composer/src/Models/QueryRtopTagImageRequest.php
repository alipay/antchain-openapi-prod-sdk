<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryRtopTagImageRequest extends Model
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

    // 企业ID
    /**
     * @var string
     */
    public $companyId;

    // 标签ID
    /**
     * @var string
     */
    public $tagId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'companyId'         => 'company_id',
        'tagId'             => 'tag_id',
    ];

    public function validate()
    {
        Model::validateRequired('companyId', $this->companyId, true);
        Model::validateRequired('tagId', $this->tagId, true);
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
        if (null !== $this->companyId) {
            $res['company_id'] = $this->companyId;
        }
        if (null !== $this->tagId) {
            $res['tag_id'] = $this->tagId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRtopTagImageRequest
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
        if (isset($map['company_id'])) {
            $model->companyId = $map['company_id'];
        }
        if (isset($map['tag_id'])) {
            $model->tagId = $map['tag_id'];
        }

        return $model;
    }
}
