<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYTC\Models;

use AlibabaCloud\Tea\Model;

class AddCodeDepositRequest extends Model
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

    // 业务类型，客户自定义标签
    /**
     * @var string
     */
    public $bizType;

    // 存证内容
    //
    /**
     * @var string
     */
    public $content;

    // 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
    /**
     * @var string[]
     */
    public $bizLabels;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizType'           => 'biz_type',
        'content'           => 'content',
        'bizLabels'         => 'biz_labels',
    ];

    public function validate()
    {
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('content', $this->content, true);
        Model::validateMaxLength('bizType', $this->bizType, 32);
        Model::validateMinLength('bizType', $this->bizType, 1);
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
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->bizLabels) {
            $res['biz_labels'] = $this->bizLabels;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddCodeDepositRequest
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
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['biz_labels'])) {
            if (!empty($map['biz_labels'])) {
                $model->bizLabels = $map['biz_labels'];
            }
        }

        return $model;
    }
}
