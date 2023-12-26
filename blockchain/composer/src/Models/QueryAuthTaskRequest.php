<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryAuthTaskRequest extends Model
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

    // 标签列表
    /**
     * @var string[]
     */
    public $tagCodeList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tagCodeList'       => 'tag_code_list',
    ];

    public function validate()
    {
        Model::validateRequired('tagCodeList', $this->tagCodeList, true);
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
        if (null !== $this->tagCodeList) {
            $res['tag_code_list'] = $this->tagCodeList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAuthTaskRequest
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
        if (isset($map['tag_code_list'])) {
            if (!empty($map['tag_code_list'])) {
                $model->tagCodeList = $map['tag_code_list'];
            }
        }

        return $model;
    }
}
